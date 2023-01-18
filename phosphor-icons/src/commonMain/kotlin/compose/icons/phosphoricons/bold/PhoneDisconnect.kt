package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) {
            return _phoneDisconnect!!
        }
        _phoneDisconnect = Builder(name = "PhoneDisconnect", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.7f, 87.3f)
                arcToRelative(148.3f, 148.3f, 0.0f, false, false, -209.4f, 0.0f)
                arcToRelative(60.2f, 60.2f, 0.0f, false, false, -5.0f, 79.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 15.8f, 7.7f)
                arcToRelative(21.1f, 21.1f, 0.0f, false, false, 7.4f, -1.4f)
                lineToRelative(47.3f, -19.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 101.0f, 139.2f)
                lineToRelative(5.5f, -27.2f)
                arcToRelative(71.5f, 71.5f, 0.0f, false, true, 42.7f, -0.1f)
                lineToRelative(5.8f, 27.4f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 12.1f, 14.5f)
                lineToRelative(47.4f, 19.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 23.2f, -6.3f)
                arcTo(60.2f, 60.2f, 0.0f, false, false, 232.7f, 87.3f)
                close()
                moveTo(220.5f, 149.3f)
                lineTo(178.0f, 132.3f)
                lineTo(172.3f, 104.7f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, false, -13.0f, -14.8f)
                arcToRelative(97.1f, 97.1f, 0.0f, false, false, -63.0f, 0.1f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -12.9f, 15.0f)
                lineToRelative(-5.5f, 27.4f)
                lineTo(35.5f, 149.3f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, true, 4.8f, -45.0f)
                arcToRelative(124.3f, 124.3f, 0.0f, false, true, 175.4f, 0.0f)
                arcTo(36.1f, 36.1f, 0.0f, false, true, 220.5f, 149.3f)
                close()
                moveTo(228.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(40.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(216.0f, 188.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 200.0f)
                close()
            }
        }
        .build()
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
