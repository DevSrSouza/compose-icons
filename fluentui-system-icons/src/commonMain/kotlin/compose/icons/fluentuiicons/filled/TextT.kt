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

public val FilledGroup.TextT: ImageVector
    get() {
        if (_textT != null) {
            return _textT!!
        }
        _textT = Builder(name = "TextT", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 5.0f)
                curveTo(4.75f, 4.4477f, 5.1977f, 4.0f, 5.75f, 4.0f)
                horizontalLineTo(18.25f)
                curveTo(18.8023f, 4.0f, 19.25f, 4.4477f, 19.25f, 5.0f)
                verticalLineTo(7.0f)
                curveTo(19.25f, 7.5523f, 18.8023f, 8.0f, 18.25f, 8.0f)
                curveTo(17.6977f, 8.0f, 17.25f, 7.5523f, 17.25f, 7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                lineTo(13.0f, 18.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 18.0f, 15.0f, 18.4477f, 15.0f, 19.0f)
                curveTo(15.0f, 19.5523f, 14.5523f, 20.0f, 14.0f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4477f, 20.0f, 9.0f, 19.5523f, 9.0f, 19.0f)
                curveTo(9.0f, 18.4477f, 9.4477f, 18.0f, 10.0f, 18.0f)
                horizontalLineTo(11.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineTo(6.75f)
                verticalLineTo(7.0f)
                curveTo(6.75f, 7.5523f, 6.3023f, 8.0f, 5.75f, 8.0f)
                curveTo(5.1977f, 8.0f, 4.75f, 7.5523f, 4.75f, 7.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _textT!!
    }

private var _textT: ImageVector? = null
