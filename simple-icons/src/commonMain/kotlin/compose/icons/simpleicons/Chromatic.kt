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

public val SimpleIcons.Chromatic: ImageVector
    get() {
        if (_chromatic != null) {
            return _chromatic!!
        }
        _chromatic = Builder(name = "Chromatic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(11.994f, 3.43f)
                arcToRelative(3.372f, 3.372f, 0.0f, false, true, 3.37f, 3.369f)
                verticalLineToRelative(2.199f)
                lineTo(9.628f, 5.689f)
                arcToRelative(4.261f, 4.261f, 0.0f, false, false, -0.688f, -0.32f)
                arcToRelative(3.351f, 3.351f, 0.0f, false, true, 3.053f, -1.94f)
                close()
                moveTo(7.496f, 6.03f)
                curveToRelative(0.588f, 0.0f, 1.17f, 0.156f, 1.684f, 0.452f)
                lineToRelative(5.734f, 3.311f)
                lineToRelative(-2.91f, 1.678f)
                lineToRelative(-3.6f, -2.076f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, -0.459f, 0.0f)
                lineTo(5.35f, 10.893f)
                curveToRelative(-0.22f, 0.126f, -0.428f, 0.27f, -0.621f, 0.433f)
                arcToRelative(3.349f, 3.349f, 0.0f, false, true, -0.155f, -3.61f)
                arcTo(3.385f, 3.385f, 0.0f, false, true, 7.496f, 6.03f)
                close()
                moveTo(16.219f, 6.045f)
                arcToRelative(3.383f, 3.383f, 0.0f, false, true, 3.205f, 1.672f)
                arcToRelative(3.37f, 3.37f, 0.0f, false, true, -1.235f, 4.6f)
                lineToRelative(-5.736f, 3.308f)
                verticalLineToRelative(-3.357f)
                lineToRelative(3.602f, -2.077f)
                arcToRelative(0.459f, 0.459f, 0.0f, false, false, 0.228f, -0.398f)
                lineTo(16.283f, 6.799f)
                curveToRelative(0.0f, -0.253f, -0.021f, -0.506f, -0.064f, -0.754f)
                close()
                moveTo(7.715f, 10.588f)
                verticalLineToRelative(6.617f)
                curveToRelative(0.0f, 0.254f, 0.021f, 0.505f, 0.066f, 0.754f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, -0.285f, 0.012f)
                arcToRelative(3.383f, 3.383f, 0.0f, false, true, -2.92f, -1.684f)
                arcToRelative(3.343f, 3.343f, 0.0f, false, true, -0.338f, -2.555f)
                arcToRelative(3.342f, 3.342f, 0.0f, false, true, 1.57f, -2.044f)
                lineToRelative(1.907f, -1.1f)
                close()
                moveTo(8.623f, 10.588f)
                lineTo(11.535f, 12.268f)
                verticalLineToRelative(4.152f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, 0.23f, 0.396f)
                lineToRelative(2.594f, 1.498f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.22f, 0.127f, 0.45f, 0.235f, 0.688f, 0.32f)
                arcToRelative(3.35f, 3.35f, 0.0f, false, true, -3.055f, 1.938f)
                arcToRelative(3.373f, 3.373f, 0.0f, false, true, -3.371f, -3.367f)
                verticalLineToRelative(-6.617f)
                close()
                moveTo(19.27f, 12.676f)
                arcToRelative(3.347f, 3.347f, 0.0f, false, true, 0.154f, 3.611f)
                arcToRelative(3.372f, 3.372f, 0.0f, false, true, -4.604f, 1.233f)
                lineToRelative(-1.908f, -1.1f)
                lineToRelative(5.738f, -3.309f)
                arcToRelative(4.31f, 4.31f, 0.0f, false, false, 0.62f, -0.435f)
                close()
            }
        }
        .build()
        return _chromatic!!
    }

private var _chromatic: ImageVector? = null
