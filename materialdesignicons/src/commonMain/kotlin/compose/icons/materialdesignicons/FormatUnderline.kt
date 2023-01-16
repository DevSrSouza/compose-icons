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

public val MaterialDesignIcons.FormatUnderline: ImageVector
    get() {
        if (_formatUnderline != null) {
            return _formatUnderline!!
        }
        _formatUnderline = Builder(name = "FormatUnderline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                moveTo(12.0f, 17.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 14.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 8.5f, 11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _formatUnderline!!
    }

private var _formatUnderline: ImageVector? = null
