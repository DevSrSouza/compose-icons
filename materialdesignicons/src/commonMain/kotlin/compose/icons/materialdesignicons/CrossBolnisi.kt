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

public val MaterialDesignIcons.CrossBolnisi: ImageVector
    get() {
        if (_crossBolnisi != null) {
            return _crossBolnisi!!
        }
        _crossBolnisi = Builder(name = "CrossBolnisi", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.0f)
                lineTo(21.5f, 6.5f)
                curveTo(19.93f, 8.0f, 18.47f, 9.4f, 16.93f, 10.18f)
                curveTo(15.5f, 10.91f, 14.44f, 10.91f, 13.0f, 11.0f)
                curveTo(13.09f, 9.56f, 13.09f, 8.5f, 13.82f, 7.07f)
                curveTo(14.6f, 5.53f, 16.0f, 4.07f, 17.5f, 2.5f)
                lineTo(17.0f, 2.0f)
                curveTo(15.32f, 3.23f, 13.64f, 3.83f, 12.0f, 3.83f)
                curveTo(10.36f, 3.83f, 8.68f, 3.23f, 7.0f, 2.0f)
                lineTo(6.5f, 2.5f)
                curveTo(8.0f, 4.07f, 9.4f, 5.53f, 10.18f, 7.07f)
                curveTo(10.91f, 8.5f, 10.91f, 9.56f, 11.0f, 11.0f)
                curveTo(9.56f, 10.91f, 8.5f, 10.91f, 7.07f, 10.18f)
                curveTo(5.53f, 9.4f, 4.06f, 8.0f, 2.5f, 6.5f)
                lineTo(2.0f, 7.0f)
                curveTo(3.23f, 8.68f, 3.83f, 10.36f, 3.83f, 12.0f)
                curveTo(3.83f, 13.64f, 3.23f, 15.32f, 2.0f, 17.0f)
                lineTo(2.5f, 17.5f)
                curveTo(4.07f, 16.0f, 5.53f, 14.6f, 7.07f, 13.82f)
                curveTo(8.5f, 13.09f, 9.56f, 13.09f, 11.0f, 13.0f)
                curveTo(10.91f, 14.44f, 10.91f, 15.5f, 10.18f, 16.93f)
                curveTo(9.4f, 18.47f, 8.0f, 19.93f, 6.5f, 21.5f)
                lineTo(7.0f, 22.0f)
                curveTo(8.68f, 20.77f, 10.36f, 20.17f, 12.0f, 20.17f)
                curveTo(13.64f, 20.17f, 15.32f, 20.77f, 17.0f, 22.0f)
                lineTo(17.5f, 21.5f)
                curveTo(16.0f, 19.93f, 14.6f, 18.47f, 13.82f, 16.93f)
                curveTo(13.09f, 15.5f, 13.09f, 14.44f, 13.0f, 13.0f)
                curveTo(14.44f, 13.09f, 15.5f, 13.09f, 16.93f, 13.82f)
                curveTo(18.47f, 14.6f, 19.93f, 16.0f, 21.5f, 17.5f)
                lineTo(22.0f, 17.0f)
                curveTo(20.77f, 15.32f, 20.17f, 13.64f, 20.17f, 12.0f)
                curveTo(20.17f, 10.36f, 20.77f, 8.68f, 22.0f, 7.0f)
                close()
            }
        }
        .build()
        return _crossBolnisi!!
    }

private var _crossBolnisi: ImageVector? = null
