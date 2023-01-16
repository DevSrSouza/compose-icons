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

public val MaterialDesignIcons.WifiStrength3LockOpen: ImageVector
    get() {
        if (_wifiStrength3LockOpen != null) {
            return _wifiStrength3LockOpen!!
        }
        _wifiStrength3LockOpen = Builder(name = "WifiStrength3LockOpen", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.2f, 13.5f)
                verticalLineTo(14.74f)
                curveTo(13.5f, 15.34f, 13.0f, 16.24f, 13.0f, 17.2f)
                verticalLineTo(20.24f)
                lineTo(12.0f, 21.5f)
                curveTo(7.88f, 16.37f, 4.39f, 12.06f, 0.365f, 7.0f)
                curveTo(3.69f, 4.41f, 7.78f, 3.0f, 12.0f, 3.0f)
                curveTo(16.2f, 3.0f, 20.31f, 4.41f, 23.64f, 7.0f)
                lineTo(21.5f, 9.69f)
                curveTo(20.86f, 9.33f, 20.17f, 9.11f, 19.42f, 9.04f)
                lineTo(20.7f, 7.45f)
                curveTo(18.08f, 5.86f, 15.06f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(5.9f, 5.85f, 3.26f, 7.44f)
                lineTo(5.2f, 9.84f)
                curveTo(6.67f, 9.0f, 9.0f, 8.0f, 12.0f, 8.0f)
                curveTo(14.18f, 8.0f, 16.08f, 8.58f, 17.53f, 9.25f)
                curveTo(15.63f, 9.85f, 14.2f, 11.54f, 14.2f, 13.5f)
                moveTo(21.8f, 16.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(13.5f)
                curveTo(17.5f, 12.7f, 18.2f, 12.2f, 19.0f, 12.2f)
                reflectiveCurveTo(20.5f, 12.7f, 20.5f, 13.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.8f)
                verticalLineTo(13.5f)
                curveTo(21.8f, 12.1f, 20.4f, 11.0f, 19.0f, 11.0f)
                reflectiveCurveTo(16.2f, 12.1f, 16.2f, 13.5f)
                verticalLineTo(16.0f)
                curveTo(15.6f, 16.0f, 15.0f, 16.6f, 15.0f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(15.0f, 21.4f, 15.6f, 22.0f, 16.2f, 22.0f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 22.0f, 23.0f, 21.4f, 23.0f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(23.0f, 16.6f, 22.4f, 16.0f, 21.8f, 16.0f)
                close()
            }
        }
        .build()
        return _wifiStrength3LockOpen!!
    }

private var _wifiStrength3LockOpen: ImageVector? = null
