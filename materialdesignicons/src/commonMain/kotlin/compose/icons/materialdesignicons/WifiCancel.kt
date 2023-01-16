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

public val MaterialDesignIcons.WifiCancel: ImageVector
    get() {
        if (_wifiCancel != null) {
            return _wifiCancel!!
        }
        _wifiCancel = Builder(name = "WifiCancel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(15.53f, 12.72f)
                curveTo(16.42f, 12.26f, 17.43f, 12.0f, 18.5f, 12.0f)
                curveTo(18.58f, 12.0f, 18.66f, 12.0f, 18.74f, 12.0f)
                lineTo(19.2f, 11.4f)
                curveTo(17.19f, 9.89f, 14.7f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(6.81f, 9.89f, 4.8f, 11.4f)
                lineTo(6.6f, 13.8f)
                curveTo(8.1f, 12.67f, 9.97f, 12.0f, 12.0f, 12.0f)
                curveTo(13.26f, 12.0f, 14.45f, 12.26f, 15.53f, 12.72f)
                moveTo(12.0f, 15.0f)
                curveTo(10.65f, 15.0f, 9.4f, 15.45f, 8.4f, 16.2f)
                lineTo(12.0f, 21.0f)
                lineTo(12.34f, 20.54f)
                curveTo(12.13f, 19.9f, 12.0f, 19.22f, 12.0f, 18.5f)
                curveTo(12.0f, 17.24f, 12.36f, 16.08f, 13.0f, 15.08f)
                curveTo(12.66f, 15.03f, 12.33f, 15.0f, 12.0f, 15.0f)
                moveTo(23.0f, 18.5f)
                curveTo(23.0f, 21.0f, 21.0f, 23.0f, 18.5f, 23.0f)
                reflectiveCurveTo(14.0f, 21.0f, 14.0f, 18.5f)
                reflectiveCurveTo(16.0f, 14.0f, 18.5f, 14.0f)
                reflectiveCurveTo(23.0f, 16.0f, 23.0f, 18.5f)
                moveTo(20.0f, 21.08f)
                lineTo(15.92f, 17.0f)
                curveTo(15.65f, 17.42f, 15.5f, 17.94f, 15.5f, 18.5f)
                curveTo(15.5f, 20.16f, 16.84f, 21.5f, 18.5f, 21.5f)
                curveTo(19.06f, 21.5f, 19.58f, 21.35f, 20.0f, 21.08f)
                moveTo(21.5f, 18.5f)
                curveTo(21.5f, 16.84f, 20.16f, 15.5f, 18.5f, 15.5f)
                curveTo(17.94f, 15.5f, 17.42f, 15.65f, 17.0f, 15.92f)
                lineTo(21.08f, 20.0f)
                curveTo(21.35f, 19.58f, 21.5f, 19.06f, 21.5f, 18.5f)
                close()
            }
        }
        .build()
        return _wifiCancel!!
    }

private var _wifiCancel: ImageVector? = null
