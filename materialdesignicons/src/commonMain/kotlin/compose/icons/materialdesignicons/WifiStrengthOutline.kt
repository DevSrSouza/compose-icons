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

public val MaterialDesignIcons.WifiStrengthOutline: ImageVector
    get() {
        if (_wifiStrengthOutline != null) {
            return _wifiStrengthOutline!!
        }
        _wifiStrengthOutline = Builder(name = "WifiStrengthOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(7.79f, 3.0f, 3.7f, 4.41f, 0.38f, 7.0f)
                horizontalLineTo(0.36f)
                curveTo(4.24f, 11.83f, 8.13f, 16.66f, 12.0f, 21.5f)
                curveTo(15.89f, 16.66f, 19.77f, 11.83f, 23.64f, 7.0f)
                horizontalLineTo(23.65f)
                curveTo(20.32f, 4.41f, 16.22f, 3.0f, 12.0f, 3.0f)
                moveTo(12.0f, 5.0f)
                curveTo(15.07f, 5.0f, 18.09f, 5.86f, 20.71f, 7.45f)
                lineTo(12.0f, 18.3f)
                lineTo(3.27f, 7.44f)
                curveTo(5.9f, 5.85f, 8.92f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _wifiStrengthOutline!!
    }

private var _wifiStrengthOutline: ImageVector? = null
