require_relative "spec_helper"

describe FibonacciSequence do
  
  describe "#value_at_sequence_position" do
    it "should return 0 for 1" do
      FibonacciSequence.new.value_of(1).should == 0
    end

    it "should return 0 for 1" do
      FibonacciSequence.new.value_of(2).should == 1
    end
  end
end
