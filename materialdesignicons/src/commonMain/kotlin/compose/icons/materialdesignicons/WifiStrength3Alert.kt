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

public val MaterialDesignIcons.WifiStrength3Alert: ImageVector
    get() {
        if (_wifiStrength3Alert != null) {
            return _wifiStrength3Alert!!
        }
        _wifiStrength3Alert = Builder(name = "WifiStrength3Alert", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(7.8f, 3.0f, 3.7f, 4.4f, 0.4f, 7.0f)
                curveTo(4.4f, 12.1f, 7.9f, 16.4f, 12.0f, 21.5f)
                curveTo(14.4f, 18.5f, 16.7f, 15.7f, 19.0f, 12.8f)
                verticalLineTo(9.6f)
                lineTo(18.8f, 9.9f)
                curveTo(17.3f, 9.0f, 14.9f, 8.0f, 12.0f, 8.0f)
                curveTo(9.0f, 8.0f, 6.7f, 9.0f, 5.2f, 9.8f)
                lineTo(3.3f, 7.4f)
                curveTo(5.9f, 5.8f, 8.9f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(18.1f, 5.9f, 20.7f, 7.4f)
                lineTo(20.3f, 8.0f)
                horizontalLineTo(22.9f)
                curveTo(23.1f, 7.7f, 23.5f, 7.3f, 23.7f, 7.0f)
                curveTo(20.3f, 4.4f, 16.2f, 3.0f, 12.0f, 3.0f)
                moveTo(21.0f, 10.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(10.0f)
                moveTo(21.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
            }
        }
        .build()
        return _wifiStrength3Alert!!
    }

private var _wifiStrength3Alert: ImageVector? = null
