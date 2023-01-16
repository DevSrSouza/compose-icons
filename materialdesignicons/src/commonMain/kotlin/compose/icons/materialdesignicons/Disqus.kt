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

public val MaterialDesignIcons.Disqus: ImageVector
    get() {
        if (_disqus != null) {
            return _disqus!!
        }
        _disqus = Builder(name = "Disqus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.08f, 22.0f)
                curveTo(9.63f, 22.0f, 7.39f, 21.11f, 5.66f, 19.63f)
                lineTo(1.41f, 20.21f)
                lineTo(3.05f, 16.15f)
                curveTo(2.5f, 14.88f, 2.16f, 13.5f, 2.16f, 12.0f)
                curveTo(2.16f, 6.5f, 6.6f, 2.0f, 12.08f, 2.0f)
                curveTo(17.56f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5f, 17.56f, 22.0f, 12.08f, 22.0f)
                moveTo(17.5f, 11.97f)
                verticalLineTo(11.94f)
                curveTo(17.5f, 9.06f, 15.46f, 7.0f, 11.95f, 7.0f)
                horizontalLineTo(8.16f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.9f)
                curveTo(15.43f, 17.0f, 17.5f, 14.86f, 17.5f, 11.97f)
                moveTo(12.0f, 14.54f)
                horizontalLineTo(10.89f)
                verticalLineTo(9.46f)
                horizontalLineTo(12.0f)
                curveTo(13.62f, 9.46f, 14.7f, 10.39f, 14.7f, 12.0f)
                verticalLineTo(12.0f)
                curveTo(14.7f, 13.63f, 13.62f, 14.54f, 12.0f, 14.54f)
                close()
            }
        }
        .build()
        return _disqus!!
    }

private var _disqus: ImageVector? = null
