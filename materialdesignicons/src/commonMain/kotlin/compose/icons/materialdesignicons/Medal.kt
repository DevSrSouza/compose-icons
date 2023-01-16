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

public val MaterialDesignIcons.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                lineTo(9.81f, 8.36f)
                curveTo(6.14f, 9.57f, 4.14f, 13.53f, 5.35f, 17.2f)
                curveTo(6.56f, 20.87f, 10.5f, 22.87f, 14.19f, 21.66f)
                curveTo(17.86f, 20.45f, 19.86f, 16.5f, 18.65f, 12.82f)
                curveTo(17.95f, 10.71f, 16.3f, 9.05f, 14.19f, 8.36f)
                lineTo(20.0f, 4.0f)
                verticalLineTo(2.0f)
                moveTo(14.94f, 19.5f)
                lineTo(12.0f, 17.78f)
                lineTo(9.06f, 19.5f)
                lineTo(9.84f, 16.17f)
                lineTo(7.25f, 13.93f)
                lineTo(10.66f, 13.64f)
                lineTo(12.0f, 10.5f)
                lineTo(13.34f, 13.64f)
                lineTo(16.75f, 13.93f)
                lineTo(14.16f, 16.17f)
                lineTo(14.94f, 19.5f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
