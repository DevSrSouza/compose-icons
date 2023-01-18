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

public val RegularGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.001f)
                curveTo(16.0041f, 2.001f, 19.25f, 5.2469f, 19.25f, 9.251f)
                curveTo(19.25f, 11.347f, 18.3493f, 13.2707f, 16.5869f, 14.9929f)
                curveTo(16.51f, 15.0681f, 16.4504f, 15.1586f, 16.4118f, 15.2582f)
                lineTo(16.3804f, 15.3605f)
                lineTo(15.2493f, 20.2561f)
                curveTo(15.0266f, 21.22f, 14.2035f, 21.9183f, 13.2302f, 21.993f)
                lineTo(13.057f, 21.9996f)
                horizontalLineTo(10.9433f)
                curveTo(9.9537f, 21.9996f, 9.0879f, 21.3545f, 8.7963f, 20.4228f)
                lineTo(8.7509f, 20.2555f)
                lineTo(7.6213f, 15.3607f)
                curveTo(7.589f, 15.2208f, 7.5173f, 15.0931f, 7.4146f, 14.9928f)
                curveTo(5.7351f, 13.3526f, 4.8378f, 11.5297f, 4.7561f, 9.5492f)
                lineTo(4.75f, 9.251f)
                lineTo(4.7539f, 9.0117f)
                curveTo(4.8801f, 5.1184f, 8.076f, 2.001f, 12.0f, 2.001f)
                close()
                moveTo(14.115f, 18.499f)
                horizontalLineTo(9.884f)
                lineTo(10.2125f, 19.9182f)
                curveTo(10.2831f, 20.2245f, 10.5357f, 20.4504f, 10.8401f, 20.4925f)
                lineTo(10.9433f, 20.4996f)
                horizontalLineTo(13.057f)
                curveTo(13.3713f, 20.4996f, 13.6481f, 20.3044f, 13.7577f, 20.0174f)
                lineTo(13.7878f, 19.9184f)
                lineTo(14.115f, 18.499f)
                close()
                moveTo(12.0f, 3.501f)
                curveTo(8.8982f, 3.501f, 6.3701f, 5.957f, 6.2541f, 9.0304f)
                lineTo(6.25f, 9.251f)
                lineTo(6.2567f, 9.528f)
                curveTo(6.3329f, 11.0913f, 7.0572f, 12.5471f, 8.4626f, 13.9197f)
                curveTo(8.7268f, 14.1777f, 8.9227f, 14.496f, 9.0342f, 14.846f)
                lineTo(9.0829f, 15.0235f)
                lineTo(9.538f, 16.999f)
                horizontalLineTo(14.461f)
                lineTo(14.9189f, 15.0228f)
                curveTo(15.0019f, 14.6634f, 15.1718f, 14.3309f, 15.4124f, 14.0539f)
                lineTo(15.5386f, 13.9201f)
                curveTo(16.9432f, 12.5475f, 17.6672f, 11.0916f, 17.7433f, 9.528f)
                lineTo(17.75f, 9.251f)
                lineTo(17.7458f, 9.0304f)
                curveTo(17.6299f, 5.957f, 15.1018f, 3.501f, 12.0f, 3.501f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
