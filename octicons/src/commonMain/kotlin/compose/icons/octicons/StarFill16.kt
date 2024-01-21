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

public val Octicons.StarFill16: ImageVector
    get() {
        if (_starFill16 != null) {
            return _starFill16!!
        }
        _starFill16 = Builder(name = "StarFill16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
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
            }
        }
        .build()
        return _starFill16!!
    }

private var _starFill16: ImageVector? = null
