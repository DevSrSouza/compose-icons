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

public val MaterialDesignIcons.WifiStrength1: ImageVector
    get() {
        if (_wifiStrength1 != null) {
            return _wifiStrength1!!
        }
        _wifiStrength1 = Builder(name = "WifiStrength1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(7.79f, 3.0f, 3.7f, 4.41f, 0.38f, 7.0f)
                curveTo(4.41f, 12.06f, 7.89f, 16.37f, 12.0f, 21.5f)
                curveTo(16.08f, 16.42f, 20.24f, 11.24f, 23.65f, 7.0f)
                curveTo(20.32f, 4.41f, 16.22f, 3.0f, 12.0f, 3.0f)
                moveTo(12.0f, 5.0f)
                curveTo(15.07f, 5.0f, 18.09f, 5.86f, 20.71f, 7.45f)
                lineTo(15.61f, 13.81f)
                curveTo(14.5f, 13.28f, 13.25f, 13.0f, 12.0f, 13.0f)
                curveTo(10.75f, 13.0f, 9.5f, 13.28f, 8.39f, 13.8f)
                lineTo(3.27f, 7.44f)
                curveTo(5.91f, 5.85f, 8.93f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _wifiStrength1!!
    }

private var _wifiStrength1: ImageVector? = null
