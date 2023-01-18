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

public val FilledGroup.CenterVertical: ImageVector
    get() {
        if (_centerVertical != null) {
            return _centerVertical!!
        }
        _centerVertical = Builder(name = "CenterVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.75f)
                curveTo(21.0f, 4.1642f, 20.6642f, 4.5f, 20.25f, 4.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 4.5f, 3.0f, 4.1642f, 3.0f, 3.75f)
                curveTo(3.0f, 3.3358f, 3.3358f, 3.0f, 3.75f, 3.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 3.0f, 21.0f, 3.3358f, 21.0f, 3.75f)
                close()
                moveTo(21.0f, 20.25f)
                curveTo(21.0f, 20.6642f, 20.6642f, 21.0f, 20.25f, 21.0f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 21.0f, 3.0f, 20.6642f, 3.0f, 20.25f)
                curveTo(3.0f, 19.8358f, 3.3358f, 19.5f, 3.75f, 19.5f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 19.5f, 21.0f, 19.8358f, 21.0f, 20.25f)
                close()
                moveTo(7.25f, 8.0f)
                curveTo(6.0074f, 8.0f, 5.0f, 9.0074f, 5.0f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(5.0f, 14.9926f, 6.0074f, 16.0f, 7.25f, 16.0f)
                horizontalLineTo(16.75f)
                curveTo(17.9926f, 16.0f, 19.0f, 14.9926f, 19.0f, 13.75f)
                verticalLineTo(10.25f)
                curveTo(19.0f, 9.0074f, 17.9926f, 8.0f, 16.75f, 8.0f)
                horizontalLineTo(7.25f)
                close()
            }
        }
        .build()
        return _centerVertical!!
    }

private var _centerVertical: ImageVector? = null
