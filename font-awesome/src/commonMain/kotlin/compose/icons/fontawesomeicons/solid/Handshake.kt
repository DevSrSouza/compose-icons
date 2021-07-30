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
                moveTo(434.7f, 64.0f)
                horizontalLineToRelative(-85.9f)
                curveToRelative(-8.0f, 0.0f, -15.7f, 3.0f, -21.6f, 8.4f)
                lineToRelative(-98.3f, 90.0f)
                curveToRelative(-0.1f, 0.1f, -0.2f, 0.3f, -0.3f, 0.4f)
                curveToRelative(-16.6f, 15.6f, -16.3f, 40.5f, -2.1f, 56.0f)
                curveToRelative(12.7f, 13.9f, 39.4f, 17.6f, 56.1f, 2.7f)
                curveToRelative(0.1f, -0.1f, 0.3f, -0.1f, 0.4f, -0.2f)
                lineToRelative(79.9f, -73.2f)
                curveToRelative(6.5f, -5.9f, 16.7f, -5.5f, 22.6f, 1.0f)
                curveToRelative(6.0f, 6.5f, 5.5f, 16.6f, -1.0f, 22.6f)
                lineToRelative(-26.1f, 23.9f)
                lineTo(504.0f, 313.8f)
                curveToRelative(2.9f, 2.4f, 5.5f, 5.0f, 7.9f, 7.7f)
                lineTo(511.9f, 128.0f)
                lineToRelative(-54.6f, -54.6f)
                curveToRelative(-5.9f, -6.0f, -14.1f, -9.4f, -22.6f, -9.4f)
                close()
                moveTo(544.0f, 128.2f)
                verticalLineToRelative(223.9f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                lineTo(640.0f, 128.2f)
                horizontalLineToRelative(-96.0f)
                close()
                moveTo(592.0f, 352.1f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                close()
                moveTo(0.0f, 384.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(96.0f, 128.2f)
                lineTo(0.0f, 128.2f)
                lineTo(0.0f, 384.0f)
                close()
                moveTo(48.0f, 320.1f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                curveToRelative(0.0f, -8.9f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(483.9f, 338.7f)
                lineTo(334.6f, 217.5f)
                lineToRelative(-30.0f, 27.5f)
                curveToRelative(-29.7f, 27.1f, -75.2f, 24.5f, -101.7f, -4.4f)
                curveToRelative(-26.9f, -29.4f, -24.8f, -74.9f, 4.4f, -101.7f)
                lineTo(289.1f, 64.0f)
                horizontalLineToRelative(-83.8f)
                curveToRelative(-8.5f, 0.0f, -16.6f, 3.4f, -22.6f, 9.4f)
                lineTo(128.0f, 128.0f)
                verticalLineToRelative(223.9f)
                horizontalLineToRelative(18.3f)
                lineToRelative(90.5f, 81.9f)
                curveToRelative(27.4f, 22.3f, 67.7f, 18.1f, 90.0f, -9.3f)
                lineToRelative(0.2f, -0.2f)
                lineToRelative(17.9f, 15.5f)
                curveToRelative(15.9f, 13.0f, 39.4f, 10.5f, 52.3f, -5.4f)
                lineToRelative(31.4f, -38.6f)
                lineToRelative(5.4f, 4.4f)
                curveToRelative(13.7f, 11.1f, 33.9f, 9.1f, 45.0f, -4.7f)
                lineToRelative(9.5f, -11.7f)
                curveToRelative(11.2f, -13.8f, 9.1f, -33.9f, -4.6f, -45.1f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null
