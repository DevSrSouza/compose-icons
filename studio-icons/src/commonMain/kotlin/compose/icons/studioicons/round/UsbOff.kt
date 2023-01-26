package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.UsbOff: ImageVector
    get() {
        if (_usbOff != null) {
            return _usbOff!!
        }
        _usbOff = Builder(name = "UsbOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.6f, 5.2f)
                lineToRelative(2.0f, -2.67f)
                curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f)
                lineToRelative(2.0f, 2.67f)
                curveTo(14.65f, 5.53f, 14.41f, 6.0f, 14.0f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.17f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(9.59f, 6.0f, 9.35f, 5.53f, 9.6f, 5.2f)
                close()
                moveTo(15.5f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(1.17f)
                lineToRelative(1.77f, 1.77f)
                curveTo(17.91f, 14.66f, 18.0f, 14.34f, 18.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                curveTo(19.0f, 8.22f, 18.78f, 8.0f, 18.5f, 8.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(15.22f, 8.0f, 15.0f, 8.22f, 15.0f, 8.5f)
                verticalLineToRelative(3.0f)
                curveTo(15.0f, 11.78f, 15.22f, 12.0f, 15.5f, 12.0f)
                close()
                moveTo(20.49f, 21.9f)
                lineTo(20.49f, 21.9f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(-5.9f, -5.9f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(2.28f)
                curveToRelative(0.6f, 0.34f, 1.0f, 0.98f, 1.0f, 1.72f)
                curveToRelative(0.0f, 1.2f, -1.07f, 2.16f, -2.31f, 1.98f)
                curveToRelative(-0.88f, -0.13f, -1.59f, -0.88f, -1.68f, -1.77f)
                curveToRelative(-0.08f, -0.83f, 0.33f, -1.55f, 0.99f, -1.93f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-2.28f)
                curveTo(5.4f, 11.38f, 5.0f, 10.74f, 5.0f, 10.0f)
                curveToRelative(0.0f, -0.59f, 0.26f, -1.13f, 0.68f, -1.5f)
                lineTo(2.1f, 4.93f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(16.97f, 16.97f)
                curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f)
                close()
                moveTo(11.0f, 13.83f)
                lineToRelative(-2.51f, -2.51f)
                curveToRelative(-0.14f, 0.16f, -0.31f, 0.29f, -0.49f, 0.4f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(13.83f)
                close()
            }
        }
        .build()
        return _usbOff!!
    }

private var _usbOff: ImageVector? = null
