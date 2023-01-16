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

public val MaterialDesignIcons.FormatAnnotationPlus: ImageVector
    get() {
        if (_formatAnnotationPlus != null) {
            return _formatAnnotationPlus!!
        }
        _formatAnnotationPlus = Builder(name = "FormatAnnotationPlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 7.0f)
                horizontalLineTo(10.5f)
                lineTo(16.0f, 21.0f)
                horizontalLineTo(13.6f)
                lineTo(12.5f, 18.0f)
                horizontalLineTo(6.3f)
                lineTo(5.2f, 21.0f)
                horizontalLineTo(3.0f)
                lineTo(8.5f, 7.0f)
                moveTo(7.1f, 16.0f)
                horizontalLineTo(11.9f)
                lineTo(9.5f, 9.7f)
                lineTo(7.1f, 16.0f)
                moveTo(22.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _formatAnnotationPlus!!
    }

private var _formatAnnotationPlus: ImageVector? = null
