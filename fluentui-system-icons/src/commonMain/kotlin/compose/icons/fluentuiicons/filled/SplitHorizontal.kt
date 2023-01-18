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

public val FilledGroup.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) {
            return _splitHorizontal!!
        }
        _splitHorizontal = Builder(name = "SplitHorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.25f, 12.5f)
                curveTo(21.6642f, 12.5f, 22.0f, 12.1642f, 22.0f, 11.75f)
                curveTo(22.0f, 11.3358f, 21.6642f, 11.0f, 21.25f, 11.0f)
                lineTo(2.75f, 11.0f)
                curveTo(2.3358f, 11.0f, 2.0f, 11.3358f, 2.0f, 11.75f)
                curveTo(2.0f, 12.1642f, 2.3358f, 12.5f, 2.75f, 12.5f)
                lineTo(21.25f, 12.5f)
                close()
                moveTo(17.75f, 2.0f)
                curveTo(18.9926f, 2.0f, 20.0f, 3.0074f, 20.0f, 4.25f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.25f)
                curveTo(4.0f, 3.0074f, 5.0074f, 2.0f, 6.25f, 2.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(4.0f, 19.25f)
                verticalLineTo(13.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.25f)
                curveTo(20.0f, 20.4926f, 18.9926f, 21.5f, 17.75f, 21.5f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 21.5f, 4.0f, 20.4926f, 4.0f, 19.25f)
                close()
            }
        }
        .build()
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
