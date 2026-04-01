package com.github.fabricservertools.htm;

import net.minecraft.resources.Identifier;
import xyz.eclipseisoffline.filefixutils.api.FileFixHelpers;
import xyz.eclipseisoffline.filefixutils.api.FileFixInitializer;

public class HTMFileFixes implements FileFixInitializer {

    @Override
    public void onFileFixPopulate() {
        // This needs to be in its own class, using as little other classes as possible, to prevent accidentally running static initialisers
        // this early in the game loading process
        FileFixHelpers.registerGlobalDataMoveFileFix("globalTrust", Identifier.fromNamespaceAndPath("htm", "global_trust_data"));
    }
}
