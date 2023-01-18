package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.DiscordLogo: ImageVector
    get() {
        if (_discordLogo != null) {
            return _discordLogo!!
        }
        _discordLogo = Builder(name = "DiscordLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 108.0f, 144.0f)
                close()
                moveTo(160.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 160.0f, 132.0f)
                close()
                moveTo(242.4f, 186.5f)
                curveToRelative(-16.6f, 14.4f, -38.9f, 25.4f, -64.4f, 31.6f)
                arcToRelative(17.4f, 17.4f, 0.0f, false, true, -3.9f, 0.5f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, -14.2f, -8.9f)
                lineToRelative(-9.5f, -19.0f)
                arcToRelative(193.6f, 193.6f, 0.0f, false, true, -44.8f, 0.0f)
                lineToRelative(-9.5f, 19.0f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, -14.2f, 8.9f)
                arcToRelative(17.4f, 17.4f, 0.0f, false, true, -3.9f, -0.5f)
                curveToRelative(-25.5f, -6.2f, -47.8f, -17.2f, -64.4f, -31.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -4.9f, -16.7f)
                lineToRelative(34.0f, -113.2f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, 9.2f, -10.2f)
                arcToRelative(172.0f, 172.0f, 0.0f, false, true, 31.0f, -9.6f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 18.6f, 10.5f)
                lineToRelative(6.0f, 17.8f)
                arcToRelative(191.6f, 191.6f, 0.0f, false, true, 41.0f, 0.0f)
                lineToRelative(6.0f, -17.8f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 18.6f, -10.5f)
                arcToRelative(172.0f, 172.0f, 0.0f, false, true, 31.0f, 9.6f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, 9.2f, 10.2f)
                lineToRelative(34.0f, 113.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 242.4f, 186.5f)
                close()
                moveTo(231.9f, 174.5f)
                lineTo(198.0f, 61.2f)
                arcToRelative(160.8f, 160.8f, 0.0f, false, false, -28.3f, -8.8f)
                lineToRelative(-5.1f, 15.0f)
                arcToRelative(163.4f, 163.4f, 0.0f, false, true, 19.5f, 5.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.0f, 15.2f)
                curveToRelative(-15.3f, -5.0f, -33.0f, -7.6f, -51.1f, -7.6f)
                reflectiveCurveToRelative(-35.8f, 2.6f, -51.1f, 7.6f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, -2.5f, 0.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.5f, -15.6f)
                arcToRelative(163.4f, 163.4f, 0.0f, false, true, 19.5f, -5.0f)
                lineToRelative(-5.0f, -15.0f)
                arcTo(167.7f, 167.7f, 0.0f, false, false, 58.0f, 61.1f)
                lineTo(24.0f, 174.4f)
                curveToRelative(14.7f, 12.8f, 34.7f, 22.5f, 57.8f, 28.2f)
                lineTo(89.0f, 188.1f)
                arcToRelative(152.9f, 152.9f, 0.0f, false, true, -17.1f, -4.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 5.0f, -15.2f)
                curveToRelative(15.3f, 5.0f, 33.0f, 7.6f, 51.1f, 7.6f)
                reflectiveCurveToRelative(35.8f, -2.6f, 51.1f, -7.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.0f, 15.2f)
                arcToRelative(152.9f, 152.9f, 0.0f, false, true, -17.1f, 4.5f)
                lineToRelative(7.2f, 14.5f)
                curveTo(197.3f, 196.9f, 217.3f, 187.2f, 231.9f, 174.5f)
                close()
            }
        }
        .build()
        return _discordLogo!!
    }

private var _discordLogo: ImageVector? = null
