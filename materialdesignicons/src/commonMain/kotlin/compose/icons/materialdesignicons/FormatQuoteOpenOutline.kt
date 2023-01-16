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

public val MaterialDesignIcons.FormatQuoteOpenOutline: ImageVector
    get() {
        if (_formatQuoteOpenOutline != null) {
            return _formatQuoteOpenOutline!!
        }
        _formatQuoteOpenOutline = Builder(name = "FormatQuoteOpenOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.12f)
                lineTo(11.12f, 6.0f)
                horizontalLineTo(5.38f)
                lineTo(3.0f, 10.76f)
                verticalLineTo(18.0f)
                moveTo(9.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.24f)
                lineTo(6.62f, 8.0f)
                horizontalLineTo(7.88f)
                lineTo(5.88f, 12.0f)
                horizontalLineTo(9.0f)
                moveTo(21.0f, 18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.12f)
                lineTo(21.12f, 6.0f)
                horizontalLineTo(15.38f)
                lineTo(13.0f, 10.76f)
                verticalLineTo(18.0f)
                moveTo(19.0f, 16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.24f)
                lineTo(16.62f, 8.0f)
                horizontalLineTo(17.88f)
                lineTo(15.88f, 12.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _formatQuoteOpenOutline!!
    }

private var _formatQuoteOpenOutline: ImageVector? = null
