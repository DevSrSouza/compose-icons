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

public val MaterialDesignIcons.FormatTextVariant: ImageVector
    get() {
        if (_formatTextVariant != null) {
            return _formatTextVariant!!
        }
        _formatTextVariant = Builder(name = "FormatTextVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.6f, 14.0f)
                lineTo(12.0f, 7.7f)
                lineTo(14.4f, 14.0f)
                moveTo(11.0f, 5.0f)
                lineTo(5.5f, 19.0f)
                horizontalLineTo(7.7f)
                lineTo(8.8f, 16.0f)
                horizontalLineTo(15.0f)
                lineTo(16.1f, 19.0f)
                horizontalLineTo(18.3f)
                lineTo(13.0f, 5.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _formatTextVariant!!
    }

private var _formatTextVariant: ImageVector? = null
