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

public val TwotoneGroup.CameraFront: ImageVector
    get() {
        if (_cameraFront != null) {
            return _cameraFront!!
        }
        _cameraFront = Builder(name = "CameraFront", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(-3.0f, -3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.0f, 20.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(11.99f, 8.0f)
                curveTo(13.1f, 8.0f, 14.0f, 7.1f, 14.0f, 6.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.01f, -2.0f)
                reflectiveCurveTo(10.0f, 4.9f, 10.0f, 6.0f)
                reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f)
                close()
                moveTo(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                curveTo(5.9f, 0.0f, 5.0f, 0.9f, 5.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(19.0f, 2.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(17.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 12.5f)
                curveToRelative(0.0f, -1.67f, -3.33f, -2.5f, -5.0f, -2.5f)
                reflectiveCurveToRelative(-5.0f, 0.83f, -5.0f, 2.5f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(10.5f)
                close()
            }
        }
        .build()
        return _cameraFront!!
    }

private var _cameraFront: ImageVector? = null
