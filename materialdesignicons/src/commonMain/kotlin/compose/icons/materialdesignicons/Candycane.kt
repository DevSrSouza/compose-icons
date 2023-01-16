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

public val MaterialDesignIcons.Candycane: ImageVector
    get() {
        if (_candycane != null) {
            return _candycane!!
        }
        _candycane = Builder(name = "Candycane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(6.0f, 7.37f, 6.1f, 6.77f, 6.27f, 6.2f)
                lineTo(10.0f, 9.93f)
                verticalLineTo(10.0f)
                moveTo(12.0f, 2.0f)
                curveTo(12.74f, 2.0f, 13.44f, 2.13f, 14.09f, 2.38f)
                lineTo(11.97f, 6.0f)
                curveTo(11.14f, 6.0f, 10.44f, 6.5f, 10.15f, 7.25f)
                lineTo(7.24f, 4.34f)
                curveTo(8.34f, 2.92f, 10.06f, 2.0f, 12.0f, 2.0f)
                moveTo(17.76f, 6.31f)
                lineTo(14.0f, 10.07f)
                verticalLineTo(8.0f)
                curveTo(14.0f, 7.62f, 13.9f, 7.27f, 13.72f, 6.97f)
                lineTo(15.83f, 3.38f)
                curveTo(16.74f, 4.13f, 17.42f, 5.15f, 17.76f, 6.31f)
                moveTo(18.0f, 13.09f)
                lineTo(14.0f, 17.09f)
                verticalLineTo(12.9f)
                lineTo(18.0f, 8.9f)
                verticalLineTo(13.09f)
                moveTo(18.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 20.0f)
                verticalLineTo(19.91f)
                lineTo(18.0f, 15.91f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _candycane!!
    }

private var _candycane: ImageVector? = null
