package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.SquareArrowRightFilled: ImageVector
    get() {
        if (_squareArrowRightFilled != null) {
            return _squareArrowRightFilled!!
        }
        _squareArrowRightFilled = Builder(name = "SquareArrowRightFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(12.613f, 7.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 0.083f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.083f, 1.32f)
                lineToRelative(2.292f, 2.293f)
                horizontalLineToRelative(-5.585f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.117f, 1.993f)
                horizontalLineToRelative(5.585f)
                lineToRelative(-2.292f, 2.293f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.497f, 1.32f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(0.073f, -0.082f)
                lineToRelative(0.074f, -0.104f)
                lineToRelative(0.052f, -0.098f)
                lineToRelative(0.044f, -0.11f)
                lineToRelative(0.03f, -0.112f)
                lineToRelative(0.017f, -0.126f)
                lineToRelative(0.003f, -0.075f)
                lineToRelative(-0.007f, -0.118f)
                lineToRelative(-0.029f, -0.148f)
                lineToRelative(-0.035f, -0.105f)
                lineToRelative(-0.054f, -0.113f)
                lineToRelative(-0.071f, -0.111f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, false, -0.097f, -0.112f)
                lineToRelative(-4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _squareArrowRightFilled!!
    }

private var _squareArrowRightFilled: ImageVector? = null
