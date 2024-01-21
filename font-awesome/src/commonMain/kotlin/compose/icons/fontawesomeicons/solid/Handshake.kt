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

public val SolidGroup.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(323.4f, 85.2f)
                lineToRelative(-96.8f, 78.4f)
                curveToRelative(-16.1f, 13.0f, -19.2f, 36.4f, -7.0f, 53.1f)
                curveToRelative(12.9f, 17.8f, 38.0f, 21.3f, 55.3f, 7.8f)
                lineToRelative(99.3f, -77.2f)
                curveToRelative(7.0f, -5.4f, 17.0f, -4.2f, 22.5f, 2.8f)
                reflectiveCurveToRelative(4.2f, 17.0f, -2.8f, 22.5f)
                lineToRelative(-20.9f, 16.2f)
                lineTo(512.0f, 316.8f)
                lineTo(512.0f, 128.0f)
                horizontalLineToRelative(-0.7f)
                lineToRelative(-3.9f, -2.5f)
                lineTo(434.8f, 79.0f)
                curveToRelative(-15.3f, -9.8f, -33.2f, -15.0f, -51.4f, -15.0f)
                curveToRelative(-21.8f, 0.0f, -43.0f, 7.5f, -60.0f, 21.2f)
                close()
                moveTo(346.2f, 209.6f)
                lineToRelative(-51.7f, 40.2f)
                curveTo(263.0f, 274.4f, 217.3f, 268.0f, 193.7f, 235.6f)
                curveToRelative(-22.2f, -30.5f, -16.6f, -73.1f, 12.7f, -96.8f)
                lineToRelative(83.2f, -67.3f)
                curveToRelative(-11.6f, -4.9f, -24.1f, -7.4f, -36.8f, -7.4f)
                curveTo(234.0f, 64.0f, 215.7f, 69.6f, 200.0f, 80.0f)
                lineToRelative(-72.0f, 48.0f)
                lineTo(128.0f, 352.0f)
                horizontalLineToRelative(28.2f)
                lineToRelative(91.4f, 83.4f)
                curveToRelative(19.6f, 17.9f, 49.9f, 16.5f, 67.8f, -3.1f)
                curveToRelative(5.5f, -6.1f, 9.2f, -13.2f, 11.1f, -20.6f)
                lineToRelative(17.0f, 15.6f)
                curveToRelative(19.5f, 17.9f, 49.9f, 16.6f, 67.8f, -2.9f)
                curveToRelative(4.5f, -4.9f, 7.8f, -10.6f, 9.9f, -16.5f)
                curveToRelative(19.4f, 13.0f, 45.8f, 10.3f, 62.1f, -7.5f)
                curveToRelative(17.9f, -19.5f, 16.6f, -49.9f, -2.9f, -67.8f)
                lineToRelative(-134.2f, -123.0f)
                close()
                moveTo(16.0f, 128.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineTo(0.0f, 352.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(64.0f, 384.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(96.0f, 128.0f)
                lineTo(16.0f, 128.0f)
                close()
                moveTo(48.0f, 320.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, -32.0f)
                close()
                moveTo(544.0f, 128.0f)
                lineTo(544.0f, 352.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(640.0f, 144.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(544.0f, 128.0f)
                close()
                moveTo(576.0f, 336.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null
