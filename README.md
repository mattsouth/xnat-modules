# XNAT Modules

XNAT v1.6 customisation modules from the DPUK project.

To use (on linux or osx):
 - clone this project: ``git clone https://github.com/mattsouth/xnat-modules``
 - ``cd xnat-modules``
 - (optional) customise the module to your requirements
 - build module: e.g. ``./build.sh xnat-ribbon`` will create xnat-ribbon.jar
 - place the resulting jar file into your XNAT's modules folder and setup/rebuild and deploy the XNAT war

## XNAT Ribbon

Adds a configurable ribbon to the top left hand corner of an XNAT installation.

![Screenshot of the default ribbon](https://mattsouth.github.io/xnat-modules/screenshot0.png)

Changing properties in xnat-ribbon/src/conf/ribbon-config.properties before
building the module will allow you to customise it to your needs.

## XNAT Noregister

This module overrides the user registration and forgotten password pages for when
you've connected your XNAT instance to a read-only authentication source.

Note that I havent used a conf file here because, for some
reason, the $site.getProperty function doesnt work in the ForgotLogin template
so you'll have to manually override the signup and forgotuserpassword action
urls to customise this module.

## XNAT Upload-applet-fix

A module to update the UploadApplet template in light of recent tweaks to the
applet rules in firefox, as per this discussion group thread:
[XNAT 1.7 problem uploading images JAVA plugin is not support](https://groups.google.com/forum/#!topic/xnat_discussion/JWEMwni55FM)
