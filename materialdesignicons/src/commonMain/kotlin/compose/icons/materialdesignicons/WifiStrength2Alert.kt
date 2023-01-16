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

public val MaterialDesignIcons.WifiStrength2Alert: ImageVector
    get() {
        if (_wifiStrength2Alert != null) {
            return _wifiStrength2Alert!!
        }
        _wifiStrength2Alert = Builder(name = "WifiStrength2Alert", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(7.8f, 3.0f, 3.7f, 4.4f, 0.4f, 7.0f)
                curveTo(4.4f, 12.1f, 7.9f, 16.4f, 12.0f, 21.5f)
                curveTo(14.4f, 18.5f, 16.7f, 15.7f, 19.0f, 12.8f)
                verticalLineTo(9.6f)
                lineTo(17.5f, 11.4f)
                curveTo(16.3f, 10.7f, 14.4f, 10.0f, 12.0f, 10.0f)
                curveTo(9.6f, 10.0f, 7.7f, 10.8f, 6.5f, 11.4f)
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
        return _wifiStrength2Alert!!
    }

private var _wifiStrength2Alert: ImageVector? = null
