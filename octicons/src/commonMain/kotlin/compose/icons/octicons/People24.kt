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

public val Octicons.People24: ImageVector
    get() {
        if (_people24 != null) {
            return _people24!!
        }
        _people24 = Builder(name = "People24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 8.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 8.596f, 4.547f)
                arcToRelative(9.005f, 9.005f, 0.0f, false, true, 5.9f, 8.18f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.5f, 0.045f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -14.993f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.499f, -0.044f)
                arcToRelative(9.005f, 9.005f, 0.0f, false, true, 5.9f, -8.181f)
                arcTo(5.496f, 5.496f, 0.0f, false, true, 3.5f, 8.0f)
                close()
                moveTo(9.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(17.29f, 8.0f)
                curveToRelative(-0.148f, 0.0f, -0.292f, 0.01f, -0.434f, 0.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.212f, -1.484f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, true, 3.38f, 8.097f)
                arcToRelative(6.69f, 6.69f, 0.0f, false, true, 3.956f, 6.107f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                arcToRelative(5.193f, 5.193f, 0.0f, false, false, -3.696f, -4.972f)
                lineToRelative(-0.534f, -0.16f)
                verticalLineToRelative(-1.676f)
                lineToRelative(0.41f, -0.209f)
                arcTo(3.03f, 3.03f, 0.0f, false, false, 17.29f, 8.0f)
                close()
            }
        }
        .build()
        return _people24!!
    }

private var _people24: ImageVector? = null
