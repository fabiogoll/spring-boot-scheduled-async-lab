package fabiogoll.lab.job;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by fabiogoll on 11/11/16.
 */
@Service
public class LabService {

    public Log log = LogFactory.getLog(this.getClass());

    @Async
    public void runTask(){
        log.info("runtask init");

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.info("runtask end");
    }
}
