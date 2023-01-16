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

public val MaterialDesignIcons.WifiSettings: ImageVector
    get() {
        if (_wifiSettings != null) {
            return _wifiSettings!!
        }
        _wifiSettings = Builder(name = "WifiSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                lineTo(8.4f, 15.2f)
                curveTo(9.4f, 14.45f, 10.65f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(14.6f, 14.45f, 15.6f, 15.2f)
                lineTo(12.0f, 20.0f)
                moveTo(4.8f, 10.4f)
                lineTo(6.6f, 12.8f)
                curveTo(8.1f, 11.67f, 9.97f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(15.9f, 11.67f, 17.4f, 12.8f)
                lineTo(19.2f, 10.4f)
                curveTo(17.19f, 8.89f, 14.7f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(6.81f, 8.89f, 4.8f, 10.4f)
                moveTo(12.0f, 2.0f)
                curveTo(7.95f, 2.0f, 4.21f, 3.34f, 1.2f, 5.6f)
                lineTo(3.0f, 8.0f)
                curveTo(5.5f, 6.12f, 8.62f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(18.5f, 6.12f, 21.0f, 8.0f)
                lineTo(22.8f, 5.6f)
                curveTo(19.79f, 3.34f, 16.05f, 2.0f, 12.0f, 2.0f)
                moveTo(7.0f, 24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(24.0f)
                moveTo(15.0f, 24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(24.0f)
                moveTo(11.0f, 24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _wifiSettings!!
    }

private var _wifiSettings: ImageVector? = null
