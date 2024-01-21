package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.SponsorTiers16: ImageVector
    get() {
        if (_sponsorTiers16 != null) {
            return _sponsorTiers16!!
        }
        _sponsorTiers16 = Builder(name = "SponsorTiers16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.586f, 1.0f)
                curveTo(12.268f, 1.0f, 13.5f, 2.37f, 13.5f, 4.25f)
                curveToRelative(0.0f, 1.745f, -0.996f, 3.359f, -2.622f, 4.831f)
                curveToRelative(-0.166f, 0.15f, -0.336f, 0.297f, -0.509f, 0.438f)
                lineToRelative(1.116f, 5.584f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.991f, 0.852f)
                lineToRelative(-2.409f, -0.876f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.17f, 0.0f)
                lineToRelative(-2.409f, 0.876f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.991f, -0.852f)
                lineTo(5.63f, 9.519f)
                arcToRelative(13.78f, 13.78f, 0.0f, false, true, -0.51f, -0.438f)
                curveTo(3.497f, 7.609f, 2.5f, 5.995f, 2.5f, 4.25f)
                curveTo(2.5f, 2.37f, 3.732f, 1.0f, 5.414f, 1.0f)
                curveToRelative(0.963f, 0.0f, 1.843f, 0.403f, 2.474f, 1.073f)
                lineTo(8.0f, 2.198f)
                lineToRelative(0.112f, -0.125f)
                arcToRelative(3.385f, 3.385f, 0.0f, false, true, 2.283f, -1.068f)
                lineTo(10.586f, 1.0f)
                close()
                moveTo(6.965f, 10.495f)
                lineTo(6.247f, 14.089f)
                lineTo(7.402f, 13.669f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.028f, -0.051f)
                lineToRelative(0.168f, 0.051f)
                lineToRelative(1.154f, 0.42f)
                lineToRelative(-0.718f, -3.592f)
                curveToRelative(-0.199f, 0.13f, -0.37f, 0.235f, -0.505f, 0.314f)
                lineToRelative(-0.169f, 0.097f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.72f, 0.0f)
                arcToRelative(9.54f, 9.54f, 0.0f, false, true, -0.515f, -0.308f)
                lineToRelative(-0.16f, -0.105f)
                close()
                moveTo(10.586f, 2.5f)
                curveToRelative(-0.863f, 0.0f, -1.611f, 0.58f, -1.866f, 1.459f)
                curveToRelative(-0.209f, 0.721f, -1.231f, 0.721f, -1.44f, 0.0f)
                curveTo(7.025f, 3.08f, 6.277f, 2.5f, 5.414f, 2.5f)
                curveTo(4.598f, 2.5f, 4.0f, 3.165f, 4.0f, 4.25f)
                curveToRelative(0.0f, 1.23f, 0.786f, 2.504f, 2.128f, 3.719f)
                curveToRelative(0.49f, 0.443f, 1.018f, 0.846f, 1.546f, 1.198f)
                lineToRelative(0.325f, 0.21f)
                lineToRelative(0.076f, -0.047f)
                lineToRelative(0.251f, -0.163f)
                arcToRelative(13.341f, 13.341f, 0.0f, false, false, 1.546f, -1.198f)
                curveTo(11.214f, 6.754f, 12.0f, 5.479f, 12.0f, 4.25f)
                curveToRelative(0.0f, -1.085f, -0.598f, -1.75f, -1.414f, -1.75f)
                close()
            }
        }
        .build()
        return _sponsorTiers16!!
    }

private var _sponsorTiers16: ImageVector? = null
