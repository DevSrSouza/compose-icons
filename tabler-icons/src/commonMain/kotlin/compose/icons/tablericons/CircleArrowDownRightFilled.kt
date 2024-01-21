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

public val TablerIcons.CircleArrowDownRightFilled: ImageVector
    get() {
        if (_circleArrowDownRightFilled != null) {
            return _circleArrowDownRightFilled!!
        }
        _circleArrowDownRightFilled = Builder(name = "CircleArrowDownRightFilled", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                close()
                moveTo(15.0f, 8.0f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, 0.993f)
                verticalLineToRelative(3.585f)
                lineToRelative(-4.293f, -4.292f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 1.497f)
                lineToRelative(4.292f, 4.293f)
                horizontalLineToRelative(-3.585f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.117f, 1.993f)
                lineToRelative(6.034f, 0.001f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 0.186f, -0.025f)
                lineToRelative(0.053f, -0.014f)
                lineToRelative(0.066f, -0.02f)
                lineToRelative(0.13f, -0.059f)
                lineToRelative(0.093f, -0.055f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, 0.438f, -0.828f)
                verticalLineToRelative(-6.0f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                close()
            }
        }
        .build()
        return _circleArrowDownRightFilled!!
    }

private var _circleArrowDownRightFilled: ImageVector? = null
