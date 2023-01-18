package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ArrowPrevious: ImageVector
    get() {
        if (_arrowPrevious != null) {
            return _arrowPrevious!!
        }
        _arrowPrevious = Builder(name = "ArrowPrevious", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 3.0f)
                curveTo(5.3703f, 3.0f, 5.0565f, 3.2822f, 5.0068f, 3.6482f)
                lineTo(5.0f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(5.0f, 20.6642f, 5.3358f, 21.0f, 5.75f, 21.0f)
                curveTo(6.1297f, 21.0f, 6.4435f, 20.7178f, 6.4932f, 20.3518f)
                lineTo(6.5f, 20.25f)
                verticalLineTo(3.75f)
                curveTo(6.5f, 3.3358f, 6.1642f, 3.0f, 5.75f, 3.0f)
                close()
                moveTo(18.7803f, 3.2197f)
                curveTo(18.5141f, 2.9534f, 18.0974f, 2.9292f, 17.8038f, 3.147f)
                lineTo(17.7197f, 3.2197f)
                lineTo(9.4697f, 11.4697f)
                curveTo(9.2034f, 11.7359f, 9.1792f, 12.1526f, 9.397f, 12.4462f)
                lineTo(9.4697f, 12.5303f)
                lineTo(17.7197f, 20.7803f)
                curveTo(18.0126f, 21.0732f, 18.4874f, 21.0732f, 18.7803f, 20.7803f)
                curveTo(19.0466f, 20.5141f, 19.0708f, 20.0974f, 18.8529f, 19.8038f)
                lineTo(18.7803f, 19.7197f)
                lineTo(11.0607f, 12.0f)
                lineTo(18.7803f, 4.2803f)
                curveTo(19.0732f, 3.9874f, 19.0732f, 3.5126f, 18.7803f, 3.2197f)
                close()
            }
        }
        .build()
        return _arrowPrevious!!
    }

private var _arrowPrevious: ImageVector? = null
