DESCRIPTION = "Task for a GNOME based image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PR = "r6"

inherit packagegroup

RDEPENDS_${PN} = " \
  packagegroup-gnome3-fonts \
  packagegroup-gnome3 \
  packagegroup-gnome3-gstreamer \
  packagegroup-gnome3-perl \
  packagegroup-gnome3-themes \
  packagegroup-gnome3-xserver-base \
"

RRECOMMENDS_${PN} = " \
   packagegroup-xserver \
"

