plugins {
    id 'java'
    id 'net.minecraftforge.gradle' version '[6.0,6.2)'
}

version = '1.0.0'
group = 'com.jujutsucommands'

java {
    toolchain.languageVersion = JavaLanguageVersion.of(17)
}

minecraft {
    mappings channel: 'official', version: '1.20.1'

    runs {
        server {
            workingDirectory project.file('run')
            property 'forge.logging.markers', 'REGISTRIES'
            property 'forge.logging.console.level', 'debug'
            mods {
                jujutsucommands {
                    source sourceSets.main
                }
            }
        }
    }
}

dependencies {
    minecraft 'net.minecraftforge:forge:1.20.1-47.2.0'
}

jar {
    manifest {
        attributes([
            'Specification-Title'     : 'jujutsucommands',
            'Specification-Vendor'    : 'jujutsucommands',
            'Specification-Version'   : '1',
            'Implementation-Title'    : project.name,
            'Implementation-Version'  : project.jar.archiveVersion,
            'Implementation-Vendor'   : 'jujutsucommands',
        ])
    }
}
