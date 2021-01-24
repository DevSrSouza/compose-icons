package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HandshakeSlash: ImageVector
    get() {
        if (_handshakeSlash != null) {
            return _handshakeSlash!!
        }
        _handshakeSlash = Builder(name = "HandshakeSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 128.21f)
                lineTo(0.0f, 384.0f)
                lineTo(64.0f, 384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(96.0f, 184.0f)
                lineTo(23.83f, 128.21f)
                close()
                moveTo(48.0f, 320.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 320.1f)
                close()
                moveTo(128.0f, 351.91f)
                horizontalLineToRelative(18.3f)
                lineToRelative(90.5f, 81.89f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 90.0f, -9.3f)
                lineToRelative(0.2f, -0.2f)
                lineToRelative(17.91f, 15.5f)
                arcToRelative(37.16f, 37.16f, 0.0f, false, false, 52.29f, -5.39f)
                lineToRelative(8.8f, -10.82f)
                lineTo(128.0f, 208.72f)
                close()
                moveTo(544.0f, 128.21f)
                lineTo(544.0f, 352.1f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                lineTo(640.0f, 128.21f)
                close()
                moveTo(592.0f, 352.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 592.0f, 352.1f)
                close()
                moveTo(303.33f, 202.67f)
                lineToRelative(59.58f, -54.57f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.59f, 23.61f)
                lineTo(358.41f, 195.6f)
                lineTo(504.0f, 313.8f)
                arcToRelative(73.08f, 73.08f, 0.0f, false, true, 7.91f, 7.7f)
                lineTo(511.91f, 128.0f)
                lineTo(457.3f, 73.41f)
                arcTo(31.76f, 31.76f, 0.0f, false, false, 434.7f, 64.0f)
                lineTo(348.8f, 64.0f)
                arcToRelative(31.93f, 31.93f, 0.0f, false, false, -21.6f, 8.41f)
                lineToRelative(-88.07f, 80.64f)
                lineToRelative(-25.64f, -19.81f)
                lineTo(289.09f, 64.0f)
                lineTo(205.3f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -22.6f, 9.41f)
                lineTo(162.36f, 93.72f)
                lineTo(45.47f, 3.38f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 23.0f, 6.19f)
                lineTo(3.38f, 31.46f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 6.19f, 53.91f)
                lineTo(594.53f, 508.63f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 617.0f, 505.82f)
                lineToRelative(19.65f, -25.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -2.82f, -22.45f)
                close()
            }
        }
        .build()
        return _handshakeSlash!!
    }

private var _handshakeSlash: ImageVector? = null
