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

public val FilledGroup.Options: ImageVector
    get() {
        if (_options != null) {
            return _options!!
        }
        _options = Builder(name = "Options", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 13.5f)
                curveTo(10.2869f, 13.5f, 11.5747f, 14.5668f, 11.9131f, 16.0003f)
                lineTo(21.25f, 16.0f)
                curveTo(21.6642f, 16.0f, 22.0f, 16.3358f, 22.0f, 16.75f)
                curveTo(22.0f, 17.1297f, 21.7178f, 17.4435f, 21.3518f, 17.4932f)
                lineTo(21.25f, 17.5f)
                lineTo(11.9129f, 17.5007f)
                curveTo(11.5741f, 18.9337f, 10.2866f, 20.0f, 8.75f, 20.0f)
                curveTo(7.2134f, 20.0f, 5.9259f, 18.9337f, 5.5871f, 17.5007f)
                lineTo(2.75f, 17.5f)
                curveTo(2.3358f, 17.5f, 2.0f, 17.1642f, 2.0f, 16.75f)
                curveTo(2.0f, 16.3703f, 2.2822f, 16.0565f, 2.6482f, 16.0068f)
                lineTo(2.75f, 16.0f)
                lineTo(5.5869f, 16.0003f)
                curveTo(5.9253f, 14.5668f, 7.2131f, 13.5f, 8.75f, 13.5f)
                close()
                moveTo(15.25f, 4.0f)
                curveTo(16.7869f, 4.0f, 18.0747f, 5.0668f, 18.4131f, 6.5003f)
                lineTo(21.25f, 6.5f)
                curveTo(21.6642f, 6.5f, 22.0f, 6.8358f, 22.0f, 7.25f)
                curveTo(22.0f, 7.6297f, 21.7178f, 7.9435f, 21.3518f, 7.9932f)
                lineTo(21.25f, 8.0f)
                lineTo(18.4129f, 8.0007f)
                curveTo(18.0741f, 9.4337f, 16.7866f, 10.5f, 15.25f, 10.5f)
                curveTo(13.7134f, 10.5f, 12.4259f, 9.4337f, 12.0871f, 8.0007f)
                lineTo(2.75f, 8.0f)
                curveTo(2.3358f, 8.0f, 2.0f, 7.6642f, 2.0f, 7.25f)
                curveTo(2.0f, 6.8703f, 2.2822f, 6.5565f, 2.6482f, 6.5068f)
                lineTo(2.75f, 6.5f)
                lineTo(12.0869f, 6.5003f)
                curveTo(12.4253f, 5.0668f, 13.7131f, 4.0f, 15.25f, 4.0f)
                close()
            }
        }
        .build()
        return _options!!
    }

private var _options: ImageVector? = null
