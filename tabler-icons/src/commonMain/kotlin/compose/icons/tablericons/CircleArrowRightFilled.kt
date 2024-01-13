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

public val TablerIcons.CircleArrowRightFilled: ImageVector
    get() {
        if (_circleArrowRightFilled != null) {
            return _circleArrowRightFilled!!
        }
        _circleArrowRightFilled = Builder(name = "CircleArrowRightFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(0.324f, 0.005f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -0.648f, 0.0f)
                lineToRelative(0.324f, -0.005f)
                close()
                moveTo(12.613f, 7.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 1.497f)
                lineToRelative(2.291f, 2.293f)
                horizontalLineToRelative(-5.584f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.117f, 1.993f)
                horizontalLineToRelative(5.584f)
                lineToRelative(-2.291f, 2.293f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.497f, 1.32f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(0.073f, -0.082f)
                lineToRelative(0.064f, -0.089f)
                lineToRelative(0.062f, -0.113f)
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
        return _circleArrowRightFilled!!
    }

private var _circleArrowRightFilled: ImageVector? = null
