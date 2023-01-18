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

public val RegularGroup.List: ImageVector
    get() {
        if (_list != null) {
            return _list!!
        }
        _list = Builder(name = "List", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 17.9997f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 17.9997f, 16.0f, 18.3355f, 16.0f, 18.7497f)
                curveTo(16.0f, 19.1294f, 15.7178f, 19.4432f, 15.3518f, 19.4928f)
                lineTo(15.25f, 19.4997f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 19.4997f, 2.0f, 19.1639f, 2.0f, 18.7497f)
                curveTo(2.0f, 18.37f, 2.2822f, 18.0562f, 2.6482f, 18.0065f)
                lineTo(2.75f, 17.9997f)
                horizontalLineTo(15.25f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 11.4997f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 11.4997f, 22.0f, 11.8355f, 22.0f, 12.2497f)
                curveTo(22.0f, 12.6294f, 21.7178f, 12.9432f, 21.3518f, 12.9928f)
                lineTo(21.25f, 12.9997f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 12.9997f, 2.0f, 12.6639f, 2.0f, 12.2497f)
                curveTo(2.0f, 11.87f, 2.2822f, 11.5562f, 2.6482f, 11.5065f)
                lineTo(2.75f, 11.4997f)
                horizontalLineTo(21.25f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 5.0029f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 5.0029f, 19.0f, 5.3387f, 19.0f, 5.7529f)
                curveTo(19.0f, 6.1326f, 18.7178f, 6.4464f, 18.3518f, 6.4961f)
                lineTo(18.25f, 6.5029f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 6.5029f, 2.0f, 6.1671f, 2.0f, 5.7529f)
                curveTo(2.0f, 5.3732f, 2.2822f, 5.0594f, 2.6482f, 5.0098f)
                lineTo(2.75f, 5.0029f)
                horizontalLineTo(18.25f)
                horizontalLineTo(2.75f)
                close()
            }
        }
        .build()
        return _list!!
    }

private var _list: ImageVector? = null
