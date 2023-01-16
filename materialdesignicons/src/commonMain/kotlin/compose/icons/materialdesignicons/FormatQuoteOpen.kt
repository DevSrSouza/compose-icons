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

public val MaterialDesignIcons.FormatQuoteOpen: ImageVector
    get() {
        if (_formatQuoteOpen != null) {
            return _formatQuoteOpen!!
        }
        _formatQuoteOpen = Builder(name = "FormatQuoteOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                lineTo(8.0f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                lineTo(7.0f, 7.0f)
                horizontalLineTo(10.0f)
                moveTo(18.0f, 7.0f)
                lineTo(16.0f, 11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _formatQuoteOpen!!
    }

private var _formatQuoteOpen: ImageVector? = null
