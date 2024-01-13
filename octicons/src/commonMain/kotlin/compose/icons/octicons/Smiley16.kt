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

public val Octicons.Smiley16: ImageVector
    get() {
        if (_smiley16 != null) {
            return _smiley16!!
        }
        _smiley16 = Builder(name = "Smiley16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(1.5f, 8.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 13.0f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -13.0f, 0.0f)
                close()
                moveTo(5.32f, 9.636f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.038f, 0.175f)
                lineToRelative(0.007f, 0.009f)
                curveToRelative(0.103f, 0.118f, 0.22f, 0.222f, 0.35f, 0.31f)
                curveToRelative(0.264f, 0.178f, 0.683f, 0.37f, 1.285f, 0.37f)
                curveToRelative(0.602f, 0.0f, 1.02f, -0.192f, 1.285f, -0.371f)
                curveToRelative(0.13f, -0.088f, 0.247f, -0.192f, 0.35f, -0.31f)
                lineToRelative(0.007f, -0.008f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.222f, 0.87f)
                lineToRelative(-0.022f, -0.015f)
                curveToRelative(0.02f, 0.013f, 0.021f, 0.015f, 0.021f, 0.015f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.001f, 0.002f)
                lineToRelative(-0.002f, 0.003f)
                lineToRelative(-0.005f, 0.007f)
                lineToRelative(-0.014f, 0.019f)
                arcToRelative(2.066f, 2.066f, 0.0f, false, true, -0.184f, 0.213f)
                curveToRelative(-0.16f, 0.166f, -0.338f, 0.316f, -0.53f, 0.445f)
                curveToRelative(-0.63f, 0.418f, -1.37f, 0.638f, -2.127f, 0.629f)
                curveToRelative(-0.946f, 0.0f, -1.652f, -0.308f, -2.126f, -0.63f)
                arcToRelative(3.331f, 3.331f, 0.0f, false, true, -0.715f, -0.657f)
                lineToRelative(-0.014f, -0.02f)
                lineToRelative(-0.005f, -0.006f)
                lineToRelative(-0.002f, -0.003f)
                verticalLineToRelative(-0.002f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(0.613f, -0.432f)
                lineToRelative(-0.614f, 0.43f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.183f, -1.044f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(5.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(10.25f, 10.25f)
                lineTo(10.842f, 10.666f)
                arcToRelative(97.71f, 97.71f, 0.0f, false, false, -0.592f, -0.416f)
                close()
            }
        }
        .build()
        return _smiley16!!
    }

private var _smiley16: ImageVector? = null
