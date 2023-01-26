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

public val TwotoneGroup.MicExternalOn: ImageVector
    get() {
        if (_micExternalOn != null) {
            return _micExternalOn!!
        }
        _micExternalOn = Builder(name = "MicExternalOn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.81f, 16.0f)
                lineToRelative(0.38f, 0.0f)
                lineToRelative(0.6f, -6.0f)
                lineToRelative(-1.58f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.22f, 7.0f)
                curveTo(9.7f, 6.47f, 10.0f, 5.77f, 10.0f, 5.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(4.0f, 3.34f, 4.0f, 5.0f)
                curveToRelative(0.0f, 0.77f, 0.3f, 1.47f, 0.78f, 2.0f)
                horizontalLineTo(9.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(1.0f, -10.0f)
                horizontalLineTo(4.0f)
                lineToRelative(1.0f, 10.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 3.79f, 18.21f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(7.19f, 16.0f)
                horizontalLineTo(6.81f)
                lineToRelative(-0.6f, -6.0f)
                horizontalLineToRelative(1.58f)
                lineTo(7.19f, 16.0f)
                close()
            }
        }
        .build()
        return _micExternalOn!!
    }

private var _micExternalOn: ImageVector? = null
