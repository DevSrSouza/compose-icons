package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Greasyfork: ImageVector
    get() {
        if (_greasyfork != null) {
            return _greasyfork!!
        }
        _greasyfork = Builder(name = "Greasyfork", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.89f, 2.227f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.266f, 0.076f)
                lineToRelative(5.063f, 5.062f)
                curveToRelative(0.54f, 0.54f, 0.509f, 1.652f, -0.031f, 2.192f)
                lineToRelative(8.771f, 8.77f)
                curveToRelative(1.356f, 1.355f, -0.36f, 3.097f, -1.73f, 1.728f)
                lineToRelative(-8.772f, -8.77f)
                curveToRelative(-0.54f, 0.54f, -1.651f, 0.571f, -2.191f, 0.031f)
                lineToRelative(-5.063f, -5.06f)
                curveToRelative(-0.304f, -0.304f, 0.304f, -0.911f, 0.608f, -0.608f)
                lineToRelative(3.714f, 3.713f)
                lineTo(7.59f, 8.297f)
                lineTo(3.875f, 4.582f)
                curveToRelative(-0.304f, -0.304f, 0.304f, -0.911f, 0.607f, -0.607f)
                lineToRelative(3.715f, 3.714f)
                lineToRelative(1.067f, -1.066f)
                lineTo(5.549f, 2.91f)
                curveToRelative(-0.228f, -0.228f, 0.057f, -0.626f, 0.342f, -0.683f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.374f, 0.0f, 0.0f, 5.375f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.374f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.625f, 0.0f, 12.0f, -5.375f, 12.0f, -12.0f)
                reflectiveCurveTo(18.625f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _greasyfork!!
    }

private var _greasyfork: ImageVector? = null
