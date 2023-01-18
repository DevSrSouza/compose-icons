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

public val FilledGroup.RibbonAdd: ImageVector
    get() {
        if (_ribbonAdd != null) {
            return _ribbonAdd!!
        }
        _ribbonAdd = Builder(name = "RibbonAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 6.5009f)
                curveTo(23.0f, 3.4629f, 20.5376f, 1.0f, 17.5f, 1.0f)
                curveTo(14.4624f, 1.0f, 12.0f, 3.4629f, 12.0f, 6.5009f)
                curveTo(12.0f, 9.539f, 14.4624f, 12.0019f, 17.5f, 12.0019f)
                curveTo(20.5376f, 12.0019f, 23.0f, 9.539f, 23.0f, 6.5009f)
                close()
                moveTo(18.0006f, 7.001f)
                lineTo(18.0011f, 9.505f)
                curveTo(18.0011f, 9.7811f, 17.7773f, 10.005f, 17.5011f, 10.005f)
                curveTo(17.225f, 10.005f, 17.0011f, 9.7811f, 17.0011f, 9.505f)
                lineTo(17.0006f, 7.001f)
                horizontalLineTo(14.4956f)
                curveTo(14.2197f, 7.001f, 13.9961f, 6.7771f, 13.9961f, 6.5009f)
                curveTo(13.9961f, 6.2248f, 14.2197f, 6.0009f, 14.4956f, 6.0009f)
                horizontalLineTo(17.0005f)
                lineTo(17.0f, 3.4997f)
                curveTo(17.0f, 3.2235f, 17.2239f, 2.9996f, 17.5f, 2.9996f)
                curveTo(17.7761f, 2.9996f, 18.0f, 3.2235f, 18.0f, 3.4997f)
                lineTo(18.0005f, 6.0009f)
                horizontalLineTo(20.4966f)
                curveTo(20.7725f, 6.0009f, 20.9961f, 6.2248f, 20.9961f, 6.5009f)
                curveTo(20.9961f, 6.7771f, 20.7725f, 7.001f, 20.4966f, 7.001f)
                horizontalLineTo(18.0006f)
                close()
                moveTo(11.0f, 6.5009f)
                curveTo(11.0f, 4.8478f, 11.6169f, 3.3389f, 12.633f, 2.1917f)
                curveTo(12.1091f, 2.0665f, 11.5623f, 2.0002f, 11.0f, 2.0002f)
                curveTo(7.134f, 2.0002f, 4.0f, 5.1347f, 4.0f, 9.0014f)
                curveTo(4.0f, 12.868f, 7.134f, 16.0026f, 11.0f, 16.0026f)
                curveTo(13.3963f, 16.0026f, 15.5113f, 14.7983f, 16.7731f, 12.9618f)
                curveTo(13.5254f, 12.6004f, 11.0f, 9.8456f, 11.0f, 6.5009f)
                close()
                moveTo(16.0016f, 15.2465f)
                lineTo(16.0009f, 21.2486f)
                curveTo(16.0009f, 21.8563f, 15.3161f, 22.2118f, 14.8192f, 21.862f)
                lineTo(11.0008f, 19.1737f)
                lineTo(7.1844f, 21.8619f)
                curveTo(6.6875f, 22.2119f, 6.0025f, 21.8564f, 6.0025f, 21.2486f)
                lineTo(6.0007f, 15.2484f)
                curveTo(7.3702f, 16.3461f, 9.1084f, 17.0027f, 11.0f, 17.0027f)
                curveTo(12.8926f, 17.0027f, 14.6318f, 16.3454f, 16.0016f, 15.2465f)
                close()
            }
        }
        .build()
        return _ribbonAdd!!
    }

private var _ribbonAdd: ImageVector? = null
