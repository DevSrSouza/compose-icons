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

public val Octicons.SignIn24: ImageVector
    get() {
        if (_signIn24 != null) {
            return _signIn24!!
        }
        _signIn24 = Builder(name = "SignIn24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.25f)
                curveToRelative(0.0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(17.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-5.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 3.0f, 20.75f)
                close()
                moveTo(12.994f, 12.75f)
                lineTo(16.294f, 16.234f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.088f, 1.032f)
                lineToRelative(-4.5f, -4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.032f)
                lineToRelative(4.5f, -4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.088f, 1.032f)
                lineToRelative(-3.3f, 3.484f)
                horizontalLineToRelative(8.256f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
            }
        }
        .build()
        return _signIn24!!
    }

private var _signIn24: ImageVector? = null
