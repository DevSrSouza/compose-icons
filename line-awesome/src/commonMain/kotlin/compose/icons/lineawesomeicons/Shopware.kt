package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Shopware: ImageVector
    get() {
        if (_shopware != null) {
            return _shopware!!
        }
        _shopware = Builder(name = "Shopware", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.83f, 3.0f, 3.0f, 8.83f, 3.0f, 16.0f)
                curveTo(3.0f, 23.17f, 8.83f, 29.0f, 16.0f, 29.0f)
                curveTo(18.9f, 29.0f, 21.58f, 28.0397f, 23.75f, 26.4297f)
                curveTo(23.72f, 26.4097f, 23.6809f, 26.3894f, 23.6309f, 26.3594f)
                curveTo(22.5109f, 25.5194f, 20.8709f, 24.8807f, 19.1309f, 24.2207f)
                curveTo(14.7609f, 22.5207f, 10.0f, 20.61f, 10.0f, 15.0f)
                curveTo(10.0f, 9.76f, 14.8002f, 7.0f, 21.4902f, 7.0f)
                curveTo(22.4602f, 7.0f, 23.4499f, 7.0595f, 24.4199f, 7.1895f)
                curveTo(24.5599f, 7.2095f, 24.5709f, 7.2105f, 24.7109f, 7.2305f)
                curveTo(25.0809f, 7.3105f, 25.4505f, 7.3905f, 25.8105f, 7.4805f)
                curveTo(23.4305f, 4.7405f, 19.91f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(21.25f, 12.0f)
                curveTo(16.81f, 12.0f, 17.0f, 14.9398f, 17.0f, 15.0098f)
                curveTo(17.0f, 17.4098f, 19.7492f, 18.4995f, 22.9492f, 19.7695f)
                curveTo(24.4992f, 20.3895f, 26.1096f, 21.0191f, 27.5996f, 21.8691f)
                curveTo(28.4896f, 20.1091f, 29.0f, 18.11f, 29.0f, 16.0f)
                curveTo(29.0f, 15.82f, 29.0005f, 15.6409f, 28.9805f, 15.4609f)
                curveTo(28.9505f, 15.4409f, 28.9109f, 15.4206f, 28.8809f, 15.3906f)
                curveTo(26.1409f, 12.9806f, 23.94f, 12.0f, 21.25f, 12.0f)
                close()
            }
        }
        .build()
        return _shopware!!
    }

private var _shopware: ImageVector? = null
