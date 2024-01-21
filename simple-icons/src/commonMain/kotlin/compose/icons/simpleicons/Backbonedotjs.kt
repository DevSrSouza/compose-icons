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

public val SimpleIcons.Backbonedotjs: ImageVector
    get() {
        if (_backbonedotjs != null) {
            return _backbonedotjs!!
        }
        _backbonedotjs = Builder(name = "Backbonedotjs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.34f, 0.0f)
                verticalLineToRelative(10.45f)
                lineToRelative(3.2f, -1.83f)
                lineTo(5.54f, 5.27f)
                lineToRelative(2.93f, 1.67f)
                lineToRelative(3.01f, -1.72f)
                lineTo(2.34f, 0.0f)
                close()
                moveTo(21.65f, 0.0f)
                lineTo(12.5f, 5.22f)
                lineToRelative(3.02f, 1.73f)
                lineToRelative(2.94f, -1.68f)
                verticalLineToRelative(3.35f)
                lineToRelative(3.2f, 1.83f)
                lineTo(21.66f, 0.0f)
                horizontalLineToRelative(-0.01f)
                close()
                moveTo(11.75f, 5.64f)
                lineTo(2.35f, 11.02f)
                lineTo(2.35f, 24.0f)
                lineToRelative(9.4f, -5.36f)
                verticalLineToRelative(-3.76f)
                lineToRelative(-6.21f, 3.56f)
                verticalLineToRelative(-5.5f)
                lineToRelative(6.21f, -3.54f)
                lineTo(11.75f, 5.64f)
                close()
                moveTo(12.25f, 5.64f)
                lineTo(12.25f, 9.4f)
                lineToRelative(6.22f, 3.54f)
                verticalLineToRelative(5.5f)
                lineToRelative(-6.22f, -3.56f)
                verticalLineToRelative(3.76f)
                lineTo(21.66f, 24.0f)
                lineTo(21.66f, 11.02f)
                lineToRelative(-9.41f, -5.38f)
                close()
                moveTo(7.7f, 12.3f)
                lineToRelative(-1.65f, 0.94f)
                verticalLineToRelative(1.86f)
                lineToRelative(2.17f, 1.24f)
                lineToRelative(3.28f, -1.87f)
                lineToRelative(-3.8f, -2.17f)
                close()
                moveTo(16.31f, 12.3f)
                lineTo(12.51f, 14.46f)
                lineTo(15.79f, 16.34f)
                lineTo(17.96f, 15.1f)
                verticalLineToRelative(-1.86f)
                lineToRelative(-1.65f, -0.94f)
                close()
            }
        }
        .build()
        return _backbonedotjs!!
    }

private var _backbonedotjs: ImageVector? = null
