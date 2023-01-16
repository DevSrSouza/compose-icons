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

public val MaterialDesignIcons.PanoramaHorizontalOutline: ImageVector
    get() {
        if (_panoramaHorizontalOutline != null) {
            return _panoramaHorizontalOutline!!
        }
        _panoramaHorizontalOutline = Builder(name = "PanoramaHorizontalOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.43f, 4.0f)
                curveTo(21.33f, 4.0f, 21.23f, 4.0f, 21.12f, 4.06f)
                curveTo(18.18f, 5.16f, 15.09f, 5.7f, 12.0f, 5.7f)
                curveTo(8.91f, 5.7f, 5.82f, 5.15f, 2.88f, 4.06f)
                curveTo(2.77f, 4.0f, 2.66f, 4.0f, 2.57f, 4.0f)
                curveTo(2.23f, 4.0f, 2.0f, 4.23f, 2.0f, 4.63f)
                verticalLineTo(19.38f)
                curveTo(2.0f, 19.77f, 2.23f, 20.0f, 2.57f, 20.0f)
                curveTo(2.67f, 20.0f, 2.77f, 20.0f, 2.88f, 19.94f)
                curveTo(5.82f, 18.84f, 8.91f, 18.3f, 12.0f, 18.3f)
                curveTo(15.09f, 18.3f, 18.18f, 18.85f, 21.12f, 19.94f)
                curveTo(21.23f, 20.0f, 21.33f, 20.0f, 21.43f, 20.0f)
                curveTo(21.76f, 20.0f, 22.0f, 19.77f, 22.0f, 19.37f)
                verticalLineTo(4.63f)
                curveTo(22.0f, 4.23f, 21.76f, 4.0f, 21.43f, 4.0f)
                moveTo(20.0f, 6.54f)
                verticalLineTo(17.45f)
                curveTo(17.4f, 16.68f, 14.72f, 16.29f, 12.0f, 16.29f)
                curveTo(9.28f, 16.29f, 6.6f, 16.68f, 4.0f, 17.45f)
                verticalLineTo(6.54f)
                curveTo(6.6f, 7.31f, 9.28f, 7.7f, 12.0f, 7.7f)
                curveTo(14.72f, 7.71f, 17.4f, 7.32f, 20.0f, 6.54f)
                close()
            }
        }
        .build()
        return _panoramaHorizontalOutline!!
    }

private var _panoramaHorizontalOutline: ImageVector? = null
