package Model.Words;

import Model.Verb;
import Model.Word;

public class Words {

    public void getWords(Word[] words) {
        Word word1 = new Word("art",
                """
                 n. 艺术;""",
                new String[]{"The film is a visual art."},
                3,
                null),
                word2 = new Word("ramification",
                        """
                         n. (后果、影响)
                                表达某个决定、行动或事件可能带来的复杂或意想不到的结果;
                            (分支、支流)
                                指分支或细分, 特别是在讨论复杂的系统或结构时;""",
                        new String[]{"The new law will have significant ramifications for the healthcare system.",
                                "The ramification of the river into smaller streams created a complex network of waterways."},
                        10 ,
                        null),
                word3 = new Word("lurid",
                        """
                         adj. (骇人听闻的)
                                  用来形容报道、故事或者描写过于夸张、充满暴力或恐怖元素，以引起强烈的情感反应;
                              (恐怖的、令人毛骨悚然的)
                                  描述场景、颜色或光线让人感到不安或害怕;
                              (刺眼的、苍白的)
                                  形容颜色或光线过于鲜艳或不自然，给人不舒服的感觉;""",
                        new String[]{"The tabloid published a lurid story about the scandal.",
                                "The horror movie was filled with lurid scenes of violence.",
                                "The sunset painted the sky in lurid shades of red and orange."},
                        10,
                        null),
                word4 = new Word("susceptible",
                        """
                         adj. (易受影响的)
                                  健康方面、情感或心理方面(外界因素或环境影响);""",
                        new String[]{"Children are more susceptible to colds and flu.",
                                "She is very susceptible to criticism.",
                                "The economy is susceptible to changes in global markets."},
                        10,
                        null),
                word5 = new Word("pea",
                        """
                         n. 豌豆;""",
                        new String[]{"Pea is a kind of green small round seed."},
                        3,
                        null),
                word6 = new Word("peas",
                        """
                         n. 豌豆(复数);""",
                        new String[]{"The peas are so tough and I think they are overcooked."},
                        3,
                        null),
                word7 = new Word("abolish",
                        """
                         v. (取消、废除、废止)
                                法律或制度的废除;
                                废除某种习俗或传统;
                                取消不公平或有害的规定;""",
                        new String[]{"The government decided to abolish the death penalty.",
                                "Slavery was abolished in the United States in the 19th century.",
                                "The school decided to abolish the dress code that was considered outdated."},
                        5,
                        new Verb(new String[]{VerbForm.BASE.name()},
                                "abolish",
                                "abolishes",
                                "abolished",
                                "abolished",
                                "abolishing")),
                word8 = new Word("abrupt",
                        """
                         adj. (突然的、粗鲁的、不连贯的)
                                  当某人突然改变态度, 或者以一种突然且可能不礼貌的方式结束谈话时;
                                  可以用来形容环境、状态、情绪等突然的变化;
                                  当某人的言辞非常直接或突然, 可能显得有些粗鲁或没礼貌时;""",
                        new String[]{"His abrupt departure from the meeting surprised everyone.",
                                "The weather change was so abrupt that we didn't have time to prepare.",
                                "Her reply was so abrupt that it took him aback."},
                        9,
                        null),
                word9 = new Word("absorb",
                        """
                         v. (吸收、吸引)
                                吸收液体或气体;
                                吸引注意力;
                                吸收信息或知识;
                                表示某人完全被某事物所吸引或沉浸其中;
                                表示某物能够承受压力、冲击或其他影响, 而不会受到严重影响;""",
                        new String[]{"The sponge absorbed all the water.",
                                "It’s important to absorb as much information as possible during the lecture.",
                                "He was so absorbed in his book that he didn’t hear me calling him.",
                                "The new material can absorb impact better than the previous one."},
                        6,
                        new Verb(new String[]{VerbForm.BASE.name()},
                                "absorb",
                                "absorbs",
                                "absorbed",
                                "absorbed",
                                "absorbing")),
                word10 = new Word("accuse",
                        """
                         v. (控告、指控、指责)
                                当指控某人犯了某种罪行时;
                                认为某人做了不对的事情(日常交流);
                                常用于描述法律或道德指控;""",
                        new String[]{"The police accused him of theft.",
                                "She accused me of lying.",
                                "The company was accused of violating environmental regulations."},
                        7,
                        new Verb(new String[]{VerbForm.BASE.name()},
                                "accuse",
                                "accuses",
                                "accused",
                                "accused",
                                "accusing")),
                word11 = new Word("adolescence",
                        """
                         n. 青春期;""",
                        new String[]{"His adolescence was not a happy time for him."},
                        4,
                        null),
                word12 = new Word("acute",
                        """
                         adj. (敏锐的、灵敏的、严重的)
                                  描述某种感觉、痛苦、感官体验等非常强烈或剧烈;
                                  用于描述某人的感觉、理解力或感官非常敏锐、敏感;
                                  用来形容病情或问题非常严重，需要立即处理(在医疗或其他紧急情况下);
                                  用来描述一种关键的或转折性的时刻，通常暗示紧迫或危险性;""",
                        new String[]{"She felt an acute pain in her chest.",
                                "He has an acute sense of hearing.",
                                "The patient is suffering from acute bronchitis.",
                                "The situation has reached an acute phase."},
                        7,
                        null),
                word13 = new Word("collectively",
                        """
                         adv. 共同地、集体地、总体地;""",
                        new String[]{"The employees collectively decided to take a day off.",
                                "These changes will collectively improve the company's efficiency.",
                                "Collectively, the students in the class scored higher on the test than last year."},
                        3,
                        null),
                word14 = new Word("wetware",
                        """
                         n. 湿件;""",
                        new String[]{"Wetware is mostly used in laboratories with artificial intelligence."},
                        1,
                        null),
                word15 = new Word("persistent",
                        """
                         adj. (坚持的、持续的)
                                  不容易停止或消失的食物;
                                  形容一个人努力不放弃;
                                  有时带有负面含义(如烦人)""",
                        new String[]{"The persistent rain made it hard to go outside.",
                                "She is a persistent student who never gives up on her studies.",
                                "The telemarketer was persistent in trying to sell me the product."},
                        7,
                        null),
                word16 = new Word("wireless",
                        """
                         adj. 无线的;
                         n. 无线电(收音机);""",
                        new String[]{"Wireless communication is essential for mobile phones.",
                                "I was listening to the wireless."},
                        5,
                        null),
                word17 = new Word("encompasses",
                        """
                                """,
                        new String[]{"The course encompasses both theory and practice.",
                                "The forest encompasses the lake."},
                        9,
                        new Verb(new String[]{VerbForm.THIRDPERSON.name()},
                                "encompass",
                                "encompasses",
                                "encompassed",
                                "encompassed",
                                "encompassing")),
                word18 = new Word("automotive",
                        """
                         adj. 汽车的;""",
                        new String[]{"The automotive industry is rapidly moving towards electric vehicles."},
                        3,
                        null),
                word19 = new Word("interchangeable",
                        """
                         adj. 可互换的;""",
                        new String[]{"The two words are interchangeable."},
                        2,
                        null),
                word20 = new Word("upgradable",
                        """
                         adj. 可升级的;""",
                        new String[]{"This computer is upgradable to 32GB of RAM."},
                        9,
                        null),
                word21 = new Word("forums",
                        """
                         n. 论坛、讨论会(复数)""",
                        new String[]{"There are many forums where you can discuss travel tips.",
                                "These conferences will provide several forums for experts to share their views."},
                        9,
                        null),
                word22 = new Word("portable",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word23 = new Word("barometer",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word24 = new Word("fingerprint",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word25 = new Word("convert",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word26 = new Word("spiral",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word27 = new Word("compose",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word28 = new Word("upfront",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word29 = new Word("venue",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word30 = new Word("repercussion",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word31 = new Word("assert",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word32 = new Word("avert",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word33 = new Word("allergy",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word34 = new Word("ellipse",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word35 = new Word("linker",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word36 = new Word("diverge",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word37 = new Word("datum",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word38 = new Word("confess",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word39 = new Word("sign",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word40 = new Word(
                        "disjoint",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word41 = new Word("argument",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word42 = new Word("atomicity",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word43 = new Word("augmented",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word44 = new Word("granularity",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word45 = new Word("histogram",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word46 = new Word("interleave",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word47 = new Word("invariant",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word48 = new Word("involute",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word49 = new Word("iterative",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word50 = new Word("phishing",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word51 = new Word("positivism",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word52 = new Word("quantification",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word53 = new Word("refactor",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word54 = new Word("stakeholder",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word55 = new Word("temporality",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word56 = new Word("timescale",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word57 = new Word("resilient",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word58 = new Word("reciprocal",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word59 = new Word("linear",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word60 = new Word("erroneous",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word61 = new Word("elicit",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word62 = new Word("combative",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word63 = new Word("coffer",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word64 = new Word("avid",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word65 = new Word("quartz",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word66 = new Word("outweigh",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word67 = new Word("ineffective",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word68 = new Word("exhaustive",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word69 = new Word("correlation",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word70 = new Word("contrive",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word71 = new Word("congenital",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word72 = new Word("clockwise",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word73 = new Word("bolster",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word74 = new Word("assertion",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word75 = new Word("antiquity",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word76 = new Word("ailment",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word77 = new Word("overlap",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word78 = new Word("eruption",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word79 = new Word("decomposition",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word80 = new Word("applicable",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word81 = new Word("showcase",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word82 = new Word("radically",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word83 = new Word("tuberculosis",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word84 = new Word("proficient",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word85 = new Word("cognitive",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word86 = new Word("analytical",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word87 = new Word("vegan",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word88 = new Word("regression",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word89 = new Word("integration",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word90 = new Word("sunflower",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word91 = new Word("cascade",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word92 = new Word("validation",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word93 = new Word("uniquely",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word94 = new Word("visor",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word95 = new Word("uplifting",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word96 = new Word("stereotype",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word97 = new Word("instantaneous",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word98 = new Word("depress",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word99 = new Word("unbalanced",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word100 = new Word("replicate",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word101 = new Word("pander",
                        """
                                """,
                        new String[]{},

                        0,
                        null),
                word102 = new Word("exploit",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word103 = new Word("parallelism",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word104 = new Word("synthesise",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word105 = new Word("phenomena",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word106 = new Word("molecules",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word107 = new Word("computational",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word108 = new Word("exploration",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word109 = new Word("outpacing",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word110 = new Word("interact",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word111 = new Word("biological",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word112 = new Word("bi-directional",
                        """
                         adj. 双向的;""",
                        new String[]{"The road allows bi-directional traffic."},
                        4,
                        null),
                word113 = new Word("organic",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word114 = new Word("inherent",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word115 = new Word("interconnectivity",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word116 = new Word("electrochemical",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word117 = new Word("biochemical",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word118 = new Word("manipulated",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word119 = new Word("lithographic",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word120 = new Word("massively",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word121 = new Word("consumption",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word122 = new Word("emergence",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word123 = new Word("dominated",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word124 = new Word("centralised",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word125 = new Word("robustness",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word126 = new Word("immune",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word127 = new Word("mammalian",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word128 = new Word("nervous",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word129 = new Word("evolutionary",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word130 = new Word("genetic",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word131 = new Word("provisional",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word132 = new Word("released",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word133 = new Word("approachable",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word134 = new Word("eliminating",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word135 = new Word("variety",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word136 = new Word("sessions",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word137 = new Word("reliable",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word138 = new Word("dissertation",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word139 = new Word("announcements",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word140 = new Word("delivered",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word141 = new Word("vector",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word142 = new Word("mapping",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word143 = new Word("non-linear",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word144 = new Word("tunable",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word145 = new Word("parameters",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word146 = new Word("recognition",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word147 = new Word("genes",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word148 = new Word("simulation",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word149 = new Word("parallel",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word150 = new Word("dependent",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word151 = new Word("inspired",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word152 = new Word("fascinating",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word153 = new Word("field",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word154 = new Word("psychology",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word155 = new Word("experiments",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word156 = new Word("trial",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word157 = new Word("underpinning",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word158 = new Word("turbines",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word159 = new Word("remarkable",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word160 = new Word("strategic",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word161 = new Word("derivations",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word162 = new Word("differentiation",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word163 = new Word("philosophy",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word164 = new Word("reinforce",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word165 = new Word("intuitive",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word166 = new Word("enhanced",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word167 = new Word("bodies",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word168 = new Word("component",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word169 = new Word("timely",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word170 = new Word("workshops",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word171 = new Word("navigation",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word172 = new Word("daily",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word173 = new Word("forum",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word174 = new Word("capped",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word175 = new Word("invigilated",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word176 = new Word("handouts",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word177 = new Word("administrative",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word178 = new Word("manually",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word179 = new Word("adversely",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word180 = new Word("cohort",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word181 = new Word("establishing",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word182 = new Word("scenarios",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word183 = new Word("revised",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word184 = new Word("resolve",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word185 = new Word("confidential",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word186 = new Word("monitor",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word187 = new Word("abolished",
                        """
                                """,
                        new String[]{"They abolished slavery in the 19th century.",
                                "The law was abolished last year."},
                        6,
                        new Verb(new String[]{VerbForm.PASTSIMPLE.name(), VerbForm.PASTPARTICIPLE.name()},
                                "abolish",
                                "abolishes",
                                "abolished",
                                "abolished",
                                "abolishing")),
                word188 = new Word("anonymized",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word189 = new Word("electronic",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word190 = new Word("manner",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word191 = new Word("faculty",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word192 = new Word("arising",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word193 = new Word("hypothetical",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word194 = new Word("industries",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word195 = new Word("obligations",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word196 = new Word("consequence",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word197 = new Word("advertisement",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word198 = new Word("tenders",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word199 = new Word("scheme",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word200 = new Word("encompass",
                        """
                         v. (包括、包含、包围、围绕)
                                用于描述某个范围内包含了不同的部分、元素或方面;
                                用于表示物理上或抽象意义上，某物被完全围绕或覆盖""",
                        new String[]{"Her responsibilities encompass managing the team, overseeing projects, and handling client relations.",
                                "Trees encompass the river."},
                        9,
                        new Verb(new String[]{VerbForm.BASE.name()},
                                "encompass",
                                "encompasses",
                                "encompassed",
                                "encompassed",
                                "encompassing")),
                word34995 = new Word("",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word34996 = new Word("",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word34997 = new Word("",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word34998 = new Word("",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word34999 = new Word("",
                        """
                                """,
                        new String[]{},
                        0,
                        null),
                word35000 = new Word("",
                        """
                                """,
                        new String[]{},
                        0,
                        null);

        words[0] = word1;
        words[1] = word2;
        words[2] = word3;
        words[3] = word4;
        words[4] = word5;
        words[5] = word6;
        words[6] = word7;
        words[7] = word8;
        words[8] = word9;
        words[9] = word10;
        words[10] = word11;
        words[11] = word12;
        words[12] = word13;
        words[13] = word14;
        words[14] = word15;
        words[15] = word16;
        words[16] = word17;
        words[17] = word18;
        words[18] = word19;
        words[19] = word20;
        words[20] = word21;
        words[21] = word22;
        words[22] = word23;
        words[23] = word24;
        words[24] = word25;
        words[25] = word26;
        words[26] = word27;
        words[27] = word28;
        words[28] = word29;
        words[29] = word30;
        words[30] = word31;
        words[31] = word32;
        words[32] = word33;
        words[33] = word34;
        words[34] = word35;
        words[35] = word36;
        words[36] = word37;
        words[37] = word38;
        words[38] = word39;
        words[39] = word40;
        words[40] = word41;
        words[41] = word42;
        words[42] = word43;
        words[43] = word44;
        words[44] = word45;
        words[45] = word46;
        words[46] = word47;
        words[47] = word48;
        words[48] = word49;
        words[49] = word50;
        words[50] = word51;
        words[51] = word52;
        words[52] = word53;
        words[53] = word54;
        words[54] = word55;
        words[55] = word56;
        words[56] = word57;
        words[57] = word58;
        words[58] = word59;
        words[59] = word60;
        words[60] = word61;
        words[61] = word62;
        words[62] = word63;
        words[63] = word64;
        words[64] = word65;
        words[65] = word66;
        words[66] = word67;
        words[67] = word68;
        words[68] = word69;
        words[69] = word70;
        words[70] = word71;
        words[71] = word72;
        words[72] = word73;
        words[73] = word74;
        words[74] = word75;
        words[75] = word76;
        words[76] = word77;
        words[77] = word78;
        words[78] = word79;
        words[79] = word80;
        words[80] = word81;
        words[81] = word82;
        words[82] = word83;
        words[83] = word84;
        words[84] = word85;
        words[85] = word86;
        words[86] = word87;
        words[87] = word88;
        words[88] = word89;
        words[89] = word90;
        words[90] = word91;
        words[91] = word92;
        words[92] = word93;
        words[93] = word94;
        words[94] = word95;
        words[95] = word96;
        words[96] = word97;
        words[97] = word98;
        words[98] = word99;
        words[99] = word100;
        words[100] = word101;
        words[101] = word102;
        words[102] = word103;
        words[103] = word104;
        words[104] = word105;
        words[105] = word106;
        words[106] = word107;
        words[107] = word108;
        words[108] = word109;
        words[109] = word110;
        words[110] = word111;
        words[111] = word112;
        words[112] = word113;
        words[113] = word114;
        words[114] = word115;
        words[115] = word116;
        words[116] = word117;
        words[117] = word118;
        words[118] = word119;
        words[119] = word120;
        words[120] = word121;
        words[121] = word122;
        words[122] = word123;
        words[123] = word124;
        words[124] = word125;
        words[125] = word126;
        words[126] = word127;
        words[127] = word128;
        words[128] = word129;
        words[129] = word130;
        words[130] = word131;
        words[131] = word132;
        words[132] = word133;
        words[133] = word134;
        words[134] = word135;
        words[135] = word136;
        words[136] = word137;
        words[137] = word138;
        words[138] = word139;
        words[139] = word140;
        words[140] = word141;
        words[141] = word142;
        words[142] = word143;
        words[143] = word144;
        words[144] = word145;
        words[145] = word146;
        words[146] = word147;
        words[147] = word148;
        words[148] = word149;
        words[149] = word150;
        words[150] = word151;
        words[151] = word152;
        words[152] = word153;
        words[153] = word154;
        words[154] = word155;
        words[155] = word156;
        words[156] = word157;
        words[157] = word158;
        words[158] = word159;
        words[159] = word160;
        words[160] = word161;
        words[161] = word162;
        words[162] = word163;
        words[163] = word164;
        words[164] = word165;
        words[165] = word166;
        words[166] = word167;
        words[167] = word168;
        words[168] = word169;
        words[169] = word170;
        words[170] = word171;
        words[171] = word172;
        words[172] = word173;
        words[173] = word174;
        words[174] = word175;
        words[175] = word176;
        words[176] = word177;
        words[177] = word178;
        words[178] = word179;
        words[179] = word180;
        words[180] = word181;
        words[181] = word182;
        words[182] = word183;
        words[183] = word184;
        words[184] = word185;
        words[185] = word186;
        words[186] = word187;
        words[187] = word188;
        words[188] = word189;
        words[189] = word190;
        words[190] = word191;
        words[191] = word192;
        words[192] = word193;
        words[193] = word194;
        words[194] = word195;
        words[195] = word196;
        words[196] = word197;
        words[197] = word198;
        words[198] = word199;
        words[199] = word200;
    }

    public int getNumberOfWords() {
        return 200;
    }

}
