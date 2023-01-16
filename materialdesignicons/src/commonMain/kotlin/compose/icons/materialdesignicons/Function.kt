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

public val MaterialDesignIcons.Function: ImageVector
    get() {
        if (_function != null) {
            return _function!!
        }
        _function = Builder(name = "Function", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6f, 5.29f)
                curveTo(14.5f, 5.19f, 13.53f, 6.0f, 13.43f, 7.11f)
                lineTo(13.18f, 10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                lineTo(12.56f, 17.07f)
                curveTo(12.37f, 19.27f, 10.43f, 20.9f, 8.23f, 20.7f)
                curveTo(6.92f, 20.59f, 5.82f, 19.86f, 5.17f, 18.83f)
                lineTo(6.67f, 17.33f)
                curveTo(6.91f, 18.07f, 7.57f, 18.64f, 8.4f, 18.71f)
                curveTo(9.5f, 18.81f, 10.47f, 18.0f, 10.57f, 16.89f)
                lineTo(11.0f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.17f)
                lineTo(11.44f, 6.93f)
                curveTo(11.63f, 4.73f, 13.57f, 3.1f, 15.77f, 3.3f)
                curveTo(17.08f, 3.41f, 18.18f, 4.14f, 18.83f, 5.17f)
                lineTo(17.33f, 6.67f)
                curveTo(17.09f, 5.93f, 16.43f, 5.36f, 15.6f, 5.29f)
                close()
            }
        }
        .build()
        return _function!!
    }

private var _function: ImageVector? = null
