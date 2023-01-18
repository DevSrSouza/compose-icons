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

public val FillGroup.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) {
            return _wifiSlash!!
        }
        _wifiSlash = Builder(name = "WifiSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 210.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.6f, 11.3f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 208.0f, 224.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -5.9f, -2.6f)
                lineToRelative(-35.2f, -38.8f)
                lineToRelative(-26.8f, 31.5f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -24.3f, -0.1f)
                lineTo(12.9f, 92.8f)
                arcTo(16.3f, 16.3f, 0.0f, false, true, 9.1f, 80.5f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, 6.2f, -10.9f)
                arcTo(182.8f, 182.8f, 0.0f, false, true, 46.7f, 50.5f)
                lineTo(42.0f, 45.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 53.9f, 34.6f)
                close()
                moveTo(246.9f, 80.5f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, -6.2f, -10.9f)
                arcTo(188.0f, 188.0f, 0.0f, false, false, 92.6f, 35.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, -6.1f, 5.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 1.7f, 7.9f)
                lineToRelative(93.4f, 102.7f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.9f, 2.6f)
                horizontalLineToRelative(0.2f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.9f, -2.8f)
                lineToRelative(49.6f, -58.4f)
                arcTo(16.4f, 16.4f, 0.0f, false, false, 246.9f, 80.5f)
                close()
            }
        }
        .build()
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
