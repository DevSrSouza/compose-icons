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

public val SimpleIcons.Rootssage: ImageVector
    get() {
        if (_rootssage != null) {
            return _rootssage!!
        }
        _rootssage = Builder(name = "Rootssage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.384f, 4.232f)
                lineToRelative(1.71f, 5.075f)
                lineToRelative(-4.478f, -3.136f)
                lineTo(0.0f, 9.403f)
                lineToRelative(1.753f, 5.2f)
                lineToRelative(0.01f, 0.03f)
                lineTo(7.3f, 14.633f)
                lineTo(2.82f, 17.77f)
                lineToRelative(1.754f, 5.2f)
                lineToRelative(0.01f, 0.03f)
                horizontalLineToRelative(5.705f)
                lineTo(12.0f, 17.925f)
                lineToRelative(1.7f, 5.045f)
                lineToRelative(0.01f, 0.03f)
                horizontalLineToRelative(5.707f)
                lineToRelative(1.763f, -5.23f)
                lineToRelative(-4.48f, -3.137f)
                horizontalLineToRelative(5.537f)
                lineTo(24.0f, 9.403f)
                lineToRelative(-4.616f, -3.232f)
                lineToRelative(-4.479f, 3.136f)
                lineToRelative(1.711f, -5.075f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(7.489f, 14.574f)
                lineToRelative(1.723f, -5.111f)
                horizontalLineToRelative(5.576f)
                lineToRelative(1.723f, 5.111f)
                lineToRelative(-4.51f, 3.16f)
                close()
            }
        }
        .build()
        return _rootssage!!
    }

private var _rootssage: ImageVector? = null
