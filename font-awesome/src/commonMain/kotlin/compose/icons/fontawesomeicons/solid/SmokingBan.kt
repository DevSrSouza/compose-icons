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

public val SolidGroup.SmokingBan: ImageVector
    get() {
        if (_smokingBan != null) {
            return _smokingBan!!
        }
        _smokingBan = Builder(name = "SmokingBan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 304.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(117.5f)
                lineToRelative(-96.0f, -96.0f)
                lineTo(112.0f, 224.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(256.0f, 0.0f)
                curveTo(114.6f, 0.0f, 0.0f, 114.6f, 0.0f, 256.0f)
                reflectiveCurveToRelative(114.6f, 256.0f, 256.0f, 256.0f)
                reflectiveCurveToRelative(256.0f, -114.6f, 256.0f, -256.0f)
                reflectiveCurveTo(397.4f, 0.0f, 256.0f, 0.0f)
                close()
                moveTo(256.0f, 448.0f)
                curveToRelative(-105.9f, 0.0f, -192.0f, -86.1f, -192.0f, -192.0f)
                curveToRelative(0.0f, -41.4f, 13.3f, -79.7f, 35.7f, -111.1f)
                lineToRelative(267.4f, 267.4f)
                curveTo(335.7f, 434.7f, 297.4f, 448.0f, 256.0f, 448.0f)
                close()
                moveTo(301.2f, 256.0f)
                lineTo(384.0f, 256.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-50.8f)
                lineToRelative(-32.0f, -32.0f)
                close()
                moveTo(412.3f, 367.1f)
                lineTo(365.2f, 320.0f)
                lineTo(400.0f, 320.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-64.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(269.2f, 224.0f)
                lineTo(144.9f, 99.7f)
                curveTo(176.3f, 77.3f, 214.6f, 64.0f, 256.0f, 64.0f)
                curveToRelative(105.9f, 0.0f, 192.0f, 86.1f, 192.0f, 192.0f)
                curveToRelative(0.0f, 41.4f, -13.3f, 79.7f, -35.7f, 111.1f)
                close()
                moveTo(320.6f, 128.0f)
                curveToRelative(-15.6f, 0.0f, -28.6f, -11.2f, -31.4f, -25.9f)
                curveToRelative(-0.7f, -3.6f, -4.0f, -6.1f, -7.7f, -6.1f)
                horizontalLineToRelative(-16.2f)
                curveToRelative(-5.0f, 0.0f, -8.7f, 4.5f, -8.0f, 9.4f)
                curveToRelative(4.6f, 30.9f, 31.2f, 54.6f, 63.3f, 54.6f)
                curveToRelative(15.6f, 0.0f, 28.6f, 11.2f, 31.4f, 25.9f)
                curveToRelative(0.7f, 3.6f, 4.0f, 6.1f, 7.7f, 6.1f)
                horizontalLineToRelative(16.2f)
                curveToRelative(5.0f, 0.0f, 8.7f, -4.5f, 8.0f, -9.4f)
                curveToRelative(-4.6f, -30.9f, -31.2f, -54.6f, -63.3f, -54.6f)
                close()
            }
        }
        .build()
        return _smokingBan!!
    }

private var _smokingBan: ImageVector? = null
