require_relative "spec_helper"

describe FizzBuzz do
  
  describe "#value_of" do
    it "should return 1 for 1" do
      FizzBuzz.new.value_of(1).should == "1"
    end

    it "should return 2 for 2" do
      FizzBuzz.new.value_of(2).should == "2"
    end

    it "should return Fizz for 3" do
      FizzBuzz.new.value_of(3).should == "Fizz"
    end

    it "should return Buzz for 5" do
      FizzBuzz.new.value_of(5).should == "Buzz"
    end
  end
end
