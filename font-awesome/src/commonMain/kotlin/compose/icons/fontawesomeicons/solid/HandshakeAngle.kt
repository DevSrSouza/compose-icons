package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HandshakeAngle: ImageVector
    get() {
        if (_handshakeAngle != null) {
            return _handshakeAngle!!
        }
        _handshakeAngle = Builder(name = "HandshakeAngle", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(543.9f, 251.4f)
                curveToRelative(0.0f, -1.1f, 0.1f, -2.2f, 0.1f, -3.4f)
                curveToRelative(0.0f, -48.6f, -39.4f, -88.0f, -88.0f, -88.0f)
                lineToRelative(-40.0f, 0.0f)
                horizontalLineTo(320.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                verticalLineToRelative(16.0f)
                verticalLineToRelative(72.0f)
                curveToRelative(0.0f, 22.1f, -17.9f, 40.0f, -40.0f, 40.0f)
                reflectiveCurveToRelative(-40.0f, -17.9f, -40.0f, -40.0f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(0.4f)
                curveToRelative(4.0f, -36.0f, 34.5f, -64.0f, 71.6f, -64.0f)
                horizontalLineTo(408.0f)
                curveToRelative(2.8f, 0.0f, 5.6f, 0.2f, 8.3f, 0.5f)
                lineToRelative(40.1f, -40.1f)
                curveToRelative(21.9f, -21.9f, 57.3f, -21.9f, 79.2f, 0.0f)
                lineToRelative(78.1f, 78.1f)
                curveToRelative(21.9f, 21.9f, 21.9f, 57.3f, 0.0f, 79.2f)
                lineToRelative(-69.7f, 69.7f)
                close()
                moveTo(192.0f, 128.0f)
                verticalLineTo(248.0f)
                curveToRelative(0.0f, 39.8f, 32.2f, 72.0f, 72.0f, 72.0f)
                reflectiveCurveToRelative(72.0f, -32.2f, 72.0f, -72.0f)
                verticalLineTo(192.0f)
                horizontalLineToRelative(80.0f)
                lineToRelative(40.0f, 0.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, 25.1f, 56.0f, 56.0f)
                curveToRelative(0.0f, 27.2f, -19.4f, 49.9f, -45.2f, 55.0f)
                curveToRelative(8.2f, 8.6f, 13.2f, 20.2f, 13.2f, 33.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                horizontalLineToRelative(-2.7f)
                curveToRelative(1.8f, 5.0f, 2.7f, 10.4f, 2.7f, 16.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                horizontalLineTo(224.0f)
                curveToRelative(-0.9f, 0.0f, -1.8f, 0.0f, -2.7f, -0.1f)
                lineToRelative(-37.7f, 37.7f)
                curveToRelative(-21.9f, 21.9f, -57.3f, 21.9f, -79.2f, 0.0f)
                lineTo(26.3f, 407.6f)
                curveToRelative(-21.9f, -21.9f, -21.9f, -57.3f, 0.0f, -79.2f)
                lineTo(96.0f, 258.7f)
                verticalLineTo(224.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                close()
            }
        }
        .build()
        return _handshakeAngle!!
    }

private var _handshakeAngle: ImageVector? = null
