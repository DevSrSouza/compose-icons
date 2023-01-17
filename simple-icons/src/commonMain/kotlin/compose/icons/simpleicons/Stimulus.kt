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

public val SimpleIcons.Stimulus: ImageVector
    get() {
        if (_stimulus != null) {
            return _stimulus!!
        }
        _stimulus = Builder(name = "Stimulus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.704f, 0.0f)
                arcTo(0.704f, 0.704f, 0.0f, false, false, 0.0f, 0.704f)
                verticalLineToRelative(2.824f)
                horizontalLineToRelative(5.648f)
                arcToRelative(3.064f, 3.064f, 0.0f, false, true, 1.312f, 0.36f)
                lineToRelative(3.232f, 1.9f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.0f, 0.712f)
                lineToRelative(-1.536f, 0.904f)
                arcToRelative(1.308f, 1.308f, 0.0f, false, true, -1.2f, 0.0f)
                lineToRelative(-1.2f, -0.7f)
                arcToRelative(3.084f, 3.084f, 0.0f, false, false, -1.316f, -0.36f)
                lineTo(0.0f, 6.344f)
                verticalLineToRelative(4.236f)
                horizontalLineToRelative(4.94f)
                arcToRelative(3.028f, 3.028f, 0.0f, false, false, 1.316f, -0.36f)
                lineToRelative(10.8f, -6.344f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, 1.312f, -0.36f)
                lineTo(24.0f, 3.516f)
                lineTo(24.0f, 0.692f)
                arcTo(0.704f, 0.704f, 0.0f, false, false, 23.296f, 0.0f)
                close()
                moveTo(19.06f, 6.352f)
                arcToRelative(3.084f, 3.084f, 0.0f, false, false, -1.316f, 0.36f)
                lineToRelative(-10.8f, 6.348f)
                arcToRelative(3.064f, 3.064f, 0.0f, false, true, -1.312f, 0.36f)
                lineTo(0.0f, 13.42f)
                verticalLineToRelative(4.236f)
                horizontalLineToRelative(4.94f)
                arcToRelative(3.084f, 3.084f, 0.0f, false, false, 1.316f, -0.36f)
                lineToRelative(10.8f, -6.348f)
                arcToRelative(3.064f, 3.064f, 0.0f, false, true, 1.312f, -0.36f)
                lineTo(24.0f, 10.588f)
                lineTo(24.0f, 6.352f)
                horizontalLineToRelative(-3.376f)
                close()
                moveTo(19.06f, 13.424f)
                arcToRelative(3.084f, 3.084f, 0.0f, false, false, -1.316f, 0.36f)
                lineToRelative(-10.8f, 6.344f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, -1.312f, 0.36f)
                lineTo(0.0f, 20.488f)
                verticalLineToRelative(2.824f)
                arcTo(0.708f, 0.708f, 0.0f, false, false, 0.704f, 24.0f)
                horizontalLineToRelative(22.592f)
                arcToRelative(0.708f, 0.708f, 0.0f, false, false, 0.704f, -0.7f)
                verticalLineToRelative(-2.824f)
                horizontalLineToRelative(-5.648f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, -1.312f, -0.36f)
                lineToRelative(-3.232f, -1.896f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.0f, -0.716f)
                lineToRelative(1.536f, -0.9f)
                arcToRelative(1.308f, 1.308f, 0.0f, false, true, 1.2f, 0.0f)
                lineToRelative(1.2f, 0.696f)
                arcToRelative(3.028f, 3.028f, 0.0f, false, false, 1.316f, 0.36f)
                lineTo(24.0f, 17.66f)
                verticalLineToRelative(-4.236f)
                horizontalLineToRelative(-3.376f)
                close()
            }
        }
        .build()
        return _stimulus!!
    }

private var _stimulus: ImageVector? = null
