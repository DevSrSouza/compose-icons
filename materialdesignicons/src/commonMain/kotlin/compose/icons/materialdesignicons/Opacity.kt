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

public val MaterialDesignIcons.Opacity: ImageVector
    get() {
        if (_opacity != null) {
            return _opacity!!
        }
        _opacity = Builder(name = "Opacity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.66f, 8.0f)
                lineTo(12.0f, 2.35f)
                lineTo(6.34f, 8.0f)
                curveTo(4.78f, 9.56f, 4.0f, 11.64f, 4.0f, 13.64f)
                curveTo(4.0f, 15.64f, 4.78f, 17.75f, 6.34f, 19.31f)
                curveTo(7.9f, 20.87f, 9.95f, 21.66f, 12.0f, 21.66f)
                curveTo(14.05f, 21.66f, 16.1f, 20.87f, 17.66f, 19.31f)
                curveTo(19.22f, 17.75f, 20.0f, 15.64f, 20.0f, 13.64f)
                curveTo(20.0f, 11.64f, 19.22f, 9.56f, 17.66f, 8.0f)
                moveTo(6.0f, 14.0f)
                curveTo(6.0f, 12.0f, 6.62f, 10.73f, 7.76f, 9.6f)
                lineTo(12.0f, 5.27f)
                lineTo(16.24f, 9.65f)
                curveTo(17.38f, 10.77f, 18.0f, 12.0f, 18.0f, 14.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _opacity!!
    }

private var _opacity: ImageVector? = null
