# XNAT Modules

XNAT customisation modules from the DPUK project.

To use (on linux or macos):
 - clone this project: ``git clone https://github.com/mattsouth/xnat-modules``
 - ``cd xnat-modules``
 - build module: e.g. ``./gradlew jar`` will create the build/libs folder where you find the plugin jars
 - place the resulting jar files into your ``$XNAT_HOME/plugins`` folder and restart your tomcat application

## XNAT Ribbon

Adds a configurable ribbon to the top left hand corner of an XNAT installation.

![Screenshot of the default ribbon](https://mattsouth.github.io/xnat-modules/screenshot2.png | width=400)

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

## TODO: XNAT Noregister

This module overrides the user registration and forgotten password pages for when
you've connected your XNAT instance to a read-only authentication source.

Note that I havent used a conf file here because, for some
reason, the $site.getProperty function doesnt work in the ForgotLogin template
so you'll have to manually override the signup and forgotuserpassword action
urls to customise this module.

## TODO: XNAT Upload-applet-fix

A module to update the UploadApplet template in light of recent tweaks to the
applet rules in firefox, as per this discussion group thread:
[XNAT 1.7 problem uploading images JAVA plugin is not support](https://groups.google.com/forum/#!topic/xnat_discussion/JWEMwni55FM)
