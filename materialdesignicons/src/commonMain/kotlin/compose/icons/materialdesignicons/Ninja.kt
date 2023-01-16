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

public val MaterialDesignIcons.Ninja: ImageVector
    get() {
        if (_ninja != null) {
            return _ninja!!
        }
        _ninja = Builder(name = "Ninja", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 13.0f)
                curveTo(7.74f, 12.65f, 7.9f, 12.31f, 8.17f, 12.08f)
                curveTo(8.92f, 12.24f, 9.62f, 12.55f, 10.25f, 13.0f)
                curveTo(10.25f, 13.68f, 9.69f, 14.24f, 9.0f, 14.24f)
                curveTo(8.31f, 14.24f, 7.76f, 13.69f, 7.75f, 13.0f)
                moveTo(13.75f, 13.0f)
                curveTo(14.38f, 12.56f, 15.08f, 12.25f, 15.83f, 12.09f)
                curveTo(16.1f, 12.32f, 16.26f, 12.66f, 16.25f, 13.0f)
                curveTo(16.25f, 13.7f, 15.69f, 14.26f, 15.0f, 14.26f)
                curveTo(14.31f, 14.26f, 13.75f, 13.7f, 13.75f, 13.0f)
                verticalLineTo(13.0f)
                moveTo(12.0f, 9.0f)
                curveTo(9.23f, 8.96f, 6.5f, 9.65f, 4.07f, 11.0f)
                lineTo(4.0f, 12.0f)
                curveTo(4.0f, 13.23f, 4.29f, 14.44f, 4.84f, 15.54f)
                curveTo(7.21f, 15.18f, 9.6f, 15.0f, 12.0f, 15.0f)
                curveTo(14.4f, 15.0f, 16.79f, 15.18f, 19.16f, 15.54f)
                curveTo(19.71f, 14.44f, 20.0f, 13.23f, 20.0f, 12.0f)
                lineTo(19.93f, 11.0f)
                curveTo(17.5f, 9.65f, 14.77f, 8.96f, 12.0f, 9.0f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _ninja!!
    }

private var _ninja: ImageVector? = null
