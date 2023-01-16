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

public val MaterialDesignIcons.PageLast: ImageVector
    get() {
        if (_pageLast != null) {
            return _pageLast!!
        }
        _pageLast = Builder(name = "PageLast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.59f, 7.41f)
                lineTo(10.18f, 12.0f)
                lineTo(5.59f, 16.59f)
                lineTo(7.0f, 18.0f)
                lineTo(13.0f, 12.0f)
                lineTo(7.0f, 6.0f)
                lineTo(5.59f, 7.41f)
                moveTo(16.0f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _pageLast!!
    }

private var _pageLast: ImageVector? = null
