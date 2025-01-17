SUMMARY = "Organize packages to avoid duplication across all images (weston)"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup features_check
REQUIRED_DISTRO_FEATURES = "wayland"

SUMMARY:packagegroup-rpb-weston = "Apps that can be used in Weston Desktop"
RDEPENDS:packagegroup-rpb-weston = "\
    clutter-1.0-examples \
    ffmpeg \
    gps-utils \
    gpsd \
    gstreamer1.0-plugins-bad-meta \
    gstreamer1.0-plugins-base-meta \
    gstreamer1.0-plugins-good-meta \
    ${@bb.utils.contains("LICENSE_FLAGS_WHITELIST", "commercial_gstreamer1.0-libav", "gstreamer1.0-libav", "", d)} \
    kmscube \
    weston \
    weston-examples \
    weston-init \
    ${@bb.utils.contains("MACHINE_FEATURES", "mali450", "mali450-userland", "", d)} \
    ${@bb.utils.contains("MACHINE_FEATURES", "sgx", "libgbm ti-sgx-ddk-km ti-sgx-ddk-um pru-icss", "", d)} \
    "

