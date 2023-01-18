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

public val FilledGroup.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) {
            return _splitVertical!!
        }
        _splitVertical = Builder(name = "SplitVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 2.75f)
                curveTo(12.5f, 2.3358f, 12.1642f, 2.0f, 11.75f, 2.0f)
                curveTo(11.3358f, 2.0f, 11.0f, 2.3358f, 11.0f, 2.75f)
                lineTo(11.0f, 21.25f)
                curveTo(11.0f, 21.6642f, 11.3358f, 22.0f, 11.75f, 22.0f)
                curveTo(12.1642f, 22.0f, 12.5f, 21.6642f, 12.5f, 21.25f)
                lineTo(12.5f, 2.75f)
                close()
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 5.0074f, 3.0074f, 4.0f, 4.25f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 20.0f, 2.0f, 18.9926f, 2.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(19.25f, 20.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.25f)
                curveTo(20.4926f, 4.0f, 21.5f, 5.0074f, 21.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.5f, 18.9926f, 20.4926f, 20.0f, 19.25f, 20.0f)
                close()
            }
        }
        .build()
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
