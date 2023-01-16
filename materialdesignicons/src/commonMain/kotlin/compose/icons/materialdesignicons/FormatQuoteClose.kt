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

public val MaterialDesignIcons.FormatQuoteClose: ImageVector
    get() {
        if (_formatQuoteClose != null) {
            return _formatQuoteClose!!
        }
        _formatQuoteClose = Builder(name = "FormatQuoteClose", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 17.0f)
                horizontalLineTo(17.0f)
                lineTo(19.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                moveTo(6.0f, 17.0f)
                horizontalLineTo(9.0f)
                lineTo(11.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                lineTo(6.0f, 17.0f)
                close()
            }
        }
        .build()
        return _formatQuoteClose!!
    }

private var _formatQuoteClose: ImageVector? = null
