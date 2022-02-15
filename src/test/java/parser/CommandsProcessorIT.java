package parser;

import parser.algorithm.CC;
import parser.algorithm.Order;
import parser.algorithm.Reverse;
import parser.algorithm.Sum;

class AlgorithmTest {

    public void should_return() {
        //given
        CommandsProcessor algorithm = CommandsProcessor.builder()
                .input(null)
                .output(null)
                .algorithm(new CC())
                .algorithm(new Order())
                .algorithm(new Sum())
                .algorithm(new Reverse())
                .build();
        //when

        //then

    }

}