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

public val RegularGroup.Autocorrect: ImageVector
    get() {
        if (_autocorrect != null) {
            return _autocorrect!!
        }
        _autocorrect = Builder(name = "Autocorrect", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4611f, 4.9343f)
                curveTo(13.754f, 5.1179f, 14.009f, 5.3547f, 14.2134f, 5.6319f)
                lineTo(14.3299f, 5.803f)
                lineTo(17.275f, 10.4987f)
                lineTo(21.5001f, 10.4996f)
                curveTo(21.8798f, 10.4996f, 22.1936f, 10.7818f, 22.2433f, 11.1478f)
                lineTo(22.2501f, 11.2496f)
                curveTo(22.2501f, 11.6638f, 21.9143f, 11.9996f, 21.5001f, 11.9996f)
                lineTo(18.216f, 11.9987f)
                lineTo(18.2217f, 12.0076f)
                lineTo(18.213f, 11.9987f)
                curveTo(19.0112f, 12.8482f, 19.5001f, 13.9918f, 19.5001f, 15.2496f)
                curveTo(19.5001f, 17.873f, 17.3735f, 19.9996f, 14.7501f, 19.9996f)
                curveTo(12.1267f, 19.9996f, 10.0001f, 17.873f, 10.0001f, 15.2496f)
                curveTo(10.0001f, 12.6263f, 12.1267f, 10.4996f, 14.7501f, 10.4996f)
                lineTo(15.506f, 10.4987f)
                lineTo(13.0591f, 6.5999f)
                curveTo(12.9589f, 6.4402f, 12.8239f, 6.3052f, 12.6642f, 6.205f)
                curveTo(12.1183f, 5.8627f, 11.4099f, 5.9939f, 11.0197f, 6.4884f)
                lineTo(10.9411f, 6.5999f)
                lineTo(3.3855f, 18.6481f)
                curveTo(3.1654f, 18.999f, 2.7025f, 19.1051f, 2.3516f, 18.885f)
                curveTo(2.0326f, 18.6849f, 1.9159f, 18.2842f, 2.0627f, 17.9494f)
                lineTo(2.1147f, 17.8511f)
                lineTo(9.6703f, 5.803f)
                curveTo(10.4772f, 4.5163f, 12.1744f, 4.1273f, 13.4611f, 4.9343f)
                close()
                moveTo(14.7501f, 11.9996f)
                curveTo(12.9552f, 11.9996f, 11.5001f, 13.4547f, 11.5001f, 15.2496f)
                curveTo(11.5001f, 17.0445f, 12.9552f, 18.4996f, 14.7501f, 18.4996f)
                curveTo(16.545f, 18.4996f, 18.0001f, 17.0445f, 18.0001f, 15.2496f)
                curveTo(18.0001f, 13.4547f, 16.545f, 11.9996f, 14.7501f, 11.9996f)
                close()
            }
        }
        .build()
        return _autocorrect!!
    }

private var _autocorrect: ImageVector? = null
