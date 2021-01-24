package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.UsersSlash: ImageVector
    get() {
        if (_usersSlash != null) {
            return _usersSlash!!
        }
        _usersSlash = Builder(name = "UsersSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.65f, 212.32f)
                lineTo(36.21f, 137.78f)
                arcTo(63.4f, 63.4f, 0.0f, false, false, 32.0f, 160.0f)
                arcToRelative(63.84f, 63.84f, 0.0f, false, false, 100.65f, 52.32f)
                close()
                moveTo(173.09f, 274.6f)
                arcTo(63.79f, 63.79f, 0.0f, false, false, 128.0f, 256.0f)
                lineTo(64.0f, 256.0f)
                arcTo(64.06f, 64.06f, 0.0f, false, false, 0.0f, 320.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                lineTo(97.91f, 384.0f)
                arcTo(146.62f, 146.62f, 0.0f, false, true, 173.09f, 274.6f)
                close()
                moveTo(544.0f, 224.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -64.0f, -64.0f)
                arcTo(64.06f, 64.06f, 0.0f, false, false, 544.0f, 224.0f)
                close()
                moveTo(500.56f, 355.11f)
                arcToRelative(114.24f, 114.24f, 0.0f, false, false, -84.47f, -65.28f)
                lineTo(361.0f, 247.23f)
                curveToRelative(41.46f, -16.3f, 71.0f, -55.92f, 71.0f, -103.23f)
                arcTo(111.93f, 111.93f, 0.0f, false, false, 320.0f, 32.0f)
                curveToRelative(-57.14f, 0.0f, -103.69f, 42.83f, -110.6f, 98.08f)
                lineTo(45.46f, 3.38f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 23.0f, 6.19f)
                lineTo(3.37f, 31.46f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 6.18f, 53.91f)
                lineTo(594.53f, 508.63f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 617.0f, 505.82f)
                lineToRelative(19.64f, -25.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -2.81f, -22.45f)
                close()
                moveTo(128.0f, 403.21f)
                lineTo(128.0f, 432.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, 48.0f)
                lineTo(464.0f, 480.0f)
                arcToRelative(47.45f, 47.45f, 0.0f, false, false, 12.57f, -1.87f)
                lineTo(232.0f, 289.13f)
                curveTo(173.74f, 294.83f, 128.0f, 343.42f, 128.0f, 403.21f)
                close()
                moveTo(576.0f, 256.0f)
                lineTo(512.0f, 256.0f)
                arcToRelative(63.79f, 63.79f, 0.0f, false, false, -45.09f, 18.6f)
                arcTo(146.29f, 146.29f, 0.0f, false, true, 542.0f, 384.0f)
                horizontalLineToRelative(66.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(640.0f, 320.0f)
                arcTo(64.06f, 64.06f, 0.0f, false, false, 576.0f, 256.0f)
                close()
            }
        }
        .build()
        return _usersSlash!!
    }

private var _usersSlash: ImageVector? = null
