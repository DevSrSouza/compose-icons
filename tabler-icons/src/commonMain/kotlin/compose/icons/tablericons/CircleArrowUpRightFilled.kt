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

public val TablerIcons.CircleArrowUpRightFilled: ImageVector
    get() {
        if (_circleArrowUpRightFilled != null) {
            return _circleArrowUpRightFilled!!
        }
        _circleArrowUpRightFilled = Builder(name = "CircleArrowUpRightFilled", defaultWidth =
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
                horizontalLineToRelative(-6.0f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, 0.993f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.993f, 0.883f)
                horizontalLineToRelative(3.584f)
                lineToRelative(-4.291f, 4.293f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.497f, 1.32f)
                lineToRelative(4.293f, -4.293f)
                verticalLineToRelative(3.586f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.993f, -0.117f)
                verticalLineToRelative(-6.0f)
                lineToRelative(-0.007f, -0.117f)
                lineToRelative(-0.029f, -0.149f)
                lineToRelative(-0.035f, -0.105f)
                lineToRelative(-0.054f, -0.113f)
                lineToRelative(-0.071f, -0.111f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, -0.097f, -0.112f)
                lineToRelative(-0.09f, -0.08f)
                lineToRelative(-0.096f, -0.067f)
                lineToRelative(-0.098f, -0.052f)
                lineToRelative(-0.11f, -0.044f)
                lineToRelative(-0.112f, -0.03f)
                lineToRelative(-0.126f, -0.017f)
                lineToRelative(-0.075f, -0.003f)
                close()
            }
        }
        .build()
        return _circleArrowUpRightFilled!!
    }

private var _circleArrowUpRightFilled: ImageVector? = null
