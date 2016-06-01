package com.JOO.ChestShopInfo;

import org.bukkit.Material;

/*
 * Klasse, um den deutschen Anzeigenamen (einzeln und plural) zu bekommen. translation(toTranslate) bringt einzeln, translation2(toTranslate) bringt plural.
 * 
 */
 
public class getTranslatedMaterial {
	public static String translation(Material material) {
		switch(material) {
		case ACACIA_DOOR:
			return "Akazienholzt�r";
		case ACACIA_DOOR_ITEM:
			return "Akazienholzt�r";
		case ACACIA_FENCE:
			return "Akazienholzzaun";
		case ACACIA_FENCE_GATE:
			return "Akazienholzzaunt�r";
		case ACACIA_STAIRS:
			return "Akazienholztreppe";
		case ACTIVATOR_RAIL:
			return "Aktivierungsschiene";
		case AIR:
			return "Luft";
		case ANVIL:
			return "Amboss";
		case APPLE:
			return "Apfel";
		case ARMOR_STAND:
			return "R�stungsst�nder";
		case ARROW:
			return "Pfeil";
		case BAKED_POTATO:
			return "Ofenkartoffel";
		case BANNER:
			return "Banner";
		case BARRIER:
			return "Barriere";
		case BEACON:
			return "Leuchtfeuer";
		case BED:
			return "Bett";
		case BED_BLOCK:
			return "Bett";
		case BEDROCK:
			return "Grundstein";
//		case BEETROOT:
//			return "";
//		case BEETROOT_BLOCK:
//			return "";
//		case BEETROOT_SEEDS:
//			return "";
//		case BEETROOT_SOUP:
//			return "";
		case BIRCH_DOOR:
			return "Birkenholzt�r";
		case BIRCH_DOOR_ITEM:
			return "Birkenholzt�r";
		case BIRCH_FENCE:
			return "Birkenholzzaun";
		case BIRCH_FENCE_GATE:
			return "Birkenholzzaunt�r";
		case BIRCH_WOOD_STAIRS:
			return "Birkenholztreppe";
		case BLAZE_POWDER:
			return "Lohenstaub";
		case BLAZE_ROD:
			return "Lohenrute";
		case BOAT:
			return "Boot";
//		case BOAT_ACACIA:
//			return "Akazienholzboot";
//		case BOAT_BIRCH:
//			return "Birkenholzboot";
//		case BOAT_DARK_OAK:
//			return "Schwarzeichenholzboot";
//		case BOAT_JUNGLE:
//			return "Jungleholzboot";
//		case BOAT_SPRUCE:
//			return "Fichtenholzboot";
		case BONE:
			return "Knochen";
		case BOOK:
			return "Buch";
		case BOOK_AND_QUILL:
			return "Buch und Feder";
		case BOOKSHELF:
			return "B�cherregal";
		case BOW:
			return "Bogen";
		case BOWL:
			return "Sch�ssel";
		case BREAD:
			return "Brot";
		case BREWING_STAND:
			return "Braustand";
		case BREWING_STAND_ITEM:
			return "Braustand";
		case BRICK:
			return "Ziegelssteine";
		case BRICK_STAIRS:
			return "Ziegeltreppe";
		case BROWN_MUSHROOM:
			return "brauner Pilz";
		case BUCKET:
			return "Eimer";
		case BURNING_FURNACE:
			return "brennender Ofen";
		case CACTUS:
			return "Kaktus";
		case CAKE:
			return "Kuchen";
		case CAKE_BLOCK:
			return "Kuchen";
		case CARPET:
			return "Teppich";
		case CARROT:
			return "Karotte";
		case CARROT_ITEM:
			return "Karotte";
		case CARROT_STICK:
			return "Karottenrute";
		case CAULDRON:
			return "Kessel";
		case CAULDRON_ITEM:
			return "Kessel";
		case CHAINMAIL_BOOTS:
			return "Kettenstiefel";
		case CHAINMAIL_CHESTPLATE:
			return "Kettenhemd";
		case CHAINMAIL_HELMET:
			return "Kettenhaube";
		case CHAINMAIL_LEGGINGS:
			return "Kettenhose";
		case CHEST:
			return "Kiste";
//		case CHORUS_FLOWER:
//			return "";
//		case CHORUS_FRUIT:
//			return "";
//		case CHORUS_FRUIT_POPPED:
//			return "";
//		case CHORUS_PLANT:
//			return "";
		case CLAY:
			return "Ton";
		case CLAY_BALL:
			return "Tonball";
		case CLAY_BRICK:
			return "Ziegel";
		case COAL:
			return "Kohle";
		case COAL_BLOCK:
			return "Kohleblock";
		case COAL_ORE:
			return "Kohleerz";
		case COBBLE_WALL:
			return "Bruchsteinmauer";
		case COBBLESTONE:
			return "Bruchstein";
		case COBBLESTONE_STAIRS:
			return "Bruchsteintreppe";
		case COCOA:
			return "Kakaobohnen";
		case COMMAND:
			return "Kommandoblock";
//		case COMMAND_CHAIN:
//			return "";
		case COMMAND_MINECART:
			return "";
//		case COMMAND_REPEATING:
//			return "";
		case COMPASS:
			return "Kompass";
		case COOKED_BEEF:
			return "Steak";
		case COOKED_CHICKEN:
			return "Gebratenes H�hnchen";
		case COOKED_FISH:
			return "Gebratener Kabeljau";
		case COOKED_MUTTON:
			return "Gebratenes Hammelfleisch";
		case COOKED_RABBIT:
			return "Gebratenes Kaninchen";
		case COOKIE:
			return "Keks";
		case CROPS:
			return "";
		case DARK_OAK_DOOR:
			return "Schwarzeichenholzt�r";
		case DARK_OAK_DOOR_ITEM:
			return "Schwarzeichenholzt�r";
		case DARK_OAK_FENCE:
			return "Schwarzeichenholzzaun";
		case DARK_OAK_FENCE_GATE:
			return "Schwarzeichenholzzaunt�r";
		case DARK_OAK_STAIRS:
			return "Schwarzeichenholztreppe";
		case DAYLIGHT_DETECTOR:
			return "Tageslichtsensor";
		case DAYLIGHT_DETECTOR_INVERTED:
			return "Tageslichtsensor";
		case DEAD_BUSH:
			return "Toter Busch";
		case DETECTOR_RAIL:
			return "Sensorschiene";
		case DIAMOND:
			return "Diamant";
		case DIAMOND_AXE:
			return "Diamantaxt";
		case DIAMOND_BARDING:
			return "Diamantene Pferder�stung";
		case DIAMOND_BLOCK:
			return "Diamantblock";
		case DIAMOND_BOOTS:
			return "Diamantstiefel";
		case DIAMOND_CHESTPLATE:
			return "Diamantbrustpanzer";
		case DIAMOND_HELMET:
			return "Diamanthelm";
		case DIAMOND_HOE:
			return "Diamanthacke";
		case 	DIAMOND_LEGGINGS:
			return "Diamantbeinschutz";
		case DIAMOND_ORE:
			return "Diamanterz";
		case DIAMOND_PICKAXE:
			return "Diamantspitzhacke";
		case DIAMOND_SPADE:
			return "Diamantschaufel";
		case DIAMOND_SWORD:
			return "Diamantschwert";
		case 	DIODE:
			return "";
		case DIODE_BLOCK_OFF:
			return "";
		case DIODE_BLOCK_ON:
			return "";
		case DIRT:
			return "Erde";
		case DISPENSER:
			return "Werfer";
		case DOUBLE_PLANT:
			return "Hohes Gras";
		case DOUBLE_STEP:
			return "";
		case DOUBLE_STONE_SLAB2:
			return "";
		case DRAGON_EGG:
			return "Drachenei";
//		case DRAGONS_BREATH:
//			return "";
		case DROPPER:
			return "Spender";
		case EGG:
			return "Ei";
//		case ELYTRA:
//			return "Elytra";
		case EMERALD:
			return "Smaragd";
		case EMERALD_BLOCK:
			return "Smaragdblock";
		case EMERALD_ORE:
			return "Smaragderz";
		case EMPTY_MAP:
			return "Leere Karte";
		case ENCHANTED_BOOK:
			return "Verzaubertes Buch";
		case ENCHANTMENT_TABLE:
			return "Zaubertisch";
//		case END_BRICKS:
//			return "Endstein";
//		case END_CRYSTAL:
//			return "";
//		case END_GATEWAY:
//			return "Endportalrahmen";
//		case END_ROD:
//			return "";
		case ENDER_CHEST:
			return "Endertruhe";
		case ENDER_PEARL:
			return "Enderperle";
		case ENDER_PORTAL:
			return "Enderportal";
		case ENDER_PORTAL_FRAME:
			return "Enderportal";
		case ENDER_STONE:
			return "Endstein";
		case EXP_BOTTLE:
			return "Erfahrungsfl�schen";
		case EXPLOSIVE_MINECART:
			return "TNT-Lore";
		case EYE_OF_ENDER:
			return "Enderauge";
		case FEATHER:
			return "Feder";
		case FENCE:
			return "Eichenholzzaun";
		case FENCE_GATE:
			return "Eichenholzzauntor";
		case FERMENTED_SPIDER_EYE:
			return "Fermentiertes Spinnenauge";
		case FIRE:
			return "Feuer";
		case FIREBALL:
			return "Feuerkugel";
		case FIREWORK:
			return "Feuerwerk";
		case FIREWORK_CHARGE:
			return "Feuerwerk";
		case FISHING_ROD:
			return "Angel";
		case FLINT:
			return "Feuerstein";
		case FLINT_AND_STEEL:
			return "Feuerzeug";
		case FLOWER_POT:
			return "Blumentopf";
		case FLOWER_POT_ITEM:
			return "";
//		case FROSTED_ICE:
//			return "Eis";
		case FURNACE:
			return "Ofen";
		case GHAST_TEAR:
			return "Ghasttr�ne";
		case GLASS:
			return "Glas";
		case GLASS_BOTTLE:
			return "Glasflasche";
		case GLOWING_REDSTONE_ORE:
			return "";
		case GLOWSTONE:
			return "Glowstone";
		case GLOWSTONE_DUST:
			return "Glowstonestaub";
		case GOLD_AXE:
			return "Goldaxt";
		case GOLD_BARDING:
			return "Goldene Pferder�stung";
		case GOLD_BLOCK:
			return "Goldblock";
		case GOLD_BOOTS:
			return "Goldstiefel";
		case GOLD_CHESTPLATE:
			return "Goldharnisch";
		case GOLD_HELMET:
			return "Goldhelm";
		case GOLD_HOE:
			return "Goldhacke";
		case GOLD_INGOT:
			return "Goldbarren";
		case GOLD_LEGGINGS:
			return "Goldbeinschutz";
		case GOLD_NUGGET:
			return "Goldnugget";
		case GOLD_ORE:
			return "Golderz";
		case GOLD_PICKAXE:
			return "Goldspitzhacke";
		case GOLD_PLATE:
			return "";
		case GOLD_RECORD:
			return "";
		case GOLD_SPADE:
			return "Goldschaufel";
		case GOLD_SWORD:
			return "Goldschwert";
		case GOLDEN_APPLE:
			return "Goldener Apfel";
		case GOLDEN_CARROT:
			return "Goldene Karotte";
		case GRASS:
			return "Grasblock";
//		case GRASS_PATH:
//			return "";
		case GRAVEL:
			return "Kies";
		case GREEN_RECORD:
			return "";
		case GRILLED_PORK:
			return "Gebratenes Schweinefleisch";
		case HARD_CLAY:
			return "Gebrannter Lehm";
		case HAY_BLOCK:
			return "Strohballen";
		case HOPPER:
			return "Trichter";
		case HOPPER_MINECART:
			return "Trichterlore";
		case HUGE_MUSHROOM_1:
			return "Pilzblock";
		case HUGE_MUSHROOM_2:
			return "Pilzblock";
		case ICE:
			return "Eis";
		case INK_SACK:
			return "Tintenbeutel";
		case IRON_AXE:
			return "Eisenaxt";
		case IRON_BARDING:
			return "Eisene Pferder�stung";
		case IRON_BLOCK:
			return "Eisenblock";
		case IRON_BOOTS:
			return "Eisenstiefel";
		case IRON_CHESTPLATE:
			return "Eisenbrustpanzer";
		case IRON_DOOR:
			return "Eisent�r";
		case IRON_DOOR_BLOCK:
			return "Eisent�r";
		case IRON_FENCE:
			return "Eisengitter";
		case IRON_HELMET:
			return "Eisenhelm";
		case IRON_HOE:
			return "Eisenhacke";
		case IRON_INGOT:
			return "Eisenbarren";
		case IRON_LEGGINGS:
			return "Eisenbeinschutz";
		case IRON_ORE:
			return "Eisenerz";
		case IRON_PICKAXE:
			return "Eisenspitzhacke";
		case IRON_PLATE:
			return "Eisendruckplatte";
		case IRON_SPADE:
			return "Eisenschaufel";
		case IRON_SWORD:
			return "Eisenschwert";
		case IRON_TRAPDOOR:
			return "Eisenfallt�r";
		case ITEM_FRAME:
			return "Rahmen";
		case JACK_O_LANTERN:
			return "K�rbislaterne";
		case JUKEBOX:
			return "Plattenspieler";
		case JUNGLE_DOOR:
			return "Jungleholzt�r";
		case JUNGLE_DOOR_ITEM:
			return "Jungleholzt�r";
		case JUNGLE_FENCE:
			return "Jungleholzzaun";
		case JUNGLE_FENCE_GATE:
			return "Jungleholzzaunt�r";
		case JUNGLE_WOOD_STAIRS:
			return "Jungleholztreppe";
		case LADDER:
			return "Leiter";
		case LAPIS_BLOCK:
			return "Lapislazuliblock";
		case LAPIS_ORE:
			return "Lapislazulierz";
		case LAVA:
			return "Lava";
		case LAVA_BUCKET:
			return "Lavaeimer";
		case LEASH:
			return "Leine";
		case LEATHER:
			return "Leder";
		case LEATHER_BOOTS:
			return "Lederstiefel";
		case LEATHER_CHESTPLATE:
			return "Lederjacke";
		case LEATHER_HELMET:
			return "Lederhelm";
		case LEATHER_LEGGINGS:
			return "Lederhose";
		case LEAVES:
			return "Laub";
		case LEAVES_2:
			return "Laub";
		case LEVER:
			return "Hebel";
//		case LINGERING_POTION:
//			return "Trank";
		case LOG:
			return "Baumstamm";
		case LOG_2:
			return "Baumstamm";
		case LONG_GRASS:
			return "hohes Gras";
		case MAGMA_CREAM:
			return "Magmacreme";
		case MAP:
			return "Karte";
		case MELON:
			return "Melone";
		case MELON_BLOCK:
			return "Melonenblock";
		case MELON_SEEDS:
			return "Melonenkerne";
		case MELON_STEM:
			return "";
		case MILK_BUCKET:
			return "Milcheimer";
		case MINECART:
			return "Lore";
		case MOB_SPAWNER:
			return "Mobspawner";
		case MONSTER_EGG:
			return "Spawnei";
		case MONSTER_EGGS:
			return "Spawnei";
		case MOSSY_COBBLESTONE:
			return "Bemooster Bruchstein";
		case MUSHROOM_SOUP:
			return "Pilzsuppe";
		case MUTTON:
			return "Rohes Hammelfleisch";
		case MYCEL:
			return "Myzel";
		case NAME_TAG:
			return "Namensschild";
		case NETHER_BRICK:
			return "Netherziegel";
		case NETHER_BRICK_ITEM:
			return "Netherziegel";
		case NETHER_BRICK_STAIRS:
			return "Netherziegeltreppe";
		case NETHER_FENCE:
			return "Netherziegelzaun";
		case NETHER_STALK:
			return "";
		case NETHER_STAR:
			return "Netherstern";
		case NETHER_WARTS:
			return "Netherwarze";
		case NETHERRACK:
			return "Netherstein";
		case NOTE_BLOCK:
			return "Notenblock";
		case OBSIDIAN:
			return "Obsidian";
		case PACKED_ICE:
			return "Packeis";
		case PAINTING:
			return "Gem�lde";
		case PAPER:
			return "Papier";
		case PISTON_BASE:
			return "Kolben";
		case PISTON_EXTENSION:
			return "Kolben";
		case PISTON_MOVING_PIECE:
			return "Kolben";
		case PISTON_STICKY_BASE:
			return "Klebriger Kolben";
		case POISONOUS_POTATO:
			return "Giftige Kartoffel";
		case PORK:
			return "Rohes Schweinefleisch";
		case PORTAL:
			return "Portal";
		case POTATO:
			return "Kartoffel";
		case POTATO_ITEM:
			return "Kartoffel";
		case POTION:
			return "Trank";
		case POWERED_MINECART:
			return "Angetriebene Lore";
		case POWERED_RAIL:
			return "Antriebsschiene";
		case PRISMARINE:
			return "Prismarinblock";
		case PRISMARINE_CRYSTALS:
			return "Prismarinkristalle";
		case PRISMARINE_SHARD:
			return "Prismarinscherbe";
		case PUMPKIN:
			return "K�rbis";
		case PUMPKIN_PIE:
			return "K�rbiskuchen";
		case PUMPKIN_SEEDS:
			return "K�rbissamen";
		case PUMPKIN_STEM:
			return "K�rbispflanze";
//		case PURPUR_BLOCK:
//			return "";
//		case PURPUR_DOUBLE_SLAB:
//			return "";
//		case PURPUR_PILLAR:
//			return "";
//		case PURPUR_SLAB:
//			return "";
//		case PURPUR_STAIRS:
//			return "";
		case QUARTZ:
			return "Netherquarz";
		case QUARTZ_BLOCK:
			return "Quarzblock";
		case QUARTZ_ORE:
			return "Quarzerz";
		case QUARTZ_STAIRS:
			return "Quarztreppe";
		case RABBIT:
			return "Rohes Kaninchen";
		case RABBIT_FOOT:
			return "Hasenpfote";
		case RABBIT_HIDE:
			return "Kaninchenfell";
		case RABBIT_STEW:
			return "Kaninchenragout";
		case RAILS:
			return "Schiene";
		case RAW_BEEF:
			return "Rohes Rindfleisch";
		case RAW_CHICKEN:
			return "Rohes H�hnchen";
		case RAW_FISH:
			return "Roher Fisch";
		case RECORD_10:
			return "Schallplatte";
		case RECORD_11:
			return "Schallplatte";
		case RECORD_12:
			return "Schallplatte";
		case RECORD_3:
			return "Schallplatte";
		case RECORD_4:
			return "Schallplatte";
		case RECORD_5:
			return "Schallplatte";
		case RECORD_6:
			return "Schallplatte";
		case RECORD_7:
			return "Schallplatte";
		case RECORD_8:
			return "Schallplatte";
		case RECORD_9:
			return "Schallplatte";
		case RED_MUSHROOM:
			return "Roter Pilz";
		case RED_ROSE:
			return "Blume";
		case RED_SANDSTONE:
			return "Roter Sandstein";
		case RED_SANDSTONE_STAIRS:
			return "Rote Sandsteintreppe";
		case REDSTONE:
			return "Redstone";
		case REDSTONE_BLOCK:
			return "Redstoneblock";
		case REDSTONE_COMPARATOR:
			return "Redstone Komparator";
		case REDSTONE_COMPARATOR_OFF:
			return "";
		case REDSTONE_COMPARATOR_ON:
			return "";
		case REDSTONE_LAMP_OFF:
			return "Redstonelampe";
		case REDSTONE_LAMP_ON:
			return "Redstonelampe";
		case REDSTONE_ORE:
			return "Redstoneerz";
		case REDSTONE_TORCH_OFF:
			return "Redstonefackel";
		case REDSTONE_TORCH_ON:
			return "Redstonefackel";
		case REDSTONE_WIRE:
			return "Redstone";
		case ROTTEN_FLESH:
			return "Verrottetes Fleisch";
		case SADDLE:
			return "Sattel";
		case SAND:
			return "Sand";
		case SANDSTONE:
			return "Sandstein";
		case SANDSTONE_STAIRS:
			return "Sandsteintreppe";
		case SAPLING:
			return "Setzling";
		case SEA_LANTERN:
			return "Seelaterne";
		case SEEDS:
			return "Samen";
		case SHEARS:
			return "Scheere";
//		case SHIELD:
//			return "Schild";
		case SIGN:
			return "Schild";
		case SIGN_POST:
			return "Schild";
		case SKULL:
			return "Sch�del/Kopf";
		case SKULL_ITEM:
			return "Sch�del/Kopf";
		case SLIME_BALL:
			return "Schleimball";
		case SLIME_BLOCK:
			return "Schleimblock";
		case SMOOTH_BRICK:
			return "Steinziegel";
		case SMOOTH_STAIRS:
			return "Steinziegeltreppe";
		case SNOW:
			return "Schnee";
		case SNOW_BALL:
			return "Schneeball";
		case SNOW_BLOCK:
			return "Schneeblock";
		case SOIL:
			return "Erde";
		case SOUL_SAND:
			return "Seelensand";
		case SPECKLED_MELON:
			return "Glitzernde Melone";
//		case SPECTRAL_ARROW:
//			return "Pfeil";
		case SPIDER_EYE:
			return "Spinnenauge";
//		case SPLASH_POTION:
//			return "Wurftrank";
		case SPONGE:
			return "Schwamm";
		case SPRUCE_DOOR:
			return "Fichtenholzt�r";
		case SPRUCE_DOOR_ITEM:
			return "Fichtenholzt�r";
		case SPRUCE_FENCE:
			return "Fichtenholzzaun";
		case SPRUCE_FENCE_GATE:
			return "Fichtenholzzaunt�r";
		case SPRUCE_WOOD_STAIRS:
			return "Fichtenholztreppe";
		case STAINED_CLAY:
			return "Gef�rbter Ton";
		case STAINED_GLASS:
			return "Gef�rbtes Glas";
		case STAINED_GLASS_PANE:
			return "Gef�rbte Glasscheibe";
		case STANDING_BANNER:
			return "Banner";
		case STATIONARY_LAVA:
			return "Lava";
		case STATIONARY_WATER:
			return "Wasser";
		case STEP:
			return "Step";
		case STICK:
			return "Stock";
		case STONE:
			return "Stein";
		case STONE_AXE:
			return "Steinaxt";
		case STONE_BUTTON:
			return "Steinknopf";
		case STONE_HOE:
			return "Steinhacke";
		case STONE_PICKAXE:
			return "Steinspitzhacke";
		case STONE_PLATE:
			return "Steindruckplatte";
		case STONE_SLAB2:
			return "Steinstufe";
		case STONE_SPADE:
			return "Steinschaufel";
		case STONE_SWORD:
			return "Steinschwert";
		case STORAGE_MINECART:
			return "G�terlore";
		case STRING:
			return "Faden";
//		case STRUCTURE_BLOCK:
//			return "";
		case SUGAR:
			return "Zucker";
		case SUGAR_CANE:
			return "Zuckerrohr";
		case SUGAR_CANE_BLOCK:
			return "Zuckerrohr";
		case SULPHUR:
			return "Schiesspulver";
		case THIN_GLASS:
			return "Thin Glas";
//		case TIPPED_ARROW:
//			return "Pfeil";
		case TNT:
			return "TNT";
		case TORCH:
			return "Fackel";
		case TRAP_DOOR:
			return "Fallt�r";
		case TRAPPED_CHEST:
			return "Redstonetruhe";
		case TRIPWIRE:
			return "Faden";
		case TRIPWIRE_HOOK:
			return "Haken";
		case VINE:
			return "Ranken";
		case WALL_BANNER:
			return "Banner";
		case WALL_SIGN:
			return "Schild";
		case WATCH:
			return "Uhr";
		case WATER:
			return "Wasser";
		case WATER_BUCKET:
			return "Wassereimer";
		case WATER_LILY:
			return "Seerosenblatt";
		case WEB:
			return "Spinnennetz";
		case WHEAT:
			return "Weizen";
		case WOOD:
			return "Holzplanken";
		case WOOD_AXE:
			return "Holzaxt";
		case WOOD_BUTTON:
			return "Holzknopf";
		case WOOD_DOOR:
			return "Holzt�r";
		case WOOD_DOUBLE_STEP:
			return "Holzstufe";
		case WOOD_HOE:
			return "Holzhacke";
		case WOOD_PICKAXE:
			return "Holzspitzhacke";
		case WOOD_PLATE:
			return "Holzplatte";
		case WOOD_SPADE:
			return "Holzschaufel";
		case WOOD_STAIRS:
			return "Holztreppe";
		case WOOD_STEP:
			return "Holzstufe";
		case WOOD_SWORD:
			return "Holzschwert";
		case WOODEN_DOOR:
			return "Holzt�r";
		case WOOL:
			return "Wolle";
		case WORKBENCH:
			return "Werkbank";
		case WRITTEN_BOOK:
			return "Beschriebenes Buch";
		case YELLOW_FLOWER:
			return "Blume";
		default:
			return material.name().toLowerCase();
		}

	}
	public static String translation2(Material material) {
		switch (material) {
		case ACACIA_DOOR:
			return "Akazienholzt�ren";
		case ACACIA_DOOR_ITEM:
			return "Akazienholzt�ren";
		case ACACIA_FENCE:
			return "Akazienholzz�une";
		case ACACIA_FENCE_GATE:
			return "Akazienholzzaunt�ren";
		case ACACIA_STAIRS:
			return "Akazienholztreppen";
		case ACTIVATOR_RAIL:
			return "Aktivierungsschienen";
		case AIR:
			return "Luft";
		case ANVIL:
			return "Ambosse";
		case APPLE:
			return "�pfel";
		case ARMOR_STAND:
			return "R�stungsst�nder";
		case ARROW:
			return "Pfeile";
		case BAKED_POTATO:
			return "Ofenkartoffeln";
		case BANNER:
			return "Banner";
		case BARRIER:
			return "Barrieren";
		case BEACON:
			return "Leuchtfeuer";
		case BED:
			return "Betten";
		case BED_BLOCK:
			return "Betten";
		case BEDROCK:
			return "Grundsteine";
//		case BEETROOT:
//			return "";
//		case BEETROOT_BLOCK:
//			return "";
//		case BEETROOT_SEEDS:
//			return "";
//		case BEETROOT_SOUP:
//			return "";
		case BIRCH_DOOR:
			return "Birkenholzt�ren";
		case BIRCH_DOOR_ITEM:
			return "Birkenholzt�ren";
		case BIRCH_FENCE:
			return "Birkenholzz�une";
		case BIRCH_FENCE_GATE:
			return "Birkenholzzaunt�ren";
		case BIRCH_WOOD_STAIRS:
			return "Birkenholztreppen";
		case BLAZE_POWDER:
			return "Lohenstaub";
		case BLAZE_ROD:
			return "Lohenruten";
		case BOAT:
			return "Boot";
//		case BOAT_ACACIA:
//			return "Akazienholzboote";
//		case BOAT_BIRCH:
//			return "Birkenholzboote";
//		case BOAT_DARK_OAK:
//			return "Schwarzeichenholzboote";
//		case BOAT_JUNGLE:
//			return "Jungleholzboote";
//		case BOAT_SPRUCE:
//			return "Fichtenholzboote";
		case BONE:
			return "Knochen";
		case BOOK:
			return "B�cher";
		case BOOK_AND_QUILL:
			return "B�cher und Federn";
		case BOOKSHELF:
			return "B�cherregale";
		case BOW:
			return "Bogen";
		case BOWL:
			return "Sch�sseln";
		case BREAD:
			return "Brote";
		case BREWING_STAND:
			return "Braust�nde";
		case BREWING_STAND_ITEM:
			return "Braust�nde";
		case BRICK:
			return "Ziegelssteine";
		case BRICK_STAIRS:
			return "Ziegeltreppen";
		case BROWN_MUSHROOM:
			return "braune Pilze";
		case BUCKET:
			return "Eimer";
		case BURNING_FURNACE:
			return "brennende �fen";
		case CACTUS:
			return "Kakteen";
		case CAKE:
			return "Kuchen";
		case CAKE_BLOCK:
			return "Kuchen";
		case CARPET:
			return "Teppiche";
		case CARROT:
			return "Karotten";
		case CARROT_ITEM:
			return "Karotten";
		case CARROT_STICK:
			return "Karottenruten";
		case CAULDRON:
			return "Kessel";
		case CAULDRON_ITEM:
			return "Kessel";
		case CHAINMAIL_BOOTS:
			return "Kettenstiefel";
		case CHAINMAIL_CHESTPLATE:
			return "Kettenhemden";
		case CHAINMAIL_HELMET:
			return "Kettenhauben";
		case CHAINMAIL_LEGGINGS:
			return "Kettenhosen";
		case CHEST:
			return "Kisten";
//		case CHORUS_FLOWER:
//			return "";
//		case CHORUS_FRUIT:
//			return "";
//		case CHORUS_FRUIT_POPPED:
//			return "";
//		case CHORUS_PLANT:
//			return "";
		case CLAY:
			return "Ton";
		case CLAY_BALL:
			return "Tonb�lle";
		case CLAY_BRICK:
			return "Ziegel";
		case COAL:
			return "Kohle";
		case COAL_BLOCK:
			return "Kohlebl�cke";
		case COAL_ORE:
			return "Kohleerze";
		case COBBLE_WALL:
			return "Bruchsteinmauern";
		case COBBLESTONE:
			return "Bruchsteine";
		case COBBLESTONE_STAIRS:
			return "Bruchsteintreppen";
		case COCOA:
			return "Kakaobohnen";
		case COMMAND:
			return "Kommandobl�cke";
//		case COMMAND_CHAIN:
//			return "";
		case COMMAND_MINECART:
			return "";
//		case COMMAND_REPEATING:
//			return "";
		case COMPASS:
			return "Kompass";
		case COOKED_BEEF:
			return "Steak";
		case COOKED_CHICKEN:
			return "Gebratene H�hnchen";
		case COOKED_FISH:
			return "Gebratene Kabeljau";
		case COOKED_MUTTON:
			return "Gebratenes Hammelfleisch";
		case COOKED_RABBIT:
			return "Gebratene Kaninchen";
		case COOKIE:
			return "Kekse";
		case CROPS:
			return "";
		case DARK_OAK_DOOR:
			return "Schwarzeichenholzt�ren";
		case DARK_OAK_DOOR_ITEM:
			return "Schwarzeichenholzt�ren";
		case DARK_OAK_FENCE:
			return "Schwarzeichenholzz�une";
		case DARK_OAK_FENCE_GATE:
			return "Schwarzeichenholzzaunt�ren";
		case DARK_OAK_STAIRS:
			return "Schwarzeichenholztreppen";
		case DAYLIGHT_DETECTOR:
			return "Tageslichtsensoren";
		case DAYLIGHT_DETECTOR_INVERTED:
			return "Tageslichtsensoren";
		case DEAD_BUSH:
			return "Tote B�sche";
		case DETECTOR_RAIL:
			return "Sensorschienen";
		case DIAMOND:
			return "Diamanten";
		case DIAMOND_AXE:
			return "Diamant�xte";
		case DIAMOND_BARDING:
			return "Diamantene Pferder�stungen";
		case DIAMOND_BLOCK:
			return "Diamantbl�cke";
		case DIAMOND_BOOTS:
			return "Diamantstiefel";
		case DIAMOND_CHESTPLATE:
			return "Diamantbrustpanzer";
		case DIAMOND_HELMET:
			return "Diamanthelme";
		case DIAMOND_HOE:
			return "Diamanthacken";
		case 	DIAMOND_LEGGINGS:
			return "Diamantbeinschutze";
		case DIAMOND_ORE:
			return "Diamanterze";
		case DIAMOND_PICKAXE:
			return "Diamantspitzhacken";
		case DIAMOND_SPADE:
			return "Diamantschaufeln";
		case DIAMOND_SWORD:
			return "Diamantschwerter";
		case 	DIODE:
			return "";
		case DIODE_BLOCK_OFF:
			return "";
		case DIODE_BLOCK_ON:
			return "";
		case DIRT:
			return "Erde";
		case DISPENSER:
			return "Werfer";
		case DOUBLE_PLANT:
			return "Hohes Gras";
		case DOUBLE_STEP:
			return "";
		case DOUBLE_STONE_SLAB2:
			return "";
		case DRAGON_EGG:
			return "Dracheneier";
//		case DRAGONS_BREATH:
//			return "";
		case DROPPER:
			return "Spender";
		case EGG:
			return "Eier";
//		case ELYTRA:
//			return "Elytras";
		case EMERALD:
			return "Smaragde";
		case EMERALD_BLOCK:
			return "Smaragdbl�cke";
		case EMERALD_ORE:
			return "Smaragderze";
		case EMPTY_MAP:
			return "Leere Karten";
		case ENCHANTED_BOOK:
			return "Verzauberte B�cher";
		case ENCHANTMENT_TABLE:
			return "Zaubertische";
//		case END_BRICKS:
//			return "Endsteine";
//		case END_CRYSTAL:
//			return "";
//		case END_GATEWAY:
//			return "Endportalrahmen";
//		case END_ROD:
//			return "";
		case ENDER_CHEST:
			return "Endertruhen";
		case ENDER_PEARL:
			return "Enderperlen";
		case ENDER_PORTAL:
			return "Enderportale";
		case ENDER_PORTAL_FRAME:
			return "Enderportale";
		case ENDER_STONE:
			return "Endsteine";
		case EXP_BOTTLE:
			return "Erfahrungsfl�schen";
		case EXPLOSIVE_MINECART:
			return "TNT-Loren";
		case EYE_OF_ENDER:
			return "Enderaugen";
		case FEATHER:
			return "Federn";
		case FENCE:
			return "Eichenholzz�une";
		case FENCE_GATE:
			return "Eichenholzzauntore";
		case FERMENTED_SPIDER_EYE:
			return "Fermentierte Spinnenaugen";
		case FIRE:
			return "Feuer";
		case FIREBALL:
			return "Feuerkugeln";
		case FIREWORK:
			return "Feuerwerke";
		case FIREWORK_CHARGE:
			return "Feuerwerke";
		case FISHING_ROD:
			return "Angeln";
		case FLINT:
			return "Feuersteine";
		case FLINT_AND_STEEL:
			return "Feuerzeuge";
		case FLOWER_POT:
			return "Blument�pfe";
		case FLOWER_POT_ITEM:
			return "";
//		case FROSTED_ICE:
//			return "Eis";
		case FURNACE:
			return "�fen";
		case GHAST_TEAR:
			return "Ghasttr�nen";
		case GLASS:
			return "Glas";
		case GLASS_BOTTLE:
			return "Glasflaschen";
		case GLOWING_REDSTONE_ORE:
			return "";
		case GLOWSTONE:
			return "Glowstone";
		case GLOWSTONE_DUST:
			return "Glowstonestaub";
		case GOLD_AXE:
			return "Gold�xte";
		case GOLD_BARDING:
			return "Goldene Pferder�stungen";
		case GOLD_BLOCK:
			return "Goldbl�cke";
		case GOLD_BOOTS:
			return "Goldstiefel";
		case GOLD_CHESTPLATE:
			return "Goldharnische";
		case GOLD_HELMET:
			return "Goldhelme";
		case GOLD_HOE:
			return "Goldhacken";
		case GOLD_INGOT:
			return "Goldbarren";
		case GOLD_LEGGINGS:
			return "Goldbeinschutze";
		case GOLD_NUGGET:
			return "Goldnuggets";
		case GOLD_ORE:
			return "Golderze";
		case GOLD_PICKAXE:
			return "Goldspitzhacken";
		case GOLD_PLATE:
			return "";
		case GOLD_RECORD:
			return "";
		case GOLD_SPADE:
			return "Goldschaufeln";
		case GOLD_SWORD:
			return "Goldschwerter";
		case GOLDEN_APPLE:
			return "Goldene �pfel";
		case GOLDEN_CARROT:
			return "Goldene Karotten";
		case GRASS:
			return "Grasbl�cke";
//		case GRASS_PATH:
//			return "";
		case GRAVEL:
			return "Kies";
		case GREEN_RECORD:
			return "";
		case GRILLED_PORK:
			return "Gebratenes Schweinefleisch";
		case HARD_CLAY:
			return "Gebrannter Lehm";
		case HAY_BLOCK:
			return "Strohballen";
		case HOPPER:
			return "Trichter";
		case HOPPER_MINECART:
			return "Trichterloren";
		case HUGE_MUSHROOM_1:
			return "Pilzbl�cke";
		case HUGE_MUSHROOM_2:
			return "Pilzbl�cke";
		case ICE:
			return "Eis";
		case INK_SACK:
			return "Tintenbeutel";
		case IRON_AXE:
			return "Eisen�xte";
		case IRON_BARDING:
			return "Eisene Pferder�stungen";
		case IRON_BLOCK:
			return "Eisenbl�cke";
		case IRON_BOOTS:
			return "Eisenstiefel";
		case IRON_CHESTPLATE:
			return "Eisenbrustpanzer";
		case IRON_DOOR:
			return "Eisent�re";
		case IRON_DOOR_BLOCK:
			return "Eisent�re";
		case IRON_FENCE:
			return "Eisengitter";
		case IRON_HELMET:
			return "Eisenhelme";
		case IRON_HOE:
			return "Eisenhacken";
		case IRON_INGOT:
			return "Eisenbarren";
		case IRON_LEGGINGS:
			return "Eisenbeinschutze";
		case IRON_ORE:
			return "Eisenerze";
		case IRON_PICKAXE:
			return "Eisenspitzhacken";
		case IRON_PLATE:
			return "Eisendruckplatten";
		case IRON_SPADE:
			return "Eisenschaufeln";
		case IRON_SWORD:
			return "Eisenschwerter";
		case IRON_TRAPDOOR:
			return "Eisenfallt�ren";
		case ITEM_FRAME:
			return "Rahmen";
		case JACK_O_LANTERN:
			return "K�rbislaternen";
		case JUKEBOX:
			return "Plattenspieler";
		case JUNGLE_DOOR:
			return "Jungleholzt�ren";
		case JUNGLE_DOOR_ITEM:
			return "Jungleholzt�ren";
		case JUNGLE_FENCE:
			return "Jungleholzz�une";
		case JUNGLE_FENCE_GATE:
			return "Jungleholzzaunt�ren";
		case JUNGLE_WOOD_STAIRS:
			return "Jungleholztreppen";
		case LADDER:
			return "Leiter";
		case LAPIS_BLOCK:
			return "Lapislazulibl�cke";
		case LAPIS_ORE:
			return "Lapislazulierze";
		case LAVA:
			return "Lava";
		case LAVA_BUCKET:
			return "Lavaeimer";
		case LEASH:
			return "Leinen";
		case LEATHER:
			return "Leder";
		case LEATHER_BOOTS:
			return "Lederstiefel";
		case LEATHER_CHESTPLATE:
			return "Lederjacken";
		case LEATHER_HELMET:
			return "Lederhelme";
		case LEATHER_LEGGINGS:
			return "Lederhosen";
		case LEAVES:
			return "Laub";
		case LEAVES_2:
			return "Laub";
		case LEVER:
			return "Hebel";
//		case LINGERING_POTION:
//			return "Tr�nke";
		case LOG:
			return "Baumst�mme";
		case LOG_2:
			return "Baumst�mme";
		case LONG_GRASS:
			return "hohes Gras";
		case MAGMA_CREAM:
			return "Magmacreme";
		case MAP:
			return "Karten";
		case MELON:
			return "Melone";
		case MELON_BLOCK:
			return "Melonenbl�cke";
		case MELON_SEEDS:
			return "Melonenkerne";
		case MELON_STEM:
			return "";
		case MILK_BUCKET:
			return "Milcheimer";
		case MINECART:
			return "Loren";
		case MOB_SPAWNER:
			return "Mobspawner";
		case MONSTER_EGG:
			return "Spawneier";
		case MONSTER_EGGS:
			return "Spawneier";
		case MOSSY_COBBLESTONE:
			return "Bemooste Bruchsteine";
		case MUSHROOM_SOUP:
			return "Pilzsuppen";
		case MUTTON:
			return "Rohes Hammelfleisch";
		case MYCEL:
			return "Myzel";
		case NAME_TAG:
			return "Namensschilder";
		case NETHER_BRICK:
			return "Netherziegel";
		case NETHER_BRICK_ITEM:
			return "Netherziegel";
		case NETHER_BRICK_STAIRS:
			return "Netherziegeltreppen";
		case NETHER_FENCE:
			return "Netherziegelz�une";
		case NETHER_STALK:
			return "";
		case NETHER_STAR:
			return "Nethersterne";
		case NETHER_WARTS:
			return "Netherwarzen";
		case NETHERRACK:
			return "Nethersteine";
		case NOTE_BLOCK:
			return "Notenbl�cke";
		case OBSIDIAN:
			return "Obsidian";
		case PACKED_ICE:
			return "Packeis";
		case PAINTING:
			return "Gem�lde";
		case PAPER:
			return "Papier";
		case PISTON_BASE:
			return "Kolben";
		case PISTON_EXTENSION:
			return "Kolben";
		case PISTON_MOVING_PIECE:
			return "Kolben";
		case PISTON_STICKY_BASE:
			return "Klebrige Kolben";
		case POISONOUS_POTATO:
			return "Giftige Kartoffeln";
		case PORK:
			return "Rohes Schweinefleisch";
		case PORTAL:
			return "Portale";
		case POTATO:
			return "Kartoffeln";
		case POTATO_ITEM:
			return "Kartoffeln";
		case POTION:
			return "Tr�nke";
		case POWERED_MINECART:
			return "Angetriebene Loren";
		case POWERED_RAIL:
			return "Antriebsschienen";
		case PRISMARINE:
			return "Prismarinbl�cke";
		case PRISMARINE_CRYSTALS:
			return "Prismarinkristalle";
		case PRISMARINE_SHARD:
			return "Prismarinscherben";
		case PUMPKIN:
			return "K�rbis";
		case PUMPKIN_PIE:
			return "K�rbiskuchen";
		case PUMPKIN_SEEDS:
			return "K�rbissamen";
		case PUMPKIN_STEM:
			return "K�rbispflanzen";
//		case PURPUR_BLOCK:
//			return "";
//		case PURPUR_DOUBLE_SLAB:
//			return "";
//		case PURPUR_PILLAR:
//			return "";
//		case PURPUR_SLAB:
//			return "";
//		case PURPUR_STAIRS:
//			return "";
		case QUARTZ:
			return "Netherquarz";
		case QUARTZ_BLOCK:
			return "Quarzbl�cke";
		case QUARTZ_ORE:
			return "Quarzerze";
		case QUARTZ_STAIRS:
			return "Quarztreppen";
		case RABBIT:
			return "Rohe Kaninchen";
		case RABBIT_FOOT:
			return "Hasenpfoten";
		case RABBIT_HIDE:
			return "Kaninchenfelle";
		case RABBIT_STEW:
			return "Kaninchenragouts";
		case RAILS:
			return "Schienen";
		case RAW_BEEF:
			return "Rohes Rindfleisch";
		case RAW_CHICKEN:
			return "Rohe H�hnchen";
		case RAW_FISH:
			return "Rohe Fische";
		case RECORD_10:
			return "Schallplatten";
		case RECORD_11:
			return "Schallplatten";
		case RECORD_12:
			return "Schallplatten";
		case RECORD_3:
			return "Schallplatten";
		case RECORD_4:
			return "Schallplatten";
		case RECORD_5:
			return "Schallplatten";
		case RECORD_6:
			return "Schallplatten";
		case RECORD_7:
			return "Schallplatten";
		case RECORD_8:
			return "Schallplatten";
		case RECORD_9:
			return "Schallplatten";
		case RED_MUSHROOM:
			return "Rote Pilze";
		case RED_ROSE:
			return "Blumen";
		case RED_SANDSTONE:
			return "Rote Sandsteine";
		case RED_SANDSTONE_STAIRS:
			return "Rote Sandsteintreppen";
		case REDSTONE:
			return "Redstone";
		case REDSTONE_BLOCK:
			return "Redstonebl�cke";
		case REDSTONE_COMPARATOR:
			return "Redstone Komparator";
		case REDSTONE_COMPARATOR_OFF:
			return "";
		case REDSTONE_COMPARATOR_ON:
			return "";
		case REDSTONE_LAMP_OFF:
			return "Redstonelampen";
		case REDSTONE_LAMP_ON:
			return "Redstonelampen";
		case REDSTONE_ORE:
			return "Redstoneerze";
		case REDSTONE_TORCH_OFF:
			return "Redstonefackeln";
		case REDSTONE_TORCH_ON:
			return "Redstonefackeln";
		case REDSTONE_WIRE:
			return "Redstone";
		case ROTTEN_FLESH:
			return "Verrottetes Fleisch";
		case SADDLE:
			return "S�ttel";
		case SAND:
			return "Sand";
		case SANDSTONE:
			return "Sandsteine";
		case SANDSTONE_STAIRS:
			return "Sandsteintreppen";
		case SAPLING:
			return "Setzlinge";
		case SEA_LANTERN:
			return "Seelaternen";
		case SEEDS:
			return "Samen";
		case SHEARS:
			return "Scheeren";
//		case SHIELD:
//			return "Schilder";
		case SIGN:
			return "Schilder";
		case SIGN_POST:
			return "Schilder";
		case SKULL:
			return "Sch�del/K�pfe";
		case SKULL_ITEM:
			return "Sch�del/K�pfe";
		case SLIME_BALL:
			return "Schleimb�lle";
		case SLIME_BLOCK:
			return "Schleimbl�cke";
		case SMOOTH_BRICK:
			return "Steinziegel";
		case SMOOTH_STAIRS:
			return "Steinziegeltreppen";
		case SNOW:
			return "Schnee";
		case SNOW_BALL:
			return "Schneeb�lle";
		case SNOW_BLOCK:
			return "Schneebl�cke";
		case SOIL:
			return "Erde";
		case SOUL_SAND:
			return "Seelensand";
		case SPECKLED_MELON:
			return "Glitzernde Melonen";
//		case SPECTRAL_ARROW:
//			return "Pfeile";
		case SPIDER_EYE:
			return "Spinnenaugen";
//		case SPLASH_POTION:
//			return "Wurftr�nke";
		case SPONGE:
			return "Schw�mme";
		case SPRUCE_DOOR:
			return "Fichtenholzt�ren";
		case SPRUCE_DOOR_ITEM:
			return "Fichtenholzt�ren";
		case SPRUCE_FENCE:
			return "Fichtenholzz�une";
		case SPRUCE_FENCE_GATE:
			return "Fichtenholzzaunt�ren";
		case SPRUCE_WOOD_STAIRS:
			return "Fichtenholztreppen";
		case STAINED_CLAY:
			return "Gef�rbter Ton";
		case STAINED_GLASS:
			return "Gef�rbtes Glas";
		case STAINED_GLASS_PANE:
			return "Gef�rbte Glasscheiben";
		case STANDING_BANNER:
			return "Banner";
		case STATIONARY_LAVA:
			return "Lava";
		case STATIONARY_WATER:
			return "Wasser";
		case STEP:
			return "Step";
		case STICK:
			return "St�cke";
		case STONE:
			return "Steine";
		case STONE_AXE:
			return "Stein�xte";
		case STONE_BUTTON:
			return "Steinkn�pfe";
		case STONE_HOE:
			return "Steinhacken";
		case STONE_PICKAXE:
			return "Steinspitzhacken";
		case STONE_PLATE:
			return "Steindruckplatten";
		case STONE_SLAB2:
			return "Steinstufen";
		case STONE_SPADE:
			return "Steinschaufeln";
		case STONE_SWORD:
			return "Steinschwerter";
		case STORAGE_MINECART:
			return "G�terloren";
		case STRING:
			return "F�den";
//		case STRUCTURE_BLOCK:
//			return "";
		case SUGAR:
			return "Zucker";
		case SUGAR_CANE:
			return "Zuckerrohr";
		case SUGAR_CANE_BLOCK:
			return "Zuckerrohr";
		case SULPHUR:
			return "Schiesspulver";
		case THIN_GLASS:
			return "Thin Glas";
//		case TIPPED_ARROW:
//			return "Pfeile";
		case TNT:
			return "TNT";
		case TORCH:
			return "Fackel";
		case TRAP_DOOR:
			return "Fallt�ren";
		case TRAPPED_CHEST:
			return "Redstonetruhen";
		case TRIPWIRE:
			return "F�den";
		case TRIPWIRE_HOOK:
			return "Haken";
		case VINE:
			return "Ranken";
		case WALL_BANNER:
			return "Banner";
		case WALL_SIGN:
			return "Schilder";
		case WATCH:
			return "Uhren";
		case WATER:
			return "Wasser";
		case WATER_BUCKET:
			return "Wassereimer";
		case WATER_LILY:
			return "Seerosenbl�tter";
		case WEB:
			return "Spinnennetze";
		case WHEAT:
			return "Weizen";
		case WOOD:
			return "Holzplanken";
		case WOOD_AXE:
			return "Holz�xte";
		case WOOD_BUTTON:
			return "Holzkn�pfe";
		case WOOD_DOOR:
			return "Holzt�ren";
		case WOOD_DOUBLE_STEP:
			return "Holzstufen";
		case WOOD_HOE:
			return "Holzhacken";
		case WOOD_PICKAXE:
			return "Holzspitzhacken";
		case WOOD_PLATE:
			return "Holzplatten";
		case WOOD_SPADE:
			return "Holzschaufeln";
		case WOOD_STAIRS:
			return "Holztreppen";
		case WOOD_STEP:
			return "Holzstufen";
		case WOOD_SWORD:
			return "Holzschwerter";
		case WOODEN_DOOR:
			return "Holzt�ren";
		case WOOL:
			return "Wolle";
		case WORKBENCH:
			return "Werkb�nke";
		case WRITTEN_BOOK:
			return "Beschriebene B�cher";
		case YELLOW_FLOWER:
			return "Blumen";
		default:
			return material.name().toLowerCase();
		}

	}
}