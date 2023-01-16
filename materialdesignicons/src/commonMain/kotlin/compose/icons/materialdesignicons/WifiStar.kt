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

public val MaterialDesignIcons.WifiStar: ImageVector
    get() {
        if (_wifiStar != null) {
            return _wifiStar!!
        }
        _wifiStar = Builder(name = "WifiStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(8.6f, 6.0f, 5.5f, 7.1f, 3.0f, 9.0f)
                lineTo(1.2f, 6.6f)
                curveTo(4.2f, 4.3f, 8.0f, 3.0f, 12.0f, 3.0f)
                curveTo(16.0f, 3.0f, 19.8f, 4.3f, 22.8f, 6.6f)
                lineTo(21.0f, 9.0f)
                curveTo(18.5f, 7.1f, 15.4f, 6.0f, 12.0f, 6.0f)
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 17.7f, 13.4f, 16.4f, 14.2f, 15.4f)
                curveTo(13.5f, 15.2f, 12.8f, 15.0f, 12.0f, 15.0f)
                curveTo(10.7f, 15.0f, 9.4f, 15.5f, 8.4f, 16.2f)
                lineTo(12.0f, 21.0f)
                lineTo(13.0f, 19.6f)
                curveTo(13.0f, 19.4f, 13.0f, 19.2f, 13.0f, 19.0f)
                moveTo(16.8f, 13.4f)
                curveTo(17.1f, 13.3f, 17.5f, 13.2f, 17.9f, 13.1f)
                lineTo(19.2f, 11.4f)
                curveTo(17.2f, 9.9f, 14.7f, 9.0f, 12.0f, 9.0f)
                curveTo(9.3f, 9.0f, 6.8f, 9.9f, 4.8f, 11.4f)
                lineTo(6.6f, 13.8f)
                curveTo(8.1f, 12.7f, 10.0f, 12.0f, 12.0f, 12.0f)
                curveTo(13.8f, 12.0f, 15.4f, 12.5f, 16.8f, 13.4f)
                moveTo(16.5f, 22.6f)
                lineTo(17.2f, 19.8f)
                lineTo(15.0f, 17.9f)
                lineTo(17.9f, 17.7f)
                lineTo(19.0f, 15.0f)
                lineTo(20.1f, 17.6f)
                lineTo(23.0f, 17.8f)
                lineTo(20.8f, 19.7f)
                lineTo(21.5f, 22.5f)
                lineTo(19.0f, 21.1f)
                lineTo(16.5f, 22.6f)
                close()
            }
        }
        .build()
        return _wifiStar!!
    }

private var _wifiStar: ImageVector? = null
