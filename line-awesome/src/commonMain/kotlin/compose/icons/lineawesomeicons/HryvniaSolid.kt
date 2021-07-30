package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.HryvniaSolid: ImageVector
    get() {
        if (_hryvniaSolid != null) {
            return _hryvniaSolid!!
        }
        _hryvniaSolid = Builder(name = "HryvniaSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.2109f, 5.0f)
                curveTo(13.2209f, 5.0f, 12.2625f, 5.2908f, 11.4375f, 5.8398f)
                lineTo(9.4453f, 7.168f)
                lineTo(10.5547f, 8.832f)
                lineTo(12.5469f, 7.5039f)
                curveTo(13.0419f, 7.1739f, 13.6169f, 7.0f, 14.2109f, 7.0f)
                lineTo(18.5957f, 7.0f)
                curveTo(19.9217f, 7.0f, 21.0f, 8.0783f, 21.0f, 9.4043f)
                curveTo(21.0f, 10.1203f, 20.6848f, 10.7949f, 20.1348f, 11.2539f)
                lineTo(19.2402f, 12.0f)
                lineTo(8.0f, 12.0f)
                lineTo(8.0f, 14.0f)
                lineTo(16.8398f, 14.0f)
                lineTo(13.2383f, 17.0f)
                lineTo(8.0f, 17.0f)
                lineTo(8.0f, 19.0f)
                lineTo(10.8398f, 19.0f)
                lineTo(10.5859f, 19.2109f)
                curveTo(9.5789f, 20.0509f, 9.0f, 21.2847f, 9.0f, 22.5957f)
                curveTo(9.0f, 25.0247f, 10.9753f, 27.0f, 13.4043f, 27.0f)
                lineTo(17.7891f, 27.0f)
                curveTo(18.7791f, 27.0f, 19.7385f, 26.7092f, 20.5625f, 26.1602f)
                lineTo(22.5547f, 24.832f)
                lineTo(21.4453f, 23.168f)
                lineTo(19.4531f, 24.4961f)
                curveTo(18.9581f, 24.8261f, 18.3831f, 25.0f, 17.7891f, 25.0f)
                lineTo(13.4043f, 25.0f)
                curveTo(12.0783f, 25.0f, 11.0f, 23.9217f, 11.0f, 22.5957f)
                curveTo(11.0f, 21.8797f, 11.3152f, 21.2051f, 11.8652f, 20.7461f)
                lineTo(13.9609f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 17.0f)
                lineTo(16.3613f, 17.0f)
                lineTo(19.9609f, 14.0f)
                lineTo(24.0f, 14.0f)
                lineTo(24.0f, 12.0f)
                lineTo(22.1504f, 12.0f)
                curveTo(22.6961f, 11.2537f, 23.0f, 10.3501f, 23.0f, 9.4043f)
                curveTo(23.0f, 6.9753f, 21.0247f, 5.0f, 18.5957f, 5.0f)
                lineTo(14.2109f, 5.0f)
                close()
            }
        }
        .build()
        return _hryvniaSolid!!
    }

private var _hryvniaSolid: ImageVector? = null
