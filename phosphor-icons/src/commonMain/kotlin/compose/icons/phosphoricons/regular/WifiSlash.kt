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

public val RegularGroup.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) {
            return _wifiSlash!!
        }
        _wifiSlash = Builder(name = "WifiSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.9f, 210.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.9f, -2.6f)
                lineTo(155.0f, 169.6f)
                arcToRelative(42.8f, 42.8f, 0.0f, false, false, -56.5f, 2.2f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -5.6f, 2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.5f, -13.8f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 128.0f, 144.0f)
                horizontalLineToRelative(3.9f)
                lineToRelative(-26.6f, -29.2f)
                arcToRelative(89.3f, 89.3f, 0.0f, false, false, -40.7f, 22.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -0.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.1f, -11.3f)
                arcToRelative(104.7f, 104.7f, 0.0f, false, true, 39.9f, -24.6f)
                lineTo(70.4f, 76.5f)
                arcToRelative(135.5f, 135.5f, 0.0f, false, false, -39.7f, 27.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -5.6f, 2.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -5.7f, -2.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.3f)
                arcTo(155.9f, 155.9f, 0.0f, false, true, 59.1f, 64.1f)
                lineToRelative(-17.0f, -18.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.5f, -11.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 11.3f, 0.5f)
                close()
                moveTo(236.6f, 92.5f)
                arcTo(153.4f, 153.4f, 0.0f, false, false, 128.0f, 48.0f)
                arcToRelative(160.5f, 160.5f, 0.0f, false, false, -22.0f, 1.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 2.3f, 15.9f)
                arcTo(143.9f, 143.9f, 0.0f, false, true, 128.0f, 64.0f)
                arcToRelative(137.5f, 137.5f, 0.0f, false, true, 97.3f, 39.9f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.6f, 2.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 5.7f, -13.7f)
                close()
                moveTo(191.4f, 137.8f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 5.6f, 2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.6f, -13.7f)
                arcToRelative(106.0f, 106.0f, 0.0f, false, false, -48.5f, -27.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -3.9f, 15.5f)
                arcTo(90.4f, 90.4f, 0.0f, false, true, 191.4f, 137.8f)
                close()
                moveTo(128.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 188.0f)
                close()
            }
        }
        .build()
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
