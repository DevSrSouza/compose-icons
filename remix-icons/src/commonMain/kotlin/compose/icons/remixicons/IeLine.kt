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

public val RemixIcons.IeLine: ImageVector
    get() {
        if (_ieLine != null) {
            return _ieLine!!
        }
        _ieLine = Builder(name = "IeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.159f, 10.0f)
                arcTo(6.002f, 6.002f, 0.0f, false, false, 6.84f, 10.0f)
                lineTo(18.16f, 10.0f)
                close()
                moveTo(6.583f, 13.0f)
                arcToRelative(6.002f, 6.002f, 0.0f, false, false, 11.08f, 2.057f)
                horizontalLineToRelative(3.304f)
                arcTo(9.003f, 9.003f, 0.0f, false, true, 8.612f, 20.12f)
                curveToRelative(-2.744f, 1.491f, -5.113f, 1.8f, -6.422f, 0.491f)
                curveToRelative(-1.344f, -1.34f, -0.628f, -4.851f, 1.313f, -8.373f)
                arcToRelative(23.624f, 23.624f, 0.0f, false, true, 2.499f, -3.665f)
                curveToRelative(0.359f, -0.433f, 0.735f, -0.852f, 1.125f, -1.252f)
                curveToRelative(-0.275f, 0.055f, -1.88f, 0.851f, -3.412f, 2.714f)
                arcToRelative(9.004f, 9.004f, 0.0f, false, true, 9.468f, -7.009f)
                curveToRelative(3.095f, -1.402f, 5.974f, -1.726f, 7.192f, -0.51f)
                curveToRelative(1.125f, 1.123f, 1.062f, 2.995f, 0.125f, 5.242f)
                curveToRelative(-0.01f, 0.021f, -0.018f, 0.043f, -0.027f, 0.064f)
                arcTo(8.96f, 8.96f, 0.0f, false, true, 21.5f, 12.0f)
                curveToRelative(0.0f, 0.338f, -0.019f, 0.672f, -0.055f, 1.0f)
                lineTo(6.583f, 13.0f)
                close()
                moveTo(8.005f, 19.799f)
                arcToRelative(9.03f, 9.03f, 0.0f, false, true, -3.972f, -4.742f)
                curveToRelative(-1.161f, 2.282f, -1.46f, 4.19f, -0.469f, 5.18f)
                curveToRelative(0.813f, 0.812f, 2.438f, 0.624f, 4.438f, -0.436f)
                lineToRelative(0.003f, -0.002f)
                close()
                moveTo(20.172f, 7.292f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, true, 0.015f, -0.034f)
                curveToRelative(0.75f, -1.622f, 0.813f, -2.994f, 0.125f, -3.806f)
                curveToRelative(-0.869f, -0.868f, -2.54f, -0.75f, -4.522f, 0.168f)
                arcToRelative(9.032f, 9.032f, 0.0f, false, true, 4.382f, 3.672f)
                close()
            }
        }
        .build()
        return _ieLine!!
    }

private var _ieLine: ImageVector? = null
