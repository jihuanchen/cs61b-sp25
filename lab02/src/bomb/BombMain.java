package bomb;

import common.IntList;

public class BombMain {
    // 静态方法 answers：根据命令行参数选择要运行的关卡并传入对应“密码”（目前是占位）
// 方法开始
    public static void answers(String[] args) {

        // 初始化要运行到的最高关卡编号为 2（默认会运行 0、1、2 三个关卡）
        int phase = 2;

        // 若提供了命令行参数，则根据第一个参数决定最高关卡
        if (args.length > 0) {

            // 将第一个命令行参数解析为整数，覆盖最高关卡编号
            phase = Integer.parseInt(args[0]);
        }

        // TODO：使用调试技巧找出每一关的正确输入（密码），替换下面的占位参数

        // 创建 Bomb 实例，用于调用各个关卡的方法
        Bomb b = new Bomb();

        // 若最高关卡 ≥ 0，则执行第 0 关
        if (phase >= 0) {

            // 调用第 0 关；当前传入的是占位字符串，需替换为正确密码
            b.phase0("39291226");
        }

        // 若最高关卡 ≥ 1，则执行第 1 关
        if (phase >= 1) {

            // 调用第 1 关；当前传入 null 作为占位，需替换为正确的 IntList 密码
            b.phase1(IntList.of(0,9,3,0,8)); // 原注释：Figure this out too（也要想办法搞定）
        }
        // 若最高关卡 ≥ 2，则执行第 2 关
        if (phase >= 2) {

            // 调用第 2 关；当前传入的是占位字符串，需替换为正确密码
            b.phase2("793227803");
        }
    } // 方法结束

}
