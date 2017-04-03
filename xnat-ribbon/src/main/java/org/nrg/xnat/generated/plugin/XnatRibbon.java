package org.nrg.xnat.generated.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "xnat-ribbon", name = "XNAT Ribbon", description = "Plugin that attaches a coloured sash to the corner of the page with a word or two and an optional link")
public class XnatRibbon {
}