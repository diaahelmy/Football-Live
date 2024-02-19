package com.example.getapi

class Logo() {
    private val teamLogo = mapOf(
//    League:"Bundesliga"
        "Borussia Dortmund" to R.drawable.borussia_dortmund_logo,
        "FC Bayern München" to R.drawable.fc_bayern_munchen__1900__vector_logo,
        "Bayer 04 Leverkusen" to R.drawable.bayer_04_leverkusen_logo,
        "VfB Stuttgart" to R.drawable.vfb_stuttgart_logo___brandlogos_net,
        "RB Leipzig" to R.drawable.rb_leipzig_logo___brandlogos_net,
        "Eintracht Frankfurt" to R.drawable.eintracht_frankfurt_logo,
        "SC Freiburg" to R.drawable.sc_freiburg_logo,
        "TSG Hoffenheim" to R.drawable.tsg_1899_hoffenheim_logo,
        "1. FC Heidenheim" to R.drawable.___fc_heidenheim_logo___brandlogos_net,
        "SV Werder Bremen" to R.drawable.werder_bremen_1950_s_logo_b40017e0f7_seeklogo_com,
        "FC Augsburg" to R.drawable.fc_augsburg_vector_logo,
        "Darmstadt 98" to R.drawable.sv_darmstadt_98_vector_logo,
        "VfL Wolfsburg" to R.drawable.vfl_wolfsburg_logo_0c49808a7c_seeklogo_com,
        "Borussia M'gladbach" to R.drawable.borussia_m_gladbach_6eeadc0d1f_seeklogo_com,
        "VfL Bochum 1848" to R.drawable.vfl_bochum_logo_ebe2f74be8_seeklogo_com,
        "1. FC Union Berlin" to R.drawable.union_berlin_logo,
        "1. FSV Mainz 05" to R.drawable.__fsv_mainz_05_vector_logo,
        "1. FC Köln" to R.drawable.___fc_koln_logo,

        //LaLiga
        "Real Madrid" to R.drawable.real_madrid_logo,
        "Girona FC" to R.drawable.girona_fc_logo___brandlogos_net,
        "Barcelona" to R.drawable.fc_barcelona_logo___brandlogos_net,
        "Atlético Madrid" to R.drawable.club_atletico_de_madrid_vector_logo,
        "Real Betis" to R.drawable.real_betis_logo___brandlogos_net,
        "Athletic Club" to R.drawable.athletic_club_bilbao_vector_logo,
        "Real Sociedad" to R.drawable.real_sociedad_logo,
        "Las Palmas" to R.drawable.las_palmas_logo_vector,
        "Valencia" to R.drawable.valencia_cf_logo,
        "Getafe" to R.drawable.getafe_logo_vector,
        "Osasuna" to R.drawable.club_atletico_osasuna_vector_logo,
        "Deportivo Alavés" to R.drawable.deportivo_alaves_logo___brandlogos_net,
        "Villarreal" to R.drawable.villarreal_cf_logo,
        "Rayo Vallecano" to R.drawable.rayo_vallecano_logo_vector,
        "Sevilla" to R.drawable.sevilla_fc_logo___brandlogos_net,
        "Celta Vigo" to R.drawable.celta_vigo_logo___brandlogos_net,
        "Mallorca" to R.drawable.rcd_mallorca_logo___brandlogos_net,
        "Cádiz" to R.drawable.cadiz_cf_logo___brandlogos_net,
        "Granada" to R.drawable.granada_logo_vector,
        "Almería" to R.drawable.ud_almeria_logo___brandlogos_net,


        "Fluminense-PI" to R.drawable.fluminense_football_club_logo_vector,
        "Benfica" to R.drawable.sl_benfica_logo___brandlogos_net,
        "Santo André" to R.drawable.santo_andr_,


        //Premier League
        "Arsenal" to R.drawable.arsenal_logo_vector,
        "Liverpool" to R.drawable.liverpool_fc_brandlogo_net,
        "Manchester City" to R.drawable.manchester_city_fc_logo,
        "Tottenham Hotspur" to R.drawable.tottenham_hotspur_fc_logo,
        "Aston Villa" to R.drawable.aston_villa_logo,
        "Manchester United" to R.drawable.manchester_united_logo_vector,
        "Newcastle United" to R.drawable.newcastle_united_logo_preview,
        "West Ham United" to R.drawable.west_ham_united_fc_logo_preview,
        "Brighton & Hove Albion" to R.drawable.brighton_hove_albion_logo,
        "Wolverhampton" to R.drawable.wolverhampton_wanderers_fc_logo,
        "Chelsea" to R.drawable.chelsea_fc_logo_preview,
        "Fulham" to R.drawable.fulham_fc_logo,
        "Bournemouth" to R.drawable.afc_bournemouth_logo_brandlogos_net_wifjg,
        "Brentford" to R.drawable.brentford_fc_logo_vector,
        "Crystal Palace" to R.drawable.crystal_palace_fc_logo___brandlogos_net,
        "Nottingham Forest" to R.drawable.nottingham_forest_logo_brandlogo_net,
        "Luton Town" to R.drawable.luton_town_fc_logo___brandlogos_net,
        "Everton" to R.drawable.everton_fc_logo_preview,
        "Burnley" to R.drawable.burnley_fc_logo_brandlogos_net_vh9ys,
        "Sheffield United" to R.drawable.sheffield_united_fc_logo,
//2
        "West Bromwich Albion" to R.drawable.west_brom_logo_vector,
        "Ipswich Town" to R.drawable.ipswich_town_fc_logo___brandlogos_net,
        "Stoke City" to R.drawable.stoke_city_fc_vector,
        "Blackburn Rovers" to R.drawable.blackburn_rovers_fc_logo___brandlogos_net,
//3

        "Portsmouth" to R.drawable.portsmouth_fc_logo___brandlogos_net,
        "Derby County" to R.drawable.derby_county_fc_logo___brandlogos_net,
        "Bolton Wanderers" to R.drawable.bolton_wanderers_fc_logo___brandlogos_net,
        "Barnsley" to R.drawable.barnsley_fc_logo___brandlogos_net,
        "Peterborough United" to R.drawable.peterborough_united_fc_logo___brandlogos_net,
        "Stevenage" to R.drawable.stevenage_fc_logo___brandlogos_net,
        "Oxford United" to R.drawable.oxford_united_fc_logo___brandlogos_net,
        "Blackpool" to R.drawable.blackpool_fc_logo___brandlogos_net,
        "Leyton Orient" to R.drawable.leyton_orient_fc_logo___brandlogos_net,
        "Lincoln City" to R.drawable.lincoln_city_fc_logo___brandlogos_net,
        "Northampton Town" to R.drawable.northampton_town_fc_logo___brandlogos_net,
        "Bristol Rovers" to R.drawable.bristol_rovers_fc_logo___brandlogos_net,
        "Exeter City" to R.drawable.exeter_city_fc_logo___brandlogos_net,
        "Wigan Athletic" to R.drawable.wigan_athletic_fc_logo,
        "Wycombe Wanderers" to R.drawable.wycombe_wanderers_fc_logo___brandlogos_net,
        "Cambridge United" to R.drawable.cambridge_united_fc_logo___brandlogos_net,
        "Burton Albion" to R.drawable.burton_albion_fc_logo_brandlogos_net,
        "Reading" to R.drawable.reading_fc_logo_vector,
        "Shrewsbury Town" to R.drawable.shrewsbury_town_fc_logo___brandlogos_net,
        "Charlton Athletic" to R.drawable.charlton_athletic_fc_logo___brandlogos_net,
        "Port Vale" to R.drawable.port_vale_logo___brandlogos_net,
        "Cheltenham Town" to R.drawable.cheltenham_town_fc_logo___brandlogos_net,
        "Fleetwood Town" to R.drawable.fleetwood_town_fc_logo___brandlogos_net,
        "Carlisle United" to R.drawable.carlisle_united_fc_logo___brandlogos_net,


        "Mirassol" to R.drawable.mirassol_fc_logo_68f027ac1a_seeklogo_com,
        "San Lorenzo" to R.drawable.sheffield_wednesday_fc_logo_1e4c79d10b_seeklogo_com,
        "Sheffield Wednesday" to R.drawable.sheffield_wednesday_fc_logo_1e4c79d10b_seeklogo_com,
        "Birmingham City" to R.drawable.birmingham_city_fc_logo_vector,
        "SC Freiburg" to R.drawable.mirassol_fc_logo_68f027ac1a_seeklogo_com,

        // italya
        "Inter" to R.drawable.inter_milan_logo,
        "Juventus" to R.drawable.juventus_fc_brandlogo_net,
        "Milan" to R.drawable.ac_milan_logo,
        "Atalanta" to R.drawable.atalanta_bc_logo___brandlogos_net,
        "Roma" to R.drawable.as_roma_logo_vector,
        "Bologna" to R.drawable.bologna_logo_vector,
        "Napoli" to R.drawable.napoli_logo_vector,
        "Fiorentina" to R.drawable.fiorentina_logo_vector,
        "Lazio" to R.drawable.ss_lazio_roma_vector_logo,
        "Torino" to R.drawable.torino_logo_vector,
        "Genoa" to R.drawable.genoa_cfc_vector_logo,
        "Monza" to R.drawable.ac_monza_logo___brandlogos_net,
        "Lecce" to R.drawable.us_lecce_logo___brandlogos_net,
        "Frosinone" to R.drawable.frosinone_calcio_vector_logo,
        "Sassuolo" to R.drawable.us_sassuolo_calcio_logo_brandlogos_net_wl1mr,
        "Udinese" to R.drawable.udinese_calcio_vector_logo,
        "Hellas Verona" to R.drawable.hellas_verona_fc_logo___brandlogos_net,
        "Cagliari" to R.drawable.cagliari_calcio_logo,
        "Empoli" to R.drawable.empoli_fc_logo,
        "Salernitana" to R.drawable.salernitana_logo___brandlogos_net,
        "Deportivo Alavés" to R.drawable.alaves_logo_vector,

//    League:"Saudi Pro League"
//    League ID:3708
        "Al-Hilal" to R.drawable.al_hilal_sfc_logo,
        "Al-Nassr" to R.drawable.al_nassr_fc_logo,
        "Al-Ahli" to R.drawable.al_ahli_vector_logo,
        "Al-Taawoun" to R.drawable.al_taawoun_fc_logo___brandlogos_net,
        "Al-Ittihad" to R.drawable.al_ittihad_club_logo___brandlogos_net,
        "Damac FC" to R.drawable.damac_fc_logo_6945ea9354_seeklogo_com,
        "Al-Fateh" to R.drawable.al_fateh,
        "Al-Ettifaq" to R.drawable.al_ettifaq_fc_logo___brandlogos_net,
        "Al-Wehda" to R.drawable.al_wehda_seeklogo,
        "Al-Khaleej" to R.drawable.al_khaleej_seeklogo,
        "Al-Shabab" to R.drawable.al_shabab_fc_logo___brandlogos_net,
        "Al Akhdood" to R.drawable.al_akhdood,
        "Al-Raed" to R.drawable.al_raed,
        "Al-Fayha" to R.drawable.al_fayha_fc_logo___brandlogos_net,
        "Al Riyadh" to R.drawable.al_riyadh,
        "Al Tai" to R.drawable.al_tai,
        "Abha" to R.drawable.abha_club_logo___brandlogos_net,
        "Al Hazem" to R.drawable.al_hazem,


        "FK Pardubice B" to R.drawable.fkpardubiceb,
        "Spartak Velká Bíteš" to R.drawable.spartak,
        "Sepahan S.C." to R.drawable.sepahan,
        "Qatar" to R.drawable.qatar_flag_logo_31ea4c9178_seeklogo_com,
        "Jordan" to R.drawable.jordan_flag_logo_077234bc28_seeklogo_com,
        "BATE Borisov" to R.drawable.bate_borisov_logo_vector,
        "Neman Grodno" to R.drawable.fk_neman_grodno_vector_logo,
        "Feyenoord" to R.drawable.feyenoord_rotterdam_logo___brandlogos_net,

        //3657 Algeria     /n//n/"Ligue 1, Reserves" 40242
        "MC Alger" to R.drawable.mc_alger,
        "MC Alger U21" to R.drawable.mc_alger,
        "CR Belouizdad" to R.drawable.cr_belouizdad,
        "CR Belouizdad U21" to R.drawable.cr_belouizdad,
        "Paradou AC" to R.drawable.paradou_ac,
        "Paradou U21" to R.drawable.paradou_ac,
        "CS Constantine" to R.drawable.cs_constantine,
        "CS Constantine U21" to R.drawable.cs_constantine,
        "ES Sétif" to R.drawable.es_s_tif,
        "ES Sétif U21" to R.drawable.es_s_tif,
        "USM Alger" to R.drawable.usm_alger,
        "USM Alger U21" to R.drawable.usm_alger,
        "JS Kabylie" to R.drawable.js_kabylie,
        "JS Kabylie U21" to R.drawable.js_kabylie,
        "MC El Bayadh" to R.drawable.mc_el_bayadh,
        "MC EL Bayadh U21" to R.drawable.mc_el_bayadh,
        "US Biskra" to R.drawable.us_biskra,
        "US Biskra U21" to R.drawable.us_biskra,
        "USM Khenchela" to R.drawable.usm_khenchela,
        "US Khenchela U21" to R.drawable.usm_khenchela,
        "JS Saoura" to R.drawable.js_saoura,
        "JS Saoura U21" to R.drawable.js_saoura,
        "ASO Chlef" to R.drawable.aso_chlef,
        "ASO Chlef U21" to R.drawable.aso_chlef,
        "NC Magra" to R.drawable.nc_magra,
        "NC Magra U21" to R.drawable.nc_magra,
        "ES Ben Aknoun" to R.drawable.es_ben_aknoun,
        "ES Ben Aknoun U21" to R.drawable.es_ben_aknoun,
        "MC Oran" to R.drawable.mc_oran,
        "MC Oran U21" to R.drawable.mc_oran,
        "US Souf" to R.drawable.us_souf,
        "US Oued Souf U21" to R.drawable.us_oued_souf_u21,


//
//        //41380 Bahrain
        "Bahrain SC" to R.drawable.bahrain,
        "A'Ali FC" to R.drawable.a_ali_fc,
        "Malkiya Club" to R.drawable.malkiya_club,
        "Al-Budaiya" to R.drawable.al_budaiya,
        "Al Ittihad Bahrain" to R.drawable.al_ittihad_bahrain,
        "Isa Town" to R.drawable.isa_town,
        "Al Ittifaq" to R.drawable.al_ittifaq,
        "Bouri" to R.drawable.bouri,
        "Um Alhassam" to R.drawable.um_alhassam,
        "Etehad al Reef" to R.drawable.etehad_al_reef,
        "Qalali" to R.drawable.qalali,
        "Al-Tadhmon" to R.drawable.al_tadhmon,


//"1. Division" 681
        "APOEL Nicosia" to R.drawable.apoel_fc_vector_logo,
        "Aris Limassol" to R.drawable.aris_fc_limassol_vector_logo,
        "Pafos FC" to R.drawable.pafos_fc,
        "AEK Larnaca" to R.drawable.aek_larnaca_vector_logo,
        "Omonia Nicosia" to R.drawable.ac_omonia_logo___brandlogos_net,
        "Anorthosis Famagusta" to R.drawable.anorthosis_fc_vector_logo,
        "Apollon Limassol" to R.drawable.apollon_fc_limassol_vector_logo,
        "Nea Salamina Famagusta" to R.drawable.nea_salamina_famagusta,
        "AEL Limassol" to R.drawable.ael_limassol__1930__vector_logo,
        "Ethnikos Achnas" to R.drawable.ethnikos_achnas,
        "Karmiotissa Polemidion" to R.drawable.karmiotissa_polemidion,
        "AEZ Zakakiou" to R.drawable.aez_zakakiou,
        "Othellos Athienou" to R.drawable.othellos_athienou,
        "Doxa Katokopias" to R.drawable.doxa_katokopias,


        "Stade Rennais" to R.drawable.stade_rennais_fc_logo___brandlogos_net,
        "Sporting Braga" to R.drawable.sporting_clube_de_braga__1921__vector_logo,
        "Qarabağ" to R.drawable.fk_qarabag_agdam_vector_logo,
        "Ajax" to R.drawable.amsterdamsche_fc_ajax_vector_logo,
        "GNK Dinamo Zagreb" to R.drawable.dinamo_zagreb_logo_vector,
        "Maccabi Haifa" to R.drawable.maccabi_haifa_fc_logo___brandlogos_net,
        "Gent" to R.drawable.kaa_gent__current__vector_logo,
        "Ludogorets" to R.drawable.pfc_ludogorets_razgrad_vector_logo,

        "Servette FC" to R.drawable.servette_fc_logo___brandlogos_net,

//          League:"Copa de la Liga"
//            League ID:72142
        "River Plate" to R.drawable.club_atletico_river_plate_logo,
        "Independiente" to R.drawable.independiente,
        "Gimnasia y Esgrima" to R.drawable.gimnasia_y_esgrima,
        "Instituto Córdoba" to R.drawable.instituto_c_rdoba,
        "Argentinos Juniors" to R.drawable.argentinos_juniors,
        "Barracas Central" to R.drawable.barracas_central,
        "Talleres" to R.drawable.talleres,
        "Vélez Sarsfield" to R.drawable.club_velez_sarsfield_vector_logo,
        "Independiente Rivadavia" to R.drawable.independiente_rivadavia_de_mendoza_logo_a134365d73_seeklogo_com,
        "Rosario Central" to R.drawable.rosario_central_logo_024b403654_seeklogo_com,

        "Huracán" to R.drawable.hurac_n,
        "Atlético Tucumán" to R.drawable.atl_tico_tucum_n,
        "Banfield" to R.drawable.banfield,
        "Deportivo Riestra" to R.drawable.deportivo_riestra,


//                   League:"Primera B, Apertura"
//               League ID:57659
//
        "Cúcuta Deportivo" to R.drawable.c_cuta_deportivo,
        "Real Cundinamarca" to R.drawable.real_cundinamarca,
        "Llaneros FC" to R.drawable.llaneros,
        "Unión Magdalena" to R.drawable.uni_n_magdalena,
        "Leones FC" to R.drawable.leones_fc,
        "Deportes Quindío" to R.drawable.deportes_quind_o,
        "Orsomarso" to R.drawable.orsomarso,
        "Atlético Huila" to R.drawable.atl_tico_huila,
        "Real Cartagena" to R.drawable.real_cartagena,
        "Bogotá FC" to R.drawable.bogot__fc,
        "Barranquilla FC" to R.drawable.barranquilla_fc,
        "Real Santander" to R.drawable.real_santander,
        "Boca Juniors de Cali" to R.drawable.boca_juniors_de_cali,
        "Atlético Cali" to R.drawable.atl_tico_cali,
        "Internacional de Palmira" to R.drawable.internacional_de_palmira,


//       League:"Paulista Série A1"
//       League ID:57411
        "Santos" to R.drawable.santos_futebol_clube_vector_logo,
        "Ituano" to R.drawable.ituano,
        "Portuguesa" to R.drawable.portuguesa,
        "Santo André" to R.drawable.santo_andr_,
        "Água Santa" to R.drawable._gua_santa,

//         League:"Capixaba, Série A"
//         League ID:77941
        "Real Noroeste" to R.drawable.real_noroeste,
        "Rio Branco-ES" to R.drawable.rio_brancoaes,
        "Porto Vitória" to R.drawable.porto_vit_ria,
        "Desportiva Ferroviária" to R.drawable.desportiva_ferrovi_ria,
        "Vitória-ES" to R.drawable.vit_ria,
        "Nova Venécia" to R.drawable.nova_ven_cia,
        "Jaguaré EC" to R.drawable.jaguar__ec,
        "Serra FC" to R.drawable.serra_fc,
        "Rio Branco de Venda Nova" to R.drawable.rio_branco_de_venda_nova,
        "Estrela do Norte FC" to R.drawable.estrela_do_norte_fc,


//         League:"Carioca Série A – Taça Guanabara"
//         League ID:57585


        "Flamengo" to R.drawable.clube_de_regatas_do_flamengo_2001_2004_logo_vector,
        "Nova Iguaçu" to R.drawable.nova_igua_u,
        "Botafogo" to R.drawable.botafogo_de_futebol_e_regatas_logo_vector,
        "Vasco da Gama" to R.drawable.club_de_regatas_vasco_da_gama_logo_vector,
        "Boavista" to R.drawable.boavista_fc_vector_logo,
        "Portuguesa-RJ" to R.drawable.portuguesa,
        "Madureira" to R.drawable.madureira,
        "Volta Redonda" to R.drawable.volta_redonda,
        "Bangu" to R.drawable.bangu,
        "Sampaio Corrêa-RJ" to R.drawable.sampaio124321512,
        "Audax-RJ" to R.drawable.audax1821823,


//       Catarinense, Serie A
        //  57299
        "Criciúma" to R.drawable.crici_ma,
        "Marcílio Dias" to R.drawable.marc_lio_dias,
        "Figueirense" to R.drawable.figueirense,
        "Avaí" to R.drawable.ava_,
        "Barra" to R.drawable.barra,
        "Joinville" to R.drawable.joinville,
        "Hercílio Luz" to R.drawable.herc_lio_luz,
        "Brusque" to R.drawable.brusque,
        "Internacional de Lages" to R.drawable.internacional_de_lages,
        "Chapecoense" to R.drawable.chapecoense,
        "Concórdia Atlético Clube" to R.drawable.conc_rdia_atl_tico_clube,
        "Nação Esportes" to R.drawable.na__o_esportes,


//                League :"Cearense, Série A"
//                League ID:57343
        "Fortaleza" to R.drawable.fortaleza,
        "Maracanã" to R.drawable.maracan_,
        "Floresta" to R.drawable.floresta,
        "Caucaia" to R.drawable.caucaia,
        "Atlético Cearense" to R.drawable.atl_tico_cearense,


//    League:"Paranaense"
//    League ID:57346

        "Athletico" to R.drawable.club_athletico_paranaense_logo___brandlogos_net,
        "Coritiba" to R.drawable.coritiba,
        "Maringá" to R.drawable.maring_,
        "Azuriz" to R.drawable.azuriz,
        "Operário-PR" to R.drawable.oper_rio,
        "Cianorte" to R.drawable.cianorte,
        "Cascavel" to R.drawable.cascavel,
        "Londrina" to R.drawable.londrina,
        "Clube Andraus Brasil" to R.drawable.clube_andraus_brasil,
        "Galo Maringá" to R.drawable.galo_maring_,
        "Independente São Joseense" to R.drawable.independente_s_o_joseense,
        "PSTC Procopense" to R.drawable.pstc_procopense,

//    League:"Copa do Nordeste"
//    League ID:70849

        "CRB" to R.drawable.crb,
        "Sport Recife" to R.drawable.sport_recife,
        "Botafogo-PB" to R.drawable.botafogo_de_futebol_e_regatas_logo_vector,
        "Ceará" to R.drawable.ceara_sporting_club_logo___brandlogos_net,
        "Vitória" to R.drawable.vit_ria,
        "Ríver PI" to R.drawable.r_ver_pi,
        "Maranhão" to R.drawable.maranh_o,
        "América-RN" to R.drawable.america_futebol_clube_de_natal_rn,

//    League:"Liga Premier Serie B"
//    League ID:119578

        "CD Ayense AC" to R.drawable.cd_ayense_ac,
        "CDM FC" to R.drawable.cdm_fc,
        "Aguacateros CD Uruapan" to R.drawable.aguacateros_cd_uruapan,
        "Artesanos Metepec FC" to R.drawable.artesanos_metepec_fc,
        "Club Atletico Pachuca" to R.drawable.club_atletico_pachuca,
        "Chilpancingo" to R.drawable.chilpancingo,
        "Santiago FC" to R.drawable.santiago_fc,
        "Chilangos FC" to R.drawable.chilangos_fc,
        "CF Petroleros De Poza Rica" to R.drawable.cf_petroleros_de_poza_rica,
        "Huracanes Izcalli FC" to R.drawable.huracanes_izcalli_fc,
        "CDF Zitácuaro" to R.drawable.cdf_zit_cuaro,
        "Caja Oblatos Cfd" to R.drawable.caja_oblatos_cfd,

        "Deportivo Dongu F.C." to R.drawable.deportivo_dongu_f_c_,
        "Ciervos FC" to R.drawable.ciervos_fc,
        "Cañoneros FC" to R.drawable.ca_oneros_fc,


        //43049
        "Mekelakeya" to R.drawable.mekelakeya,
        "Ethiopia Nigd Bank" to R.drawable.ethiopia_nigd_bank,
        "Ethiopia Bunna" to R.drawable.ethiopia_bunna,
        "Saint George" to R.drawable.saint_george,
        "Fasil Kenema" to R.drawable.fasil_kenema,
        "Adama City" to R.drawable.adama_city,
        "Wolaita Dicha FC" to R.drawable.wolaita_dicha_fc,
        "Bahir Dar Kenema FC" to R.drawable.bahir_dar_kenema_fc,
        "Sidama Bunna FC" to R.drawable.sidama_bunna_fc,
        "Hadiya Hossana" to R.drawable.hadiya_hossana,
        "Hawassa City" to R.drawable.hawassa_city,
        "Dire Dawa" to R.drawable.dire_dawa,
        "Ethiopian Medhin" to R.drawable.ethiopian_medhin,
        "Wolkite City FC" to R.drawable.wolkite_city_fc,
        "Shashemene Kenema" to R.drawable.shashemene_kenema,
        "Hambericho Durame" to R.drawable.hambericho_durame,


//    League:"Superliga"
//    League ID:219

        "FC Midtjylland" to R.drawable.fc_midtjylland_vector_logo,
        "Brøndby IF" to R.drawable.brondby_if_logo___brandlogos_net,
        "FC København" to R.drawable.fc_copenhagen_logo___brandlogos_net,
        "AGF" to R.drawable.agf,
        "FC Nordsjælland" to R.drawable.fc_nordsj_lland,
        "Silkeborg IF" to R.drawable.silkeborg_if_vector_logo,
        "Lyngby" to R.drawable.lyngby_bk_vector_logo,
        "Viborg FF" to R.drawable.viborg_ff_vector_logo,
        "Odense BK" to R.drawable.odense_bk,
        "Randers FC" to R.drawable.randers_fc_vector_logo,

//            League:"Trendyol Süper Lig"
//                League ID:62

//    League:"3. Liga"
//    League ID:8343

//    League:"National 1"
//    League ID:950

//    League:"Premiership"
//        League ID:3830
//

        //16753
        //5071

//    League:"2. Bundesliga"
//    League ID:41


        "FC St. Pauli" to R.drawable.fc_st_pauli_vector_logo,
        "Holstein Kiel" to R.drawable.kieler_sv_holstein_vector_logo,
        "Hamburger SV" to R.drawable.hamburger_sv_logo_preview,
        "SpVgg Greuther Fürth" to R.drawable.spvgg_greuther_furth_logo,
        "Hannover 96" to R.drawable.hannover_sv_96_vector_logo,
        "SC Paderborn 07" to R.drawable.sc_paderborn_07_vector_logo,
        "Fortuna Düsseldorf" to R.drawable.tsv_fortuna_95_dusseldorf_vector_logo,
        "Hertha BSC" to R.drawable.hertha_bsc_logo,
        "SV 07 Elversberg" to R.drawable.spvgg_07_elversberg__1907__vector_logo,
        "1. FC Nürnberg" to R.drawable.__fc_nurnberg_vector_logo,
        "1. FC Magdeburg" to R.drawable.__fc_magdeburg_vector_logo,
        "Karlsruher SC" to R.drawable.karlsruher_sc_vector_logo,
        "SV Wehen Wiesbaden" to R.drawable.sv_wehen_wiesbaden_vector_logo,
        "FC Schalke 04" to R.drawable.fc_schalke_04_vector_logo,
        "Eintracht Braunschweig" to R.drawable.tsv_eintracht_braunschweig__1895__vector_logo,
        "1. FC Kaiserslautern" to R.drawable.__fc_kaiserslautern_vector_logo,
        "F.C. Hansa Rostock" to R.drawable.fc_hansa_rostock_vector_logo,
        "VfL Osnabrück" to R.drawable.vfl_osnabruck_vector_logo,


//    League:"Trendyol 1.Lig"
//    League ID:101
//
//    League:"Ekstraklasa"
//    League ID:64
//
//    League:"Superliga"
//    League ID:12
//
//    League:"Niké Liga"
//    League ID:92
//
//    League:"U19 Friendly Games"
//    League ID:5799
//
//
//    League:"Kategoria Superiore"
//    League ID:2891
//

//        League:"Ligue 1"  
//    League ID:4
        "Paris Saint-Germain" to R.drawable.paris_saint_germain_logo,

        "Nice" to R.drawable.ogc_nice_logo___brandlogos_net,

        "Lille" to R.drawable.lille_osc_logo,

        "AS Monaco" to R.drawable.as_monaco_fc_logo,

        "Stade Brestois" to R.drawable.stade_brestois_29_logo___brandlogos_net,

        "Lens" to R.drawable.rc_lens_logo,

        "Stade Rennais" to R.drawable.stade_rennais_fc_logo___brandlogos_net,

        "Olympique de Marseille" to R.drawable.olympique_de_marseille_logo_vector,


        "Stade de Reims" to R.drawable.stade_de_reims_logo___brandlogos_net,


        "RC Strasbourg" to R.drawable.rc_strasbourg_alsace_logo___brandlogos_net,

        "Olympique Lyonnais" to R.drawable.olympique_lyonnais_logo___brandlogos_net,

        "Le Havre" to R.drawable.le_havre_ac_logo___brandlogos_net,

        "Nantes" to R.drawable.fc_nantes_logo___brandlogos_net,

        "Toulouse" to R.drawable.toulouse_fc_logo___brandlogos_net,

        "Montpellier" to R.drawable.montpellier_hsc_logo___brandlogos_net,

        "Lorient" to R.drawable.fc_lorient_logo___brandlogos_net,

        "Metz" to R.drawable.fc_metz_2021_logo_661f373862_seeklogo_com,

        "Clermont Foot" to R.drawable.clermont_foot_logo___brandlogos_net,


//5
        "Bodø/Glimt" to R.drawable.fk_bodo_glimt___brandlogos_net,

        "Haugesund" to R.drawable.fk_haugesund_vector_logo,

        "Fredrikstad FK" to R.drawable.fredrikstad_fk_vector_logo,

        "HamKam" to R.drawable.hamkam,

        "KFUM Oslo" to R.drawable.kfum_oslo_vector_logo,

        "Kristiansund BK" to R.drawable.kristiansund_bk_vector_logo,

        "Lillestrøm SK" to R.drawable.lillestrom_sk_vector_logo,

        "Molde FK" to R.drawable.molde_fk_logo_vector,

        "Odds BK" to R.drawable.odd_bk__current__vector_logo,

        "Rosenborg BK" to R.drawable.rosenborg_bk__current__vector_logo,

        "Sandefjord Fotball" to R.drawable.sandefjord_fotball__1998__vector_logo,

        "Sarpsborg 08" to R.drawable.sarpsborg_08,

        "SK Brann" to R.drawable.sk_brann_vector_logo,

        "Strømsgodset" to R.drawable.str_msgodset,

        "Tromsø IL" to R.drawable.tromso_il_vector_logo,

        "Viking FK" to R.drawable.viking_fk,

// 6

        "Aalesunds FK" to R.drawable.aalesunds_fk_vector_logo,

        "Åsane" to R.drawable.asane_fotball_vector_logo,
        "Bryne FK" to R.drawable.bryne_fk_vector_logo,

        "Egersund" to R.drawable.egersunds_ik_vector_logo,

        "IK Start" to R.drawable.ik_start_vector_logo,

        "Kongsvinger" to R.drawable.kongsvinger_il_vector_logo,

        "Levanger" to R.drawable.levanger_fk_vector_logo,

        "Lyn FK" to R.drawable.fc_lyn_oslo_vector_logo,

        "Mjøndalen" to R.drawable.mjondalen_if_vector_logo,

        "Moss FK" to R.drawable.moss_fk_vector_logo,

        "Ranheim IL" to R.drawable.ranheim_il_fotball_vector_logo,

        "Raufoss" to R.drawable.raufoss,

        "Sandnes Ulf" to R.drawable.sandnes_ulf_vector_logo,

        "Sogndal IL" to R.drawable.sogndal_fotball_vector_logo,

        "Stabæk Fotball" to R.drawable.stabaek_fotball__current__vector_logo,

        "Vålerenga IF" to R.drawable.valerenga_if_vector_logo,


//        League:"Serie B"
//    League ID:34
        "Parma" to R.drawable.parma_logo_vector,

        "Cremonese" to R.drawable.us_cremonese_logo___brandlogos_net,

        "Palermo" to R.drawable.palermo,

        "Como" to R.drawable.como,

        "Venezia" to R.drawable.venezia,

        "Catanzaro" to R.drawable.catanzaro,

        "Cittadella" to R.drawable.cittadella,

        "Bari" to R.drawable.bari,

        "Modena" to R.drawable.modena,

        "Brescia" to R.drawable.brescia,

        "Cosenza" to R.drawable.cosenza,

        "Pisa" to R.drawable.pisa,

        "Reggiana" to R.drawable.ac_reggiana_vector_logo,

        "Südtirol" to R.drawable.fc_sudtirol_vector_logo,

        "Sampdoria" to R.drawable.uc_sampdoria_logo___brandlogos_net,

        "Spezia" to R.drawable.spezia,

        "Ternana" to R.drawable.ternana_calcio_vector_logo,


        "Ascoli" to R.drawable.ascoli,

        "Feralpisalò" to R.drawable.feralpisal_,

        "Lecco" to R.drawable.us_lecce_logo___brandlogos_net,


//        League:"Ekstraklasa"
//    League ID:64

//                "Jagiellonia Białystok",
//
//                "Śląsk Wrocław",
//
//                "Lech Poznań",
//
//                "Pogoń Szczecin",
//
//                "Raków Częstochowa",
//
//                "Legia Warszawa",
//
//                "Górnik Zabrze",
//
//                "Stal Mielec",
//
//                 "Zagłębie Lubin",
//
//                 "Cracovia",
//
//                 "Piast Gliwice",
//
//                 "Radomiak Radom",
//
//                "Warta Poznań",
//
//                 "Widzew Łódź
//
//                 "MKS Korona Kielce",
//
//                 "Puszcza Niepołomice",
//
//                 "Ruch Chorzów",
//
//                 "ŁKS Łódź",
//
//        League:"LaLiga 2"
//    League ID:37


        "Leganés" to R.drawable.cd_leganes_logo___brandlogos_net,

        "Eibar" to R.drawable.sd_eibar_logo___brandlogos_net,

        "Espanyol" to R.drawable.rcd_espanyol_de_barcelona_vector_logo,

        "Sporting Gijón" to R.drawable.sporting_de_gijon_logo_vector,

        "Racing de Ferrol" to R.drawable.racing_de_ferrol,

        "Real Valladolid" to R.drawable.real_valladolid,

        "Real Oviedo" to R.drawable.real_oviedo_logo_vector,

        "Elche" to R.drawable.elche_cf_logo___brandlogos_net,

        "Racing de Santander" to R.drawable.racing_de_santander_logo_vector,

        "Burgos" to R.drawable.burgos_cf_logo_vector,

        "Levante UD" to R.drawable.levante_ud_logo___brandlogos_net,

        "Real Zaragoza" to R.drawable.real_zaragoza_logo___brandlogos_net,

        "CD Eldense" to R.drawable.cd_eldense,

        "Mirandés" to R.drawable.cd_mirandes_vector_logo,

        "Tenerife" to R.drawable.tenerife_logo_vector,

        "FC Cartagena" to R.drawable.fc_cartagena_vector_logo,

        "Villarreal B" to R.drawable.villarreal_cf_logo,

        "Huesca" to R.drawable.hurac_n,

        "AD Alcorcón" to R.drawable.alcorc_n,

        "Albacete Balompié" to R.drawable.albacete_logo_vector,

        "FC Andorra" to R.drawable.fc_andorra,

        "SD Amorebieta" to R.drawable.amorebieta,


//        League:"Pro League"
//    League ID:38

//    League:"Parva Liga"
//    League ID:232
//
//    League:"Superdivision"
//    League ID:76580
//
//    League:"HNL"
//    League ID:48
//
//    League:"Premier League"
//    League ID:43049
//
//    League:"PrvaLiga"
//    League ID:94


        "ENPPI" to R.drawable.enppi_egyptian_soccer_club_logo_1219612c47_seeklogo_com,
        "ZED FC" to R.drawable.zed_fc_logo,
        "Al-Ittihad Alexandria" to R.drawable.al_ittihad_alexandria,
        "Pyramids FC" to R.drawable.pngitem_4817605,
        "Tala'ea El-Gaish" to R.drawable.tala_ea_el_gaish_sporting_club_logo_cfc17ee2d9_seeklogo_com,
        "Smouha" to R.drawable.smouha_sporting_club_logo_ac6d6c7ab6_seeklogo_com,
        "Al-Masry" to R.drawable.al_masry_club_logo_696776ff04_seeklogo_com,
        "Al Ahly FC" to R.drawable.al_ahly_sc_logo_7518b176e8_seeklogo_com,
        "Ceramica Cleopatra" to R.drawable.ceramica_cleopatra_fc_logo_png,
        "El Gouna FC" to R.drawable.el_gouna_fc,
        "Modern Future FC" to R.drawable.modern_future_fc,
        "Baladiyet El Mahallah" to R.drawable.baladiyet_el_mahallah,
        "Zamalek SC" to R.drawable.zamalek_,
        "National Bank of Egypt" to R.drawable.national_bank_of_egypt,
        "Ismaily" to R.drawable.ismaily,
        "Al-Mokawloon" to R.drawable.al_mokawloon,
        "El Dakhlya" to R.drawable.el_dakhlya,
        "Pharco FC" to R.drawable.pharco_fc,

        )

//    "CA Bizertin",
//
//    "US Ben Guerdane",
//
//    "US Tataouine",
//
//    "ES Métlaoui",
//
//    "AS Soliman",
//
//    "Olympique Béja",
//
//    "Avenir Sportif De La Marsa",
//
//    "EGS Gafsa",

    fun getLogoId(teamName: String): Int {
        return teamLogo[teamName] ?: R.drawable.clipart194678
    }


}