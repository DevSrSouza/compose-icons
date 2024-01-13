package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Ltspice: ImageVector
    get() {
        if (_ltspice != null) {
            return _ltspice!!
        }
        _ltspice = Builder(name = "Ltspice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3267f, 3.4848f)
                curveToRelative(-0.7965f, 0.627f, -0.9744f, 1.6212f, -1.1644f, 3.3173f)
                curveToRelative(-0.3653f, 3.257f, -0.641f, 5.1982f, -1.0473f, 8.658f)
                curveToRelative(-0.199f, 1.7013f, 0.9756f, 1.9015f, 2.3646f, 1.8861f)
                horizontalLineToRelative(2.8841f)
                curveToRelative(0.2604f, 0.002f, 0.3525f, 0.1229f, 0.3193f, 0.3807f)
                curveToRelative(-0.1241f, 0.9654f, -0.2579f, 2.7882f, -1.19f, 2.7882f)
                lineTo(0.0f, 20.4933f)
                reflectiveCurveToRelative(2.8304f, -1.032f, 3.165f, -3.3723f)
                lineTo(4.5047f, 6.234f)
                curveToRelative(0.2086f, -1.357f, 1.2885f, -2.7492f, 2.634f, -2.7492f)
                horizontalLineToRelative(2.188f)
                close()
                moveTo(14.8834f, 20.5154f)
                curveToRelative(1.3454f, 0.0f, 2.4254f, -1.3922f, 2.634f, -2.7491f)
                lineTo(18.857f, 6.8792f)
                curveToRelative(0.3346f, -2.3404f, 3.165f, -3.3723f, 3.165f, -3.3723f)
                lineTo(10.529f, 3.485f)
                curveToRelative(-0.9321f, 0.0f, -1.0658f, 1.8228f, -1.19f, 2.7882f)
                curveToRelative(-0.0332f, 0.2578f, 0.0589f, 0.3787f, 0.3193f, 0.3806f)
                horizontalLineToRelative(2.8841f)
                curveToRelative(1.389f, -0.0153f, 2.5636f, 0.185f, 2.3646f, 1.8861f)
                curveToRelative(-0.4062f, 3.46f, -0.682f, 5.401f, -1.0473f, 8.6581f)
                curveToRelative(-0.19f, 1.696f, -0.3679f, 2.6903f, -1.1644f, 3.3173f)
                horizontalLineToRelative(2.188f)
                close()
                moveTo(23.202f, 6.6528f)
                curveToRelative(0.259f, 6.0E-4f, 0.4964f, -0.2092f, 0.5284f, -0.4658f)
                lineToRelative(0.2662f, -2.2309f)
                curveToRelative(0.0313f, -0.2565f, -0.1549f, -0.4715f, -0.4133f, -0.4715f)
                horizontalLineToRelative(-0.8797f)
                curveToRelative(-1.0883f, 0.0f, -2.2022f, 1.7952f, -2.2559f, 2.696f)
                curveToRelative(-0.0339f, 0.2585f, 0.151f, 0.4696f, 0.4114f, 0.4722f)
                horizontalLineToRelative(2.3429f)
                close()
            }
        }
        .build()
        return _ltspice!!
    }

private var _ltspice: ImageVector? = null
