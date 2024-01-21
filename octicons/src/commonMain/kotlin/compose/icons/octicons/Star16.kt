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

public val Octicons.Star16: ImageVector
    get() {
        if (_star16 != null) {
            return _star16!!
        }
        _star16 = Builder(name = "Star16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.673f, 0.418f)
                lineToRelative(1.882f, 3.815f)
                lineToRelative(4.21f, 0.612f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.416f, 1.279f)
                lineToRelative(-3.046f, 2.97f)
                lineToRelative(0.719f, 4.192f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.088f, 0.791f)
                lineTo(8.0f, 12.347f)
                lineToRelative(-3.766f, 1.98f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.088f, -0.79f)
                lineToRelative(0.72f, -4.194f)
                lineTo(0.818f, 6.374f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.416f, -1.28f)
                lineToRelative(4.21f, -0.611f)
                lineTo(7.327f, 0.668f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 0.25f)
                close()
                moveTo(8.0f, 2.695f)
                lineTo(6.615f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.564f, 0.41f)
                lineToRelative(-3.097f, 0.45f)
                lineToRelative(2.24f, 2.184f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.216f, 0.664f)
                lineToRelative(-0.528f, 3.084f)
                lineToRelative(2.769f, -1.456f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.698f, 0.0f)
                lineToRelative(2.77f, 1.456f)
                lineToRelative(-0.53f, -3.084f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.216f, -0.664f)
                lineToRelative(2.24f, -2.183f)
                lineToRelative(-3.096f, -0.45f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.564f, -0.41f)
                lineTo(8.0f, 2.694f)
                close()
            }
        }
        .build()
        return _star16!!
    }

private var _star16: ImageVector? = null
