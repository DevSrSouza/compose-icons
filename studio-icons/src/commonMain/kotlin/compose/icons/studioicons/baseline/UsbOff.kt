package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.UsbOff: ImageVector
    get() {
        if (_usbOff != null) {
            return _usbOff!!
        }
        _usbOff = Builder(name = "UsbOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.34f, -0.08f, 0.66f, -0.23f, 0.94f)
                lineTo(16.0f, 13.17f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(11.0f, 8.17f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-3.0f, -4.0f)
                lineTo(9.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(8.17f)
                close()
                moveTo(13.0f, 16.0f)
                verticalLineToRelative(2.28f)
                curveToRelative(0.6f, 0.34f, 1.0f, 0.98f, 1.0f, 1.72f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.74f, 0.4f, -1.37f, 1.0f, -1.72f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f)
                verticalLineToRelative(-2.28f)
                curveTo(5.4f, 11.38f, 5.0f, 10.74f, 5.0f, 10.0f)
                curveToRelative(0.0f, -0.59f, 0.26f, -1.13f, 0.68f, -1.49f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(13.17f, 16.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(11.0f, 14.0f)
                verticalLineToRelative(-0.17f)
                lineToRelative(-2.51f, -2.51f)
                curveToRelative(-0.14f, 0.16f, -0.31f, 0.29f, -0.49f, 0.4f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _usbOff!!
    }

private var _usbOff: ImageVector? = null
