DESCRIPTION = "A custom console image based on core image"
PR = "r2"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

EXTRA_IMAGE_FEATURES_append = "tools-sdk tools-debug eclipse-debug"

IMAGE_FEATURES += "splash ssh-server-openssh package-management hwcodecs ${EXTRA_IMAGE_FEATURES} "

# Include modules in rootfs
IMAGE_INSTALL += " \
    kernel-modules \
    libcgroup \
"

include console-base.inc
include console-extras.inc
include developer-extras.inc

export IMAGE_BASENAME = "console-image-plus"
