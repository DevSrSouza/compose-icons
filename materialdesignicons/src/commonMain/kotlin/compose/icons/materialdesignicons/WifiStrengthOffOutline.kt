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

public val MaterialDesignIcons.WifiStrengthOffOutline: ImageVector
    get() {
        if (_wifiStrengthOffOutline != null) {
            return _wifiStrengthOffOutline!!
        }
        _wifiStrengthOffOutline = Builder(name = "WifiStrengthOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.27f, 1.44f)
                lineTo(2.0f, 2.72f)
                lineTo(4.05f, 4.77f)
                curveTo(2.75f, 5.37f, 1.5f, 6.11f, 0.38f, 7.0f)
                curveTo(4.2f, 11.8f, 8.14f, 16.67f, 12.0f, 21.5f)
                lineTo(15.91f, 16.63f)
                lineTo(19.23f, 19.95f)
                lineTo(20.5f, 18.68f)
                curveTo(14.87f, 13.04f, 3.27f, 1.44f, 3.27f, 1.44f)
                moveTo(12.0f, 3.0f)
                curveTo(10.6f, 3.0f, 9.21f, 3.17f, 7.86f, 3.5f)
                lineTo(9.56f, 5.19f)
                curveTo(10.37f, 5.07f, 11.18f, 5.0f, 12.0f, 5.0f)
                curveTo(15.07f, 5.0f, 18.09f, 5.86f, 20.71f, 7.45f)
                lineTo(16.76f, 12.38f)
                lineTo(18.18f, 13.8f)
                curveTo(20.08f, 11.43f, 22.0f, 9.0f, 23.65f, 7.0f)
                curveTo(20.32f, 4.41f, 16.22f, 3.0f, 12.0f, 3.0f)
                moveTo(5.57f, 6.29f)
                lineTo(14.5f, 15.21f)
                lineTo(12.0f, 18.3f)
                lineTo(3.27f, 7.44f)
                curveTo(4.0f, 7.0f, 4.78f, 6.61f, 5.57f, 6.29f)
                close()
            }
        }
        .build()
        return _wifiStrengthOffOutline!!
    }

private var _wifiStrengthOffOutline: ImageVector? = null
