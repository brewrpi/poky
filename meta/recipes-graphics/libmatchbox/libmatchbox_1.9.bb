require libmatchbox.inc

PR = "r8"

SRC_URI = "http://projects.o-hand.com/matchbox/sources/${PN}/${PV}/${PN}-${PV}.tar.gz \
           file://16bppfixes.patch;patch=1 \
           file://configure_fixes.patch;patch=1 \
           file://check.m4 \
           file://matchbox-start-fix.patch;patch=1"

do_configure_prepend () {
	cp ${WORKDIR}/check.m4 ${S}/
}
