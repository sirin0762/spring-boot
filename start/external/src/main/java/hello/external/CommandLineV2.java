package hello.external;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

import java.util.List;

@Slf4j
public class CommandLineV2 {

    public static void main(String[] args) {
        // --url=devdb --username=dev_user --password=dev_pw mode=on
        for (String arg : args) {
            log.info("arg = {}", arg);
        }

        ApplicationArguments appArgs = new DefaultApplicationArguments(args);
        log.info("SourceArgs = {}", List.of(appArgs.getSourceArgs()));
        log.info("NonOptionArgs = {}", List.of(appArgs.getNonOptionArgs()));
        log.info("OptionArgs = {}", List.of(appArgs.getOptionNames()));

        for (String optionName : appArgs.getOptionNames()) {
            log.info("option arg {} = {}", optionName, appArgs.getOptionValues(optionName));
        }
    }

}
