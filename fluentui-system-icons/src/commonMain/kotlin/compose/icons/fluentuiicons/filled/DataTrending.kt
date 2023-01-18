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

public val FilledGroup.DataTrending: ImageVector
    get() {
        if (_dataTrending != null) {
            return _dataTrending!!
        }
        _dataTrending = Builder(name = "DataTrending", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 4.25f)
                curveTo(5.25f, 3.6977f, 4.8023f, 3.25f, 4.25f, 3.25f)
                curveTo(3.6977f, 3.25f, 3.25f, 3.6977f, 3.25f, 4.25f)
                verticalLineTo(18.25f)
                curveTo(3.25f, 19.6307f, 4.3693f, 20.75f, 5.75f, 20.75f)
                horizontalLineTo(19.75f)
                curveTo(20.3023f, 20.75f, 20.75f, 20.3023f, 20.75f, 19.75f)
                curveTo(20.75f, 19.1977f, 20.3023f, 18.75f, 19.75f, 18.75f)
                horizontalLineTo(5.75f)
                curveTo(5.4739f, 18.75f, 5.25f, 18.5261f, 5.25f, 18.25f)
                verticalLineTo(4.25f)
                close()
                moveTo(14.0f, 7.0f)
                curveTo(14.0f, 6.4477f, 14.4477f, 6.0f, 15.0f, 6.0f)
                horizontalLineTo(19.5015f)
                curveTo(19.7667f, 6.0f, 20.0211f, 6.1054f, 20.2087f, 6.293f)
                curveTo(20.3962f, 6.4806f, 20.5016f, 6.7351f, 20.5015f, 7.0003f)
                lineTo(20.5f, 11.5003f)
                curveTo(20.4998f, 12.0526f, 20.052f, 12.5002f, 19.4997f, 12.5f)
                curveTo(18.9474f, 12.4998f, 18.4998f, 12.052f, 18.5f, 11.4997f)
                lineTo(18.5007f, 9.4135f)
                lineTo(13.9571f, 13.9571f)
                curveTo(13.5666f, 14.3476f, 12.9334f, 14.3476f, 12.5429f, 13.9571f)
                lineTo(10.75f, 12.1642f)
                lineTo(8.2071f, 14.7071f)
                curveTo(7.8166f, 15.0976f, 7.1834f, 15.0976f, 6.7929f, 14.7071f)
                curveTo(6.4024f, 14.3166f, 6.4024f, 13.6834f, 6.7929f, 13.2929f)
                lineTo(10.0429f, 10.0429f)
                curveTo(10.4334f, 9.6524f, 11.0666f, 9.6524f, 11.4571f, 10.0429f)
                lineTo(13.25f, 11.8358f)
                lineTo(17.0858f, 8.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4477f, 8.0f, 14.0f, 7.5523f, 14.0f, 7.0f)
                close()
            }
        }
        .build()
        return _dataTrending!!
    }

private var _dataTrending: ImageVector? = null
