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

public val MaterialDesignIcons.WifiSync: ImageVector
    get() {
        if (_wifiSync != null) {
            return _wifiSync!!
        }
        _wifiSync = Builder(name = "WifiSync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 15.0f)
                curveTo(10.65f, 15.0f, 9.4f, 15.45f, 8.4f, 16.2f)
                lineTo(12.0f, 21.0f)
                lineTo(13.26f, 19.32f)
                curveTo(13.1f, 18.74f, 13.0f, 18.13f, 13.0f, 17.5f)
                curveTo(13.0f, 16.69f, 13.16f, 15.91f, 13.43f, 15.19f)
                curveTo(12.97f, 15.08f, 12.5f, 15.0f, 12.0f, 15.0f)
                moveTo(15.23f, 12.61f)
                curveTo(16.19f, 11.77f, 17.38f, 11.22f, 18.7f, 11.05f)
                curveTo(16.78f, 9.76f, 14.5f, 9.0f, 12.0f, 9.0f)
                curveTo(9.3f, 9.0f, 6.81f, 9.89f, 4.8f, 11.4f)
                lineTo(6.6f, 13.8f)
                curveTo(8.1f, 12.67f, 9.97f, 12.0f, 12.0f, 12.0f)
                curveTo(13.14f, 12.0f, 14.23f, 12.22f, 15.23f, 12.61f)
                moveTo(19.0f, 20.0f)
                curveTo(17.62f, 20.0f, 16.5f, 18.88f, 16.5f, 17.5f)
                curveTo(16.5f, 17.1f, 16.59f, 16.72f, 16.76f, 16.38f)
                lineTo(15.67f, 15.29f)
                curveTo(15.25f, 15.92f, 15.0f, 16.68f, 15.0f, 17.5f)
                curveTo(15.0f, 19.71f, 16.79f, 21.5f, 19.0f, 21.5f)
                verticalLineTo(23.0f)
                lineTo(21.25f, 20.75f)
                lineTo(19.0f, 18.5f)
                verticalLineTo(20.0f)
                moveTo(19.0f, 13.5f)
                verticalLineTo(12.0f)
                lineTo(16.75f, 14.25f)
                lineTo(19.0f, 16.5f)
                verticalLineTo(15.0f)
                curveTo(20.38f, 15.0f, 21.5f, 16.12f, 21.5f, 17.5f)
                curveTo(21.5f, 17.9f, 21.41f, 18.28f, 21.24f, 18.62f)
                lineTo(22.33f, 19.71f)
                curveTo(22.75f, 19.08f, 23.0f, 18.32f, 23.0f, 17.5f)
                curveTo(23.0f, 15.29f, 21.21f, 13.5f, 19.0f, 13.5f)
                close()
            }
        }
        .build()
        return _wifiSync!!
    }

private var _wifiSync: ImageVector? = null
