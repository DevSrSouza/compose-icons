package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.DiscordLogo: ImageVector
    get() {
        if (_discordLogo != null) {
            return _discordLogo!!
        }
        _discordLogo = Builder(name = "DiscordLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.3f, 169.8f)
                lineToRelative(-34.0f, -113.2f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, -9.2f, -10.2f)
                horizontalLineToRelative(-0.6f)
                lineToRelative(0.6f, -0.2f)
                arcTo(192.4f, 192.4f, 0.0f, false, false, 169.6f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.4f, 6.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 6.2f, 9.4f)
                curveToRelative(4.5f, 0.9f, 8.9f, 2.0f, 13.2f, 3.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 70.0f)
                horizontalLineToRelative(-0.8f)
                arcTo(185.4f, 185.4f, 0.0f, false, false, 128.0f, 64.0f)
                arcToRelative(181.8f, 181.8f, 0.0f, false, false, -46.1f, 5.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.6f, -14.9f)
                horizontalLineToRelative(0.1f)
                curveToRelative(4.3f, -1.2f, 8.7f, -2.3f, 13.2f, -3.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.3f, -9.4f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 86.5f, 36.0f)
                arcTo(191.2f, 191.2f, 0.0f, false, false, 51.9f, 46.4f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, -9.2f, 10.2f)
                lineTo(8.7f, 169.8f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 4.9f, 16.7f)
                arcToRelative(34.7f, 34.7f, 0.0f, false, false, 2.9f, 2.5f)
                horizontalLineToRelative(0.1f)
                curveToRelative(16.2f, 13.2f, 37.5f, 23.3f, 61.5f, 29.1f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 1.9f, 0.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.9f, -15.8f)
                arcToRelative(160.3f, 160.3f, 0.0f, false, true, -31.3f, -11.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.6f, -13.2f)
                curveToRelative(19.0f, 8.4f, 42.9f, 13.7f, 68.8f, 13.7f)
                reflectiveCurveToRelative(49.8f, -5.3f, 68.8f, -13.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.6f, 13.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(160.3f, 160.3f, 0.0f, false, true, -31.3f, 11.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.9f, 15.8f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 1.9f, -0.3f)
                curveToRelative(24.0f, -5.8f, 45.3f, -15.9f, 61.5f, -29.1f)
                horizontalLineToRelative(0.1f)
                arcToRelative(34.7f, 34.7f, 0.0f, false, false, 2.9f, -2.5f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 247.3f, 169.8f)
                close()
                moveTo(96.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 156.0f)
                close()
                moveTo(160.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 160.0f, 156.0f)
                close()
            }
        }
        .build()
        return _discordLogo!!
    }

private var _discordLogo: ImageVector? = null
