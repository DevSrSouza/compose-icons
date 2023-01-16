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

public val MaterialDesignIcons.FormatParagraph: ImageVector
    get() {
        if (_formatParagraph != null) {
            return _formatParagraph!!
        }
        _formatParagraph = Builder(name = "FormatParagraph", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 17.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 13.0f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                moveTo(13.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _formatParagraph!!
    }

private var _formatParagraph: ImageVector? = null
