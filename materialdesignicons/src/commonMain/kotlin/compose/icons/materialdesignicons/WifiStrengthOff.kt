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

public val MaterialDesignIcons.WifiStrengthOff: ImageVector
    get() {
        if (_wifiStrengthOff != null) {
            return _wifiStrengthOff!!
        }
        _wifiStrengthOff = Builder(name = "WifiStrengthOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.27f, 1.44f)
                lineTo(2.0f, 2.72f)
                lineTo(4.05f, 4.77f)
                curveTo(2.75f, 5.37f, 1.5f, 6.11f, 0.38f, 7.0f)
                curveTo(4.41f, 12.06f, 12.0f, 21.5f, 12.0f, 21.5f)
                lineTo(15.91f, 16.63f)
                lineTo(19.23f, 19.95f)
                lineTo(20.5f, 18.68f)
                moveTo(12.0f, 3.0f)
                curveTo(10.6f, 3.0f, 9.21f, 3.17f, 7.86f, 3.5f)
                lineTo(18.18f, 13.81f)
                curveTo(20.0f, 11.5f, 22.05f, 9.0f, 23.65f, 7.0f)
                curveTo(20.32f, 4.41f, 16.22f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _wifiStrengthOff!!
    }

private var _wifiStrengthOff: ImageVector? = null
