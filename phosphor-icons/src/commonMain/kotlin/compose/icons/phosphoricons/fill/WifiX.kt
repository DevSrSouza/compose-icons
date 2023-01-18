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

public val FillGroup.WifiX: ImageVector
    get() {
        if (_wifiX != null) {
            return _wifiX!!
        }
        _wifiX = Builder(name = "WifiX", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.4f, 98.1f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.6f, 11.1f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -6.0f, 2.8f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -5.7f, -2.3f)
                lineTo(200.0f, 91.3f)
                lineToRelative(-18.3f, 18.4f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 176.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.1f, -2.8f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 0.6f, -11.1f)
                lineTo(188.7f, 80.0f)
                lineTo(170.6f, 61.9f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -0.4f, -11.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.5f, -0.2f)
                lineTo(200.0f, 68.7f)
                lineToRelative(18.3f, -18.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.5f, 0.2f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -0.4f, 11.4f)
                lineTo(211.3f, 80.0f)
                close()
                moveTo(202.8f, 116.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.6f, 0.0f)
                lineToRelative(-3.9f, 3.8f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -34.3f, 0.4f)
                arcToRelative(24.2f, 24.2f, 0.0f, false, true, 0.0f, -34.0f)
                lineToRelative(7.1f, -7.0f)
                lineToRelative(-6.7f, -6.6f)
                curveToRelative(-9.0f, -9.0f, -9.9f, -23.6f, -1.5f, -33.2f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, true, 1.1f, -1.1f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -1.5f, -4.8f)
                arcTo(187.4f, 187.4f, 0.0f, false, false, 15.4f, 69.6f)
                arcTo(15.6f, 15.6f, 0.0f, false, false, 9.2f, 80.5f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, false, 3.7f, 12.3f)
                lineToRelative(103.0f, 121.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 24.2f, 0.0f)
                lineToRelative(71.5f, -84.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.9f, -5.9f)
                arcToRelative(26.9f, 26.9f, 0.0f, false, true, -3.7f, -3.0f)
                close()
            }
        }
        .build()
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
