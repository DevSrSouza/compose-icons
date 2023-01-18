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

public val RemixIcons.HeartsLine: ImageVector
    get() {
        if (_heartsLine != null) {
            return _heartsLine!!
        }
        _heartsLine = Builder(name = "HeartsLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.243f, 4.757f)
                curveToRelative(1.462f, 1.466f, 2.012f, 3.493f, 1.65f, 5.38f)
                curveToRelative(0.568f, 0.16f, 1.106f, 0.463f, 1.554f, 0.908f)
                curveToRelative(1.404f, 1.394f, 1.404f, 3.654f, 0.0f, 5.047f)
                lineTo(17.0f, 21.5f)
                lineToRelative(-3.022f, -3.0f)
                lineTo(11.0f, 21.485f)
                lineTo(2.52f, 12.993f)
                curveTo(0.417f, 10.637f, 0.496f, 7.019f, 2.757f, 4.757f)
                curveToRelative(2.265f, -2.264f, 5.888f, -2.34f, 8.244f, -0.228f)
                curveToRelative(2.349f, -2.109f, 5.979f, -2.039f, 8.242f, 0.228f)
                close()
                moveTo(12.962f, 12.465f)
                curveToRelative(-0.616f, 0.611f, -0.616f, 1.597f, 0.0f, 2.208f)
                lineTo(17.0f, 18.682f)
                lineToRelative(4.038f, -4.009f)
                curveToRelative(0.616f, -0.611f, 0.616f, -1.597f, 0.0f, -2.208f)
                curveToRelative(-0.624f, -0.62f, -1.642f, -0.62f, -2.268f, 0.002f)
                lineToRelative(-1.772f, 1.754f)
                lineToRelative(-1.407f, -1.396f)
                lineToRelative(-0.363f, -0.36f)
                curveToRelative(-0.624f, -0.62f, -1.642f, -0.62f, -2.266f, 0.0f)
                close()
                moveTo(4.172f, 6.172f)
                curveToRelative(-1.49f, 1.49f, -1.565f, 3.875f, -0.192f, 5.451f)
                lineTo(11.0f, 18.654f)
                lineToRelative(1.559f, -1.562f)
                lineToRelative(-1.006f, -1.0f)
                curveToRelative(-1.404f, -1.393f, -1.404f, -3.653f, 0.0f, -5.047f)
                curveToRelative(1.404f, -1.393f, 3.68f, -1.393f, 5.084f, 0.0f)
                lineToRelative(0.363f, 0.36f)
                lineToRelative(0.363f, -0.36f)
                curveToRelative(0.425f, -0.421f, 0.93f, -0.715f, 1.465f, -0.882f)
                curveToRelative(0.416f, -1.367f, 0.078f, -2.912f, -1.001f, -3.993f)
                curveToRelative(-1.5f, -1.502f, -3.92f, -1.563f, -5.49f, -0.153f)
                lineToRelative(-1.335f, 1.198f)
                lineToRelative(-1.336f, -1.197f)
                curveToRelative(-1.575f, -1.412f, -3.99f, -1.35f, -5.494f, 0.154f)
                close()
            }
        }
        .build()
        return _heartsLine!!
    }

private var _heartsLine: ImageVector? = null
