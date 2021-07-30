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

public val LineAwesomeIcons.PhoneSquareSolid: ImageVector
    get() {
        if (_phoneSquareSolid != null) {
            return _phoneSquareSolid!!
        }
        _phoneSquareSolid = Builder(name = "PhoneSquareSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(11.8711f, 9.002f)
                curveTo(11.381f, 9.002f, 10.8896f, 9.1875f, 10.5156f, 9.5605f)
                lineTo(9.5605f, 10.5156f)
                curveTo(9.0345f, 11.0436f, 8.8604f, 11.806f, 9.1074f, 12.502f)
                lineTo(9.1504f, 12.6328f)
                curveTo(9.3154f, 13.1358f, 9.7019f, 14.3127f, 10.9629f, 16.1797f)
                curveTo(11.5749f, 17.0877f, 12.2835f, 17.9373f, 13.0605f, 18.6953f)
                lineTo(13.2949f, 18.9297f)
                curveTo(14.0609f, 19.7137f, 14.9084f, 20.4212f, 15.8164f, 21.0352f)
                curveTo(17.6854f, 22.2962f, 18.8642f, 22.6817f, 19.3672f, 22.8477f)
                lineTo(19.498f, 22.8926f)
                curveTo(19.707f, 22.9656f, 19.9237f, 23.002f, 20.1367f, 23.002f)
                curveTo(20.6327f, 23.002f, 21.1154f, 22.8065f, 21.4844f, 22.4375f)
                lineTo(22.4395f, 21.4844f)
                curveTo(22.8015f, 21.1214f, 23.0f, 20.6419f, 23.0f, 20.1309f)
                curveTo(23.0f, 19.6189f, 22.8015f, 19.1364f, 22.4395f, 18.7754f)
                lineTo(21.2891f, 17.627f)
                curveTo(20.5661f, 16.904f, 19.3041f, 16.904f, 18.5801f, 17.627f)
                lineTo(16.873f, 19.334f)
                curveTo(16.102f, 18.807f, 15.3787f, 18.1994f, 14.7188f, 17.5234f)
                lineTo(14.4688f, 17.2734f)
                curveTo(13.7987f, 16.6194f, 13.194f, 15.897f, 12.668f, 15.127f)
                lineTo(14.375f, 13.4199f)
                curveTo(14.737f, 13.0589f, 14.9355f, 12.5755f, 14.9355f, 12.0645f)
                curveTo(14.9355f, 11.5535f, 14.737f, 11.0739f, 14.375f, 10.7109f)
                lineTo(13.2227f, 9.5605f)
                curveTo(12.8502f, 9.1885f, 12.3612f, 9.002f, 11.8711f, 9.002f)
                close()
            }
        }
        .build()
        return _phoneSquareSolid!!
    }

private var _phoneSquareSolid: ImageVector? = null
