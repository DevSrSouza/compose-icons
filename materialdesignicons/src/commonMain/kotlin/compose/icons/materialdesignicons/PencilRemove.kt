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

public val MaterialDesignIcons.PencilRemove: ImageVector
    get() {
        if (_pencilRemove != null) {
            return _pencilRemove!!
        }
        _pencilRemove = Builder(name = "PencilRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7f, 7.0f)
                curveTo(21.1f, 6.6f, 21.1f, 6.0f, 20.7f, 5.6f)
                lineTo(18.4f, 3.3f)
                curveTo(18.0f, 2.9f, 17.4f, 2.9f, 17.0f, 3.3f)
                lineTo(15.2f, 5.1f)
                lineTo(19.0f, 8.9f)
                moveTo(3.0f, 17.2f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.8f)
                lineTo(17.8f, 9.9f)
                lineTo(14.1f, 6.1f)
                lineTo(3.0f, 17.2f)
                moveTo(3.9f, 2.4f)
                lineTo(6.0f, 4.5f)
                lineTo(8.1f, 2.4f)
                lineTo(9.5f, 3.8f)
                lineTo(7.4f, 5.9f)
                lineTo(9.5f, 8.0f)
                lineTo(8.1f, 9.5f)
                lineTo(6.0f, 7.4f)
                lineTo(3.9f, 9.5f)
                lineTo(2.5f, 8.1f)
                lineTo(4.6f, 6.0f)
                lineTo(2.5f, 3.8f)
                lineTo(3.9f, 2.4f)
                close()
            }
        }
        .build()
        return _pencilRemove!!
    }

private var _pencilRemove: ImageVector? = null
