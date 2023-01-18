package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.BellFill: ImageVector
    get() {
        if (_bellFill != null) {
            return _bellFill!!
        }
        _bellFill = Builder(name = "BellFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.414f, 10.586f)
                lineToRelative(0.48f, 0.486f)
                lineToRelative(0.465f, 0.485f)
                lineToRelative(0.459f, 0.492f)
                curveToRelative(3.458f, 3.764f, 5.472f, 7.218f, 4.607f, 8.083f)
                curveToRelative(-0.4f, 0.4f, -1.356f, 0.184f, -2.64f, -0.507f)
                arcToRelative(9.006f, 9.006f, 0.0f, false, true, -10.403f, -0.592f)
                lineToRelative(2.98f, -2.98f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -1.45f, -1.569f)
                lineToRelative(0.035f, 0.155f)
                lineToRelative(-2.979f, 2.98f)
                arcToRelative(9.007f, 9.007f, 0.0f, false, true, -0.592f, -10.405f)
                curveToRelative(-0.692f, -1.283f, -0.908f, -2.238f, -0.508f, -2.639f)
                curveToRelative(0.977f, -0.976f, 5.25f, 1.715f, 9.546f, 6.01f)
                close()
                moveTo(19.778f, 4.222f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.164f, 2.976f)
                arcToRelative(9.015f, 9.015f, 0.0f, false, true, 0.607f, 8.47f)
                curveToRelative(-1.189f, -1.954f, -3.07f, -4.174f, -5.393f, -6.496f)
                lineToRelative(-0.537f, -0.532f)
                curveToRelative(-2.128f, -2.079f, -4.156f, -3.764f, -5.958f, -4.86f)
                arcToRelative(9.015f, 9.015f, 0.0f, false, true, 8.471f, 0.607f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.974f, -0.165f)
                close()
            }
        }
        .build()
        return _bellFill!!
    }

private var _bellFill: ImageVector? = null
