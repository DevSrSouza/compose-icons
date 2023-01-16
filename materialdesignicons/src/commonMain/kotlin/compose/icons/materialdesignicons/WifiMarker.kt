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

public val MaterialDesignIcons.WifiMarker: ImageVector
    get() {
        if (_wifiMarker != null) {
            return _wifiMarker!!
        }
        _wifiMarker = Builder(name = "WifiMarker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(8.62f, 6.0f, 5.5f, 7.12f, 3.0f, 9.0f)
                lineTo(1.2f, 6.6f)
                curveTo(4.21f, 4.34f, 7.95f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(19.79f, 4.34f, 22.8f, 6.6f)
                lineTo(21.0f, 9.0f)
                curveTo(18.5f, 7.12f, 15.38f, 6.0f, 12.0f, 6.0f)
                moveTo(13.0f, 15.09f)
                curveTo(12.69f, 15.03f, 12.35f, 15.0f, 12.0f, 15.0f)
                curveTo(10.65f, 15.0f, 9.4f, 15.45f, 8.4f, 16.2f)
                lineTo(12.0f, 21.0f)
                lineTo(13.8f, 18.6f)
                curveTo(13.33f, 17.58f, 13.0f, 16.5f, 13.0f, 15.5f)
                curveTo(13.0f, 15.36f, 13.0f, 15.23f, 13.0f, 15.09f)
                moveTo(12.0f, 9.0f)
                curveTo(9.3f, 9.0f, 6.81f, 9.89f, 4.8f, 11.4f)
                lineTo(6.6f, 13.8f)
                curveTo(8.1f, 12.67f, 9.97f, 12.0f, 12.0f, 12.0f)
                curveTo(12.73f, 12.0f, 13.43f, 12.09f, 14.1f, 12.25f)
                curveTo(14.86f, 11.25f, 15.93f, 10.5f, 17.17f, 10.18f)
                curveTo(15.6f, 9.43f, 13.85f, 9.0f, 12.0f, 9.0f)
                moveTo(22.0f, 15.5f)
                curveTo(22.0f, 18.1f, 18.5f, 22.0f, 18.5f, 22.0f)
                reflectiveCurveTo(15.0f, 18.1f, 15.0f, 15.5f)
                curveTo(15.0f, 13.6f, 16.6f, 12.0f, 18.5f, 12.0f)
                reflectiveCurveTo(22.0f, 13.6f, 22.0f, 15.5f)
                moveTo(19.7f, 15.6f)
                curveTo(19.7f, 15.0f, 19.1f, 14.4f, 18.5f, 14.4f)
                reflectiveCurveTo(17.3f, 14.9f, 17.3f, 15.6f)
                curveTo(17.3f, 16.2f, 17.8f, 16.8f, 18.5f, 16.8f)
                reflectiveCurveTo(19.8f, 16.2f, 19.7f, 15.6f)
                close()
            }
        }
        .build()
        return _wifiMarker!!
    }

private var _wifiMarker: ImageVector? = null
