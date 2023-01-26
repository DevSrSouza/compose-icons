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

public val TwotoneGroup.Nightlight: ImageVector
    get() {
        if (_nightlight != null) {
            return _nightlight!!
        }
        _nightlight = Builder(name = "Nightlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f)
                curveToRelative(0.34f, 0.0f, 0.68f, 0.02f, 1.01f, 0.07f)
                curveTo(13.1f, 6.23f, 12.0f, 9.05f, 12.0f, 12.0f)
                reflectiveCurveToRelative(1.1f, 5.77f, 3.01f, 7.93f)
                curveTo(14.68f, 19.98f, 14.34f, 20.0f, 14.0f, 20.0f)
                curveTo(9.59f, 20.0f, 6.0f, 16.41f, 6.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, -3.7f, 2.01f, -6.92f, 5.0f, -8.65f)
                curveTo(17.53f, 2.5f, 15.82f, 2.0f, 14.0f, 2.0f)
                curveTo(8.48f, 2.0f, 4.0f, 6.48f, 4.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                curveToRelative(1.82f, 0.0f, 3.53f, -0.5f, 5.0f, -1.35f)
                curveTo(16.01f, 18.92f, 14.0f, 15.7f, 14.0f, 12.0f)
                close()
                moveTo(15.01f, 19.93f)
                curveTo(14.68f, 19.98f, 14.34f, 20.0f, 14.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f)
                curveToRelative(0.34f, 0.0f, 0.68f, 0.02f, 1.01f, 0.07f)
                curveTo(13.1f, 6.23f, 12.0f, 9.05f, 12.0f, 12.0f)
                reflectiveCurveTo(13.1f, 17.77f, 15.01f, 19.93f)
                close()
            }
        }
        .build()
        return _nightlight!!
    }

private var _nightlight: ImageVector? = null
