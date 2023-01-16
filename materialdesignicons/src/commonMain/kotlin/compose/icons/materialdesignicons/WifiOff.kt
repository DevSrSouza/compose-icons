package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.WifiOff: ImageVector
    get() {
        if (_wifiOff != null) {
            return _wifiOff!!
        }
        _wifiOff = Builder(name = "WifiOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.28f, 3.0f)
                lineTo(1.0f, 4.27f)
                lineTo(2.47f, 5.74f)
                curveTo(2.04f, 6.0f, 1.61f, 6.29f, 1.2f, 6.6f)
                lineTo(3.0f, 9.0f)
                curveTo(3.53f, 8.6f, 4.08f, 8.25f, 4.66f, 7.93f)
                lineTo(6.89f, 10.16f)
                curveTo(6.15f, 10.5f, 5.44f, 10.91f, 4.8f, 11.4f)
                lineTo(6.6f, 13.8f)
                curveTo(7.38f, 13.22f, 8.26f, 12.77f, 9.2f, 12.47f)
                lineTo(11.75f, 15.0f)
                curveTo(10.5f, 15.07f, 9.34f, 15.5f, 8.4f, 16.2f)
                lineTo(12.0f, 21.0f)
                lineTo(14.46f, 17.73f)
                lineTo(17.74f, 21.0f)
                lineTo(19.0f, 19.72f)
                moveTo(12.0f, 3.0f)
                curveTo(9.85f, 3.0f, 7.8f, 3.38f, 5.9f, 4.07f)
                lineTo(8.29f, 6.47f)
                curveTo(9.5f, 6.16f, 10.72f, 6.0f, 12.0f, 6.0f)
                curveTo(15.38f, 6.0f, 18.5f, 7.11f, 21.0f, 9.0f)
                lineTo(22.8f, 6.6f)
                curveTo(19.79f, 4.34f, 16.06f, 3.0f, 12.0f, 3.0f)
                moveTo(12.0f, 9.0f)
                curveTo(11.62f, 9.0f, 11.25f, 9.0f, 10.88f, 9.05f)
                lineTo(14.07f, 12.25f)
                curveTo(15.29f, 12.53f, 16.43f, 13.07f, 17.4f, 13.8f)
                lineTo(19.2f, 11.4f)
                curveTo(17.2f, 9.89f, 14.7f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _wifiOff!!
    }

private var _wifiOff: ImageVector? = null
