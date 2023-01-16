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

public val MaterialDesignIcons.Baguette: ImageVector
    get() {
        if (_baguette != null) {
            return _baguette!!
        }
        _baguette = Builder(name = "Baguette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 22.0f)
                curveTo(3.68f, 22.0f, 3.15f, 19.64f, 3.04f, 18.7f)
                arcTo(5.56f, 5.56f, 0.0f, false, true, 3.36f, 16.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.23f, 14.38f)
                curveTo(6.4f, 14.18f, 7.23f, 14.88f, 8.29f, 15.12f)
                arcTo(1.21f, 1.21f, 0.0f, false, false, 9.85f, 13.75f)
                curveTo(9.41f, 12.03f, 6.28f, 12.0f, 5.0f, 12.0f)
                curveTo(5.0f, 10.14f, 7.04f, 9.9f, 8.5f, 10.04f)
                arcTo(10.8f, 10.8f, 0.0f, false, true, 11.04f, 10.6f)
                curveTo(11.54f, 10.77f, 12.12f, 11.2f, 12.67f, 11.16f)
                curveTo(13.5f, 11.09f, 13.67f, 10.23f, 13.31f, 9.6f)
                curveTo(12.44f, 8.12f, 9.97f, 8.0f, 8.5f, 8.0f)
                curveTo(8.5f, 6.0f, 10.23f, 5.62f, 11.89f, 5.92f)
                arcTo(11.58f, 11.58f, 0.0f, false, true, 14.38f, 6.71f)
                curveTo(14.89f, 6.93f, 15.5f, 7.35f, 16.06f, 7.16f)
                curveTo(17.5f, 6.72f, 16.0f, 5.18f, 15.36f, 4.81f)
                arcTo(6.6f, 6.6f, 0.0f, false, false, 13.94f, 4.23f)
                curveTo(13.4f, 4.07f, 12.74f, 4.13f, 13.23f, 3.5f)
                arcTo(5.13f, 5.13f, 0.0f, false, true, 15.96f, 2.26f)
                curveTo(17.85f, 1.82f, 20.46f, 1.74f, 20.92f, 4.12f)
                arcTo(5.3f, 5.3f, 0.0f, false, true, 20.07f, 7.7f)
                arcTo(38.96f, 38.96f, 0.0f, false, true, 13.22f, 16.33f)
                arcTo(36.6f, 36.6f, 0.0f, false, true, 8.62f, 20.32f)
                curveTo(7.62f, 21.04f, 6.3f, 22.0f, 5.0f, 22.0f)
                close()
            }
        }
        .build()
        return _baguette!!
    }

private var _baguette: ImageVector? = null
