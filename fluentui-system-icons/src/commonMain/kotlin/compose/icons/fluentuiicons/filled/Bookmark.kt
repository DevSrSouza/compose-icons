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

public val FilledGroup.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1909f, 21.8547f)
                curveTo(5.6948f, 22.2117f, 5.0029f, 21.8571f, 5.0029f, 21.2459f)
                verticalLineTo(6.25f)
                curveTo(5.0029f, 4.4551f, 6.458f, 3.0f, 8.2529f, 3.0f)
                horizontalLineTo(15.7513f)
                curveTo(17.5462f, 3.0f, 19.0013f, 4.4551f, 19.0013f, 6.25f)
                verticalLineTo(21.2459f)
                curveTo(19.0013f, 21.8571f, 18.3094f, 22.2117f, 17.8133f, 21.8547f)
                lineTo(12.0021f, 17.6738f)
                lineTo(6.1909f, 21.8547f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
