# XNAT Modules

XNAT v1.6 customisation modules from the DPUK project.

To use (on linux or osx):
 - clone this project: ``git clone https://github.com/mattsouth/xnat-modules``
 - ``cd xnat-modules``
 - (optional) customise the module to your requirements
 - build module: e.g. ``./build.sh xnat-ribbon`` will create xnat-ribbon.jar
 - place the resulting jar file into your XNAT's modules folder and rebuild/deploy the XNAT war

## XNAT Ribbon

Adds a configurable ribbon to the top left hand corner of an XNAT installation.

![Screenshot of the default ribbon](https://mattsouth.github.io/xnat-modules/screenshot0.png)

Changing properties in xnat-ribbon/src/cong/ribbon-config.properties before
building the module will allow you to customise it to your needs.
