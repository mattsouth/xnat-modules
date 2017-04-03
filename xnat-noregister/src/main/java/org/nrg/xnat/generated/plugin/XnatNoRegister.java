package org.nrg.xnat.generated.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "xnat-noregister", name = "XNAT Noregister", description = "Plugin that that over-rides the registration page with a custom link.")
public class XnatNoRegister {
}