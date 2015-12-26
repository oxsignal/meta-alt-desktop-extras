FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# uncomment and configure the system-local file as needed
#SRC_URI_append = " file://system-local.conf "

do_configure_prepend() {
    # fix dbus init script path
    sed -i -e "s|/var/run/messagebus.pid|/var/run/dbus/pid|" \
        ${WORKDIR}/dbus-1.init
}
