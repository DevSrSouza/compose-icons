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

public val FilledGroup.Gesture: ImageVector
    get() {
        if (_gesture != null) {
            return _gesture!!
        }
        _gesture = Builder(name = "Gesture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                curveTo(3.5523f, 18.0f, 4.0f, 18.4477f, 4.0f, 19.0f)
                curveTo(4.0f, 19.5523f, 3.5523f, 20.0f, 3.0f, 20.0f)
                curveTo(2.4477f, 20.0f, 2.0f, 19.5523f, 2.0f, 19.0f)
                curveTo(2.0f, 18.4477f, 2.4477f, 18.0f, 3.0f, 18.0f)
                close()
                moveTo(7.0f, 4.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 4.0f, 18.0f, 4.4477f, 18.0f, 5.0f)
                curveTo(18.0f, 5.5128f, 17.614f, 5.9355f, 17.1166f, 5.9933f)
                lineTo(17.0f, 6.0f)
                horizontalLineTo(12.3513f)
                lineTo(20.3611f, 9.1019f)
                curveTo(21.131f, 9.4f, 21.2164f, 10.432f, 20.5559f, 10.8663f)
                lineTo(20.4455f, 10.9297f)
                lineTo(6.4454f, 17.8953f)
                curveTo(5.951f, 18.1413f, 5.3507f, 17.9399f, 5.1047f, 17.4455f)
                curveTo(4.8762f, 16.9863f, 5.0336f, 16.4359f, 5.4531f, 16.1627f)
                lineTo(5.5546f, 16.1047f)
                lineTo(17.5257f, 10.1486f)
                lineTo(6.6389f, 5.9325f)
                curveTo(5.6446f, 5.5475f, 5.8733f, 4.112f, 6.8804f, 4.0062f)
                lineTo(7.0f, 4.0f)
                horizontalLineTo(17.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(20.0f, 4.0f)
                curveTo(20.5523f, 4.0f, 21.0f, 4.4477f, 21.0f, 5.0f)
                curveTo(21.0f, 5.5523f, 20.5523f, 6.0f, 20.0f, 6.0f)
                curveTo(19.4477f, 6.0f, 19.0f, 5.5523f, 19.0f, 5.0f)
                curveTo(19.0f, 4.4477f, 19.4477f, 4.0f, 20.0f, 4.0f)
                close()
            }
        }
        .build()
        return _gesture!!
    }

private var _gesture: ImageVector? = null
