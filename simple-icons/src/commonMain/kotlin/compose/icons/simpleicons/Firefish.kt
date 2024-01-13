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

public val SimpleIcons.Firefish: ImageVector
    get() {
        if (_firefish != null) {
            return _firefish!!
        }
        _firefish = Builder(name = "Firefish", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.771f, 0.0f)
                curveToRelative(-0.68f, -0.016f, -1.342f, 0.507f, -1.342f, 1.304f)
                lineTo(15.429f, 7.27f)
                curveToRelative(0.0f, 0.719f, 0.582f, 1.301f, 1.3f, 1.301f)
                horizontalLineToRelative(5.967f)
                curveToRelative(1.16f, 0.0f, 1.74f, -1.401f, 0.92f, -2.22f)
                lineTo(17.65f, 0.383f)
                arcToRelative(1.275f, 1.275f, 0.0f, false, false, -0.879f, -0.383f)
                close()
                moveTo(6.573f, 0.106f)
                curveToRelative(-0.672f, -0.017f, -1.326f, 0.5f, -1.326f, 1.287f)
                verticalLineToRelative(5.892f)
                curveToRelative(0.0f, 0.71f, 0.575f, 1.285f, 1.285f, 1.285f)
                horizontalLineToRelative(5.892f)
                curveToRelative(1.145f, 0.0f, 1.718f, -1.384f, 0.908f, -2.194f)
                lineTo(7.44f, 0.484f)
                arcToRelative(1.259f, 1.259f, 0.0f, false, false, -0.867f, -0.379f)
                close()
                moveTo(1.286f, 10.287f)
                curveToRelative(-0.71f, 0.0f, -1.286f, 0.576f, -1.286f, 1.286f)
                verticalLineToRelative(11.142f)
                curveTo(0.0f, 23.425f, 0.576f, 24.0f, 1.286f, 24.0f)
                horizontalLineToRelative(11.143f)
                curveToRelative(0.71f, 0.0f, 1.285f, -0.575f, 1.285f, -1.285f)
                lineTo(13.714f, 11.573f)
                curveToRelative(0.0f, -0.71f, -0.575f, -1.286f, -1.285f, -1.286f)
                close()
                moveTo(16.771f, 10.287f)
                curveToRelative(-0.68f, -0.017f, -1.342f, 0.507f, -1.342f, 1.304f)
                verticalLineToRelative(5.966f)
                curveToRelative(0.0f, 0.718f, 0.582f, 1.3f, 1.3f, 1.3f)
                horizontalLineToRelative(5.967f)
                curveToRelative(1.16f, 0.0f, 1.74f, -1.4f, 0.92f, -2.22f)
                lineTo(17.65f, 10.67f)
                arcToRelative(1.275f, 1.275f, 0.0f, false, false, -0.879f, -0.384f)
                close()
                moveTo(3.43f, 17.144f)
                arcToRelative(1.714f, 1.714f, 0.0f, true, true, 0.0f, 3.428f)
                arcToRelative(1.714f, 1.714f, 0.0f, false, true, 0.0f, -3.428f)
                close()
                moveTo(7.715f, 17.144f)
                arcToRelative(1.714f, 1.714f, 0.0f, true, true, 0.0f, 3.428f)
                arcToRelative(1.714f, 1.714f, 0.0f, false, true, 0.0f, -3.428f)
                close()
            }
        }
        .build()
        return _firefish!!
    }

private var _firefish: ImageVector? = null
