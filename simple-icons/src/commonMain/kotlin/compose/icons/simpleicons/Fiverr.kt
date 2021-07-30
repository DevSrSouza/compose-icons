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

public val SimpleIcons.Fiverr: ImageVector
    get() {
        if (_fiverr != null) {
            return _fiverr!!
        }
        _fiverr = Builder(name = "Fiverr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.004f, 15.588f)
                arcToRelative(0.995f, 0.995f, 0.0f, true, false, 0.002f, -1.99f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, false, -0.002f, 1.99f)
                close()
                moveTo(22.008f, 11.883f)
                horizontalLineToRelative(-0.85f)
                curveToRelative(-0.546f, 0.0f, -0.84f, 0.41f, -0.84f, 1.092f)
                verticalLineToRelative(2.466f)
                horizontalLineToRelative(-1.61f)
                verticalLineToRelative(-3.558f)
                horizontalLineToRelative(-0.684f)
                curveToRelative(-0.547f, 0.0f, -0.84f, 0.41f, -0.84f, 1.092f)
                verticalLineToRelative(2.466f)
                horizontalLineToRelative(-1.61f)
                verticalLineToRelative(-4.874f)
                horizontalLineToRelative(1.61f)
                verticalLineToRelative(0.74f)
                curveToRelative(0.264f, -0.574f, 0.626f, -0.74f, 1.163f, -0.74f)
                horizontalLineToRelative(1.972f)
                verticalLineToRelative(0.74f)
                curveToRelative(0.264f, -0.574f, 0.625f, -0.74f, 1.162f, -0.74f)
                horizontalLineToRelative(0.527f)
                verticalLineToRelative(1.316f)
                close()
                moveTo(15.222f, 13.384f)
                horizontalLineToRelative(-3.359f)
                curveToRelative(0.088f, 0.546f, 0.43f, 0.858f, 1.006f, 0.858f)
                curveToRelative(0.43f, 0.0f, 0.732f, -0.175f, 0.83f, -0.487f)
                lineToRelative(1.425f, 0.4f)
                curveToRelative(-0.351f, 0.848f, -1.22f, 1.364f, -2.255f, 1.364f)
                curveToRelative(-1.748f, 0.0f, -2.549f, -1.355f, -2.549f, -2.515f)
                curveToRelative(0.0f, -1.14f, 0.703f, -2.505f, 2.45f, -2.505f)
                curveToRelative(1.856f, 0.0f, 2.471f, 1.384f, 2.471f, 2.408f)
                curveToRelative(0.0f, 0.224f, -0.01f, 0.37f, -0.02f, 0.477f)
                close()
                moveTo(13.66f, 12.439f)
                curveToRelative(-0.04f, -0.42f, -0.342f, -0.81f, -0.889f, -0.81f)
                curveToRelative(-0.508f, 0.0f, -0.81f, 0.225f, -0.908f, 0.81f)
                horizontalLineToRelative(1.797f)
                close()
                moveTo(7.508f, 15.44f)
                horizontalLineToRelative(1.416f)
                lineToRelative(1.767f, -4.874f)
                horizontalLineToRelative(-1.62f)
                lineToRelative(-0.86f, 2.837f)
                lineToRelative(-0.878f, -2.837f)
                lineTo(5.72f, 10.566f)
                lineToRelative(1.787f, 4.874f)
                close()
                moveTo(0.908f, 15.44f)
                lineTo(2.51f, 15.44f)
                verticalLineToRelative(-3.558f)
                horizontalLineToRelative(1.524f)
                verticalLineToRelative(3.558f)
                horizontalLineToRelative(1.591f)
                verticalLineToRelative(-4.874f)
                lineTo(2.51f, 10.566f)
                verticalLineToRelative(-0.302f)
                curveToRelative(0.0f, -0.332f, 0.235f, -0.536f, 0.606f, -0.536f)
                horizontalLineToRelative(0.918f)
                lineTo(4.034f, 8.412f)
                lineTo(2.85f, 8.412f)
                curveToRelative(-1.162f, 0.0f, -1.943f, 0.712f, -1.943f, 1.755f)
                verticalLineToRelative(0.4f)
                lineTo(0.0f, 10.567f)
                verticalLineToRelative(1.316f)
                horizontalLineToRelative(0.908f)
                verticalLineToRelative(3.558f)
                close()
            }
        }
        .build()
        return _fiverr!!
    }

private var _fiverr: ImageVector? = null
