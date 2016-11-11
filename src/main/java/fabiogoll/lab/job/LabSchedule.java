package fabiogoll.lab.job;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by fabiogoll on 11/11/16.
 */
@Component
public class LabSchedule {

    public Log log = LogFactory.getLog(this.getClass());

    @Autowired
    private LabService labService;

    /**
     * 5 sec.
     */
    @Scheduled(fixedRate = 5000)
    public void schedule() {
        log.info("schedule init");

        labService.runTask();

        log.info("schedule fim");
    }
}
