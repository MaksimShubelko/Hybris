package org.customextension.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;
import de.hybris.platform.servicelayer.model.ModelService;
import lombok.Setter;
import org.customextension.dao.TokenKeeperDao;
import org.customextension.model.TokenKeeperModel;

import java.util.Random;

@Setter
public class GenerateTokenJob extends AbstractJobPerformable<CronJobModel> {

    private TokenKeeperDao tokenKeeperDao;
    private final Random random = new Random();
    private ModelService modelService;

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        TokenKeeperModel tokenKeeperModel = tokenKeeperDao.findFirst()
                .orElseThrow(() -> new ModelNotFoundException("TokenKeeperModel doesn't exist"));

        tokenKeeperModel.setToken(random.nextLong());
        modelService.save(tokenKeeperModel);
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
