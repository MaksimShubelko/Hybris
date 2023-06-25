package org.customextension.dao;

import org.customextension.model.TokenKeeperModel;

import java.util.Optional;

public interface TokenKeeperDao {

    Optional<TokenKeeperModel> findFirst();
}
