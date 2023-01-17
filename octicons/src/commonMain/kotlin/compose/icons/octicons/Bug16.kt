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

public val Octicons.Bug16: ImageVector
    get() {
        if (_bug16 != null) {
            return _bug16!!
        }
        _bug16 = Builder(name = "Bug16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.72f, 0.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineToRelative(1.0f, 0.999f)
                arcToRelative(3.488f, 3.488f, 0.0f, false, true, 2.441f, 0.0f)
                lineToRelative(0.999f, -1.0f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, 1.265f, 0.332f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.205f, 0.729f)
                lineToRelative(-0.775f, 0.776f)
                curveToRelative(0.616f, 0.63f, 0.995f, 1.493f, 0.995f, 2.444f)
                verticalLineToRelative(0.327f)
                curveToRelative(0.0f, 0.1f, -0.009f, 0.197f, -0.025f, 0.292f)
                curveToRelative(0.408f, 0.14f, 0.764f, 0.392f, 1.029f, 0.722f)
                lineToRelative(1.968f, -0.787f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.556f, 1.392f)
                lineTo(13.0f, 7.258f)
                lineTo(13.0f, 9.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(13.0f, 10.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.409f, -0.049f, 0.806f, -0.141f, 1.186f)
                lineToRelative(2.17f, 0.868f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.557f, 1.392f)
                lineToRelative(-2.184f, -0.873f)
                arcTo(4.997f, 4.997f, 0.0f, false, true, 8.0f, 16.0f)
                arcToRelative(4.997f, 4.997f, 0.0f, false, true, -4.288f, -2.427f)
                lineToRelative(-2.183f, 0.873f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.558f, -1.392f)
                lineToRelative(2.17f, -0.868f)
                arcTo(5.036f, 5.036f, 0.0f, false, true, 3.0f, 11.0f)
                verticalLineToRelative(-0.5f)
                lineTo(0.75f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(3.0f, 9.0f)
                lineTo(3.0f, 7.258f)
                lineTo(0.971f, 6.446f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.558f, -1.392f)
                lineToRelative(1.967f, 0.787f)
                curveToRelative(0.265f, -0.33f, 0.62f, -0.583f, 1.03f, -0.722f)
                arcToRelative(1.677f, 1.677f, 0.0f, false, true, -0.026f, -0.292f)
                lineTo(4.5f, 4.5f)
                curveToRelative(0.0f, -0.951f, 0.38f, -1.814f, 0.995f, -2.444f)
                lineTo(4.72f, 1.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
                moveTo(5.25f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                lineTo(4.5f, 11.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 7.0f, 0.0f)
                lineTo(11.5f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(6.173f, 5.0f)
                horizontalLineToRelative(3.654f)
                arcTo(0.172f, 0.172f, 0.0f, false, false, 10.0f, 4.827f)
                lineTo(10.0f, 4.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                verticalLineToRelative(0.327f)
                curveToRelative(0.0f, 0.096f, 0.077f, 0.173f, 0.173f, 0.173f)
                close()
            }
        }
        .build()
        return _bug16!!
    }

private var _bug16: ImageVector? = null
