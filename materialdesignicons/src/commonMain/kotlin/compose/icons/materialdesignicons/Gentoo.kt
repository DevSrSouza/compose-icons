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

public val MaterialDesignIcons.Gentoo: ImageVector
    get() {
        if (_gentoo != null) {
            return _gentoo!!
        }
        _gentoo = Builder(name = "Gentoo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.28f, 2.0f)
                curveTo(9.93f, 2.0f, 9.57f, 2.03f, 9.23f, 2.1f)
                curveTo(5.61f, 2.76f, 3.06f, 5.89f, 2.85f, 7.96f)
                curveTo(2.74f, 8.97f, 3.29f, 9.73f, 3.59f, 10.06f)
                curveTo(4.4f, 10.97f, 6.03f, 11.66f, 7.07f, 12.23f)
                curveTo(5.56f, 13.5f, 4.87f, 14.14f, 4.19f, 14.86f)
                curveTo(3.17f, 15.93f, 2.45f, 17.1f, 2.45f, 17.95f)
                curveTo(2.45f, 18.22f, 2.4f, 19.09f, 2.76f, 19.77f)
                curveTo(2.89f, 20.03f, 3.27f, 20.89f, 4.41f, 21.53f)
                curveTo(5.14f, 21.94f, 6.17f, 22.09f, 7.19f, 21.95f)
                curveTo(10.33f, 21.5f, 14.54f, 18.83f, 17.55f, 16.35f)
                curveTo(19.46f, 14.77f, 20.86f, 13.23f, 21.26f, 12.5f)
                curveTo(21.59f, 11.87f, 21.63f, 10.78f, 21.44f, 10.09f)
                curveTo(20.9f, 8.14f, 16.53f, 4.15f, 12.96f, 2.55f)
                curveTo(12.14f, 2.18f, 11.2f, 2.0f, 10.28f, 2.0f)
                moveTo(11.34f, 4.91f)
                curveTo(11.59f, 4.91f, 11.81f, 4.94f, 12.0f, 5.0f)
                curveTo(13.15f, 5.3f, 15.08f, 6.68f, 14.91f, 7.94f)
                curveTo(14.68f, 9.6f, 13.23f, 10.27f, 11.56f, 10.03f)
                curveTo(10.58f, 9.9f, 8.63f, 8.8f, 8.78f, 6.89f)
                curveTo(8.89f, 5.4f, 10.3f, 4.9f, 11.34f, 4.91f)
                moveTo(11.32f, 6.65f)
                curveTo(11.05f, 6.65f, 10.84f, 6.71f, 10.74f, 6.87f)
                curveTo(10.27f, 7.59f, 10.5f, 8.09f, 10.92f, 8.42f)
                curveTo(11.07f, 8.04f, 12.71f, 8.45f, 12.75f, 8.79f)
                curveTo(14.17f, 7.72f, 12.36f, 6.66f, 11.32f, 6.65f)
                close()
            }
        }
        .build()
        return _gentoo!!
    }

private var _gentoo: ImageVector? = null
