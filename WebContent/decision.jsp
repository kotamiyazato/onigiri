<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html lang=ja>
<head>
        <meta charset="utf-8">

     <link rel="stylesheet" type="text/css" href="deside_jissi.css">

    <title>実施決裁</title>


    </head>


    <body>

    <table  class="main" border="2" >

   <tr>

        <th class="kian">起案者名</th>

       <td><input type="text" name="name" size="8" placeholder="氏名"></td>

       <th colspan="2">プロジェクト承認者</th>

       <td><input type="text" name="name" size="8" placeholder="氏名"></td>

       <td><input type="text" name="name" size="8" placeholder="氏名"></td>

       <td><input type="text" name="name" size="9" placeholder="氏名"></td>

       <th colspan="2">承認番号</th>

       <td colspan="2"><input type="text" name="name" size="32" placeholder="氏名"></td>

        </tr>

        <tr>
            <th >起案番号</th>

            <td colspan="2">q</td>

            <th>決裁番号</th>

            <td  colspan="2">q</td>

            <th colspan="2">実施時期・実施機関</th>

            <td colspan="3"><input type="date" name="example" required>~

<input type="date" name="example2" required></td>


        </tr>


        <tr>
        <th class="atama">決裁頭紙</th>

            <td colspan="10">q</td>


        </tr>


<tr>
    <th class="anken">案件名
    </th>

    <td colspan="3"><textarea cols="32" rows="4" name="案件名"></textarea></td>

    <th>費用</th>

    <td colspan="6">建設費用：　　　　　　損益費用：　　　　　合計：</td>


        </tr>



 </table>



       <br><br><br>

        <table class="sub" border="1">

            <tr>
        <th></th>
        <th>1単位当たりの金額(万円)</th>
            <th>個数</th>
            <th>小計(万円)</th>

                <tr>
            <th>開発端末
                    </th>
                    <td>7</td>

                    <td></td>

                    <td></td>

                    <tr>

                        <th>リリース環境使用料</th>

            <td>0.6</td>

                        <td></td>


                        <td></td>

            </tr>


            <tr>
            <th>回線使用料</th>

                <td>1</td>

                <td></td>

                <td></td>




            </tr>

            <tr>

            <th>施設使用料</th>

                <td>55.5</td>

                <td></td>

                <td></td>




            </tr>

            <tr>

            <th>建設費用</th>

                <td></td>

                <td></td>



                <td></td>


            </tr>





        </table>

        <br><br><br>

        <table class="math" border="2">
        <tr>
            <th></th>

            <td>1単位当たりの金額(万円)</td>

            <td>個数</td>


            <td>小計(万円)</td>


            </tr>


            <tr>
            <th>開発要員</th>
                <td>100</td>
                <td></td>
                <td></td>

            </tr>

        <tr>
            <th>雑費</th>
            <td>0.5</td>
            <td></td>
            <td></td>

            </tr>


            <tr>
                <th>損益費用(万円)</th>
                <td></td>
                <td></td>
                <td></td>





            </tr>

        </table>

        <br><br><br>

        <h2>WBS、チーム体制図、画面遷移図を添付</h2>




        <form action="decideaction">
        <input type="file" name="example" multiple size="30">
             <p><input type="submit" name="save" value="保存" /></p>
        </form>
















    </body>
</html>