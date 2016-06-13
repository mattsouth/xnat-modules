#!/bin/bash
# build an xnat module - i.e. jar up the files from a sub-directory
# see https://wiki.xnat.org/display/Marketplace/How+to+Create+an+XNAT+Module+-+Developer+Guide

if [ -z "$1" ]
then
  echo 'expecting a sub-directory as a parameter, e.g. xnat-ribbon'
else
  cd $1
  jar cf $1.jar *
  mv $1.jar ../.
  cd ..
  echo "created $1.jar"
fi
