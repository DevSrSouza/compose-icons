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

public val SolidGroup.HandshakeAltSlash: ImageVector
    get() {
        if (_handshakeAltSlash != null) {
            return _handshakeAltSlash!!
        }
        _handshakeAltSlash = Builder(name = "HandshakeAltSlash", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(358.59f, 195.6f)
                lineTo(504.2f, 313.8f)
                arcToRelative(63.4f, 63.4f, 0.0f, false, true, 22.21f, 37.91f)
                horizontalLineTo(624.0f)
                arcToRelative(16.05f, 16.05f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(143.91f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 624.0f, 128.0f)
                horizontalLineTo(512.0f)
                lineTo(457.41f, 73.41f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 434.8f, 64.0f)
                horizontalLineTo(348.91f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -21.61f, 8.41f)
                lineToRelative(-88.12f, 80.68f)
                lineToRelative(-25.69f, -19.85f)
                lineTo(289.09f, 64.0f)
                horizontalLineTo(205.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -22.6f, 9.41f)
                lineToRelative(-20.34f, 20.3f)
                lineTo(45.47f, 3.38f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 23.0f, 6.19f)
                lineTo(3.38f, 31.46f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 6.19f, 53.91f)
                lineTo(594.54f, 508.63f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 617.0f, 505.82f)
                lineToRelative(19.64f, -25.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -2.81f, -22.45f)
                lineTo(303.4f, 202.72f)
                lineToRelative(32.69f, -29.92f)
                lineToRelative(27.0f, -24.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.61f, 23.61f)
                close()
                moveTo(16.0f, 128.0f)
                arcTo(16.05f, 16.05f, 0.0f, false, false, 0.0f, 144.0f)
                verticalLineTo(335.91f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(146.3f)
                lineToRelative(90.5f, 81.89f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 90.0f, -9.3f)
                lineToRelative(0.2f, -0.2f)
                lineToRelative(17.91f, 15.5f)
                arcToRelative(37.16f, 37.16f, 0.0f, false, false, 52.29f, -5.39f)
                lineToRelative(8.8f, -10.82f)
                lineTo(23.56f, 128.0f)
                close()
            }
        }
        .build()
        return _handshakeAltSlash!!
    }

private var _handshakeAltSlash: ImageVector? = null
