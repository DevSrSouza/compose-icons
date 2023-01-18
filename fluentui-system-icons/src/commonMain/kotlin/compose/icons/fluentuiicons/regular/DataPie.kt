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

public val RegularGroup.DataPie: ImageVector
    get() {
        if (_dataPie != null) {
            return _dataPie!!
        }
        _dataPie = Builder(name = "DataPie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.25f, 4.25f)
                curveTo(10.6642f, 4.25f, 11.0f, 4.5858f, 11.0f, 5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                curveTo(19.3797f, 13.0f, 19.6935f, 13.2822f, 19.7432f, 13.6482f)
                lineTo(19.75f, 13.75f)
                curveTo(19.75f, 18.7206f, 15.7206f, 22.25f, 10.75f, 22.25f)
                curveTo(5.7794f, 22.25f, 1.75f, 18.2206f, 1.75f, 13.25f)
                curveTo(1.75f, 8.2794f, 5.2794f, 4.25f, 10.25f, 4.25f)
                close()
                moveTo(9.5f, 5.787f)
                lineTo(9.2911f, 5.8107f)
                curveTo(5.6018f, 6.2815f, 3.25f, 9.4327f, 3.25f, 13.25f)
                curveTo(3.25f, 17.3921f, 6.6079f, 20.75f, 10.75f, 20.75f)
                curveTo(14.5673f, 20.75f, 17.7185f, 18.3982f, 18.1893f, 14.7089f)
                lineTo(18.212f, 14.5f)
                horizontalLineTo(10.25f)
                curveTo(9.8703f, 14.5f, 9.5565f, 14.2178f, 9.5069f, 13.8518f)
                lineTo(9.5f, 13.75f)
                verticalLineTo(5.787f)
                close()
                moveTo(13.25f, 1.75f)
                curveTo(18.2206f, 1.75f, 22.25f, 5.7794f, 22.25f, 10.75f)
                curveTo(22.25f, 11.1642f, 21.9142f, 11.5f, 21.5f, 11.5f)
                horizontalLineTo(13.25f)
                curveTo(12.8358f, 11.5f, 12.5f, 11.1642f, 12.5f, 10.75f)
                verticalLineTo(2.5f)
                curveTo(12.5f, 2.0858f, 12.8358f, 1.75f, 13.25f, 1.75f)
                close()
                moveTo(14.0f, 3.287f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.712f)
                lineTo(20.6893f, 9.7911f)
                curveTo(20.2585f, 6.4158f, 17.5842f, 3.7415f, 14.2089f, 3.3107f)
                lineTo(14.0f, 3.287f)
                close()
            }
        }
        .build()
        return _dataPie!!
    }

private var _dataPie: ImageVector? = null
