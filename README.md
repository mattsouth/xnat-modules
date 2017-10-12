# XNAT Plugins

XNAT customisation plugins from the DPUK project.

To use (on linux or macos):
 - clone this project: ``git clone https://github.com/mattsouth/xnat-modules``
 - ``cd xnat-modules``
 - build plugin: e.g. ``./gradlew jar`` will create the build/libs folder where you find the plugin jars
 - place the resulting jar files into your ``$XNAT_HOME/plugins`` folder and restart your tomcat application

## XNAT Ribbon

Adds a configurable ribbon to the top left hand corner of an XNAT installation.

<img src="https://mattsouth.github.io/xnat-modules/screenshot2.png" width="600">

The ribbon style and content is controlled by properties in the ``$XNAT_HOME/config/prefs-init.ini`` file, which you should create if it doesnt already exist and add the following properties:
```
[siteConfig]

ribbonBackgroundColor=rgba(56,50,147,0.8)
ribbonBorderColor=#070E96
ribbonText=TODO: CHANGE ME
ribbonColor=#FFF
ribbonUrl=http://www.xnat.org
```
If you change the config then you'll have to restart the application to see them applied.

## XNAT Noregister

This module overrides the user registration and forgotten password links for when
you've connected your XNAT instance to a read-only authentication source.

The plugin assumes that your read-only authentication source has URLs for registration and forgotten password functionality and allows you to set those in the
``$XNAT_HOME/config/prefs-init.ini`` file, which you should create if it doesnt already exist and add the following properties:
```
[siteConfig]

noRegisterTitle=XNAT WIKI
noRegisterRegistrationURL=http://wiki.xnat.org/signup.action
noRegisterForgotPasswordURL=http://wiki.xnat.org/forgotuserpassword.action
```

The original design of this plugin is to override the user registration and
forgotten password pages but the forgotten password page currently has an
issue that blocks this approach:  https://issues.xnat.org/browse/XNAT-4819

## XNAT Upload-applet-fix

** Obsoleted by 1.7.3 - but still maybe relevant for 1.7.0, 1.7.1, 1.7.2 **

A module to update the UploadApplet template in light of recent tweaks to the
applet rules in firefox, as per this discussion group thread:
[XNAT 1.7 problem uploading images JAVA plugin is not support](https://groups.google.com/forum/#!topic/xnat_discussion/JWEMwni55FM)

### Before

<img src="https://mattsouth.github.io/xnat-modules/screenshot3.png" width="600">

### After

<img src="https://mattsouth.github.io/xnat-modules/screenshot4.png" width="600">
