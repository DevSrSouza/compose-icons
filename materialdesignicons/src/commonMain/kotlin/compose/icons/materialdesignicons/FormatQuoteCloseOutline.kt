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

public val MaterialDesignIcons.FormatQuoteCloseOutline: ImageVector
    get() {
        if (_formatQuoteCloseOutline != null) {
            return _formatQuoteCloseOutline!!
        }
        _formatQuoteCloseOutline = Builder(name = "FormatQuoteCloseOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.88f)
                lineTo(12.88f, 18.0f)
                horizontalLineTo(18.62f)
                lineTo(21.0f, 13.24f)
                verticalLineTo(6.0f)
                moveTo(15.0f, 8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.76f)
                lineTo(17.38f, 16.0f)
                horizontalLineTo(16.12f)
                lineTo(18.12f, 12.0f)
                horizontalLineTo(15.0f)
                moveTo(3.0f, 6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.88f)
                lineTo(2.88f, 18.0f)
                horizontalLineTo(8.62f)
                lineTo(11.0f, 13.24f)
                verticalLineTo(6.0f)
                moveTo(5.0f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.76f)
                lineTo(7.38f, 16.0f)
                horizontalLineTo(6.12f)
                lineTo(8.12f, 12.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _formatQuoteCloseOutline!!
    }

private var _formatQuoteCloseOutline: ImageVector? = null
