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

public val SimpleIcons.Opel: ImageVector
    get() {
        if (_opel != null) {
            return _opel!!
        }
        _opel = Builder(name = "Opel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.291f, 4.57f)
                arcToRelative(7.46f, 7.46f, 0.0f, false, false, -7.338f, 5.006f)
                horizontalLineToRelative(0.568f)
                arcToRelative(6.926f, 6.926f, 0.0f, false, true, 6.483f, -4.494f)
                arcToRelative(6.922f, 6.922f, 0.0f, false, true, 6.922f, 6.924f)
                curveToRelative(0.0f, 0.116f, 0.0f, 0.234f, -0.01f, 0.351f)
                lineToRelative(0.533f, 0.059f)
                curveToRelative(0.0f, -0.134f, 0.01f, -0.273f, 0.01f, -0.4f)
                arcToRelative(7.46f, 7.46f, 0.0f, false, false, -7.168f, -7.446f)
                close()
                moveTo(0.869f, 10.113f)
                lineTo(0.0f, 10.566f)
                lineToRelative(13.25f, 1.44f)
                lineToRelative(3.63f, -1.893f)
                lineTo(0.87f, 10.113f)
                close()
                moveTo(4.551f, 11.596f)
                verticalLineToRelative(0.41f)
                arcToRelative(7.46f, 7.46f, 0.0f, false, false, 14.498f, 2.441f)
                horizontalLineToRelative(-0.57f)
                arcToRelative(6.924f, 6.924f, 0.0f, false, true, -6.475f, 4.487f)
                arcToRelative(6.928f, 6.928f, 0.0f, false, true, -6.92f, -6.928f)
                verticalLineToRelative(-0.352f)
                lineToRelative(-0.533f, -0.058f)
                close()
                moveTo(10.744f, 12.01f)
                lineTo(7.114f, 13.908f)
                horizontalLineToRelative(16.011f)
                lineToRelative(0.873f, -0.453f)
                verticalLineToRelative(-0.006f)
                lineToRelative(-13.254f, -1.44f)
                close()
                moveTo(23.998f, 13.45f)
                lineTo(24.0f, 13.45f)
                lineToRelative(-0.002f, -0.007f)
                verticalLineToRelative(0.006f)
                close()
            }
        }
        .build()
        return _opel!!
    }

private var _opel: ImageVector? = null
