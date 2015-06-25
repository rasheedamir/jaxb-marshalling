#!/usr/bin/env bash
xjc -d src/main/java/ -p io.as.ams.contentkeyauthorizationpolicyoptions.tokenrestrictiontemplate src/main/resources/xsd/TokenRestrictionSchema.xsd
xjc -d src/main/java/ -p io.as.ams.contentkeyauthorizationpolicyoptions.playreadylicenseresponsetemplate src/main/resources/xsd/PlayReadyLicenseResponseTemplate.xsd