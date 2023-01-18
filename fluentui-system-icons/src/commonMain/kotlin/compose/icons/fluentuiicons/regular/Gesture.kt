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

public val RegularGroup.Gesture: ImageVector
    get() {
        if (_gesture != null) {
            return _gesture!!
        }
        _gesture = Builder(name = "Gesture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 17.5f)
                curveTo(4.1642f, 17.5f, 4.5f, 17.8358f, 4.5f, 18.25f)
                curveTo(4.5f, 18.6642f, 4.1642f, 19.0f, 3.75f, 19.0f)
                curveTo(3.3358f, 19.0f, 3.0f, 18.6642f, 3.0f, 18.25f)
                curveTo(3.0f, 17.8358f, 3.3358f, 17.5f, 3.75f, 17.5f)
                close()
                moveTo(6.7486f, 4.0047f)
                horizontalLineTo(17.2535f)
                curveTo(17.6677f, 4.0047f, 18.0035f, 4.3405f, 18.0035f, 4.7547f)
                curveTo(18.0035f, 5.1344f, 17.7213f, 5.4482f, 17.3552f, 5.4978f)
                lineTo(17.2535f, 5.5047f)
                horizontalLineTo(10.7509f)
                lineTo(20.5242f, 9.3009f)
                curveTo(21.0949f, 9.5225f, 21.1635f, 10.2822f, 20.6848f, 10.6137f)
                lineTo(20.5886f, 10.6706f)
                lineTo(6.1006f, 17.9279f)
                curveTo(5.7303f, 18.1135f, 5.2797f, 17.9636f, 5.0941f, 17.5933f)
                curveTo(4.9241f, 17.2538f, 5.0358f, 16.8469f, 5.3409f, 16.6385f)
                lineTo(5.4288f, 16.5868f)
                lineTo(18.4048f, 10.0868f)
                lineTo(6.4771f, 5.4538f)
                curveTo(5.737f, 5.1663f, 5.9018f, 4.103f, 6.6439f, 4.011f)
                lineTo(6.7486f, 4.0047f)
                horizontalLineTo(17.2535f)
                horizontalLineTo(6.7486f)
                close()
                moveTo(19.75f, 4.0f)
                curveTo(20.1642f, 4.0f, 20.5f, 4.3358f, 20.5f, 4.75f)
                curveTo(20.5f, 5.1642f, 20.1642f, 5.5f, 19.75f, 5.5f)
                curveTo(19.3358f, 5.5f, 19.0f, 5.1642f, 19.0f, 4.75f)
                curveTo(19.0f, 4.3358f, 19.3358f, 4.0f, 19.75f, 4.0f)
                close()
            }
        }
        .build()
        return _gesture!!
    }

private var _gesture: ImageVector? = null
