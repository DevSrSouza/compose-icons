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

public val RegularGroup.Attach: ImageVector
    get() {
        if (_attach != null) {
            return _attach!!
        }
        _attach = Builder(name = "Attach", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7722f, 3.7441f)
                curveTo(14.1136f, 1.4005f, 17.9126f, 1.4005f, 20.2558f, 3.7436f)
                curveTo(22.5388f, 6.0267f, 22.5974f, 9.6919f, 20.4314f, 12.0458f)
                lineTo(20.2432f, 12.2432f)
                lineTo(11.4432f, 21.0414f)
                lineTo(11.4066f, 21.0717f)
                curveTo(9.9454f, 22.3884f, 7.6914f, 22.3437f, 6.284f, 20.9363f)
                curveTo(4.965f, 19.6173f, 4.8429f, 17.5546f, 5.9177f, 16.0979f)
                curveTo(5.941f, 16.0525f, 5.9693f, 16.0088f, 6.0025f, 15.9677f)
                lineTo(6.056f, 15.908f)
                lineTo(6.143f, 15.8203f)
                lineTo(6.284f, 15.6724f)
                lineTo(6.287f, 15.6753f)
                lineTo(13.7227f, 8.221f)
                curveTo(13.9886f, 7.9543f, 14.4052f, 7.9296f, 14.6991f, 8.147f)
                lineTo(14.7834f, 8.2196f)
                curveTo(15.05f, 8.4855f, 15.0747f, 8.9021f, 14.8573f, 9.196f)
                lineTo(14.7848f, 9.2802f)
                lineTo(7.1901f, 16.8933f)
                curveTo(6.4725f, 17.7689f, 6.5224f, 19.0632f, 7.3398f, 19.8806f)
                curveTo(8.1688f, 20.7096f, 9.4885f, 20.7491f, 10.3643f, 19.999f)
                lineTo(19.197f, 11.1685f)
                curveTo(20.9525f, 9.4109f, 20.9525f, 6.5616f, 19.1951f, 4.8043f)
                curveTo(17.4927f, 3.1019f, 14.7655f, 3.0487f, 12.999f, 4.6447f)
                lineTo(12.8312f, 4.8043f)
                lineTo(12.8186f, 4.8186f)
                lineTo(3.2823f, 14.3549f)
                curveTo(2.9894f, 14.6478f, 2.5145f, 14.6478f, 2.2216f, 14.3549f)
                curveTo(1.9554f, 14.0887f, 1.9311f, 13.672f, 2.149f, 13.3784f)
                lineTo(2.2216f, 13.2943f)
                lineTo(11.7705f, 3.7436f)
                lineTo(11.7722f, 3.7441f)
                close()
            }
        }
        .build()
        return _attach!!
    }

private var _attach: ImageVector? = null
