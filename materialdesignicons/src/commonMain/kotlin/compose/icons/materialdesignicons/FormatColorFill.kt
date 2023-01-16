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

public val MaterialDesignIcons.FormatColorFill: ImageVector
    get() {
        if (_formatColorFill != null) {
            return _formatColorFill!!
        }
        _formatColorFill = Builder(name = "FormatColorFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 11.5f)
                curveTo(19.0f, 11.5f, 17.0f, 13.67f, 17.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 15.0f)
                curveTo(21.0f, 13.67f, 19.0f, 11.5f, 19.0f, 11.5f)
                moveTo(5.21f, 10.0f)
                lineTo(10.0f, 5.21f)
                lineTo(14.79f, 10.0f)
                moveTo(16.56f, 8.94f)
                lineTo(7.62f, 0.0f)
                lineTo(6.21f, 1.41f)
                lineTo(8.59f, 3.79f)
                lineTo(3.44f, 8.94f)
                curveTo(2.85f, 9.5f, 2.85f, 10.47f, 3.44f, 11.06f)
                lineTo(8.94f, 16.56f)
                curveTo(9.23f, 16.85f, 9.62f, 17.0f, 10.0f, 17.0f)
                curveTo(10.38f, 17.0f, 10.77f, 16.85f, 11.06f, 16.56f)
                lineTo(16.56f, 11.06f)
                curveTo(17.15f, 10.47f, 17.15f, 9.5f, 16.56f, 8.94f)
                close()
            }
        }
        .build()
        return _formatColorFill!!
    }

private var _formatColorFill: ImageVector? = null
