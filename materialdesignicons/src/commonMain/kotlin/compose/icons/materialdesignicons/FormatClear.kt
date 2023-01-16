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

public val MaterialDesignIcons.FormatClear: ImageVector
    get() {
        if (_formatClear != null) {
            return _formatClear!!
        }
        _formatClear = Builder(name = "FormatClear", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                verticalLineTo(5.18f)
                lineTo(8.82f, 8.0f)
                horizontalLineTo(11.22f)
                lineTo(10.5f, 9.68f)
                lineTo(12.6f, 11.78f)
                lineTo(14.21f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                moveTo(3.27f, 5.0f)
                lineTo(2.0f, 6.27f)
                lineTo(8.97f, 13.24f)
                lineTo(6.5f, 19.0f)
                horizontalLineTo(9.5f)
                lineTo(11.07f, 15.34f)
                lineTo(16.73f, 21.0f)
                lineTo(18.0f, 19.73f)
                lineTo(3.55f, 5.27f)
                lineTo(3.27f, 5.0f)
                close()
            }
        }
        .build()
        return _formatClear!!
    }

private var _formatClear: ImageVector? = null
