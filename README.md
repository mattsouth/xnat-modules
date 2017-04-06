# XNAT Modules

XNAT customisation modules from the DPUK project.

To use (on linux or macos):
 - clone this project: ``git clone https://github.com/mattsouth/xnat-modules``
 - ``cd xnat-modules``
 - build module: e.g. ``./gradlew jar`` will create the build/libs folder where you find the plugin jars
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

This module overrides the user registration and forgotten password pages for when
you've connected your XNAT instance to a read-only authentication source.

The plugin assumes that your read-only authentication source has URLs for registration and forgotten password functionality and allows you to set those in the
``$XNAT_HOME/config/prefs-init.ini`` file, which you should create if it doesnt already exist and add the following properties:
```
[siteConfig]

noRegisterTitle=XNAT WIKI
noRegisterRegistrationURL=http://wiki.xnat.org/signup.action
noRegisterForgotPasswordURL=http://wiki.xnat.org/forgotuserpassword.action
```

Note that before this plugin can be used, this issue must be fixed: https://issues.xnat.org/browse/XNAT-4819
. Without this fix, the ForgotLogin page wont render properly.

## XNAT Upload-applet-fix

A module to update the UploadApplet template in light of recent tweaks to the
applet rules in firefox, as per this discussion group thread:
[XNAT 1.7 problem uploading images JAVA plugin is not support](https://groups.google.com/forum/#!topic/xnat_discussion/JWEMwni55FM)
