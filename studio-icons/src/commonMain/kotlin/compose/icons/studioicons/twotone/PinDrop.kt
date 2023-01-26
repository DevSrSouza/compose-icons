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

public val TwotoneGroup.PinDrop: ImageVector
    get() {
        if (_pinDrop != null) {
            return _pinDrop!!
        }
        _pinDrop = Builder(name = "PinDrop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(9.19f, 3.0f, 6.0f, 5.11f, 6.0f, 9.13f)
                curveToRelative(0.0f, 2.68f, 2.0f, 5.49f, 6.0f, 8.44f)
                curveToRelative(4.0f, -2.95f, 6.0f, -5.77f, 6.0f, -8.44f)
                curveTo(18.0f, 5.11f, 14.81f, 3.0f, 12.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(1.93f, 0.0f, 5.0f, 1.4f, 5.0f, 5.15f)
                curveToRelative(0.0f, 2.16f, -1.72f, 4.67f, -5.0f, 7.32f)
                curveToRelative(-3.28f, -2.65f, -5.0f, -5.17f, -5.0f, -7.32f)
                curveTo(7.0f, 5.4f, 10.07f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                curveTo(8.73f, 2.0f, 5.0f, 4.46f, 5.0f, 9.15f)
                curveToRelative(0.0f, 3.12f, 2.33f, 6.41f, 7.0f, 9.85f)
                curveToRelative(4.67f, -3.44f, 7.0f, -6.73f, 7.0f, -9.85f)
                curveTo(19.0f, 4.46f, 15.27f, 2.0f, 12.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(13.1f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(5.0f, 20.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _pinDrop!!
    }

private var _pinDrop: ImageVector? = null
