package org.customextension.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import lombok.Setter;
import org.customextension.dao.TokenKeeperDao;
import org.customextension.model.TokenKeeperModel;

import java.util.List;

@Setter
public class TokenKeeperDaoImpl implements TokenKeeperDao {

    private static final String FIND_FIRST_TOKEN_KEEPER = """
                SELECT {TokenKeeper.PK} FROM
                {
                    TokenKeeper
                }
            """;

    private FlexibleSearchService flexibleSearchService;

    @Override
    public TokenKeeperModel findFirst() {
        List<TokenKeeperModel> tokenKeeperModels = flexibleSearchService
                .<TokenKeeperModel>search(FIND_FIRST_TOKEN_KEEPER)
                .getResult();

        return tokenKeeperModels.stream()
                .findFirst()
                .orElse(null);
    }
}
