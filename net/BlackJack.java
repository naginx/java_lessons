
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

class Blackjack {
    public static void main(String[] args) {
        System.out.println("ゲームを開始します");

        // 空の山札を作成
        List <Integer> deck = new ArrayList<>(52);

        // 山札をシャッフル

        // プレーヤー・ディーラーの手札リストを生成
        List <Integer> player = new ArrayList<>();
        List <Integer> dealer = new ArrayList<>();

        // プレーヤー・ディーラーがカードを２枚引く
        player.add(deck.get(0));
        dealer.add(deck.get(1));
        
        // 山札の進行状況を記録する変数deckCountを定義
        int deckCount = 4;

        // プレイヤーの手札枚数を記録する変数playerHandsを定義
        int playerHands = 2;

        // プレイヤー・ディーラーの手札のポイントを表示
        System.out.println("あなたの一枚目のカードは" + toDescription(player.get(0)));

        System.out.println("ディーラーの1枚目のカードは" + toDescription(dealer.get(0)));

        System.out.println("あなたの2枚目のカードは" + toDescription(player.get(1)));

        System.out.println("ディーラーの2枚目のカードは秘密です。");

        // プレイヤー・ディーラーのポイントを集計

        System.out.println("あなたの現在のポイントは" + playerPoint + "です。");

        // プレイヤーがカードを引くフェーズ

        // ディーラーが手札を17以上にするまでカードを引くフェーズ

        // ポイントを比較する
        System.out.println("あなたのポイントは" + playerPoint);
        System.out.println("ディーラーのポイントは" + dealerPoint);

        System.out.println("引き分けです。");
        System.out.println("勝ちました！");
        System.out.println("負けました…");
    }

    // 山札に(deck)に値を入れ、シャッフルするメソッド
    private static void shuffleDeck(List<Integer> deck) {

        // リストに1-52の連番を代入
        for(int i = 1; i <= 52; i++){
            deck.add(i);
        }

        // 山札をシャッフル
        Collections.shuffle(deck);

        // リストの中身を確認(デバッグ用)
        for(int i = 0; i < deck.size(); i++){
            System.out.println(deck.get(i));
        }
    }

    // 山札がバーストしているか判定するメソッド

    // 現在の合計ポイントを計算するメソッド
    private static int sumPoint(List<Integer> list) {

    }

    // 山札の数を(スート)の(ランク)の文字列に置き換えるメソッド
    private static String toDescription(int cardNumber) {
        String rank = toRank(toNumber(cardNumber));
        String suit = toSuit(cardNumber);

        return suit + "の" + rank;
    }

    // 山札の数をカードの数に置き換えるメソッド
    private static int toNumber(int cardNumber) {
        int number = cardNumber % 13;
        if(number == 0) {
            number = 13;
        }

        return number;
    }

    // カード番号をランク(AやJ,Q,K)に変換するメソッド
    private static String toRank(int number) {
        switch (number) {
            case  1:  return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default:
                String str = String.valueOf(number);
                return  str;
        }
    }

    // 山札の数をスート(ハートやスペードなどのマーク)に置き換えるメソッド
    private static String toSuit(int cardNumber) {
        switch((cardNumber - 1)/13) {
            case 0: return "クラブ";
            case 1: return "ダイヤ";
            case 2: return "ハート";
            case 3: return "スペード";
            default: return "例外です";
        }
    }
}
