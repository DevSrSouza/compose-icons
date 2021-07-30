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

public val SimpleIcons.Qualcomm: ImageVector
    get() {
        if (_qualcomm != null) {
            return _qualcomm!!
        }
        _qualcomm = Builder(name = "Qualcomm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.2293f, 0.0f, 1.5761f, 4.4865f, 1.5761f, 10.4739f)
                curveToRelative(0.0f, 6.0042f, 4.6532f, 10.4739f, 10.4239f, 10.4739f)
                curveToRelative(0.984f, 0.0f, 1.9347f, -0.1334f, 2.8353f, -0.3836f)
                lineToRelative(1.1341f, 2.9187f)
                curveToRelative(0.1168f, 0.3169f, 0.3503f, 0.517f, 0.7672f, 0.517f)
                horizontalLineToRelative(1.8012f)
                curveToRelative(0.4336f, 0.0f, 0.7505f, -0.2835f, 0.5504f, -0.8339f)
                lineToRelative(-1.4677f, -3.8193f)
                curveToRelative(2.8853f, -1.8179f, 4.8033f, -5.0368f, 4.8033f, -8.8895f)
                curveTo(22.4239f, 4.4864f, 17.7707f, 0.0f, 12.0f, 0.0f)
                moveToRelative(4.5365f, 16.5615f)
                lineToRelative(-1.3176f, -3.419f)
                curveToRelative(-0.1168f, -0.2835f, -0.3502f, -0.5504f, -0.8506f, -0.5504f)
                horizontalLineToRelative(-1.7179f)
                curveToRelative(-0.4336f, 0.0f, -0.7672f, 0.2835f, -0.5671f, 0.8339f)
                lineToRelative(1.7345f, 4.4865f)
                curveToRelative(-0.5671f, 0.1501f, -1.1842f, 0.2168f, -1.8179f, 0.2168f)
                curveToRelative(-4.2196f, 0.0f, -7.2217f, -3.319f, -7.2217f, -7.6553f)
                curveTo(4.7783f, 6.1376f, 7.7804f, 2.8186f, 12.0f, 2.8186f)
                reflectiveCurveToRelative(7.2217f, 3.319f, 7.2217f, 7.6553f)
                curveToRelative(0.0f, 2.5351f, -1.0174f, 4.7033f, -2.6852f, 6.0876f)
            }
        }
        .build()
        return _qualcomm!!
    }

private var _qualcomm: ImageVector? = null
