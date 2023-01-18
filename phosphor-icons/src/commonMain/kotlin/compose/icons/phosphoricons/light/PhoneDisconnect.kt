package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) {
            return _phoneDisconnect!!
        }
        _phoneDisconnect = Builder(name = "PhoneDisconnect", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.4f, 91.6f)
                arcToRelative(142.1f, 142.1f, 0.0f, false, false, -200.8f, 0.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -4.5f, 71.2f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 16.2f, 4.4f)
                lineToRelative(47.3f, -18.9f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 95.1f, 138.0f)
                lineToRelative(5.9f, -29.5f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, 1.2f, -1.5f)
                arcToRelative(78.8f, 78.8f, 0.0f, false, true, 51.2f, -0.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.2f, 1.5f)
                lineToRelative(6.2f, 29.7f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 8.6f, 10.2f)
                lineToRelative(47.3f, 18.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 16.2f, -4.4f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 228.4f, 91.6f)
                close()
                moveTo(223.5f, 155.5f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -2.3f, 0.6f)
                lineToRelative(-47.4f, -19.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.2f, -1.4f)
                lineToRelative(-6.2f, -29.8f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -9.1f, -10.3f)
                arcToRelative(90.4f, 90.4f, 0.0f, false, false, -59.0f, 0.1f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -9.0f, 10.5f)
                lineToRelative(-5.9f, 29.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.3f, 1.4f)
                lineToRelative(-47.3f, 19.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -2.3f, -0.6f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 3.6f, -55.4f)
                arcToRelative(130.1f, 130.1f, 0.0f, false, true, 183.8f, 0.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 223.5f, 155.5f)
                close()
                moveTo(222.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(40.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(216.0f, 194.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 200.0f)
                close()
            }
        }
        .build()
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
