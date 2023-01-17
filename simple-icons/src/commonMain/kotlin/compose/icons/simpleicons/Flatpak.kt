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

public val SimpleIcons.Flatpak: ImageVector
    get() {
        if (_flatpak != null) {
            return _flatpak!!
        }
        _flatpak = Builder(name = "Flatpak", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.556f, 0.0f, -1.111f, 0.144f, -1.61f, 0.432f)
                lineToRelative(-7.603f, 4.39f)
                arcToRelative(3.217f, 3.217f, 0.0f, false, false, -1.61f, 2.788f)
                verticalLineToRelative(8.78f)
                curveToRelative(0.0f, 1.151f, 0.612f, 2.212f, 1.61f, 2.788f)
                lineToRelative(7.603f, 4.39f)
                arcToRelative(3.217f, 3.217f, 0.0f, false, false, 3.22f, 0.0f)
                lineToRelative(7.603f, -4.39f)
                arcToRelative(3.217f, 3.217f, 0.0f, false, false, 1.61f, -2.788f)
                lineTo(22.823f, 7.61f)
                arcToRelative(3.217f, 3.217f, 0.0f, false, false, -1.61f, -2.788f)
                lineTo(13.61f, 0.432f)
                arcTo(3.218f, 3.218f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.358f)
                curveToRelative(0.15f, 0.0f, 0.299f, 0.039f, 0.431f, 0.115f)
                lineToRelative(7.604f, 4.39f)
                curveToRelative(0.132f, 0.077f, 0.24f, 0.187f, 0.315f, 0.316f)
                lineTo(12.0f, 12.0f)
                verticalLineToRelative(9.642f)
                arcToRelative(0.863f, 0.863f, 0.0f, false, true, -0.431f, -0.116f)
                lineToRelative(-7.604f, -4.39f)
                arcToRelative(0.866f, 0.866f, 0.0f, false, true, -0.431f, -0.746f)
                lineTo(3.534f, 7.61f)
                curveToRelative(0.0f, -0.153f, 0.041f, -0.302f, 0.116f, -0.43f)
                lineTo(12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _flatpak!!
    }

private var _flatpak: ImageVector? = null
