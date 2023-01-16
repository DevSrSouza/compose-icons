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

public val MaterialDesignIcons.ZodiacLeo: ImageVector
    get() {
        if (_zodiacLeo != null) {
            return _zodiacLeo!!
        }
        _zodiacLeo = Builder(name = "ZodiacLeo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 20.0f)
                curveTo(15.38f, 19.92f, 14.08f, 18.62f, 14.0f, 17.0f)
                curveTo(14.16f, 15.39f, 14.5f, 13.8f, 15.0f, 12.26f)
                curveTo(15.54f, 10.55f, 15.87f, 8.79f, 16.0f, 7.0f)
                curveTo(15.93f, 4.27f, 13.73f, 2.07f, 11.0f, 2.0f)
                curveTo(8.27f, 2.07f, 6.07f, 4.27f, 6.0f, 7.0f)
                curveTo(6.15f, 8.53f, 6.5f, 10.03f, 7.0f, 11.5f)
                lineTo(7.21f, 12.2f)
                curveTo(5.1f, 11.53f, 2.86f, 12.7f, 2.19f, 14.8f)
                curveTo(1.5f, 16.91f, 2.68f, 19.16f, 4.79f, 19.83f)
                curveTo(6.9f, 20.5f, 9.14f, 19.33f, 9.81f, 17.22f)
                curveTo(9.94f, 16.83f, 10.0f, 16.41f, 10.0f, 16.0f)
                curveTo(9.84f, 14.27f, 9.5f, 12.56f, 8.91f, 10.92f)
                curveTo(8.47f, 9.65f, 8.16f, 8.34f, 8.0f, 7.0f)
                curveTo(8.08f, 5.38f, 9.38f, 4.08f, 11.0f, 4.0f)
                curveTo(12.62f, 4.08f, 13.92f, 5.38f, 14.0f, 7.0f)
                curveTo(13.84f, 8.61f, 13.5f, 10.2f, 13.0f, 11.74f)
                curveTo(12.46f, 13.45f, 12.13f, 15.21f, 12.0f, 17.0f)
                curveTo(12.07f, 19.73f, 14.27f, 21.93f, 17.0f, 22.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 22.0f, 17.0f)
                horizontalLineTo(20.0f)
                moveTo(6.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 18.0f)
                close()
            }
        }
        .build()
        return _zodiacLeo!!
    }

private var _zodiacLeo: ImageVector? = null
