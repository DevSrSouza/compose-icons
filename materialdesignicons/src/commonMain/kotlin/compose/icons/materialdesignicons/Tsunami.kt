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

public val MaterialDesignIcons.Tsunami: ImageVector
    get() {
        if (_tsunami != null) {
            return _tsunami!!
        }
        _tsunami = Builder(name = "Tsunami", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.67f, 17.63f)
                curveTo(14.87f, 20.43f, 12.55f, 18.03f, 12.0f, 17.63f)
                curveTo(11.34f, 18.12f, 9.08f, 20.39f, 5.33f, 17.63f)
                curveTo(3.43f, 19.03f, 2.65f, 19.0f, 2.0f, 19.0f)
                verticalLineTo(21.0f)
                curveTo(3.16f, 21.0f, 4.3f, 20.68f, 5.33f, 20.07f)
                curveTo(7.39f, 21.29f, 9.94f, 21.29f, 12.0f, 20.07f)
                curveTo(14.06f, 21.29f, 16.61f, 21.29f, 18.67f, 20.07f)
                curveTo(19.7f, 20.68f, 20.84f, 21.0f, 22.0f, 21.0f)
                verticalLineTo(19.0f)
                curveTo(21.34f, 19.0f, 20.5f, 19.0f, 18.67f, 17.63f)
                moveTo(19.33f, 12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.33f)
                curveTo(17.5f, 10.0f, 16.0f, 8.5f, 16.0f, 6.67f)
                curveTo(16.0f, 5.65f, 16.38f, 4.93f, 17.09f, 3.33f)
                curveTo(15.72f, 3.12f, 15.09f, 3.0f, 14.0f, 3.0f)
                curveTo(7.36f, 3.0f, 2.15f, 8.03f, 2.0f, 14.5f)
                lineTo(2.0f, 16.5f)
                curveTo(3.16f, 16.5f, 4.3f, 16.18f, 5.33f, 15.57f)
                curveTo(7.39f, 16.79f, 9.94f, 16.79f, 12.0f, 15.57f)
                curveTo(14.06f, 16.79f, 16.61f, 16.79f, 18.67f, 15.57f)
                curveTo(19.7f, 16.18f, 20.84f, 16.5f, 22.0f, 16.5f)
                verticalLineTo(14.5f)
                curveTo(21.34f, 14.5f, 20.5f, 14.5f, 18.67f, 13.13f)
                curveTo(14.87f, 15.93f, 12.55f, 13.53f, 12.0f, 13.13f)
                curveTo(11.1f, 13.8f, 11.46f, 13.54f, 11.09f, 13.76f)
                curveTo(10.39f, 12.82f, 10.0f, 11.7f, 10.0f, 10.5f)
                curveTo(10.0f, 7.92f, 11.77f, 5.76f, 14.21f, 5.17f)
                curveTo(14.08f, 5.68f, 14.0f, 6.19f, 14.0f, 6.67f)
                curveTo(14.0f, 9.61f, 16.39f, 12.0f, 19.33f, 12.0f)
                close()
            }
        }
        .build()
        return _tsunami!!
    }

private var _tsunami: ImageVector? = null
