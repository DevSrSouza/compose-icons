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

public val MaterialDesignIcons.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.04f, 4.85f)
                curveTo(17.34f, 3.2f, 15.33f, 2.25f, 13.0f, 2.0f)
                verticalLineTo(5.62f)
                lineTo(22.0f, 10.8f)
                curveTo(21.72f, 8.5f, 20.73f, 6.5f, 19.04f, 4.85f)
                moveTo(12.0f, 22.0f)
                curveTo(15.44f, 22.0f, 18.16f, 20.62f, 20.17f, 17.86f)
                lineTo(17.06f, 16.0f)
                lineTo(8.07f, 21.2f)
                curveTo(9.32f, 21.73f, 10.64f, 22.0f, 12.0f, 22.0f)
                moveTo(13.0f, 11.41f)
                lineTo(21.15f, 16.07f)
                curveTo(21.59f, 15.13f, 21.88f, 14.14f, 22.0f, 13.11f)
                lineTo(13.0f, 7.93f)
                verticalLineTo(11.41f)
                moveTo(3.88f, 17.81f)
                curveTo(4.54f, 18.72f, 5.26f, 19.46f, 6.05f, 20.0f)
                lineTo(15.04f, 14.9f)
                lineTo(12.0f, 13.15f)
                lineTo(3.88f, 17.81f)
                moveTo(11.04f, 2.0f)
                curveTo(10.0f, 2.09f, 9.0f, 2.36f, 8.0f, 2.8f)
                verticalLineTo(13.15f)
                lineTo(11.04f, 11.41f)
                verticalLineTo(2.0f)
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 13.39f, 2.3f, 14.77f, 2.89f, 16.12f)
                lineTo(6.0f, 14.28f)
                verticalLineTo(4.0f)
                curveTo(3.33f, 6.0f, 2.0f, 8.65f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
