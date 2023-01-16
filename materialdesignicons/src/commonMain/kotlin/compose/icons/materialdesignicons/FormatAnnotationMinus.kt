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

public val MaterialDesignIcons.FormatAnnotationMinus: ImageVector
    get() {
        if (_formatAnnotationMinus != null) {
            return _formatAnnotationMinus!!
        }
        _formatAnnotationMinus = Builder(name = "FormatAnnotationMinus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 7.0f)
                horizontalLineTo(8.5f)
                lineTo(3.0f, 21.0f)
                horizontalLineTo(5.2f)
                lineTo(6.3f, 18.0f)
                horizontalLineTo(12.5f)
                lineTo(13.6f, 21.0f)
                horizontalLineTo(16.0f)
                lineTo(10.5f, 7.0f)
                moveTo(7.1f, 16.0f)
                lineTo(9.5f, 9.7f)
                lineTo(11.9f, 16.0f)
                horizontalLineTo(7.1f)
                moveTo(22.0f, 7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _formatAnnotationMinus!!
    }

private var _formatAnnotationMinus: ImageVector? = null
