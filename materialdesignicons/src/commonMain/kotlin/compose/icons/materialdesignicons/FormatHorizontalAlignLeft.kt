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

public val MaterialDesignIcons.FormatHorizontalAlignLeft: ImageVector
    get() {
        if (_formatHorizontalAlignLeft != null) {
            return _formatHorizontalAlignLeft!!
        }
        _formatHorizontalAlignLeft = Builder(name = "FormatHorizontalAlignLeft", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                lineTo(7.0f, 12.0f)
                lineTo(11.0f, 16.0f)
                moveTo(3.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _formatHorizontalAlignLeft!!
    }

private var _formatHorizontalAlignLeft: ImageVector? = null
