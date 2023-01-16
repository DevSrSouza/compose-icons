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

public val MaterialDesignIcons.Freebsd: ImageVector
    get() {
        if (_freebsd != null) {
            return _freebsd!!
        }
        _freebsd = Builder(name = "Freebsd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.69f, 2.0f)
                curveTo(3.54f, 1.95f, 6.08f, 3.16f, 6.13f, 3.19f)
                curveTo(4.84f, 4.0f, 3.74f, 5.09f, 2.91f, 6.38f)
                curveTo(2.09f, 4.81f, 1.34f, 2.91f, 2.0f, 2.25f)
                curveTo(2.17f, 2.08f, 2.4f, 2.0f, 2.69f, 2.0f)
                moveTo(20.84f, 2.13f)
                curveTo(21.25f, 2.08f, 21.58f, 2.14f, 21.78f, 2.34f)
                curveTo(22.85f, 3.42f, 19.88f, 8.15f, 19.38f, 8.66f)
                curveTo(18.87f, 9.16f, 17.57f, 8.7f, 16.5f, 7.63f)
                curveTo(15.43f, 6.55f, 14.97f, 5.26f, 15.47f, 4.75f)
                curveTo(15.88f, 4.34f, 19.09f, 2.3f, 20.84f, 2.13f)
                moveTo(12.0f, 2.56f)
                curveTo(13.29f, 2.56f, 14.53f, 2.82f, 15.66f, 3.28f)
                curveTo(15.17f, 3.6f, 14.81f, 3.85f, 14.69f, 3.97f)
                curveTo(13.7f, 4.96f, 14.14f, 6.83f, 15.72f, 8.41f)
                curveTo(16.7f, 9.38f, 17.84f, 9.97f, 18.78f, 9.97f)
                curveTo(19.46f, 9.97f, 19.92f, 9.68f, 20.16f, 9.44f)
                curveTo(20.33f, 9.27f, 20.6f, 8.88f, 20.91f, 8.41f)
                curveTo(21.42f, 9.59f, 21.69f, 10.88f, 21.69f, 12.25f)
                curveTo(21.69f, 17.61f, 17.36f, 21.97f, 12.0f, 21.97f)
                curveTo(6.64f, 21.97f, 2.31f, 17.61f, 2.31f, 12.25f)
                curveTo(2.31f, 6.89f, 6.64f, 2.56f, 12.0f, 2.56f)
                close()
            }
        }
        .build()
        return _freebsd!!
    }

private var _freebsd: ImageVector? = null
