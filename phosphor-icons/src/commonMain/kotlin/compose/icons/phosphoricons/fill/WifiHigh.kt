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

public val FillGroup.WifiHigh: ImageVector
    get() {
        if (_wifiHigh != null) {
            return _wifiHigh!!
        }
        _wifiHigh = Builder(name = "WifiHigh", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.1f, 92.7f)
                lineToRelative(-103.0f, 121.4f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -24.2f, 0.0f)
                lineTo(12.9f, 92.8f)
                arcTo(16.6f, 16.6f, 0.0f, false, true, 9.2f, 80.5f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, 6.2f, -10.9f)
                curveToRelative(66.3f, -50.1f, 158.9f, -50.1f, 225.3f, 0.0f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, 6.2f, 10.9f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 243.1f, 92.7f)
                close()
            }
        }
        .build()
        return _wifiHigh!!
    }

private var _wifiHigh: ImageVector? = null
