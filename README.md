# XNAT Plugins

[XNAT](http://www.xnat.org) customisation plugins from the DPUK project.

To use (on linux or macos):
 - clone this project: ``git clone https://github.com/mattsouth/xnat-modules``
 - ``cd xnat-modules``
 - choose the plugin you wish to build
 - ``cd xnat-ribbon``
 - build plugin: e.g. ``./gradlew jar`` will create the build/libs folder where you find the plugin jars
 - place the resulting jar files into your ``$XNAT_HOME/plugins`` folder and restart your tomcat application

## XNAT Ribbon

Adds a configurable ribbon to the top left hand corner of an XNAT installation.

<img src="https://mattsouth.github.io/xnat-plugins/screenshot0.png" width="600">

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

<img src="https://mattsouth.github.io/xnat-plugins/screenshot5.png" width="600">

The plugin assumes that your read-only authentication source has URLs for registration and forgotten password functionality and allows you to set those in the
``$XNAT_HOME/config/prefs-init.ini`` file, which you should create if it doesnt already exist and add the following properties:
```
[siteConfig]

noRegisterTitle=XNAT WIKI
noRegisterRegistrationURL=http://wiki.xnat.org/signup.action
noRegisterForgotPasswordURL=http://wiki.xnat.org/forgotuserpassword.action
```
<img src="https://mattsouth.github.io/xnat-plugins/screenshot6.png" width="600">
