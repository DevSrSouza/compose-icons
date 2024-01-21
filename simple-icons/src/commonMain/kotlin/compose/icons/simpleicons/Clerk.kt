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

public val SimpleIcons.Clerk: ImageVector
    get() {
        if (_clerk != null) {
            return _clerk!!
        }
        _clerk = Builder(name = "Clerk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.47f, 20.829f)
                lineToRelative(-2.881f, -2.881f)
                arcToRelative(0.572f, 0.572f, 0.0f, false, false, -0.7f, -0.084f)
                arcToRelative(6.854f, 6.854f, 0.0f, false, true, -7.081f, 0.0f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, false, -0.7f, 0.084f)
                lineToRelative(-2.881f, 2.881f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, false, -0.103f, 0.69f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, 0.166f, 0.186f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.113f, 0.0f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, 0.239f, -0.423f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, false, -0.172f, -0.453f)
                close()
                moveTo(21.472f, 3.161f)
                lineTo(18.592f, 6.041f)
                arcToRelative(0.569f, 0.569f, 0.0f, false, true, -0.701f, 0.084f)
                arcTo(6.857f, 6.857f, 0.0f, false, false, 8.724f, 8.08f)
                arcToRelative(6.862f, 6.862f, 0.0f, false, false, -1.222f, 3.692f)
                arcToRelative(6.86f, 6.86f, 0.0f, false, false, 0.978f, 3.764f)
                arcToRelative(0.573f, 0.573f, 0.0f, false, true, -0.083f, 0.699f)
                lineToRelative(-2.881f, 2.88f)
                arcToRelative(0.567f, 0.567f, 0.0f, false, true, -0.864f, -0.063f)
                arcTo(11.993f, 11.993f, 0.0f, false, true, 6.771f, 2.7f)
                arcToRelative(11.99f, 11.99f, 0.0f, false, true, 14.637f, -0.405f)
                arcToRelative(0.566f, 0.566f, 0.0f, false, true, 0.232f, 0.418f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, -0.168f, 0.448f)
                close()
                moveTo(14.354f, 15.422f)
                arcToRelative(3.427f, 3.427f, 0.0f, true, false, 0.0f, -6.854f)
                arcToRelative(3.427f, 3.427f, 0.0f, false, false, 0.0f, 6.854f)
                close()
            }
        }
        .build()
        return _clerk!!
    }

private var _clerk: ImageVector? = null
