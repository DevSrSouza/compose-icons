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

public val SimpleIcons.Gradleplaypublisher: ImageVector
    get() {
        if (_gradleplaypublisher != null) {
            return _gradleplaypublisher!!
        }
        _gradleplaypublisher = Builder(name = "Gradleplaypublisher", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.191f, 6.777f)
                arcToRelative(1.409f, 1.409f, 0.0f, false, false, -1.384f, 1.41f)
                verticalLineToRelative(7.62f)
                arcToRelative(1.406f, 1.406f, 0.0f, false, false, 2.109f, 1.218f)
                lineToRelative(6.633f, -3.832f)
                arcToRelative(1.38f, 1.38f, 0.0f, false, false, 0.0f, -2.392f)
                lineTo(9.916f, 6.969f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, false, -0.725f, -0.192f)
                close()
                moveTo(9.572f, 8.107f)
                arcToRelative(0.895f, 0.895f, 0.0f, false, true, 0.602f, 0.106f)
                lineToRelative(5.22f, 3.014f)
                arcToRelative(0.896f, 0.896f, 0.0f, false, true, 0.0f, 1.546f)
                lineToRelative(-5.22f, 3.014f)
                arcToRelative(0.894f, 0.894f, 0.0f, false, true, -1.342f, -0.773f)
                lineTo(8.832f, 8.986f)
                arcToRelative(0.895f, 0.895f, 0.0f, false, true, 0.74f, -0.878f)
                close()
                moveTo(8.154f, 0.633f)
                curveTo(3.414f, 2.233f, 0.0f, 6.716f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.626f, 5.374f, 12.0f, 12.0f, 12.0f)
                curveToRelative(5.161f, 0.0f, 9.568f, -3.266f, 11.258f, -7.84f)
                lineToRelative(-3.838f, -0.844f)
                lineToRelative(-5.148f, 5.149f)
                lineToRelative(-8.465f, -2.272f)
                lineToRelative(-2.272f, -8.465f)
                lineToRelative(5.059f, -5.056f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.471f, 0.0f, -0.929f, 0.025f, -1.387f, 0.076f)
                lineToRelative(0.412f, 3.801f)
                lineToRelative(7.168f, 1.924f)
                lineToRelative(1.91f, 7.101f)
                lineToRelative(3.774f, 0.832f)
                curveToRelative(0.084f, -0.567f, 0.123f, -1.14f, 0.123f, -1.734f)
                curveToRelative(0.0f, -6.626f, -5.374f, -12.0f, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _gradleplaypublisher!!
    }

private var _gradleplaypublisher: ImageVector? = null
