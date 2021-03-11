package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Csharp: ImageVector
    get() {
        if (_csharp != null) {
            return _csharp!!
        }
        _csharp = Builder(name = "Csharp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(9.426f, 7.12f)
                arcToRelative(5.55f, 5.55f, 0.0f, false, true, 1.985f, 0.38f)
                verticalLineToRelative(1.181f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -2.25f, -0.566f)
                arcToRelative(3.439f, 3.439f, 0.0f, false, false, -2.625f, 1.087f)
                arcToRelative(4.099f, 4.099f, 0.0f, false, false, -1.012f, 2.906f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.945f, 2.754f)
                arcToRelative(3.217f, 3.217f, 0.0f, false, false, 2.482f, 1.023f)
                arcToRelative(4.657f, 4.657f, 0.0f, false, false, 2.464f, -0.634f)
                lineToRelative(-0.004f, 1.08f)
                arcToRelative(5.543f, 5.543f, 0.0f, false, true, -2.625f, 0.555f)
                arcToRelative(4.211f, 4.211f, 0.0f, false, true, -3.228f, -1.297f)
                arcToRelative(4.793f, 4.793f, 0.0f, false, true, -1.212f, -3.409f)
                arcToRelative(5.021f, 5.021f, 0.0f, false, true, 1.365f, -3.663f)
                arcToRelative(4.631f, 4.631f, 0.0f, false, true, 3.473f, -1.392f)
                arcToRelative(5.55f, 5.55f, 0.0f, false, true, 0.12f, -0.004f)
                arcToRelative(5.55f, 5.55f, 0.0f, false, true, 0.122f, 0.0f)
                close()
                moveTo(15.289f, 7.275f)
                horizontalLineToRelative(0.836f)
                lineToRelative(-0.555f, 2.652f)
                horizontalLineToRelative(1.661f)
                lineToRelative(0.567f, -2.652f)
                horizontalLineToRelative(0.81f)
                lineToRelative(-0.555f, 2.652f)
                lineToRelative(1.732f, -0.004f)
                lineToRelative(-0.15f, 0.697f)
                lineTo(17.91f, 10.62f)
                lineToRelative(-0.412f, 1.98f)
                horizontalLineToRelative(1.852f)
                lineToRelative(-0.176f, 0.698f)
                horizontalLineToRelative(-1.816f)
                lineToRelative(-0.58f, 2.625f)
                horizontalLineToRelative(-0.83f)
                lineToRelative(0.567f, -2.625f)
                horizontalLineToRelative(-1.65f)
                lineToRelative(-0.555f, 2.625f)
                horizontalLineToRelative(-0.81f)
                lineToRelative(0.555f, -2.625f)
                horizontalLineToRelative(-1.74f)
                lineToRelative(0.131f, -0.698f)
                horizontalLineToRelative(1.748f)
                lineToRelative(0.401f, -1.976f)
                horizontalLineToRelative(-1.826f)
                lineToRelative(0.138f, -0.697f)
                horizontalLineToRelative(1.826f)
                close()
                moveTo(15.431f, 10.62f)
                lineTo(15.0f, 12.6f)
                horizontalLineToRelative(1.673f)
                lineToRelative(0.423f, -1.98f)
                close()
            }
        }
        .build()
        return _csharp!!
    }

private var _csharp: ImageVector? = null
