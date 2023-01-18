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

public val FilledGroup.DataScatter: ImageVector
    get() {
        if (_dataScatter != null) {
            return _dataScatter!!
        }
        _dataScatter = Builder(name = "DataScatter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.75f)
                curveTo(3.0f, 3.3358f, 3.3358f, 3.0f, 3.75f, 3.0f)
                curveTo(4.1642f, 3.0f, 4.5f, 3.3358f, 4.5f, 3.75f)
                verticalLineTo(19.5f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 19.5f, 21.0f, 19.8358f, 21.0f, 20.25f)
                curveTo(21.0f, 20.6642f, 20.6642f, 21.0f, 20.25f, 21.0f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 21.0f, 3.0f, 20.6642f, 3.0f, 20.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(14.0f, 7.0f)
                curveTo(14.0f, 5.3432f, 15.3431f, 4.0f, 17.0f, 4.0f)
                curveTo(18.6569f, 4.0f, 20.0f, 5.3432f, 20.0f, 7.0f)
                curveTo(20.0f, 8.6568f, 18.6569f, 10.0f, 17.0f, 10.0f)
                curveTo(15.3431f, 10.0f, 14.0f, 8.6568f, 14.0f, 7.0f)
                close()
                moveTo(9.0f, 6.0f)
                curveTo(7.3432f, 6.0f, 6.0f, 7.3432f, 6.0f, 9.0f)
                curveTo(6.0f, 10.6569f, 7.3432f, 12.0f, 9.0f, 12.0f)
                curveTo(10.6569f, 12.0f, 12.0f, 10.6569f, 12.0f, 9.0f)
                curveTo(12.0f, 7.3432f, 10.6569f, 6.0f, 9.0f, 6.0f)
                close()
                moveTo(15.0f, 12.0f)
                curveTo(13.3431f, 12.0f, 12.0f, 13.3431f, 12.0f, 15.0f)
                curveTo(12.0f, 16.6569f, 13.3431f, 18.0f, 15.0f, 18.0f)
                curveTo(16.6569f, 18.0f, 18.0f, 16.6569f, 18.0f, 15.0f)
                curveTo(18.0f, 13.3431f, 16.6569f, 12.0f, 15.0f, 12.0f)
                close()
            }
        }
        .build()
        return _dataScatter!!
    }

private var _dataScatter: ImageVector? = null
