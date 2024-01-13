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

public val SimpleIcons.Fedora: ImageVector
    get() {
        if (_fedora != null) {
            return _fedora!!
        }
        _fedora = Builder(name = "Fedora", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 0.0f)
                curveTo(5.376f, 0.0f, 0.008f, 5.369f, 0.004f, 11.992f)
                lineTo(0.002f, 11.992f)
                verticalLineToRelative(9.287f)
                horizontalLineToRelative(0.002f)
                arcTo(2.726f, 2.726f, 0.0f, false, false, 2.73f, 24.0f)
                horizontalLineToRelative(9.275f)
                curveToRelative(6.626f, -0.004f, 11.993f, -5.372f, 11.993f, -11.997f)
                curveTo(23.998f, 5.375f, 18.628f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(14.432f, 4.94f)
                curveToRelative(2.015f, 0.0f, 3.917f, 1.543f, 3.917f, 3.671f)
                curveToRelative(0.0f, 0.197f, 0.001f, 0.395f, -0.03f, 0.619f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, true, -1.137f, 0.893f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, true, -0.842f, -1.175f)
                arcToRelative(2.61f, 2.61f, 0.0f, false, false, 0.013f, -0.337f)
                curveToRelative(0.0f, -1.207f, -0.987f, -1.672f, -1.92f, -1.672f)
                curveToRelative(-0.934f, 0.0f, -1.775f, 0.784f, -1.777f, 1.672f)
                curveToRelative(0.016f, 1.027f, 0.0f, 2.046f, 0.0f, 3.07f)
                lineToRelative(1.732f, -0.012f)
                curveToRelative(1.352f, -0.028f, 1.368f, 2.009f, 0.016f, 1.998f)
                lineToRelative(-1.748f, 0.013f)
                curveToRelative(-0.004f, 0.826f, 0.006f, 0.677f, 0.002f, 1.093f)
                curveToRelative(0.0f, 0.0f, 0.015f, 1.01f, -0.016f, 1.776f)
                curveToRelative(-0.209f, 2.25f, -2.124f, 4.046f, -4.424f, 4.046f)
                curveToRelative(-2.438f, 0.0f, -4.448f, -1.993f, -4.448f, -4.437f)
                curveToRelative(0.073f, -2.515f, 2.078f, -4.492f, 4.603f, -4.469f)
                lineToRelative(1.409f, -0.01f)
                verticalLineToRelative(1.996f)
                lineToRelative(-1.409f, 0.013f)
                horizontalLineToRelative(-0.007f)
                curveToRelative(-1.388f, 0.04f, -2.577f, 0.984f, -2.6f, 2.47f)
                arcToRelative(2.438f, 2.438f, 0.0f, false, false, 2.452f, 2.439f)
                curveToRelative(1.356f, 0.0f, 2.441f, -0.987f, 2.441f, -2.437f)
                lineToRelative(-0.001f, -7.557f)
                curveToRelative(0.0f, -0.14f, 0.005f, -0.252f, 0.02f, -0.407f)
                curveToRelative(0.23f, -1.848f, 1.883f, -3.256f, 3.754f, -3.256f)
                close()
            }
        }
        .build()
        return _fedora!!
    }

private var _fedora: ImageVector? = null
