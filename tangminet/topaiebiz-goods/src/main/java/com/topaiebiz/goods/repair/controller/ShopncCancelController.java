package com.topaiebiz.goods.repair.controller;

import com.nebulapaas.web.response.ResponseInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.Executors;

/***
 * @author yfeng
 * @date 2018-03-06 23:43
 */
@Slf4j
@RestController
@RequestMapping(value = "/goods/repair", method = RequestMethod.POST)
public class ShopncCancelController {
    private static Map<Long, Integer> map = new HashedMap();
    private static Charset utf8 = Charset.forName("UTF-8");
    private static int timeout = 3000;

    static {
        map.put(100573658259483762L, 7321762);
        map.put(100573673451693006L, 5159006);
        map.put(100573682316474204L, 7365204);
        map.put(110573659023294836L, 7048836);
        map.put(110573676085269419L, 6855419);
        map.put(120573681611887853L, 7009853);
        map.put(120573685870458545L, 6888545);
        map.put(130573652853652352L, 7291352);
        map.put(130573661200451837L, 6931837);
        map.put(130573667903550216L, 2540216);
        map.put(130573679276707339L, 4605339);
        map.put(140573645576542298L, 2846298);
        map.put(140573647560001395L, 6957395);
        map.put(140573651649816788L, 7303788);
        map.put(140573661054121983L, 6947983);
        map.put(140573671664941390L, 6937390);
        map.put(150573642384651162L, 3038162);
        map.put(150573653699066394L, 6990394);
        map.put(150573671473518345L, 6964345);
        map.put(150573681407184577L, 5950577);
        map.put(160573690236667210L, 3748210);
        map.put(170573676777538012L, 2879012);
        map.put(180573647394386395L, 6957395);
        map.put(190573643664383088L, 7365088);
        map.put(190573671113978475L, 3602475);
        map.put(190573673072443006L, 5159006);
        map.put(190573679105080851L, 6990851);
        map.put(190573685220049525L, 7310525);
        map.put(190573687968438287L, 1293287);
        map.put(200573677096042571L, 2637571);
        map.put(200573681125865851L, 6990851);
        map.put(210573606315145062L, 7365062);
        map.put(210573606856472034L, 4558034);
        map.put(210573618551852434L, 7356434);
        map.put(210573675044131347L, 2917347);
        map.put(210573675727168199L, 2789199);
        map.put(210573687211477260L, 2335260);
        map.put(210573689965588354L, 7269354);
        map.put(210573692393880764L, 5650764);
        map.put(220573608822625193L, 2592193);
        map.put(220573624689608436L, 4604436);
        map.put(220573648044774395L, 6957395);
        map.put(220573678204479677L, 6979677);
        map.put(220573686975858381L, 6974381);
        map.put(230573609928560906L, 691906);
        map.put(230573644809969855L, 6966855);
        map.put(230573662782077649L, 7264649);
        map.put(230573668356049947L, 385947);
        map.put(230573670607232515L, 7310515);
        map.put(230573681502925853L, 7009853);
        map.put(250573609761650906L, 691906);
        map.put(250573641252966191L, 7359191);
        map.put(250573666031945056L, 2904056);
        map.put(250573669839309418L, 2738418);
        map.put(250573674448119226L, 7365226);
        map.put(250573686416164648L, 7234648);
        map.put(260573607953418499L, 4294499);
        map.put(260573658140491751L, 6961751);
        map.put(260573689111832599L, 7364599);
        map.put(270573639518043906L, 691906);
        map.put(270573662943441499L, 7016499);
        map.put(270573673235525006L, 5159006);
        map.put(270573683253022975L, 4482975);
        map.put(270573687441588764L, 7308764);
        map.put(270573689368006909L, 2214909);
        map.put(280573665359330702L, 2681702);
        map.put(290573647424502378L, 7042378);
        map.put(290573647668406395L, 6957395);
        map.put(300573651631347026L, 4308026);
        map.put(300573659561043684L, 6984684);
        map.put(300573664229980892L, 7364892);
        map.put(300573666541554487L, 6987487);
        map.put(300573689124852599L, 7364599);
        map.put(300573689898951354L, 7269354);
        map.put(310573606297927062L, 7365062);
        map.put(310573608554514193L, 2592193);
        map.put(310573680731169717L, 7300717);
        map.put(320573612396225833L, 7351833);
        map.put(320573661080869983L, 6947983);
        map.put(330573614654737293L, 2894293);
        map.put(330573618573906434L, 7356434);
        map.put(330573684735665903L, 2435903);
        map.put(340573651357790066L, 1533066);
        map.put(340573688828630439L, 4182439);
        map.put(350573642648430069L, 7243069);
        map.put(350573655546423124L, 7365124);
        map.put(350573660058461185L, 1113185);
        map.put(350573662341049414L, 2563414);
        map.put(360573662255476682L, 7315682);
        map.put(370573670926231475L, 3602475);
        map.put(370573685968890545L, 6888545);
        map.put(380573639903735713L, 3248713);
        map.put(380573651680099026L, 4308026);
        map.put(380573664636001896L, 7234896);
        map.put(380573672981166412L, 2818412);
        map.put(390573682888544229L, 7365229);
        map.put(390573686351822982L, 6985982);
        map.put(390573690398132551L, 695551);
        map.put(400573642354284162L, 3038162);
        map.put(400573650705820638L, 4158638);
        map.put(400573655302905899L, 2178899);
        map.put(400573670440702020L, 366020);
        map.put(400573673891749819L, 7148819);
        map.put(400573679502669939L, 4195939);
        map.put(410573679689623851L, 6990851);
        map.put(410573683166262975L, 4482975);
        map.put(410573685034281525L, 7310525);
        map.put(420573609710699292L, 4865292);
        map.put(420573618241951434L, 7356434);
        map.put(420573674010707316L, 6914316);
        map.put(420573680702886851L, 6990851);
        map.put(420573684281845280L, 6976280);
        map.put(420573687049002493L, 2810493);
        map.put(430573678442974677L, 6979677);
        map.put(430573685284537764L, 7308764);
        map.put(440573612044696833L, 7351833);
        map.put(440573645836775156L, 655156);
        map.put(440573652762899026L, 4308026);
        map.put(440573683285488892L, 7079892);
        map.put(450573640894531023L, 6957023);
        map.put(450573680592235754L, 2450754);
        map.put(450573680612089804L, 4143804);
        map.put(450573688069645599L, 7364599);
        map.put(460573687117833298L, 7365298);
        map.put(460573688781854721L, 1261721);
        map.put(470573656336678294L, 2224294);
        map.put(470573681021049686L, 2534686);
        map.put(480573648371798816L, 531816);
        map.put(480573652452166755L, 7219755);
        map.put(480573666499669310L, 6960310);
        map.put(480573681423373853L, 7009853);
        map.put(480573681955897020L, 717020);
        map.put(480573684747373024L, 6988024);
        map.put(490573658214231762L, 7321762);
        map.put(490573658426200328L, 7307328);
        map.put(490573666388135406L, 7337406);
        map.put(490573666466361562L, 2600562);
        map.put(490573679344787701L, 1487701);
        map.put(490573679554987939L, 4195939);
        map.put(500573645528193784L, 2458784);
        map.put(510573681483881251L, 4478251);
        map.put(520573609700480906L, 691906);
        map.put(520573640363782959L, 6854959);
        map.put(520573663287738813L, 7364813);
        map.put(520573680531054754L, 2450754);
        map.put(520573684608701525L, 7310525);
        map.put(530573611970620833L, 7351833);
        map.put(530573647028690583L, 3974583);
        map.put(530573647448369395L, 6957395);
        map.put(530573648218285106L, 7365106);
        map.put(530573655936564407L, 6025407);
        map.put(530573666313300406L, 7337406);
        map.put(530573668288228398L, 3957398);
        map.put(530573676113100830L, 7310830);
        map.put(530573683760275892L, 7079892);
        map.put(530573688022328734L, 3104734);
        map.put(540573680477797986L, 2693986);
        map.put(540573690542291144L, 2190144);
        map.put(550573607713344097L, 7317097);
        map.put(550573650616597156L, 7004156);
        map.put(550573652927678122L, 6585122);
        map.put(560573658184556721L, 7268721);
        map.put(560573661066259910L, 7359910);
        map.put(560573668256944619L, 7357619);
        map.put(560573668544122619L, 7357619);
        map.put(560573679144447701L, 1487701);
        map.put(570573612010233833L, 7351833);
        map.put(570573617123376434L, 7356434);
        map.put(570573629783109066L, 1533066);
        map.put(570573650325672673L, 3248673);
        map.put(570573684457051525L, 7310525);
        map.put(570573687889808453L, 7230453);
        map.put(580573643884456344L, 7202344);
        map.put(580573648299689106L, 7365106);
        map.put(580573652611434304L, 2847304);
        map.put(580573690483260145L, 2731145);
        map.put(580573691419560720L, 7009720);
        map.put(590573607723977168L, 7292168);
        map.put(590573669369328568L, 6999568);
        map.put(590573684200355895L, 5176895);
        map.put(600573676048277419L, 6855419);
        map.put(600573684355957280L, 6976280);
        map.put(600573691538359728L, 7310728);
        map.put(600573692483129681L, 6617681);
        map.put(610573647234847583L, 3974583);
        map.put(610573647899916533L, 7305533);
        map.put(610573661986125733L, 7299733);
        map.put(610573664193520976L, 538976);
        map.put(620573644693654486L, 2974486);
        map.put(630573630521404240L, 4263240);
        map.put(640573609487788918L, 7136918);
        map.put(640573647194126449L, 388449);
        map.put(650573646218713193L, 2592193);
        map.put(650573657737641215L, 2320215);
        map.put(650573667938747216L, 2540216);
        map.put(660573642715618855L, 6966855);
        map.put(670573642991934855L, 6966855);
        map.put(670573679570338599L, 7357599);
        map.put(670573685792259545L, 6888545);
        map.put(680573644079296344L, 7202344);
        map.put(680573647621115395L, 6957395);
        map.put(680573658976524836L, 7048836);
        map.put(680573668981905619L, 7357619);
        map.put(690573650436485923L, 7009923);
        map.put(690573658233479762L, 7321762);
        map.put(690573675857791073L, 6917073);
        map.put(700573646049824881L, 2207881);
        map.put(700573657591758430L, 5225430);
        map.put(700573679660735599L, 7357599);
        map.put(710573653385884155L, 3720155);
        map.put(710573674809229226L, 7365226);
        map.put(710573686538409493L, 2810493);
        map.put(710573692346261891L, 6963891);
        map.put(720573683541377895L, 5176895);
        map.put(720573683840109197L, 7306197);
        map.put(730573610197404134L, 2904134);
        map.put(730573650239843673L, 3248673);
        map.put(730573657833163340L, 2180340);
        map.put(740573618489500434L, 7356434);
        map.put(740573681576274896L, 2522896);
        map.put(750573686804119154L, 6615154);
        map.put(750573689771468210L, 3748210);
        map.put(760573651271629007L, 4327007);
        map.put(760573683770693739L, 7293739);
        map.put(770573624541300436L, 4604436);
        map.put(770573667771589899L, 2178899);
        map.put(770573687393242525L, 7310525);
        map.put(770573690909191597L, 7364597);
        map.put(780573653088414117L, 7365117);
        map.put(780573659747049022L, 3793022);
        map.put(780573659769118176L, 7222176);
        map.put(790573682375650129L, 7364129);
        map.put(800573607183256517L, 676517);
        map.put(800573668005666216L, 2540216);
        map.put(800573682614329306L, 7230306);
        map.put(800573682954241863L, 6955863);
        map.put(800573688152297764L, 7308764);
        map.put(800573690223887551L, 695551);
        map.put(810573612269524833L, 7351833);
        map.put(810573666667879310L, 6960310);
        map.put(810573667920208691L, 3886691);
        map.put(810573675802460688L, 1448688);
        map.put(810573680494754851L, 6990851);
        map.put(820573661364581313L, 7307313);
        map.put(820573666575266310L, 6960310);
        map.put(820573669515281962L, 7364962);
        map.put(820573678399126960L, 6932960);
        map.put(820573679287705939L, 4195939);
        map.put(830573651696121374L, 6819374);
        map.put(830573655715855284L, 2181284);
        map.put(830573667864371216L, 2540216);
        map.put(830573686162039722L, 7309722);
        map.put(830573692086529177L, 2206177);
        map.put(840573665369833220L, 7029220);
        map.put(840573669148717619L, 7357619);
        map.put(840573686055405722L, 7309722);
        map.put(850573644816958399L, 5765399);
        map.put(850573669200337568L, 6999568);
        map.put(850573679192632939L, 4195939);
        map.put(850573680798324752L, 683752);
        map.put(850573690165667457L, 2779457);
        map.put(870573645774023193L, 2592193);
        map.put(870573650337289156L, 7004156);
        map.put(870573659813256176L, 7222176);
        map.put(870573661904493171L, 7365171);
        map.put(870573665161376789L, 7364789);
        map.put(870573688301607734L, 3104734);
        map.put(890573609663642292L, 4865292);
        map.put(890573661357203026L, 1269026);
        map.put(890573662605084181L, 3802181);
        map.put(890573664918011074L, 7020074);
        map.put(890573684915196525L, 7310525);
        map.put(890573688749551599L, 7364599);
        map.put(900573644990111096L, 7365096);
        map.put(900573647799634395L, 6957395);
        map.put(900573664342763636L, 6997636);
        map.put(900573666608923406L, 7337406);
        map.put(900573673332977006L, 5159006);
        map.put(900573692438809891L, 6963891);
        map.put(910573642485777162L, 3038162);
        map.put(910573646972014922L, 5975922);
        map.put(910573648121473215L, 2320215);
        map.put(910573648319515215L, 2320215);
        map.put(910573664611759896L, 7234896);
        map.put(910573678271916069L, 7243069);
        map.put(920573676596970866L, 6946866);
        map.put(920573689248825439L, 4182439);
        map.put(930573646480471298L, 2846298);
        map.put(930573684549041280L, 6976280);
        map.put(950573612159124833L, 7351833);
        map.put(950573661951945347L, 2917347);
        map.put(950573680847425853L, 7009853);
        map.put(950573682279936306L, 7230306);
        map.put(960573658377896275L, 1267275);
        map.put(960573665493693220L, 7029220);
        map.put(960573677003641456L, 6858456);
        map.put(960573678478494677L, 6979677);
        map.put(960573689379549530L, 593530);
        map.put(970573607729023685L, 7242685);
        map.put(970573610311113906L, 691906);
        map.put(970573656154538035L, 7335035);
        map.put(970573675734649207L, 6938207);
        map.put(970573680344439990L, 2620990);
        map.put(970573684303038337L, 2579337);
        map.put(970573686864992725L, 537725);
        map.put(980573641765409191L, 7359191);
        map.put(980573675386944207L, 6938207);
        map.put(980573676746825571L, 2637571);
        map.put(980573685417908764L, 7308764);
        map.put(980573687824640764L, 7308764);
        map.put(990573651267112066L, 1533066);
        map.put(990573655242473042L, 6954042);
        map.put(990573657076621836L, 4105836);
        map.put(990573669623758591L, 600591);
        map.put(990573669927845412L, 2818412);
        map.put(990573682826957464L, 1257464);
        map.put(990573688635343599L, 7364599);
    }

    @RequestMapping(value = "/cancelShopOrders")
    public ResponseInfo queryOrders() {
        log.info("=======================");
        Executors.newSingleThreadExecutor().submit(new Runnable() {
            @Override
            public void run() {
                map.entrySet().forEach(item -> {
                    try {
                        String paySn = item.getKey().toString();
                        String userId = item.getValue().toString();
                        String returnMsg = Request.Post("http://10.99.104.170:7009/rest/order/cancel")
                                .bodyForm(Form.form()
                                        .add("userId", userId).add("paySn", paySn)
                                        .build(), utf8)
                                .connectTimeout(timeout)
                                .socketTimeout(timeout)
                                .execute()
                                .returnContent()
                                .asString(utf8);
                        log.info("cancel user:{} paySn:{} return:{}", userId, paySn, returnMsg);
                    } catch (Exception ex) {
                        log.error(ex.getMessage());
                    }
                });

            }
        });
        return new ResponseInfo();
    }

}