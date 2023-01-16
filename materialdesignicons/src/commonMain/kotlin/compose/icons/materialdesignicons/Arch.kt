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

public val MaterialDesignIcons.Arch: ImageVector
    get() {
        if (_arch != null) {
            return _arch!!
        }
        _arch = Builder(name = "Arch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(11.11f, 4.18f, 10.57f, 5.61f, 9.58f, 7.73f)
                curveTo(10.19f, 8.37f, 10.93f, 9.12f, 12.14f, 9.97f)
                curveTo(10.84f, 9.43f, 9.95f, 8.9f, 9.29f, 8.34f)
                curveTo(8.0f, 11.0f, 6.03f, 14.75f, 2.0f, 22.0f)
                curveTo(5.17f, 20.17f, 7.63f, 19.04f, 9.92f, 18.61f)
                curveTo(9.82f, 18.19f, 9.76f, 17.73f, 9.77f, 17.25f)
                verticalLineTo(17.15f)
                curveTo(9.82f, 15.12f, 10.88f, 13.56f, 12.13f, 13.67f)
                curveTo(13.38f, 13.77f, 14.35f, 15.5f, 14.3f, 17.54f)
                curveTo(14.29f, 17.92f, 14.25f, 18.29f, 14.18f, 18.63f)
                curveTo(16.44f, 19.07f, 18.87f, 20.19f, 22.0f, 22.0f)
                curveTo(21.38f, 20.86f, 20.83f, 19.84f, 20.31f, 18.87f)
                curveTo(19.5f, 18.23f, 18.61f, 17.39f, 16.85f, 16.5f)
                curveTo(18.06f, 16.8f, 18.93f, 17.16f, 19.61f, 17.57f)
                curveTo(14.26f, 7.62f, 13.83f, 6.3f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _arch!!
    }

private var _arch: ImageVector? = null
