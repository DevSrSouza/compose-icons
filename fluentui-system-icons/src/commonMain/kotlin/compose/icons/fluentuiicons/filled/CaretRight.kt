package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.CaretRight: ImageVector
    get() {
        if (_caretRight != null) {
            return _caretRight!!
        }
        _caretRight = Builder(name = "CaretRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 17.8983f)
                curveTo(9.0f, 18.9722f, 10.2649f, 19.5462f, 11.0731f, 18.839f)
                lineTo(17.3838f, 13.3172f)
                curveTo(18.1806f, 12.6199f, 18.1806f, 11.3804f, 17.3838f, 10.6831f)
                lineTo(11.0731f, 5.1613f)
                curveTo(10.2649f, 4.4541f, 9.0f, 5.0281f, 9.0f, 6.102f)
                verticalLineTo(17.8983f)
                close()
            }
        }
        .build()
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
