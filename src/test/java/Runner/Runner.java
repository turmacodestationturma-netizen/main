package Runner;

import java.security.KeyStore.TrustedCertificateEntry;

import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature", glue = "Steps",
tags = "@regressivo",plugin = {"pretty","html:target/ReportBancoInter.html"},monochrome = true,dryRun =true)

public class Runner {

}
