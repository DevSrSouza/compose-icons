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

public val MaterialDesignIcons.WifiAlert: ImageVector
    get() {
        if (_wifiAlert != null) {
            return _wifiAlert!!
        }
        _wifiAlert = Builder(name = "WifiAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.24f, 5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.25f)
                curveTo(16.16f, 6.45f, 14.13f, 6.0f, 12.0f, 6.0f)
                curveTo(8.62f, 6.0f, 5.5f, 7.12f, 3.0f, 9.0f)
                lineTo(1.2f, 6.6f)
                curveTo(4.21f, 4.34f, 7.95f, 3.0f, 12.0f, 3.0f)
                curveTo(14.97f, 3.0f, 17.77f, 3.73f, 20.24f, 5.0f)
                moveTo(8.4f, 16.2f)
                lineTo(12.0f, 21.0f)
                lineTo(15.6f, 16.2f)
                curveTo(14.6f, 15.45f, 13.35f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(9.4f, 15.45f, 8.4f, 16.2f)
                moveTo(4.8f, 11.4f)
                lineTo(6.6f, 13.8f)
                curveTo(8.1f, 12.67f, 9.97f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveTo(15.9f, 12.67f, 17.4f, 13.8f)
                lineTo(18.0f, 13.0f)
                verticalLineTo(10.62f)
                curveTo(16.23f, 9.59f, 14.19f, 9.0f, 12.0f, 9.0f)
                curveTo(9.3f, 9.0f, 6.81f, 9.89f, 4.8f, 11.4f)
                moveTo(20.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                moveTo(20.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _wifiAlert!!
    }

private var _wifiAlert: ImageVector? = null
