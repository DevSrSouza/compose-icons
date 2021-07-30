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

public val SimpleIcons.Espressif: ImageVector
    get() {
        if (_espressif != null) {
            return _espressif!!
        }
        _espressif = Builder(name = "Espressif", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.926f, 19.324f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, -2.983f, -6.754f)
                arcToRelative(7.44f, 7.44f, 0.0f, false, false, -3.828f, -1.554f)
                arcToRelative(0.697f, 0.697f, 0.0f, false, true, -0.606f, -0.731f)
                arcToRelative(0.674f, 0.674f, 0.0f, false, true, 0.743f, -0.617f)
                arcToRelative(8.97f, 8.97f, 0.0f, false, true, 8.0f, 9.805f)
                arcToRelative(7.828f, 7.828f, 0.0f, false, true, -0.298f, 1.542f)
                lineToRelative(1.989f, 0.56f)
                arcToRelative(11.039f, 11.039f, 0.0f, false, false, 1.714f, -0.651f)
                arcToRelative(12.159f, 12.159f, 0.0f, false, false, 0.217f, -2.343f)
                arcTo(12.57f, 12.57f, 0.0f, false, false, 7.212f, 6.171f)
                arcToRelative(5.53f, 5.53f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(4.354f, 4.354f, 0.0f, false, false, -2.16f, 1.337f)
                arcToRelative(4.274f, 4.274f, 0.0f, false, false, 1.909f, 6.856f)
                arcToRelative(9.896f, 9.896f, 0.0f, false, false, 1.074f, 0.195f)
                arcToRelative(4.011f, 4.011f, 0.0f, false, true, 3.337f, 3.954f)
                arcToRelative(3.965f, 3.965f, 0.0f, false, true, -0.64f, 2.16f)
                lineToRelative(1.371f, 0.88f)
                arcToRelative(10.182f, 10.182f, 0.0f, false, false, 2.057f, 0.342f)
                arcToRelative(7.52f, 7.52f, 0.0f, false, false, 0.754f, -2.628f)
                moveToRelative(0.16f, 4.73f)
                arcTo(13.073f, 13.073f, 0.0f, false, true, 0.001f, 10.983f)
                arcTo(12.982f, 12.982f, 0.0f, false, true, 3.83f, 1.737f)
                lineToRelative(0.743f, 0.697f)
                arcToRelative(12.067f, 12.067f, 0.0f, false, false, 0.0f, 17.141f)
                arcToRelative(12.067f, 12.067f, 0.0f, false, false, 17.141f, 0.0f)
                lineToRelative(0.697f, 0.697f)
                arcToRelative(12.97f, 12.97f, 0.0f, false, true, -9.336f, 3.726f)
                moveTo(24.0f, 10.993f)
                arcTo(10.993f, 10.993f, 0.0f, false, false, 12.949f, 0.0f)
                curveToRelative(-0.389f, 0.0f, -0.766f, 0.0f, -1.143f, 0.057f)
                lineToRelative(-0.252f, 0.732f)
                arcToRelative(18.912f, 18.912f, 0.0f, false, true, 11.588f, 11.576f)
                lineToRelative(0.731f, -0.263f)
                curveToRelative(0.0f, -0.366f, 0.069f, -0.732f, 0.069f, -1.143f)
                moveToRelative(-1.269f, 5.165f)
                arcTo(17.53f, 17.53f, 0.0f, false, false, 7.818f, 1.27f)
                arcToRelative(11.119f, 11.119f, 0.0f, false, false, -2.457f, 1.77f)
                verticalLineToRelative(1.635f)
                arcTo(13.919f, 13.919f, 0.0f, false, true, 19.268f, 18.57f)
                horizontalLineToRelative(1.634f)
                arcToRelative(11.713f, 11.713f, 0.0f, false, false, 1.771f, -2.446f)
                moveTo(7.92f, 17.884f)
                arcToRelative(1.691f, 1.691f, 0.0f, true, true, -1.69f, -1.691f)
                arcToRelative(1.691f, 1.691f, 0.0f, false, true, 1.69f, 1.691f)
            }
        }
        .build()
        return _espressif!!
    }

private var _espressif: ImageVector? = null
