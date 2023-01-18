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

public val FilledGroup.TextColorAccent: ImageVector
    get() {
        if (_textColorAccent != null) {
            return _textColorAccent!!
        }
        _textColorAccent = Builder(name = "TextColorAccent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.501f, 17.0f)
                curveTo(3.501f, 15.8954f, 4.3964f, 15.0f, 5.501f, 15.0f)
                lineTo(17.5f, 15.0f)
                curveTo(18.6046f, 15.0f, 19.5f, 15.8954f, 19.5f, 17.0f)
                verticalLineTo(19.5f)
                curveTo(19.5f, 20.6046f, 18.6046f, 21.5f, 17.5f, 21.5f)
                horizontalLineTo(5.501f)
                curveTo(4.3964f, 21.5f, 3.501f, 20.6046f, 3.501f, 19.5f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _textColorAccent!!
    }

private var _textColorAccent: ImageVector? = null
