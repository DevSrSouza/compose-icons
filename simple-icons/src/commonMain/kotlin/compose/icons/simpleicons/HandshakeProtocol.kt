package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.HandshakeProtocol: ImageVector
    get() {
        if (_handshakeProtocol != null) {
            return _handshakeProtocol!!
        }
        _handshakeProtocol = Builder(name = "HandshakeProtocol", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.348f, 7.829f)
                lineToRelative(-1.491f, -2.65f)
                lineToRelative(2.889f, 0.001f)
                curveToRelative(0.077f, 0.0f, 0.167f, 0.051f, 0.21f, 0.12f)
                lineToRelative(1.533f, 2.529f)
                close()
                moveTo(15.004f, 23.875f)
                curveToRelative(-0.07f, 0.125f, -0.161f, 0.125f, -0.19f, 0.125f)
                horizontalLineToRelative(-2.956f)
                lineToRelative(4.591f, -8.243f)
                arcToRelative(0.442f, 0.442f, 0.0f, false, false, -0.384f, -0.657f)
                lineToRelative(-7.825f, 0.01f)
                lineToRelative(-1.556f, -2.694f)
                horizontalLineToRelative(11.397f)
                curveToRelative(0.248f, -0.017f, 0.362f, -0.158f, 0.393f, -0.231f)
                lineToRelative(1.879f, -3.473f)
                horizontalLineToRelative(3.101f)
                close()
                moveTo(11.094f, 23.561f)
                lineToRelative(-1.522f, -2.506f)
                curveToRelative(-0.023f, -0.037f, -0.034f, -0.128f, 0.014f, -0.214f)
                lineToRelative(2.694f, -4.853f)
                lineToRelative(3.034f, -0.004f)
                close()
                moveTo(5.92f, 18.403f)
                lineToRelative(-1.508f, -2.68f)
                lineToRelative(1.52f, -2.848f)
                lineToRelative(1.524f, 2.64f)
                curveToRelative(-0.474f, 0.891f, -1.213f, 2.283f, -1.536f, 2.888f)
                close()
                moveTo(2.252f, 18.82f)
                arcToRelative(0.268f, 0.268f, 0.0f, false, true, -0.207f, -0.12f)
                lineTo(0.51f, 16.17f)
                horizontalLineToRelative(3.141f)
                lineToRelative(1.491f, 2.65f)
                lineToRelative(-2.891f, -0.001f)
                close()
                moveTo(8.996f, 0.126f)
                curveTo(9.066f, 0.0f, 9.156f, 0.0f, 9.186f, 0.0f)
                horizontalLineToRelative(2.968f)
                lineTo(7.551f, 8.243f)
                curveToRelative(-0.11f, 0.167f, -0.11f, 0.712f, 0.58f, 0.657f)
                lineToRelative(7.63f, -0.01f)
                curveToRelative(0.527f, 0.92f, 1.002f, 1.752f, 1.51f, 2.642f)
                lineTo(5.922f, 11.532f)
                arcToRelative(0.465f, 0.465f, 0.0f, false, false, -0.397f, 0.234f)
                lineToRelative(-1.879f, 3.522f)
                horizontalLineToRelative(-3.1f)
                lineTo(8.996f, 0.126f)
                close()
                moveTo(12.913f, 0.449f)
                lineToRelative(1.515f, 2.496f)
                curveToRelative(0.023f, 0.037f, 0.034f, 0.128f, -0.015f, 0.214f)
                lineTo(11.72f, 8.012f)
                lineToRelative(-3.032f, 0.004f)
                close()
                moveTo(18.079f, 5.594f)
                lineToRelative(1.509f, 2.68f)
                lineToRelative(-1.538f, 2.844f)
                curveToRelative(-0.517f, -0.905f, -0.997f, -1.745f, -1.529f, -2.673f)
                curveToRelative(0.328f, -0.6f, 1.195f, -2.189f, 1.558f, -2.851f)
                close()
            }
        }
        .build()
        return _handshakeProtocol!!
    }

private var _handshakeProtocol: ImageVector? = null
