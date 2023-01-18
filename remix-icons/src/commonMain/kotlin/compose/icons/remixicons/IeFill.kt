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

public val RemixIcons.IeFill: ImageVector
    get() {
        if (_ieFill != null) {
            return _ieFill!!
        }
        _ieFill = Builder(name = "IeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.612f, 20.12f)
                curveToRelative(-2.744f, 1.49f, -5.113f, 1.799f, -6.422f, 0.49f)
                curveToRelative(-1.344f, -1.34f, -0.628f, -4.851f, 1.313f, -8.373f)
                arcTo(23.204f, 23.204f, 0.0f, false, true, 7.127f, 7.32f)
                curveToRelative(0.187f, -0.187f, 1.125f, -1.124f, 1.187f, -1.124f)
                curveToRelative(0.0f, 0.0f, -0.5f, 0.313f, -0.562f, 0.313f)
                curveToRelative(-1.95f, 1.095f, -3.663f, 3.08f, -4.037f, 3.525f)
                arcToRelative(9.004f, 9.004f, 0.0f, false, true, 9.468f, -7.009f)
                curveToRelative(3.095f, -1.402f, 5.974f, -1.726f, 7.192f, -0.51f)
                curveToRelative(1.125f, 1.123f, 1.062f, 2.995f, 0.125f, 5.242f)
                curveToRelative(-0.01f, 0.021f, -0.018f, 0.043f, -0.027f, 0.064f)
                arcTo(8.96f, 8.96f, 0.0f, false, true, 21.5f, 12.0f)
                curveToRelative(0.0f, 0.38f, -0.023f, 0.753f, -0.069f, 1.12f)
                horizontalLineToRelative(-0.804f)
                arcToRelative(4.104f, 4.104f, 0.0f, false, true, -0.142f, 0.003f)
                lineTo(8.689f, 13.123f)
                verticalLineToRelative(0.187f)
                curveToRelative(0.062f, 1.997f, 1.812f, 3.744f, 3.937f, 3.744f)
                curveToRelative(1.5f, 0.0f, 2.937f, -0.811f, 3.562f, -1.997f)
                horizontalLineToRelative(4.78f)
                arcTo(9.003f, 9.003f, 0.0f, false, true, 8.612f, 20.12f)
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
                moveTo(16.563f, 10.752f)
                verticalLineToRelative(-0.061f)
                curveToRelative(-0.125f, -2.06f, -1.75f, -3.62f, -3.75f, -3.62f)
                curveToRelative(-2.125f, 0.0f, -3.936f, 1.685f, -4.061f, 3.62f)
                verticalLineToRelative(0.062f)
                horizontalLineToRelative(7.811f)
                close()
            }
        }
        .build()
        return _ieFill!!
    }

private var _ieFill: ImageVector? = null
