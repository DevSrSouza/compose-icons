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

public val SolidGroup.HollyBerry: ImageVector
    get() {
        if (_hollyBerry != null) {
            return _hollyBerry!!
        }
        _hollyBerry = Builder(name = "HollyBerry", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
                moveTo(176.0f, 192.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
                moveTo(276.8f, 383.8f)
                curveToRelative(1.0f, 0.1f, 2.1f, 0.2f, 3.2f, 0.2f)
                curveToRelative(39.8f, 0.0f, 72.0f, 32.2f, 72.0f, 72.0f)
                verticalLineToRelative(22.7f)
                curveToRelative(0.0f, 16.4f, 16.0f, 27.9f, 31.6f, 22.8f)
                lineToRelative(12.8f, -4.3f)
                curveToRelative(18.0f, -6.0f, 37.3f, -6.5f, 55.6f, -1.5f)
                lineToRelative(19.4f, 5.3f)
                curveToRelative(17.9f, 4.9f, 34.4f, -11.6f, 29.5f, -29.5f)
                lineTo(495.6f, 452.0f)
                curveToRelative(-5.0f, -18.3f, -4.4f, -37.6f, 1.5f, -55.6f)
                lineToRelative(4.3f, -12.8f)
                curveToRelative(5.2f, -15.5f, -6.4f, -31.6f, -22.8f, -31.6f)
                curveToRelative(-34.6f, 0.0f, -62.7f, -28.1f, -62.7f, -62.7f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -16.4f, -16.0f, -27.9f, -31.6f, -22.8f)
                lineToRelative(-12.8f, 4.3f)
                curveToRelative(-18.0f, 6.0f, -37.3f, 6.5f, -55.6f, 1.5f)
                lineToRelative(-29.6f, -8.1f)
                curveToRelative(-2.9f, -0.8f, -5.9f, -1.0f, -8.7f, -0.7f)
                curveToRelative(4.2f, 9.7f, 5.8f, 20.8f, 3.7f, 32.3f)
                lineTo(275.0f, 298.7f)
                curveToRelative(-1.5f, 8.4f, -1.4f, 17.0f, 0.5f, 25.3f)
                lineToRelative(5.3f, 23.9f)
                curveToRelative(2.8f, 12.7f, 1.1f, 25.2f, -4.0f, 35.9f)
                close()
                moveTo(127.6f, 234.5f)
                curveToRelative(-15.5f, -5.2f, -31.6f, 6.4f, -31.6f, 22.8f)
                verticalLineToRelative(32.0f)
                curveTo(96.0f, 323.9f, 67.9f, 352.0f, 33.3f, 352.0f)
                curveToRelative(-16.4f, 0.0f, -27.9f, 16.0f, -22.8f, 31.6f)
                lineToRelative(4.3f, 12.8f)
                curveToRelative(6.0f, 18.0f, 6.5f, 37.3f, 1.5f, 55.6f)
                lineToRelative(-5.3f, 19.4f)
                curveTo(6.2f, 489.4f, 22.6f, 505.8f, 40.5f, 501.0f)
                lineTo(60.0f, 495.6f)
                curveToRelative(18.3f, -5.0f, 37.6f, -4.5f, 55.6f, 1.5f)
                lineToRelative(12.8f, 4.3f)
                curveToRelative(15.5f, 5.2f, 31.6f, -6.4f, 31.6f, -22.8f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -34.6f, 28.1f, -62.7f, 62.7f, -62.7f)
                curveToRelative(16.4f, 0.0f, 27.9f, -16.0f, 22.8f, -31.6f)
                lineToRelative(-4.3f, -12.8f)
                curveToRelative(-6.0f, -18.0f, -6.5f, -37.3f, -1.5f, -55.6f)
                lineToRelative(5.3f, -19.4f)
                curveToRelative(4.9f, -17.9f, -11.6f, -34.4f, -29.5f, -29.5f)
                lineTo(196.0f, 240.4f)
                curveToRelative(-18.3f, 5.0f, -37.6f, 4.4f, -55.6f, -1.5f)
                lineToRelative(-12.8f, -4.3f)
                close()
                moveTo(384.0f, 144.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
            }
        }
        .build()
        return _hollyBerry!!
    }

private var _hollyBerry: ImageVector? = null
