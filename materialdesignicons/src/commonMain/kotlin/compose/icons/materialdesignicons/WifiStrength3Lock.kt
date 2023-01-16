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

public val MaterialDesignIcons.WifiStrength3Lock: ImageVector
    get() {
        if (_wifiStrength3Lock != null) {
            return _wifiStrength3Lock!!
        }
        _wifiStrength3Lock = Builder(name = "WifiStrength3Lock", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                curveTo(19.68f, 10.0f, 20.32f, 10.14f, 20.91f, 10.39f)
                lineTo(23.64f, 7.0f)
                curveTo(20.31f, 4.41f, 16.2f, 3.0f, 12.0f, 3.0f)
                curveTo(7.78f, 3.0f, 3.69f, 4.41f, 0.365f, 7.0f)
                curveTo(4.39f, 12.06f, 7.88f, 16.37f, 12.0f, 21.5f)
                lineTo(13.0f, 20.24f)
                verticalLineTo(17.2f)
                curveTo(13.0f, 16.24f, 13.5f, 15.34f, 14.2f, 14.74f)
                verticalLineTo(14.5f)
                curveTo(14.2f, 12.06f, 16.4f, 10.0f, 19.0f, 10.0f)
                moveTo(12.0f, 8.0f)
                curveTo(9.0f, 8.0f, 6.67f, 9.0f, 5.2f, 9.84f)
                lineTo(3.26f, 7.44f)
                curveTo(5.9f, 5.85f, 8.91f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(18.08f, 5.86f, 20.7f, 7.45f)
                lineTo(18.76f, 9.88f)
                curveTo(17.25f, 9.0f, 14.87f, 8.0f, 12.0f, 8.0f)
                moveTo(21.8f, 16.0f)
                verticalLineTo(14.5f)
                curveTo(21.8f, 13.1f, 20.4f, 12.0f, 19.0f, 12.0f)
                reflectiveCurveTo(16.2f, 13.1f, 16.2f, 14.5f)
                verticalLineTo(16.0f)
                curveTo(15.6f, 16.0f, 15.0f, 16.6f, 15.0f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(15.0f, 21.4f, 15.6f, 22.0f, 16.2f, 22.0f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 22.0f, 23.0f, 21.4f, 23.0f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(23.0f, 16.6f, 22.4f, 16.0f, 21.8f, 16.0f)
                moveTo(20.5f, 16.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(14.5f)
                curveTo(17.5f, 13.7f, 18.2f, 13.2f, 19.0f, 13.2f)
                reflectiveCurveTo(20.5f, 13.7f, 20.5f, 14.5f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _wifiStrength3Lock!!
    }

private var _wifiStrength3Lock: ImageVector? = null
