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

public val FilledGroup.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) {
            return _caretLeft!!
        }
        _caretLeft = Builder(name = "CaretLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 17.8983f)
                curveTo(15.0f, 18.9722f, 13.7351f, 19.5462f, 12.9268f, 18.839f)
                lineTo(6.6162f, 13.3172f)
                curveTo(5.8193f, 12.6199f, 5.8193f, 11.3804f, 6.6162f, 10.6831f)
                lineTo(12.9268f, 5.1613f)
                curveTo(13.7351f, 4.4541f, 15.0f, 5.0281f, 15.0f, 6.102f)
                lineTo(15.0f, 17.8983f)
                close()
            }
        }
        .build()
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
