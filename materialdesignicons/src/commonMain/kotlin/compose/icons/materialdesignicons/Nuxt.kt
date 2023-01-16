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

public val MaterialDesignIcons.Nuxt: ImageVector
    get() {
        if (_nuxt != null) {
            return _nuxt!!
        }
        _nuxt = Builder(name = "Nuxt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8f, 18.36f)
                lineTo(16.03f, 8.08f)
                curveTo(15.93f, 8.0f, 15.63f, 7.43f, 15.03f, 7.43f)
                curveTo(14.78f, 7.43f, 14.43f, 7.53f, 14.07f, 8.08f)
                lineTo(13.33f, 9.26f)
                lineTo(11.31f, 5.65f)
                curveTo(11.26f, 5.55f, 10.91f, 5.0f, 10.31f, 5.0f)
                curveTo(10.06f, 5.0f, 9.66f, 5.1f, 9.36f, 5.65f)
                lineTo(2.18f, 18.31f)
                curveTo(2.13f, 18.41f, 1.83f, 19.0f, 2.13f, 19.5f)
                curveTo(2.23f, 19.75f, 2.53f, 20.0f, 3.19f, 20.0f)
                horizontalLineTo(20.85f)
                curveTo(20.95f, 20.0f, 21.6f, 20.0f, 21.9f, 19.5f)
                curveTo(22.0f, 19.26f, 22.1f, 18.86f, 21.8f, 18.36f)
                moveTo(8.1f, 18.31f)
                lineTo(7.95f, 18.86f)
                horizontalLineTo(3.24f)
                lineTo(10.36f, 6.34f)
                lineTo(12.66f, 10.47f)
                lineTo(8.1f, 18.31f)
                moveTo(9.21f, 18.86f)
                lineTo(13.32f, 11.66f)
                lineTo(17.5f, 18.86f)
                horizontalLineTo(9.21f)
                moveTo(18.74f, 18.86f)
                lineTo(18.54f, 18.31f)
                lineTo(14.0f, 10.46f)
                lineTo(15.03f, 8.73f)
                lineTo(20.75f, 18.86f)
                horizontalLineTo(18.74f)
                close()
            }
        }
        .build()
        return _nuxt!!
    }

private var _nuxt: ImageVector? = null
