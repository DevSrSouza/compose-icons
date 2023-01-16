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

public val MaterialDesignIcons.Tailwind: ImageVector
    get() {
        if (_tailwind != null) {
            return _tailwind!!
        }
        _tailwind = Builder(name = "Tailwind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(9.33f, 6.0f, 7.67f, 7.33f, 7.0f, 10.0f)
                curveTo(8.0f, 8.67f, 9.17f, 8.17f, 10.5f, 8.5f)
                curveTo(11.26f, 8.69f, 11.81f, 9.24f, 12.41f, 9.85f)
                curveTo(13.39f, 10.85f, 14.5f, 12.0f, 17.0f, 12.0f)
                curveTo(19.67f, 12.0f, 21.33f, 10.67f, 22.0f, 8.0f)
                curveTo(21.0f, 9.33f, 19.83f, 9.83f, 18.5f, 9.5f)
                curveTo(17.74f, 9.31f, 17.2f, 8.76f, 16.59f, 8.15f)
                curveTo(15.61f, 7.15f, 14.5f, 6.0f, 12.0f, 6.0f)
                moveTo(7.0f, 12.0f)
                curveTo(4.33f, 12.0f, 2.67f, 13.33f, 2.0f, 16.0f)
                curveTo(3.0f, 14.67f, 4.17f, 14.17f, 5.5f, 14.5f)
                curveTo(6.26f, 14.69f, 6.8f, 15.24f, 7.41f, 15.85f)
                curveTo(8.39f, 16.85f, 9.5f, 18.0f, 12.0f, 18.0f)
                curveTo(14.67f, 18.0f, 16.33f, 16.67f, 17.0f, 14.0f)
                curveTo(16.0f, 15.33f, 14.83f, 15.83f, 13.5f, 15.5f)
                curveTo(12.74f, 15.31f, 12.2f, 14.76f, 11.59f, 14.15f)
                curveTo(10.61f, 13.15f, 9.5f, 12.0f, 7.0f, 12.0f)
                close()
            }
        }
        .build()
        return _tailwind!!
    }

private var _tailwind: ImageVector? = null
