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

public val FilledGroup.News: ImageVector
    get() {
        if (_news != null) {
            return _news!!
        }
        _news = Builder(name = "News", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 4.0f)
                curveTo(17.9409f, 4.0f, 18.9156f, 4.9252f, 18.9948f, 6.096f)
                lineTo(19.0f, 6.25f)
                verticalLineTo(17.5f)
                curveTo(19.0f, 17.7761f, 19.2239f, 18.0f, 19.5f, 18.0f)
                curveTo(19.7455f, 18.0f, 19.9496f, 17.8231f, 19.9919f, 17.5899f)
                lineTo(20.0f, 17.5f)
                lineTo(20.0006f, 7.0138f)
                curveTo(21.0717f, 7.1325f, 21.9161f, 8.0031f, 21.9941f, 9.086f)
                lineTo(22.0f, 9.25f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 18.483f, 20.6435f, 19.8992f, 18.9344f, 19.9949f)
                lineTo(18.75f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20.0f, 2.1007f, 18.6435f, 2.0051f, 16.9344f)
                lineTo(2.0f, 16.75f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.0591f, 2.9252f, 4.0844f, 4.096f, 4.0052f)
                lineTo(4.25f, 4.0f)
                horizontalLineTo(16.75f)
                close()
                moveTo(9.2478f, 11.0f)
                horizontalLineTo(5.7478f)
                curveTo(5.3335f, 11.0f, 4.9978f, 11.3358f, 4.9978f, 11.75f)
                verticalLineTo(15.25f)
                curveTo(4.9978f, 15.6642f, 5.3335f, 16.0f, 5.7478f, 16.0f)
                horizontalLineTo(9.2478f)
                curveTo(9.662f, 16.0f, 9.9978f, 15.6642f, 9.9978f, 15.25f)
                verticalLineTo(11.75f)
                curveTo(9.9978f, 11.3358f, 9.662f, 11.0f, 9.2478f, 11.0f)
                close()
                moveTo(15.2522f, 14.5f)
                horizontalLineTo(12.7539f)
                lineTo(12.6522f, 14.5068f)
                curveTo(12.2861f, 14.5565f, 12.0039f, 14.8703f, 12.0039f, 15.25f)
                curveTo(12.0039f, 15.6642f, 12.3397f, 16.0f, 12.7539f, 16.0f)
                horizontalLineTo(15.2522f)
                lineTo(15.354f, 15.9932f)
                curveTo(15.7201f, 15.9435f, 16.0022f, 15.6297f, 16.0022f, 15.25f)
                curveTo(16.0022f, 14.8358f, 15.6665f, 14.5f, 15.2522f, 14.5f)
                close()
                moveTo(8.4978f, 12.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(6.4978f)
                verticalLineTo(12.5f)
                horizontalLineTo(8.4978f)
                close()
                moveTo(15.2509f, 11.0f)
                lineTo(12.7526f, 11.0045f)
                lineTo(12.6508f, 11.0115f)
                curveTo(12.2848f, 11.0618f, 12.0032f, 11.3761f, 12.0039f, 11.7558f)
                curveTo(12.0047f, 12.17f, 12.3411f, 12.5052f, 12.7553f, 12.5045f)
                lineTo(15.2536f, 12.5f)
                lineTo(15.3553f, 12.493f)
                curveTo(15.7213f, 12.4427f, 16.0029f, 12.1284f, 16.0022f, 11.7487f)
                curveTo(16.0015f, 11.3344f, 15.6651f, 10.9993f, 15.2509f, 11.0f)
                close()
                moveTo(15.2522f, 7.5045f)
                horizontalLineTo(5.7478f)
                lineTo(5.646f, 7.5113f)
                curveTo(5.2799f, 7.561f, 4.9978f, 7.8748f, 4.9978f, 8.2545f)
                curveTo(4.9978f, 8.6687f, 5.3335f, 9.0045f, 5.7478f, 9.0045f)
                horizontalLineTo(15.2522f)
                lineTo(15.354f, 8.9976f)
                curveTo(15.7201f, 8.948f, 16.0022f, 8.6342f, 16.0022f, 8.2545f)
                curveTo(16.0022f, 7.8403f, 15.6665f, 7.5045f, 15.2522f, 7.5045f)
                close()
            }
        }
        .build()
        return _news!!
    }

private var _news: ImageVector? = null
