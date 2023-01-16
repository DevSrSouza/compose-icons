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

public val MaterialDesignIcons.Snowmobile: ImageVector
    get() {
        if (_snowmobile != null) {
            return _snowmobile!!
        }
        _snowmobile = Builder(name = "Snowmobile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.34f, 17.93f)
                lineTo(18.4f, 16.0f)
                curveTo(19.5f, 15.91f, 22.66f, 15.53f, 22.97f, 13.36f)
                curveTo(23.0f, 13.12f, 22.92f, 12.89f, 22.78f, 12.7f)
                curveTo(22.12f, 11.82f, 19.88f, 9.07f, 15.0f, 5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                lineTo(16.0f, 9.0f)
                lineTo(12.0f, 11.0f)
                lineTo(3.0f, 10.0f)
                lineTo(1.0f, 13.0f)
                lineTo(5.58f, 14.38f)
                lineTo(2.58f, 16.09f)
                curveTo(2.22f, 16.26f, 1.0f, 16.89f, 1.0f, 18.05f)
                curveTo(1.0f, 18.4f, 1.0f, 18.89f, 1.33f, 19.32f)
                curveTo(1.83f, 20.0f, 2.71f, 20.0f, 3.0f, 20.0f)
                horizontalLineTo(9.0f)
                curveTo(10.26f, 20.0f, 12.53f, 19.13f, 12.93f, 16.0f)
                horizontalLineTo(15.59f)
                lineTo(17.59f, 18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.65f, 20.0f, 23.0f, 18.65f, 23.0f, 17.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 17.43f, 20.73f, 17.79f, 20.34f, 17.93f)
                moveTo(9.0f, 18.0f)
                horizontalLineTo(3.25f)
                curveTo(3.33f, 17.95f, 3.41f, 17.91f, 3.5f, 17.87f)
                lineTo(8.22f, 15.17f)
                lineTo(10.92f, 16.0f)
                curveTo(10.58f, 17.84f, 9.28f, 18.0f, 9.0f, 18.0f)
                close()
            }
        }
        .build()
        return _snowmobile!!
    }

private var _snowmobile: ImageVector? = null
