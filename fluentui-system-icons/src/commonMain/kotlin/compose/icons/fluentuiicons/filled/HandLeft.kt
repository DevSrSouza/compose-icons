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

public val FilledGroup.HandLeft: ImageVector
    get() {
        if (_handLeft != null) {
            return _handLeft!!
        }
        _handLeft = Builder(name = "HandLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.2527f)
                curveTo(14.0f, 3.7005f, 14.4477f, 3.2529f, 15.0f, 3.2529f)
                curveTo(15.5523f, 3.2529f, 16.0f, 3.7005f, 16.0f, 4.2527f)
                verticalLineTo(10.9993f)
                curveTo(16.0f, 11.2754f, 16.2239f, 11.4992f, 16.5f, 11.4992f)
                curveTo(16.7761f, 11.4992f, 17.0f, 11.2754f, 17.0f, 10.9993f)
                verticalLineTo(5.9991f)
                curveTo(17.0f, 5.4469f, 17.4477f, 4.9993f, 18.0f, 4.9993f)
                curveTo(18.5523f, 4.9993f, 19.0f, 5.4469f, 19.0f, 5.9991f)
                verticalLineTo(14.7539f)
                curveTo(19.0f, 16.9328f, 17.8316f, 19.2623f, 17.086f, 20.5415f)
                curveTo(16.5298f, 21.4956f, 15.5059f, 22.0f, 14.4634f, 22.0f)
                horizontalLineTo(12.2954f)
                curveTo(11.0642f, 22.0f, 9.9387f, 21.3044f, 9.3883f, 20.2033f)
                lineTo(9.2549f, 19.9366f)
                curveTo(8.8342f, 19.095f, 8.3096f, 18.3095f, 7.6933f, 17.5986f)
                lineTo(5.4814f, 15.047f)
                lineTo(3.2895f, 13.3426f)
                curveTo(3.1068f, 13.2005f, 3.0f, 12.9821f, 3.0f, 12.7507f)
                curveTo(3.0f, 12.266f, 3.2591f, 11.906f, 3.5916f, 11.6913f)
                curveTo(3.8877f, 11.5f, 4.2416f, 11.4183f, 4.5536f, 11.3812f)
                curveTo(5.1898f, 11.3057f, 5.9636f, 11.3829f, 6.6429f, 11.5147f)
                curveTo(7.1564f, 11.6144f, 7.6171f, 11.8087f, 8.0f, 12.0191f)
                verticalLineTo(4.2527f)
                curveTo(8.0f, 3.7005f, 8.4477f, 3.2529f, 9.0f, 3.2529f)
                curveTo(9.5523f, 3.2529f, 10.0f, 3.7005f, 10.0f, 4.2527f)
                verticalLineTo(10.5013f)
                curveTo(10.0f, 10.7773f, 10.2239f, 11.0011f, 10.5f, 11.0011f)
                curveTo(10.7761f, 11.0011f, 11.0f, 10.7773f, 11.0f, 10.5013f)
                verticalLineTo(2.9998f)
                curveTo(11.0f, 2.4476f, 11.4477f, 2.0f, 12.0f, 2.0f)
                curveTo(12.5523f, 2.0f, 13.0f, 2.4476f, 13.0f, 2.9998f)
                verticalLineTo(10.5013f)
                curveTo(13.0f, 10.7773f, 13.2239f, 11.0011f, 13.5f, 11.0011f)
                curveTo(13.7761f, 11.0011f, 14.0f, 10.7773f, 14.0f, 10.5013f)
                verticalLineTo(4.2527f)
                close()
            }
        }
        .build()
        return _handLeft!!
    }

private var _handLeft: ImageVector? = null
