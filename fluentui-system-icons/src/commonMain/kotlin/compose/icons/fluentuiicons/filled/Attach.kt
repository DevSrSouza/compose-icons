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

public val FilledGroup.Attach: ImageVector
    get() {
        if (_attach != null) {
            return _attach!!
        }
        _attach = Builder(name = "Attach", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0009f, 2.0f)
                curveTo(19.3146f, 2.0f, 22.0009f, 4.6863f, 22.0009f, 8.0f)
                curveTo(22.0009f, 9.5373f, 21.4188f, 10.9843f, 20.397f, 12.0835f)
                lineTo(20.2071f, 12.2784f)
                lineTo(11.48f, 21.0053f)
                lineTo(11.4269f, 21.0548f)
                lineTo(11.3711f, 21.0997f)
                curveTo(10.7019f, 21.6759f, 9.8469f, 22.0f, 8.9439f, 22.0f)
                curveTo(6.8888f, 22.0f, 5.2228f, 20.334f, 5.2228f, 18.2789f)
                curveTo(5.2228f, 17.3775f, 5.5458f, 16.5248f, 6.1183f, 15.8574f)
                lineTo(6.2666f, 15.6945f)
                lineTo(6.2817f, 15.6826f)
                lineTo(13.5727f, 8.3788f)
                curveTo(13.9629f, 7.9879f, 14.5961f, 7.9874f, 14.9869f, 8.3776f)
                curveTo(15.3778f, 8.7677f, 15.3783f, 9.4009f, 14.9882f, 9.7918f)
                lineTo(7.6972f, 17.0956f)
                lineTo(7.6862f, 17.1039f)
                curveTo(7.3899f, 17.4208f, 7.2228f, 17.8354f, 7.2228f, 18.2789f)
                curveTo(7.2228f, 19.2294f, 7.9933f, 20.0f, 8.9439f, 20.0f)
                curveTo(9.3228f, 20.0f, 9.6808f, 19.8781f, 9.9751f, 19.6571f)
                lineTo(10.0972f, 19.5564f)
                lineTo(10.098f, 19.558f)
                lineTo(18.8004f, 10.8571f)
                lineTo(18.959f, 10.6927f)
                curveTo(19.6241f, 9.963f, 20.0009f, 9.0125f, 20.0009f, 8.0f)
                curveTo(20.0009f, 5.7909f, 18.21f, 4.0f, 16.0009f, 4.0f)
                curveTo(14.9393f, 4.0f, 13.9463f, 4.4146f, 13.2058f, 5.1386f)
                lineTo(13.051f, 5.2984f)
                lineTo(13.0326f, 5.3114f)
                lineTo(3.7073f, 14.6403f)
                curveTo(3.3168f, 15.0309f, 2.6837f, 15.031f, 2.2931f, 14.6406f)
                curveTo(1.9024f, 14.2501f, 1.9023f, 13.617f, 2.2927f, 13.2264f)
                lineTo(11.6017f, 3.9132f)
                lineTo(11.6483f, 3.8702f)
                curveTo(12.7722f, 2.6858f, 14.3326f, 2.0f, 16.0009f, 2.0f)
                close()
            }
        }
        .build()
        return _attach!!
    }

private var _attach: ImageVector? = null
