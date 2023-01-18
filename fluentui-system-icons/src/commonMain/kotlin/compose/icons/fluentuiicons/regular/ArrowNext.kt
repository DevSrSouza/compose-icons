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

public val RegularGroup.ArrowNext: ImageVector
    get() {
        if (_arrowNext != null) {
            return _arrowNext!!
        }
        _arrowNext = Builder(name = "ArrowNext", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 3.0f)
                curveTo(18.6297f, 3.0f, 18.9435f, 3.2822f, 18.9932f, 3.6482f)
                lineTo(19.0f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(19.0f, 20.6642f, 18.6642f, 21.0f, 18.25f, 21.0f)
                curveTo(17.8703f, 21.0f, 17.5565f, 20.7178f, 17.5068f, 20.3518f)
                lineTo(17.5f, 20.25f)
                verticalLineTo(3.75f)
                curveTo(17.5f, 3.3358f, 17.8358f, 3.0f, 18.25f, 3.0f)
                close()
                moveTo(5.2197f, 3.2197f)
                curveTo(5.4859f, 2.9534f, 5.9026f, 2.9292f, 6.1962f, 3.147f)
                lineTo(6.2803f, 3.2197f)
                lineTo(14.5303f, 11.4697f)
                curveTo(14.7966f, 11.7359f, 14.8208f, 12.1526f, 14.6029f, 12.4462f)
                lineTo(14.5303f, 12.5303f)
                lineTo(6.2803f, 20.7803f)
                curveTo(5.9874f, 21.0732f, 5.5126f, 21.0732f, 5.2197f, 20.7803f)
                curveTo(4.9534f, 20.5141f, 4.9292f, 20.0974f, 5.147f, 19.8038f)
                lineTo(5.2197f, 19.7197f)
                lineTo(12.9393f, 12.0f)
                lineTo(5.2197f, 4.2803f)
                curveTo(4.9268f, 3.9874f, 4.9268f, 3.5126f, 5.2197f, 3.2197f)
                close()
            }
        }
        .build()
        return _arrowNext!!
    }

private var _arrowNext: ImageVector? = null
