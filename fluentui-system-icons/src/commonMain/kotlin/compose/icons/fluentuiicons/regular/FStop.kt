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

public val RegularGroup.FStop: ImageVector
    get() {
        if (_fStop != null) {
            return _fStop!!
        }
        _fStop = Builder(name = "FStop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.1953f, 6.5276f)
                curveTo(13.5331f, 4.5488f, 15.5663f, 3.3464f, 17.4631f, 4.0037f)
                lineTo(18.0546f, 4.2087f)
                curveTo(18.4459f, 4.3443f, 18.8732f, 4.137f, 19.0088f, 3.7456f)
                curveTo(19.1444f, 3.3542f, 18.9371f, 2.927f, 18.5457f, 2.7914f)
                lineTo(17.9543f, 2.5864f)
                curveTo(15.1821f, 1.6257f, 12.2105f, 3.3831f, 11.7167f, 6.2752f)
                lineTo(10.9954f, 10.5f)
                horizontalLineTo(6.7501f)
                curveTo(6.3359f, 10.5f, 6.0001f, 10.8358f, 6.0001f, 11.25f)
                curveTo(6.0001f, 11.6642f, 6.3359f, 12.0f, 6.7501f, 12.0f)
                horizontalLineTo(10.7393f)
                lineTo(9.9567f, 16.5835f)
                curveTo(9.5806f, 18.7864f, 7.145f, 19.9612f, 5.1869f, 18.8843f)
                lineTo(5.1116f, 18.8429f)
                curveTo(4.7486f, 18.6433f, 4.2926f, 18.7757f, 4.093f, 19.1386f)
                curveTo(3.8934f, 19.5015f, 4.0258f, 19.9576f, 4.3887f, 20.1572f)
                lineTo(4.464f, 20.1986f)
                curveTo(7.3258f, 21.7726f, 10.8857f, 20.0555f, 11.4353f, 16.836f)
                lineTo(12.261f, 12.0f)
                horizontalLineTo(16.2501f)
                curveTo(16.6643f, 12.0f, 17.0001f, 11.6642f, 17.0001f, 11.25f)
                curveTo(17.0001f, 10.8358f, 16.6643f, 10.5f, 16.2501f, 10.5f)
                horizontalLineTo(12.5171f)
                lineTo(13.1953f, 6.5276f)
                close()
            }
        }
        .build()
        return _fStop!!
    }

private var _fStop: ImageVector? = null
