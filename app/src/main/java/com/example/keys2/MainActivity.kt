package com.example.keys2


import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.keys2.DBHelper


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Массив кампусов
        val kampus = arrayOf("МКУ-100", "МКУ-101", "МКУ-102", "МКУ-103", "МКУ-104", "МКУ-105",
            "МКУ-106", "МКУ-107", "МКУ-108", "МКУ-109", "МКУ-110", "МКУ-111", "МКУ-112", "МКУ-113",
            "МКУ-114", "МКУ-115", "МКУ-116", "МКУ-117", "МКУ-118", "МКУ-119", "МКУ-120", "МКУ-121");

        //Массив улиц
        val streets = arrayOf( "героев сталинграда", "пролетарская", "бульвар энгельса",
            "остравская", "гражданская", "доценко", "удмуртская", "гремячинская", "караванная",
            "2 караванная", "светлояпская", "2 штурманская", "николаевская", "танеева", "брестская",
            "мачтозаводская", "олимпийская", "пятиморская", "40 лет влксм", "столетова", "якуба коласа",
            "фадеева", "марийская", "2 динамовская", "гагринская", "панферова", "зерноградская",
            "саушинская", "50 лет октября", "водников", "лазоревая", "минская", "сулейманова",
            "фролова", "черепановых", "обводной", "петропавловская", "изобильная", "тельмана",
            "бахтурова", "вучетича", "голубева", "ломакина", "канатчиков", "российская", "луговая");


        //Массив с ключами
        val keys = arrayOf("1.3", "4", "12", "13", "14", "53", "65", "70", "79", "93", "94", "96",
            "102", "106", "109", "111", "112", "113", "119", "120","123", "128","131", "132", "135",
            "138", "140","146", "147", "148", "152","157", "158", "168", "169", "170", "171", "181",
            "182", "183","185", "188", "195", "212", "367","445", "476", "481", "МегаКот", "K",
            "Индивидуальный", "Амбарные", "Спец", "любой ключ", "136", "Мега Кот", "162", "128/157",
            "146/147", "Коламбийские", "130")

        //Массив с примечаниями и комментариями
        val comments = arrayOf("", "171 кл", "102, 103 МКУ-113кл ДШ", "Подходит 113 кл от МКУ-103, 102",
            "6 под. ключи у охраны по удостоверению",  "Подходит от Энгельса 14",
            "Подходит 157 кл МКУ-113", "Подходит любой ключ", "Подходит 181 кл от МКУ-114",
            "Подходит 152 кл от МКУ-116", "Подходит 170 кл от МКУ-118", "69 кл", "157 кл",
            "Подходит 148 кл от МКУ-119", "332 кл от дополнительного ДШ", "Подходит 111 кл от МКУ-112",
            "Подходит 0160 кл от МКУ-112", "Подъезды 6, 10, 13 Спец", "Подходит 158 от МКУ-115",
            "188, 185, 121, 0182", "2-й подъезд с нулем", "ключ с нулем", "5-й подъезд с нулем",
            "185 кл 2-й подъезд")

        //Основной массив
        val key = Array(456, { Array(6, {0}) })
        //Улица, дом, корпус, ключ, кампус, примечание
        key[0] = arrayOf( 0, 47, 0, 36, 0, 0)
        key[1] = arrayOf( 0, 49, 0, 16, 0, 1)
        key[2] = arrayOf( 1, 11, 0, 36, 0, 0)
        key[3] = arrayOf( 1, 13, 0, 36, 0, 0)
        key[4] = arrayOf( 1, 15, 0, 36, 0, 0)
        key[5] = arrayOf( 1, 17, 0, 36, 0, 0)
        key[6] = arrayOf( 1, 19, 0, 36, 0, 0)
        key[7] = arrayOf( 1, 21, 0, 36, 0, 0)
        key[8] = arrayOf( 1, 23, 0, 36, 0, 0)
        key[9] = arrayOf( 1, 25, 0, 36, 0, 0)
        key[10] = arrayOf( 1, 27, 0, 36, 0, 0)
        key[11] = arrayOf( 1, 29, 0, 36, 0, 0)
        key[12] = arrayOf( 1, 31, 0, 36, 0, 0)
        key[13] = arrayOf( 1, 33, 0, 36, 0, 0)
        key[14] = arrayOf( 1, 35, 0, 36, 0, 0)
        key[15] = arrayOf( 1, 39, 0, 36, 0, 0)
        key[16] = arrayOf( 1, 41, 0, 36, 0, 0)
        key[17] = arrayOf( 1, 45, 0, 36, 0, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[18] = arrayOf( 0, 39, 0, 8, 1, 0)
        key[19] = arrayOf( 0, 41, 0, 8, 1, 0)
        key[20] = arrayOf( 0, 45, 0, 8, 1, 0)
        key[21] = arrayOf( 2, 2, 0, 8, 1, 0)
        key[22] = arrayOf( 2, 2, 1, 8, 1, 0)
        key[23] = arrayOf( 2, 4, 0, 39, 1, 0)
        key[24] = arrayOf( 2, 4, 1, 8, 1, 0)
        key[25] = arrayOf( 2, 8, 0, 8, 1, 0)
        key[26] = arrayOf( 2, 10, 0, 8, 1, 0)
        key[27] = arrayOf( 2, 14, 0, 50, 1, 0)
        key[28] = arrayOf( 2, 16, 0, 48, 1, 0)
        key[29] = arrayOf( 2, 18, 0, 48, 1, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[30] = arrayOf( 0, 23, 0, 17, 2, 0)
        key[31] = arrayOf( 0, 25, 0, 17, 2, 0)
        key[32] = arrayOf( 0, 29, 0, 9, 2, 0)
        key[33] = arrayOf( 0, 35, 0, 49, 2, 0)
        key[34] = arrayOf( 0, 37, 0, 49, 2, 0)
        key[35] = arrayOf( 3, 8, 0, 50, 2, 2)
        key[36] = arrayOf( 3, 12, 0, 17, 2, 0)
        key[37] = arrayOf( 3, 16, 0, 17, 2, 0)
        key[38] = arrayOf( 2, 9, 0, 17, 2, 0)
        key[39] = arrayOf( 2, 11, 0, 17, 2, 0)
        key[40] = arrayOf( 2, 15, 0, 17, 2, 0)
        key[41] = arrayOf( 2, 17, 0, 17, 2, 0)
        key[42] = arrayOf( 2, 19, 0, 17, 2, 0)
        key[43] = arrayOf( 2, 23, 0, 17, 2, 0)
        key[44] = arrayOf( 2, 25, 0, 17, 2, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[45] = arrayOf( 0, 21, 0, 47, 3, 0)
        key[46] = arrayOf( 3, 2, 0, 54, 3, 0)
        key[47] = arrayOf( 3, 4, 0, 17, 3, 0)
        key[48] = arrayOf( 3, 6, 0, 17, 3, 0)
        key[49] = arrayOf( 3, 10, 0, 17, 3, 0)
        key[50] = arrayOf( 3, 14, 0, 17, 3, 2)
        key[51] = arrayOf( 3, 18, 0, 17, 3, 0)
        key[52] = arrayOf( 3, 20, 0, 17, 3, 0)
        key[53] = arrayOf( 3, 20, 1, 17, 3, 0)
        key[54] = arrayOf( 2, 1, 0, 17, 3, 0)
        key[55] = arrayOf( 2, 3, 0, 17, 3, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[56] = arrayOf( 4, 52, 0, 20, 4, 0)
        key[57] = arrayOf( 4, 56, 0, 20, 4, 0)
        key[58] = arrayOf( 4, 58, 0, 20, 4, 0)
        key[59] = arrayOf( 4, 62, 0, 20, 4, 0)
        key[60] = arrayOf( 5, 35, 0, 20, 4, 0)
        key[61] = arrayOf( 5, 35, 1, 13, 4, 0)
        key[62] = arrayOf( 5, 37, 0, 20, 4, 0)
        key[63] = arrayOf( 5, 39, 0, 20, 4, 0)
        key[64] = arrayOf( 5, 41, 0, 20, 4, 0)
        key[65] = arrayOf( 5, 43, 0, 20, 4, 0)
        key[66] = arrayOf( 5, 68, 0, 20, 4, 0)
        key[67] = arrayOf( 5, 68, 1, 20, 4, 0)
        key[68] = arrayOf( 5, 74, 0, 20, 4, 0)
        key[69] = arrayOf( 5, 76, 0, 20, 4, 0)
        key[70] = arrayOf( 5, 78, 0, 20, 4, 0)
        key[71] = arrayOf( 5, 80, 0, 20, 4, 0)
        key[72] = arrayOf( 35, 2, 0, 20, 4, 0)
        key[73] = arrayOf( 36, 87, 0, 20, 4, 0)
        key[74] = arrayOf( 36, 87, 1, 20, 4, 0)
        key[75] = arrayOf( 36, 89, 0, 20, 4, 0)
        key[76] = arrayOf( 36, 91, 0, 20, 4, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[77] = arrayOf( 0, 50, 0, 55, 5, 0)
        key[78] = arrayOf( 0, 52, 0, 55, 5, 0)
        key[79] = arrayOf( 0, 54, 0, 55, 5, 0)
        key[80] = arrayOf( 0, 56, 0, 55, 5, 0)
        key[81] = arrayOf( 0, 60, 0, 55, 5, 0)
        key[82] = arrayOf( 0, 62, 0, 43, 5, 0)
        key[83] = arrayOf( 4, 34, 0, 11, 5, 0)
        key[84] = arrayOf( 1, 47, 0, 55, 5, 0)
        key[84] = arrayOf( 1, 49, 0, 55, 5, 0)
        key[85] = arrayOf( 1, 51, 1, 55, 5, 0)
        key[86] = arrayOf( 1, 51, 2, 52, 5, 0)
        key[87] = arrayOf( 1, 53, 0, 55, 5, 0)
        key[88] = arrayOf( 1, 55, 0, 55, 5, 0)
        key[89] = arrayOf( 2, 22, 0, 51, 5, 0)
        key[90] = arrayOf( 2, 24, 0, 51, 5, 0)
        key[91] = arrayOf( 2, 26, 0, 51, 5, 0)
        key[92] = arrayOf( 2, 28, 0, 47, 5, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[93] = arrayOf( 4, 14, 0, 48, 6, 0)
        key[94] = arrayOf( 4, 16, 0, 48, 6, 0)
        key[95] = arrayOf( 4, 18, 0, 48, 6, 0)
        key[96] = arrayOf( 4, 20, 0, 48, 6, 0)
        key[97] = arrayOf( 4, 22, 0, 48, 6, 3)
        key[98] = arrayOf( 4, 24, 0, 48, 6, 0)
        key[99] = arrayOf( 4, 26, 0, 48, 6, 0)
        key[100] = arrayOf( 4, 28, 0, 48, 6, 0)
        key[101] = arrayOf( 37, 22, 0, 48, 6, 0)
        key[102] = arrayOf( 2, 28, 5, 52, 6, 0)
        key[103] = arrayOf( 2, 32, 0, 47, 6, 0)
        key[104] = arrayOf( 2, 33, 1, 55, 6, 0)
        key[105] = arrayOf( 2, 34, 0, 14, 6, 0)
        key[106] = arrayOf( 2, 34, 5, 55, 6, 0)
        key[107] = arrayOf( 2, 35, 0, 52, 6, 0)
        key[108] = arrayOf( 2, 35, 1, 55, 6, 0)
        key[109] = arrayOf( 2, 36, 0, 55, 6, 0)
        key[110] = arrayOf( 37, 12, 0, 48, 6, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[111] = arrayOf( 0, 38, 0, 1, 7, 4)
        key[112] = arrayOf( 0, 40, 0, 17, 7, 0)
        key[113] = arrayOf( 0, 42, 0, 1, 7, 0)
        key[114] = arrayOf( 0, 44, 0, 1, 7, 0)
        key[115] = arrayOf( 0, 48, 0, 1, 7, 0)
        key[116] = arrayOf( 37, 4, 0, 1, 7, 0)
        key[117] = arrayOf( 37, 6, 0, 1, 7, 0)
        key[118] = arrayOf( 37, 14, 0, 1, 7, 0)
        key[119] = arrayOf( 38, 14, 0, 1, 7, 0)
        key[120] = arrayOf( 38, 19, 0, 1, 7, 0)
        key[121] = arrayOf( 2, 26, 1, 52, 7, 0)
        key[122] = arrayOf( 2, 27, 0, 1, 7, 0)
        key[123] = arrayOf( 2, 29, 0, 1, 7, 0)
        key[124] = arrayOf( 2, 31, 0, 1, 7, 0)
        key[125] = arrayOf( 2, 31, 1, 1, 7, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[126] = arrayOf( 28, 20, 0, 34, 8, 0)
        key[127] = arrayOf( 28, 22, 0, 34, 8, 0)
        key[128] = arrayOf( 28, 24, 0, 34, 8, 0)
        key[129] = arrayOf( 28, 28, 0, 56, 8, 0)
        key[130] = arrayOf( 28, 30, 0, 55, 8, 0)
        key[131] = arrayOf( 39, 1, 0, 34, 8, 0)
        key[132] = arrayOf( 40, 5, 0, 34, 8, 0)
        key[133] = arrayOf( 40, 5, 1, 34, 8, 0)
        key[134] = arrayOf( 40, 19, 0, 34, 8, 0)
        key[135] = arrayOf( 41, 1, 1, 34, 8, 0)
        key[136] = arrayOf( 41, 3, 0, 34, 8, 0)
        key[137] = arrayOf( 41, 4, 0, 34, 8, 0)
        key[138] = arrayOf( 41, 6, 0, 34, 8, 0)
        key[139] = arrayOf( 41, 8, 0, 34, 8, 0)
        key[140] = arrayOf( 41, 12, 0, 34, 8, 0)
        key[141] = arrayOf( 41, 16, 0, 34, 8, 0)
        key[142] = arrayOf( 42, 1, 0, 34, 8, 0)
        key[143] = arrayOf( 42, 1, 1, 34, 8, 0)
        key[144] = arrayOf( 42, 2, 0, 34, 8, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[145] = arrayOf( 40, 18, 0, 31, 9, 0)
        key[146] = arrayOf( 40, 20, 0, 21, 9, 6)
        key[147] = arrayOf( 40, 22, 0, 31, 9, 0)
        key[148] = arrayOf( 40, 24, 0, 31, 9, 0)
        key[149] = arrayOf( 43, 7, 0, 31, 9, 0)
        key[150] = arrayOf( 43, 9, 0, 31, 9, 0)
        key[151] = arrayOf( 43, 11, 0, 21, 9, 0)
        key[152] = arrayOf( 43, 13, 0, 31, 9, 0)
        key[153] = arrayOf( 43, 15, 0, 21, 9, 0)
        key[154] = arrayOf( 43, 17, 0, 21, 9, 0)
        key[155] = arrayOf( 43, 19, 0, 21, 9, 0)
        key[156] = arrayOf( 43, 21, 0, 21, 9, 0)
        key[157] = arrayOf( 42, 3, 0, 21, 9, 0)
        key[158] = arrayOf( 42, 5, 0, 21, 9, 0)
        key[159] = arrayOf( 42, 5, 1, 21, 9, 0)
        key[160] = arrayOf( 42, 11, 0, 21, 9, 0)
        key[161] = arrayOf( 42, 13, 0, 21, 9, 0)
        key[162] = arrayOf( 42, 15, 0, 21, 9, 0)
        key[163] = arrayOf( 42, 17, 0, 21, 9, 0)
        key[164] = arrayOf( 42, 19, 0, 21, 9, 7)
        key[165] = arrayOf( 28, 4, 0, 21, 9, 0)
        key[166] = arrayOf( 28, 6, 0, 21, 9, 0)
        key[167] = arrayOf( 28, 8, 0, 52, 9, 0)
        key[168] = arrayOf( 28, 10, 0, 57, 9, 0)
        key[169] = arrayOf( 28, 12, 0, 23, 9, 0)
        key[170] = arrayOf( 44, 2, 0, 31, 9, 0)
        key[171] = arrayOf( 44, 4, 0, 31, 9, 0)
        key[172] = arrayOf( 44, 5, 0, 21, 9, 0)
        key[173] = arrayOf( 44, 6, 0, 31, 9, 0)
        key[174] = arrayOf( 44, 7, 0, 31, 9, 0)
        key[175] = arrayOf( 44, 10, 0, 21, 9, 0)
        key[176] = arrayOf( 44, 14, 0, 21, 9, 0)
        key[177] = arrayOf( 44, 16, 0, 21, 9, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[178] = arrayOf( 39, 31, 0, 4, 10, 0)
        key[179] = arrayOf( 43, 1, 0, 6, 10, 0)
        key[180] = arrayOf( 43, 2, 0, 37, 10, 8)
        key[181] = arrayOf( 43, 3, 0, 3, 10, 0)
        key[182] = arrayOf( 43, 4, 0, 37, 10, 0)
        key[183] = arrayOf( 43, 5, 0, 53, 10, 0)
        key[184] = arrayOf( 43, 6, 0, 37, 10, 0)
        key[185] = arrayOf( 43, 8, 0, 3, 10, 0)
        key[186] = arrayOf( 43, 10, 0, 6, 10, 0)
        key[187] = arrayOf( 43, 12, 0, 6, 10, 0)
        key[188] = arrayOf( 43, 14, 0, 2, 10, 0)
        key[189] = arrayOf( 43, 16, 0, 5, 10, 0)
        key[190] = arrayOf( 43, 16, 1, 0, 10, 0)
        key[191] = arrayOf( 43, 18, 0, 37, 10, 0)
        key[192] = arrayOf( 43, 20, 0, 37, 10, 0)
        key[193] = arrayOf( 43, 22, 0, 55, 10, 0)
        key[194] = arrayOf( 43, 26, 0, 55, 10, 0)
        key[195] = arrayOf( 42, 25, 0, 37, 10, 0)
        key[196] = arrayOf( 42, 26, 0, 6, 10, 0)
        key[197] = arrayOf( 6, 2, 0, 37, 10, 0)
        key[198] = arrayOf( 6, 4, 0, 37, 10, 0)
        key[199] = arrayOf( 6, 6, 0, 37, 10, 0)
        key[200] = arrayOf( 6, 8, 0, 37, 10, 0)
        key[201] = arrayOf( 6, 10, 0, 37, 10, 0)
        key[202] = arrayOf( 6, 12, 0, 37, 10, 0)
        key[203] = arrayOf( 6, 14, 0, 37, 10, 0)
        key[204] = arrayOf( 6, 16, 0, 37, 10, 0)
        key[205] = arrayOf( 6, 20, 0, 55, 10, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[206] = arrayOf( 0, 1, 0, 24, 11, 0)
        key[207] = arrayOf( 0, 2, 0, 24, 11, 0)
        key[208] = arrayOf( 0, 4, 0, 24, 11, 0)
        key[209] = arrayOf( 0, 6, 0, 24, 11, 0)
        key[210] = arrayOf( 0, 8, 0, 24, 11, 0)
        key[211] = arrayOf( 0, 10, 0, 24, 11, 0)
        key[212] = arrayOf( 0, 16, 0, 10, 11, 9)
        key[213] = arrayOf( 0, 18, 0, 30, 11, 0)
        key[214] = arrayOf( 0, 20, 0, 24, 11, 0)
        key[215] = arrayOf( 0, 22, 0, 24, 11, 0)
        key[216] = arrayOf( 0, 24, 0, 30, 11, 0)
        key[217] = arrayOf( 0, 26, 0, 24, 11, 0)
        key[218] = arrayOf( 0, 28, 0, 30, 11, 0)
        key[219] = arrayOf( 0, 30, 0, 24, 11, 0)
        key[220] = arrayOf( 0, 32, 0, 30, 11, 0)
        key[221] = arrayOf( 6, 32, 0, 30, 11, 0)
        key[222] = arrayOf( 6, 36, 0, 30, 11, 0)
        key[223] = arrayOf( 6, 38, 0, 30, 11, 0)
        key[224] = arrayOf( 21, 3, 0, 24, 11, 0)
        key[225] = arrayOf( 21, 5, 0, 24, 11, 0)
        key[226] = arrayOf( 21, 7, 0, 24, 11, 0)
        key[227] = arrayOf( 21, 9, 0, 30, 11, 0)
        key[228] = arrayOf( 21, 11, 0, 24, 11, 0)
        key[229] = arrayOf( 21, 13, 0, 30, 11, 0)
        key[230] = arrayOf( 21, 19, 0, 30, 11, 0)
        key[231] = arrayOf( 21, 21, 0, 30, 11, 0)
        key[232] = arrayOf( 21, 23, 0, 24, 11, 0)
        key[233] = arrayOf( 21, 25, 0, 24, 11, 0)
        key[234] = arrayOf( 21, 27, 0, 24, 11, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[235] = arrayOf( 14, 3, 0, 11, 12, 0)
        key[236] = arrayOf( 14, 4, 0, 15, 12, 10)
        key[237] = arrayOf( 14, 5, 0, 11, 12, 0)
        key[238] = arrayOf( 14, 7, 0, 11, 12, 0)
        key[239] = arrayOf( 14, 9, 0, 15, 12, 0)
        key[240] = arrayOf( 14, 11, 0, 15, 12, 0)
        key[241] = arrayOf( 14, 13, 0, 11, 12, 0)
        key[242] = arrayOf( 22, 8, 0, 15, 12, 0)
        key[243] = arrayOf( 22, 10, 0, 20, 12, 0)
        key[244] = arrayOf( 22, 12, 0, 42, 12, 0)
        key[245] = arrayOf( 18, 4, 0, 15, 12, 11)
        key[246] = arrayOf( 6, 85, 0, 15, 12, 0)
        key[247] = arrayOf( 6, 87, 0, 15, 12, 0)
        key[248] = arrayOf( 6, 89, 0, 15, 12, 0)
        key[249] = arrayOf( 6, 91, 0, 15, 12, 0)
        key[250] = arrayOf( 6, 93, 0, 11, 12, 0)
        key[251] = arrayOf( 6, 95, 0, 11, 12, 0)
        key[252] = arrayOf( 6, 97, 0, 25, 12, 0)
        key[253] = arrayOf( 6, 99, 0, 11, 12, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[254] = arrayOf( 6, 103, 0, 15, 12, 0)
        key[255] = arrayOf( 6, 105, 0, 20, 12, 0)
        key[256] = arrayOf( 14, 17, 0, 31, 13, 0)
        key[257] = arrayOf( 14, 19, 0, 19, 13, 0)
        key[258] = arrayOf( 14, 21, 0, 19, 13, 0)
        key[259] = arrayOf( 14, 23, 0, 14, 13, 0)
        key[260] = arrayOf( 19, 32, 0, 31, 13, 0)
        key[261] = arrayOf( 19, 34, 0, 31, 13, 0)
        key[262] = arrayOf( 19, 38, 0, 19, 13, 0)
        key[263] = arrayOf( 19, 44, 0, 26, 13, 12)
        key[264] = arrayOf( 19, 48, 0, 14, 13, 0)
        key[265] = arrayOf( 19, 50, 0, 31, 13, 0)
        key[266] = arrayOf( 19, 51, 0, 31, 13, 0)
        key[267] = arrayOf( 19, 53, 0, 31, 13, 0)
        key[268] = arrayOf( 19, 55, 0, 31, 13, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[269] = arrayOf( 23, 7, 0, 45, 14, 0)
        key[270] = arrayOf( 24, 5, 0, 46, 14, 0)
        key[271] = arrayOf( 24, 7, 0, 46, 14, 0)
        key[272] = arrayOf( 24, 7, 1, 45, 14, 0)
        key[273] = arrayOf( 24, 9, 0, 45, 14, 0)
        key[274] = arrayOf( 25, 2, 0, 48, 14, 0)
        key[275] = arrayOf( 25, 4, 1, 58, 14, 0)
        key[276] = arrayOf( 25, 6, 0, 52, 14, 0)
        key[277] = arrayOf( 25, 8, 0, 37, 14, 0)
        key[278] = arrayOf( 25, 10, 0, 48, 14, 0)
        key[279] = arrayOf( 25, 12, 0, 48, 14, 0)
        key[280] = arrayOf( 25, 14, 0, 48, 14, 0)
        key[281] = arrayOf( 19, 6, 0, 48, 14, 0)
        key[282] = arrayOf( 6, 47, 1, 33, 14, 0)
        key[283] = arrayOf( 6, 51, 0, 58, 14, 0)
        key[284] = arrayOf( 6, 69, 0, 59, 14, 0)
        key[285] = arrayOf( 6, 71, 0, 59, 14, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[286] = arrayOf( 7, 4, 0, 32, 15, 0)
        key[287] = arrayOf( 7, 10, 0, 29, 15, 0)
        key[288] = arrayOf( 7, 10, 1, 36, 15, 0)
        key[289] = arrayOf( 7, 12, 0, 29, 15, 0)
        key[290] = arrayOf( 26, 2, 0, 7, 15, 0)
        key[291] = arrayOf( 26, 3, 0, 32, 15, 13)
        key[292] = arrayOf( 26, 6, 0, 32, 15, 0)
        key[293] = arrayOf( 26, 8, 0, 32, 15, 0)
        key[294] = arrayOf( 26, 10, 0, 32, 15, 0)
        key[295] = arrayOf( 26, 12, 0, 32, 15, 0)
        key[296] = arrayOf( 26, 1, 1, 7, 15, 0)
        key[297] = arrayOf( 12, 4, 0, 7, 15, 0)
        key[298] = arrayOf( 12, 6, 0, 32, 15, 0)
        key[299] = arrayOf( 27, 1, 0, 18, 15, 0)
        key[300] = arrayOf( 27, 1, 1, 32, 15, 0)
        key[301] = arrayOf( 27, 2, 1, 7, 15, 0)
        key[302] = arrayOf( 27, 6, 0, 32, 15, 0)
        key[303] = arrayOf( 27, 7, 0, 32, 15, 0)
        key[304] = arrayOf( 27, 11, 0, 29, 15, 0)
        key[305] = arrayOf( 27, 13, 0, 29, 15, 0)
        key[306] = arrayOf( 27, 34, 0, 32, 15, 0)
        key[307] = arrayOf( 27, 36, 0, 32, 15, 0)
        key[308] = arrayOf( 6, 19, 0, 32, 15, 0)
        key[309] = arrayOf( 6, 19, 1, 32, 15, 0)
        key[310] = arrayOf( 6, 21, 0, 32, 15, 0)
        key[311] = arrayOf( 6, 23, 0, 32, 15, 0)
        key[312] = arrayOf( 6, 25, 0, 32, 15, 0)
        key[313] = arrayOf( 6, 27, 0, 32, 15, 0)
        key[314] = arrayOf( 6, 29, 0, 32, 15, 0)
        key[315] = arrayOf( 6, 31, 0, 32, 15, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[316] = arrayOf( 7, 12, 1, 30, 16, 0)
        key[317] = arrayOf( 7, 14, 0, 30, 16, 0)
        key[318] = arrayOf( 7, 18, 0, 30, 16, 0)
        key[319] = arrayOf( 7, 26, 0, 30, 16, 0)
        key[320] = arrayOf( 7, 28, 0, 30, 16, 14)
        key[321] = arrayOf( 8, 37, 0, 30, 16, 0)
        key[322] = arrayOf( 8, 39, 0, 30, 16, 0)
        key[323] = arrayOf( 8, 41, 0, 30, 16, 0)
        key[324] = arrayOf( 8, 43, 0, 30, 16, 0)
        key[325] = arrayOf( 10, 46, 0, 30, 16, 0)
        key[326] = arrayOf( 10, 48, 0, 30, 16, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[327] = arrayOf( 9, 21, 0, 22, 17, 0)
        key[328] = arrayOf( 11, 2, 0, 48, 17, 0)
        key[329] = arrayOf( 11, 3, 0, 48, 17, 0)
        key[330] = arrayOf( 11, 5, 0, 48, 17, 0)
        key[331] = arrayOf( 11, 7, 0, 48, 17, 0)
        key[332] = arrayOf( 11, 7, 1, 48, 17, 0)
        key[333] = arrayOf( 11, 9, 0, 48, 17, 0)
        key[334] = arrayOf( 11, 9, 1, 48, 17, 0)
        key[335] = arrayOf( 11, 11, 0, 48, 17, 0)
        key[336] = arrayOf( 11, 13, 0, 48, 17, 0)
        key[337] = arrayOf( 11, 15, 0, 48, 17, 0)
        key[338] = arrayOf( 12, 11, 0, 48, 17, 0)
        key[339] = arrayOf( 12, 13, 0, 48, 17, 0)
        key[340] = arrayOf( 12, 15, 0, 48, 17, 0)
        key[341] = arrayOf( 13, 2, 0, 48, 17, 0)
        key[342] = arrayOf( 13, 6, 0, 48, 17, 0)
        key[343] = arrayOf( 13, 8, 0, 48, 17, 0)
        key[344] = arrayOf( 13, 10, 0, 48, 17, 0)
        key[345] = arrayOf( 13, 12, 0, 48, 17, 0)
        key[346] = arrayOf( 13, 14, 0, 48, 17, 0)
        key[347] = arrayOf( 13, 16, 0, 48, 17, 0)
        key[348] = arrayOf( 13, 18, 0, 48, 17, 0)
        key[349] = arrayOf( 13, 20, 0, 48, 17, 0)
        key[350] = arrayOf( 14, 24, 0, 35, 18, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[351] = arrayOf( 15, 116, 0, 37, 18, 0)
        key[352] = arrayOf( 15, 118, 0, 37, 18, 0)
        key[353] = arrayOf( 15, 122, 0, 37, 18, 0)
        key[354] = arrayOf( 15, 124, 0, 37, 18, 8)
        key[355] = arrayOf( 15, 126, 0, 15, 18, 15)
        key[356] = arrayOf( 15, 130, 0, 35, 18, 0)
        key[357] = arrayOf( 15, 152, 0, 35, 18, 0)
        key[358] = arrayOf( 15, 154, 0, 35, 18, 0)
        key[359] = arrayOf( 16, 40, 0, 35, 18, 0)
        key[360] = arrayOf( 16, 42, 0, 15, 18, 0)
        key[361] = arrayOf( 17, 9, 0, 15, 18, 0)
        key[362] = arrayOf( 17, 11, 0, 15, 18, 0)
        key[363] = arrayOf( 17, 13, 0, 15, 18, 0)
        key[364] = arrayOf( 17, 15, 0, 15, 18, 0)
        key[365] = arrayOf( 17, 17, 0, 15, 18, 0)
        key[366] = arrayOf( 17, 18, 0, 35, 18, 0)
        key[367] = arrayOf( 17, 20, 0, 15, 18, 0)
        key[368] = arrayOf( 17, 22, 0, 44, 18, 0)
        key[369] = arrayOf( 17, 23, 0, 35, 18, 0)
        key[370] = arrayOf( 17, 25, 0, 35, 18, 0)
        key[371] = arrayOf( 17, 26, 0, 35, 18, 0)
        key[372] = arrayOf( 17, 27, 0, 35, 18, 0)
        key[373] = arrayOf( 17, 29, 0, 35, 18, 0)
        key[374] = arrayOf( 17, 31, 0, 35, 18, 0)
        key[375] = arrayOf( 17, 33, 0, 35, 18, 0)
        key[376] = arrayOf( 17, 35, 0, 37, 18, 0)
        key[377] = arrayOf( 17, 37, 0, 35, 18, 0)
        key[378] = arrayOf( 17, 39, 0, 35, 18, 0)
        key[379] = arrayOf( 17, 41, 0, 35, 18, 0)
        key[380] = arrayOf( 17, 41, 1, 35, 18, 0)
        key[381] = arrayOf( 18, 23, 0, 15, 18, 0)
        key[382] = arrayOf( 18, 25, 0, 15, 18, 0)
        key[383] = arrayOf( 18, 27, 0, 35, 18, 0)
        key[384] = arrayOf( 18, 29, 0, 37, 18, 0)
        key[385] = arrayOf( 18, 30, 0, 35, 18, 0)
        key[386] = arrayOf( 18, 32, 0, 35, 18, 0)
        key[387] = arrayOf( 18, 34, 0, 35, 18, 0)
        key[388] = arrayOf( 19, 35, 0, 35, 18, 0)
        key[389] = arrayOf( 19, 37, 0, 35, 18, 0)
        key[390] = arrayOf( 19, 39, 0, 35, 18, 0)
        key[391] = arrayOf( 19, 41, 0, 35, 18, 0)
        key[392] = arrayOf( 19, 43, 0, 25, 18, 16)
        key[393] = arrayOf( 20, 24, 0, 35, 18, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[394] = arrayOf( 28, 17, 0, 29, 19, 17)
        key[395] = arrayOf( 28, 25, 0, 29, 19, 0)
        key[396] = arrayOf( 28, 27, 0, 29, 19, 0)
        key[397] = arrayOf( 21, 41, 0, 29, 19, 0)
        key[398] = arrayOf( 21, 41, 1, 29, 19, 18)
        key[399] = arrayOf( 21, 43, 0, 29, 19, 0)
        key[400] = arrayOf( 21, 45, 0, 29, 19, 0)
        key[401] = arrayOf( 21, 49, 0, 52, 19, 0)
        key[402] = arrayOf( 21, 51, 0, 29, 19, 0)
        key[403] = arrayOf( 21, 53, 0, 29, 19, 0)
        key[404] = arrayOf( 21, 55, 0, 29, 19, 0)
        key[405] = arrayOf( 21, 59, 0, 29, 19, 0)
        key[406] = arrayOf( 21, 65, 0, 29, 19, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[407] = arrayOf( 28, 3, 0, 18, 20, 0)
        key[408] = arrayOf( 28, 5, 0, 18, 20, 0)
        key[409] = arrayOf( 28, 7, 0, 18, 20, 0)
        key[410] = arrayOf( 28, 13, 0, 18, 20, 0)
        key[411] = arrayOf( 28, 15, 0, 18, 20, 0)
        key[412] = arrayOf( 0, 5, 0, 18, 20, 0)
        key[413] = arrayOf( 0, 7, 0, 18, 20, 0)
        key[414] = arrayOf( 0, 9, 0, 18, 20, 0)
        key[415] = arrayOf( 0, 11, 0, 49, 20, 0)
        key[416] = arrayOf( 0, 13, 0, 18, 20, 0)
        key[417] = arrayOf( 0, 15, 0, 60, 20, 0)
        key[418] = arrayOf( 0, 17, 0, 60, 20, 0)
        key[419] = arrayOf( 21, 29, 0, 30, 20, 0)
        key[420] = arrayOf( 21, 31, 0, 49, 20, 0)
        key[421] = arrayOf( 21, 33, 1, 12, 20, 0)
        key[422] = arrayOf( 21, 35, 0, 18, 20, 0)
        key[423] = arrayOf( 21, 39, 0, 18, 20, 0)
        //Улица, дом, корпус, ключ, кампус, примечание
        key[424] = arrayOf( 29, 4, 0, 41, 21, 19)
        key[425] = arrayOf( 29, 6, 0, 41, 21, 0)
        key[426] = arrayOf( 29, 12, 0, 41, 21, 0)
        key[427] = arrayOf( 19, 12, 1, 41, 21, 0)
        key[428] = arrayOf( 30, 183, 0, 40, 21, 0)
        key[429] = arrayOf( 30, 189, 0, 40, 21, 0)
        key[430] = arrayOf( 30, 191, 0, 40, 21, 0)
        key[431] = arrayOf( 30, 193, 0, 40, 21, 0)
        key[432] = arrayOf( 30, 195, 0, 40, 21, 0)
        key[433] = arrayOf( 30, 199, 0, 40, 21, 0)
        key[434] = arrayOf( 30, 201, 0, 40, 21, 0)
        key[435] = arrayOf( 30, 203, 0, 40, 21, 0)
        key[436] = arrayOf( 30, 205, 0, 40, 21, 0)
        key[437] = arrayOf( 30, 219, 0, 41, 21, 0)
        key[438] = arrayOf( 30, 221, 0, 41, 21, 0)
        key[439] = arrayOf( 30, 223, 0, 41, 21, 0)
        key[440] = arrayOf( 45, 142, 0, 38, 21, 23)
        key[441] = arrayOf( 31, 218, 0, 40, 21, 0)
        key[442] = arrayOf( 31, 222, 0, 40, 21, 0)
        key[443] = arrayOf( 32, 12, 0, 41, 21, 0)
        key[444] = arrayOf( 32, 14, 0, 41, 21, 0)
        key[445] = arrayOf( 33, 4, 0, 40, 21, 0)
        key[446] = arrayOf( 33, 6, 0, 40, 21, 0)
        key[447] = arrayOf( 34, 3, 0, 41, 21, 0)
        key[448] = arrayOf( 34, 5, 0, 41, 21, 0)
        //Новые добавленные адреса
        key[449] = arrayOf( 40, 18, 1, 50, 9, 5) //Вучетича 18а
        key[450] = arrayOf( 1, 49, 1, 50, 5, 0) //Пролетарская 49а
        key[451] = arrayOf( 5, 70, 0, 50, 4, 0) //Доценко 70
        key[452] = arrayOf( 41, 14, 0, 49, 8, 0) //Голубева 14
        key[453] = arrayOf( 11, 19, 0, 24, 17, 0) //2-я штурманская 19
        key[454] = arrayOf( 19, 2, 0, 37, 17, 0) //Столетова 2
        key[455] = arrayOf( 19, 2, 1, 37, 17, 0) //Столетова 2а
        //Улица, дом, корпус, ключ, кампус, примечание

        // ниже код для добавления по клику
        // слушатель нашей кнопки добавления имени
        val sozdatDB: Button = findViewById(R.id.sozdatDB)
        sozdatDB.setOnClickListener{
            //Делаем кнопку не активной чтобы пользователь не жмакал несколько раз
            sozdatDB.isEnabled = false

            // ниже мы создали
            // новый класс DBHelper,
            // и передал ему контекст
            val db = DBHelper(this, null)

            //извлекаем данные из массива
            var street: String = ""
            var house: String = ""
            var key1: String = ""
            var campus: String = ""
            var comments1: String = ""
            for (i in key.indices){

                street = streets[key[i][0]]

                if (key[i][2] == 1) {
                    house = key[i][1].toString() + " а"
                }
                else if (key[i][2] == 2){
                    house = key[i][1].toString() + " б"
                }
                else if (key[i][2] == 3){
                    house = key[i][1].toString() + " в"
                }

                else if (key[i][2] == 4){
                    house = key[i][1].toString() + " г"
                }

                else if (key[i][2] == 5){
                    house = key[i][1].toString() + " д"
                }
                else{
                    house = key[i][1].toString()
                }

                key1 = keys[key[i][3]]
                campus = kampus[key[i][4]]
                comments1 = comments[key[i][5]]


                val info: TextView = findViewById(R.id.information)
                info.text = street +", " + house +", " + key1 +", " + campus + ", " + comments1
                info.append("Добавлено " + (i+1) + " строк в базу данных.")
                //тут написать процедуру записи массива построчно в Базу Данных
                //цикл длиной в основной массив


                // вызов метода для добавления
                // имя в нашу базу данных
                db.addHouseKey(street, house, key1, campus, comments1)
            }
            // Тост за сообщение на экране
            Toast.makeText(this, "База данных создана!!!",
                Toast.LENGTH_LONG).show()
            sozdatDB.isEnabled = false
        }

        // написать тестировщик созданной базы по строкам,
        //задаем номер строки - выводится заданная строка
        //вешаем слушателя на кнопку Test
        val btnTest: Button = findViewById(R.id.btnTest)
        btnTest.setOnClickListener{
            //функция обработки инажития кнопки Test
            val printLine: TextView = findViewById(R.id.printLine)
            //Метод чтобы скроллить текстВиев в хмл нужно добавить android:scrollbars="vertical"
            printLine.setMovementMethod(ScrollingMovementMethod())

            var idTab: String
            var street: String = ""
            var house: String = ""
            var key1: String = ""
            var campus: String = ""
            var comments1: String = ""

            //Создание класса DBHelper
            val db = DBHelper(this, null)

            // ниже переменная для курсора
            // мы вызвали метод для получения
            // все имена из нашей базы данных
            // и добавить в текстовое представление имени
            val cursor = db.getName()

            // переводим курсор в первую позицию и
            // добавление значения в текстовом виде

           var i = 0


            cursor!!.moveToFirst()
            idTab = (cursor.getString(cursor.getColumnIndex(DBHelper.ID_COL)))
            street = (cursor.getString(cursor.getColumnIndex(DBHelper.STREET_COl)))
            house = (cursor.getString(cursor.getColumnIndex(DBHelper.HOUSE_COL)))
            key1 = (cursor.getString(cursor.getColumnIndex(DBHelper.KEY_COL)))
            campus = (cursor.getString(cursor.getColumnIndex(DBHelper.CAMPUS_COL)))
            comments1 = (cursor.getString(cursor.getColumnIndex(DBHelper.COMMENTS_COL)))
            i++

            // вывод на экран первой строки
            // printLine.append( cursor. + "\n")
            printLine.append(idTab + ", " + street + ", " + house+ ", " + key1 + ", " + campus +
                    ", " + comments1 + "\n")

            //вывод на экран остальных строк

            while(cursor.moveToNext()){
                idTab = (cursor.getString(cursor.getColumnIndex(DBHelper.ID_COL)))
                street = (cursor.getString(cursor.getColumnIndex(DBHelper.STREET_COl)))
                house = (cursor.getString(cursor.getColumnIndex(DBHelper.HOUSE_COL)))
                key1 = (cursor.getString(cursor.getColumnIndex(DBHelper.KEY_COL)))
                campus = (cursor.getString(cursor.getColumnIndex(DBHelper.CAMPUS_COL)))
                comments1 = (cursor.getString(cursor.getColumnIndex(DBHelper.COMMENTS_COL)))
                printLine.append(idTab + ", " + street + ", " + house+ ", " + key1 + ", " + campus +
                        ", " + comments1 + "\n")
                i++
            }
            printLine.append("Количество строк в бд = " + i + "\n")

            // наконец мы закрываем наш курсор
            cursor.close()
        }

        //Заполнение базы ключами
        val addKey: Button = findViewById(R.id.addKey)
        addKey.setOnClickListener {

            //Массив ключей, который пойдет в Базу Данных
            //keysDB[ключ][МКУ]
            val keysDBAll = Array(457, { Array(2 , {""}) })
            var keysDBAllCut = Array(456) {""}
            val txtKeyResalt: TextView = findViewById(R.id.txtKeyResults)
            txtKeyResalt.setMovementMethod(ScrollingMovementMethod())
            //Процесс обработки и выделения ключей из основного массива
            for (i in key.indices) {
                keysDBAll[i] = arrayOf(keys[key[i][3]] , kampus[key[i][4]])
                keysDBAllCut[i] = keysDBAll[i][0]
            }

            //Сортировка массива
            keysDBAllCut.sort()
            var keysDBAllFull = keysDBAllCut.distinct().toMutableList()// Переделываем
            // массив в изменяемый список

            //удаляем не нужные ключи типа Индивидуальный и т.п.
           // for (i in keysDBAllFull.indices.reversed())
            var i=0
            while (i < keysDBAllFull.size){
                if (keysDBAllFull[i] == "Амбарные")
                    keysDBAllFull.removeAt(i)
                if (keysDBAllFull[i] == "Индивидуальный")
                    keysDBAllFull.removeAt(i)
                if (keysDBAllFull[i] == "Коламбийские")
                    keysDBAllFull.removeAt(i)
                if (keysDBAllFull[i] == "Спец")
                    keysDBAllFull.removeAt(i)
                if (keysDBAllFull[i] == "любой ключ")
                    keysDBAllFull.removeAt(i)
                i++
            }
            //Переприсваиваем массив к массиву чтобы в итоге у нас остался ключ в
            //единственном экземпляре и соответствующие ему МКУ
            var keysDB = Array(keysDBAllFull.size, { Array(2 , {""}) })
            for (i in keysDBAllFull.indices)
            {
                for (j in keysDBAll.indices +1)
                {
                    if(keysDBAllFull[i] == keysDBAll[j][0])
                    {
                        keysDB[i][0] = keysDBAllFull[i]
                        keysDB[i][1] += keysDBAll[j][1] + ", "
                    }
                }
            }
            //Удаляем повторяющиеся МКУ из массива
            var chanMKU1 = ""
            var chanMKU2 = ""
            var changeMKU = ""
            for (i in keysDB.indices) {
                changeMKU = keysDB[i][1]

                if (changeMKU.length > 9) {
                    keysDB[i][1] = changeMKU.take(9)
                    var chanMKU = Array(changeMKU.length / 9) { "" }
                    for (j in chanMKU.indices + 1) {
                        chanMKU1 = changeMKU.take(9)
                        changeMKU = changeMKU.drop(9)
                        chanMKU2 = changeMKU.take(9)
                        if (chanMKU1 != chanMKU2)
                            keysDB[i][1] = keysDB[i][1] + chanMKU2
                    }
                }
            }
            //Добавляем очищенные и переработанные ключи в БД ключей
            val db = DBHelperKey(this , null)
            for (i in keysDBAllFull.indices)
            {
               txtKeyResalt.append(keysDB[i][0] + " -- " + keysDB[i][1] + "\n")
                var key = keysDB[i][0]
                var YNKey = ""
                var campus = keysDB[i][1]
                var comments = ""
                db.addKey(key , YNKey , campus , comments)
            }
        }
    }
}
