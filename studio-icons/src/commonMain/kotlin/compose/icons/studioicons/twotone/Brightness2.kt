package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Brightness2: ImageVector
    get() {
        if (_brightness2 != null) {
            return _brightness2!!
        }
        _brightness2 = Builder(name = "Brightness2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f)
                curveToRelative(-0.34f, 0.0f, -0.68f, 0.02f, -1.01f, 0.07f)
                curveTo(10.9f, 6.23f, 12.0f, 9.05f, 12.0f, 12.0f)
                curveToRelative(0.0f, 2.95f, -1.1f, 5.77f, -3.01f, 7.93f)
                curveToRelative(0.33f, 0.05f, 0.67f, 0.07f, 1.01f, 0.07f)
                curveToRelative(4.41f, 0.0f, 8.0f, -3.59f, 8.0f, -8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.65f)
                curveTo(6.47f, 21.5f, 8.18f, 22.0f, 10.0f, 22.0f)
                curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(15.52f, 2.0f, 10.0f, 2.0f)
                curveToRelative(-1.82f, 0.0f, -3.53f, 0.5f, -5.0f, 1.35f)
                curveTo(7.99f, 5.08f, 10.0f, 8.3f, 10.0f, 12.0f)
                reflectiveCurveToRelative(-2.01f, 6.92f, -5.0f, 8.65f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(0.0f, -2.95f, -1.1f, -5.77f, -3.01f, -7.93f)
                curveTo(9.32f, 4.02f, 9.66f, 4.0f, 10.0f, 4.0f)
                curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f)
                curveToRelative(-0.34f, 0.0f, -0.68f, -0.02f, -1.01f, -0.07f)
                curveTo(10.9f, 17.77f, 12.0f, 14.95f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _brightness2!!
    }

private var _brightness2: ImageVector? = null
