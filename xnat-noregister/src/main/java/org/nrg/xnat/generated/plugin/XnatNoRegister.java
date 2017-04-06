package org.nrg.xnat.generated.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "xnat-noregister", name = "XNAT No Register", description = "Plugin that over-rides the registration and forgot password pages with a custom link.")
public class XnatNoRegister {
}
