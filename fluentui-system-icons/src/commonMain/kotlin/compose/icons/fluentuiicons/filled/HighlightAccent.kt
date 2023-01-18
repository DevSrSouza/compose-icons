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

public val FilledGroup.HighlightAccent: ImageVector
    get() {
        if (_highlightAccent != null) {
            return _highlightAccent!!
        }
        _highlightAccent = Builder(name = "HighlightAccent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0029f, 4.0f)
                lineTo(20.0f, 7.7502f)
                lineTo(19.9929f, 7.8519f)
                curveTo(19.9439f, 8.2062f, 19.6472f, 8.4825f, 19.2829f, 8.5f)
                horizontalLineTo(4.7369f)
                lineTo(4.6482f, 8.494f)
                curveTo(4.2821f, 8.4444f, 4.0f, 8.1306f, 4.0f, 7.7509f)
                lineTo(4.0f, 4.0f)
                horizontalLineTo(20.0029f)
                close()
                moveTo(15.507f, 13.5f)
                horizontalLineTo(8.4999f)
                lineTo(8.5f, 21.0f)
                lineTo(15.0758f, 17.8937f)
                curveTo(15.3064f, 17.7858f, 15.4642f, 17.5695f, 15.5f, 17.3222f)
                lineTo(15.5078f, 17.2145f)
                lineTo(15.507f, 13.5f)
                close()
            }
        }
        .build()
        return _highlightAccent!!
    }

private var _highlightAccent: ImageVector? = null
