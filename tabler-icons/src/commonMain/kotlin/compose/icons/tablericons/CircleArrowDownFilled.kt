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

public val TablerIcons.CircleArrowDownFilled: ImageVector
    get() {
        if (_circleArrowDownFilled != null) {
            return _circleArrowDownFilled!!
        }
        _circleArrowDownFilled = Builder(name = "CircleArrowDownFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(5.585f)
                lineToRelative(-2.293f, -2.292f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 1.497f)
                lineToRelative(4.0f, 4.0f)
                curveToRelative(0.028f, 0.028f, 0.057f, 0.054f, 0.094f, 0.083f)
                lineToRelative(0.092f, 0.064f)
                lineToRelative(0.098f, 0.052f)
                lineToRelative(0.081f, 0.034f)
                lineToRelative(0.113f, 0.034f)
                lineToRelative(0.112f, 0.02f)
                lineToRelative(0.117f, 0.006f)
                lineToRelative(0.115f, -0.007f)
                lineToRelative(0.114f, -0.02f)
                lineToRelative(0.142f, -0.044f)
                lineToRelative(0.113f, -0.054f)
                lineToRelative(0.111f, -0.071f)
                arcToRelative(0.939f, 0.939f, 0.0f, false, false, 0.112f, -0.097f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.497f, -1.32f)
                lineToRelative(-2.293f, 2.291f)
                verticalLineToRelative(-5.584f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                close()
            }
        }
        .build()
        return _circleArrowDownFilled!!
    }

private var _circleArrowDownFilled: ImageVector? = null
