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

public val MaterialDesignIcons.Opera: ImageVector
    get() {
        if (_opera != null) {
            return _opera!!
        }
        _opera = Builder(name = "Opera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.04f, 17.07f)
                curveTo(8.04f, 15.9f, 7.4f, 14.16f, 7.35f, 12.21f)
                verticalLineTo(11.79f)
                curveTo(7.4f, 9.84f, 8.04f, 8.1f, 9.04f, 6.93f)
                curveTo(9.86f, 5.95f, 10.93f, 5.37f, 12.1f, 5.37f)
                curveTo(14.72f, 5.37f, 16.84f, 8.34f, 16.84f, 12.0f)
                curveTo(16.84f, 15.66f, 14.72f, 18.63f, 12.1f, 18.63f)
                curveTo(10.93f, 18.63f, 10.33f, 18.5f, 9.04f, 17.07f)
                moveTo(12.03f, 3.0f)
                horizontalLineTo(12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 3.0f, 12.0f)
                curveTo(3.0f, 16.83f, 6.8f, 20.77f, 11.57f, 21.0f)
                horizontalLineTo(12.0f)
                curveTo(14.3f, 21.0f, 16.4f, 20.13f, 18.0f, 18.71f)
                curveTo(19.84f, 17.06f, 21.0f, 14.67f, 21.0f, 12.0f)
                curveTo(21.0f, 9.33f, 19.84f, 6.94f, 18.0f, 5.29f)
                curveTo(16.41f, 3.87f, 14.32f, 3.0f, 12.03f, 3.0f)
                close()
            }
        }
        .build()
        return _opera!!
    }

private var _opera: ImageVector? = null
