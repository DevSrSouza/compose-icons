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
                moveTo(544.0f, 248.0f)
                verticalLineToRelative(3.3f)
                lineToRelative(69.7f, -69.7f)
                curveToRelative(21.9f, -21.9f, 21.9f, -57.3f, 0.0f, -79.2f)
                lineTo(535.6f, 24.4f)
                curveToRelative(-21.9f, -21.9f, -57.3f, -21.9f, -79.2f, 0.0f)
                lineTo(416.3f, 64.5f)
                curveToRelative(-2.7f, -0.3f, -5.5f, -0.5f, -8.3f, -0.5f)
                horizontalLineTo(296.0f)
                curveToRelative(-37.1f, 0.0f, -67.6f, 28.0f, -71.6f, 64.0f)
                horizontalLineTo(224.0f)
                verticalLineTo(248.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                reflectiveCurveToRelative(40.0f, -17.9f, 40.0f, -40.0f)
                verticalLineTo(176.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, -0.1f, 0.0f, -0.1f)
                verticalLineTo(160.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(136.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f)
                horizontalLineTo(464.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(336.0f, 192.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 39.8f, -32.2f, 72.0f, -72.0f, 72.0f)
                reflectiveCurveToRelative(-72.0f, -32.2f, -72.0f, -72.0f)
                verticalLineTo(129.4f)
                curveToRelative(-35.9f, 6.2f, -65.8f, 32.3f, -76.0f, 68.2f)
                lineTo(99.5f, 255.2f)
                lineTo(26.3f, 328.4f)
                curveToRelative(-21.9f, 21.9f, -21.9f, 57.3f, 0.0f, 79.2f)
                lineToRelative(78.1f, 78.1f)
                curveToRelative(21.9f, 21.9f, 57.3f, 21.9f, 79.2f, 0.0f)
                lineToRelative(37.7f, -37.7f)
                curveToRelative(0.9f, 0.0f, 1.8f, 0.1f, 2.7f, 0.1f)
                horizontalLineTo(384.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                curveToRelative(0.0f, -5.6f, -1.0f, -11.0f, -2.7f, -16.0f)
                horizontalLineTo(432.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                curveToRelative(0.0f, -12.8f, -5.0f, -24.4f, -13.2f, -33.0f)
                curveToRelative(25.7f, -5.0f, 45.1f, -27.6f, 45.2f, -54.8f)
                verticalLineToRelative(-0.4f)
                curveToRelative(-0.1f, -30.8f, -25.1f, -55.8f, -56.0f, -55.8f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(-120.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handshakeAngle!!
    }

private var _handshakeAngle: ImageVector? = null
