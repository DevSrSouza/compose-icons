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

public val TwotoneGroup.Opacity: ImageVector
    get() {
        if (_opacity != null) {
            return _opacity!!
        }
        _opacity = Builder(name = "Opacity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.24f, 9.65f)
                lineTo(12.0f, 5.27f)
                lineTo(7.76f, 9.6f)
                curveTo(6.62f, 10.73f, 6.01f, 12.0f, 6.0f, 14.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(-0.01f, -2.0f, -0.62f, -3.23f, -1.76f, -4.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.66f, 8.0f)
                lineTo(12.0f, 2.35f)
                lineTo(6.34f, 8.0f)
                curveTo(4.78f, 9.56f, 4.0f, 11.64f, 4.0f, 13.64f)
                reflectiveCurveToRelative(0.78f, 4.11f, 2.34f, 5.67f)
                reflectiveCurveToRelative(3.61f, 2.35f, 5.66f, 2.35f)
                reflectiveCurveToRelative(4.1f, -0.79f, 5.66f, -2.35f)
                reflectiveCurveTo(20.0f, 15.64f, 20.0f, 13.64f)
                reflectiveCurveTo(19.22f, 9.56f, 17.66f, 8.0f)
                close()
                moveTo(6.0f, 14.0f)
                curveToRelative(0.01f, -2.0f, 0.62f, -3.27f, 1.76f, -4.4f)
                lineTo(12.0f, 5.27f)
                lineToRelative(4.24f, 4.38f)
                curveTo(17.38f, 10.77f, 17.99f, 12.0f, 18.0f, 14.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _opacity!!
    }

private var _opacity: ImageVector? = null
