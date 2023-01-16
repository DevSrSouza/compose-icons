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

public val MaterialDesignIcons.Drawing: ImageVector
    get() {
        if (_drawing != null) {
            return _drawing!!
        }
        _drawing = Builder(name = "Drawing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 3.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 14.0f, 8.5f)
                curveTo(14.0f, 9.83f, 13.53f, 11.05f, 12.74f, 12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.74f)
                curveTo(11.05f, 13.53f, 9.83f, 14.0f, 8.5f, 14.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 3.0f, 8.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 8.5f, 3.0f)
                close()
            }
        }
        .build()
        return _drawing!!
    }

private var _drawing: ImageVector? = null
