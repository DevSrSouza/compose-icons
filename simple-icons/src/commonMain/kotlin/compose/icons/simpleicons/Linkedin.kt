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

public val SimpleIcons.Linkedin: ImageVector
    get() {
        if (_linkedin != null) {
            return _linkedin!!
        }
        _linkedin = Builder(name = "Linkedin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.447f, 20.452f)
                horizontalLineToRelative(-3.554f)
                verticalLineToRelative(-5.569f)
                curveToRelative(0.0f, -1.328f, -0.027f, -3.037f, -1.852f, -3.037f)
                curveToRelative(-1.853f, 0.0f, -2.136f, 1.445f, -2.136f, 2.939f)
                verticalLineToRelative(5.667f)
                lineTo(9.351f, 20.452f)
                lineTo(9.351f, 9.0f)
                horizontalLineToRelative(3.414f)
                verticalLineToRelative(1.561f)
                horizontalLineToRelative(0.046f)
                curveToRelative(0.477f, -0.9f, 1.637f, -1.85f, 3.37f, -1.85f)
                curveToRelative(3.601f, 0.0f, 4.267f, 2.37f, 4.267f, 5.455f)
                verticalLineToRelative(6.286f)
                close()
                moveTo(5.337f, 7.433f)
                curveToRelative(-1.144f, 0.0f, -2.063f, -0.926f, -2.063f, -2.065f)
                curveToRelative(0.0f, -1.138f, 0.92f, -2.063f, 2.063f, -2.063f)
                curveToRelative(1.14f, 0.0f, 2.064f, 0.925f, 2.064f, 2.063f)
                curveToRelative(0.0f, 1.139f, -0.925f, 2.065f, -2.064f, 2.065f)
                close()
                moveTo(7.119f, 20.452f)
                lineTo(3.555f, 20.452f)
                lineTo(3.555f, 9.0f)
                horizontalLineToRelative(3.564f)
                verticalLineToRelative(11.452f)
                close()
                moveTo(22.225f, 0.0f)
                lineTo(1.771f, 0.0f)
                curveTo(0.792f, 0.0f, 0.0f, 0.774f, 0.0f, 1.729f)
                verticalLineToRelative(20.542f)
                curveTo(0.0f, 23.227f, 0.792f, 24.0f, 1.771f, 24.0f)
                horizontalLineToRelative(20.451f)
                curveTo(23.2f, 24.0f, 24.0f, 23.227f, 24.0f, 22.271f)
                lineTo(24.0f, 1.729f)
                curveTo(24.0f, 0.774f, 23.2f, 0.0f, 22.222f, 0.0f)
                horizontalLineToRelative(0.003f)
                close()
            }
        }
        .build()
        return _linkedin!!
    }

private var _linkedin: ImageVector? = null
