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

public val SimpleIcons.Favro: ImageVector
    get() {
        if (_favro != null) {
            return _favro!!
        }
        _favro = Builder(name = "Favro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.586f, 1.655f)
                arcToRelative(6.623f, 6.623f, 0.0f, false, false, -6.62f, 6.62f)
                verticalLineToRelative(0.773f)
                arcToRelative(7.503f, 7.503f, 0.0f, false, true, 3.31f, 3.269f)
                lineTo(8.276f, 8.276f)
                arcToRelative(3.302f, 3.302f, 0.0f, false, true, 3.31f, -3.31f)
                arcTo(1.66f, 1.66f, 0.0f, false, false, 13.24f, 3.31f)
                arcToRelative(1.66f, 1.66f, 0.0f, false, false, -1.656f, -1.655f)
                close()
                moveTo(1.656f, 9.103f)
                arcTo(1.66f, 1.66f, 0.0f, false, false, 0.0f, 10.758f)
                curveToRelative(0.0f, 0.91f, 0.745f, 1.655f, 1.655f, 1.655f)
                arcToRelative(3.302f, 3.302f, 0.0f, false, true, 3.31f, 3.31f)
                verticalLineToRelative(4.966f)
                curveToRelative(0.0f, 0.91f, 0.745f, 1.655f, 1.655f, 1.655f)
                arcToRelative(1.66f, 1.66f, 0.0f, false, false, 1.655f, -1.655f)
                verticalLineToRelative(-4.966f)
                arcToRelative(6.623f, 6.623f, 0.0f, false, false, -6.62f, -6.621f)
                close()
                moveTo(17.38f, 9.103f)
                arcToRelative(6.623f, 6.623f, 0.0f, false, false, -6.622f, 6.621f)
                arcToRelative(6.623f, 6.623f, 0.0f, false, false, 6.622f, 6.621f)
                arcToRelative(6.583f, 6.583f, 0.0f, false, false, 3.462f, -0.979f)
                curveToRelative(0.262f, 0.58f, 0.84f, 0.98f, 1.503f, 0.98f)
                arcTo(1.66f, 1.66f, 0.0f, false, false, 24.0f, 20.69f)
                verticalLineToRelative(-9.93f)
                arcToRelative(1.66f, 1.66f, 0.0f, false, false, -1.655f, -1.655f)
                curveToRelative(-0.676f, 0.0f, -1.241f, 0.4f, -1.503f, 0.979f)
                arcToRelative(6.574f, 6.574f, 0.0f, false, false, -3.462f, -0.98f)
                close()
                moveTo(17.38f, 12.414f)
                arcToRelative(3.303f, 3.303f, 0.0f, false, true, 3.31f, 3.31f)
                arcToRelative(3.303f, 3.303f, 0.0f, false, true, -3.31f, 3.31f)
                arcToRelative(3.302f, 3.302f, 0.0f, false, true, -3.31f, -3.31f)
                arcToRelative(3.303f, 3.303f, 0.0f, false, true, 3.31f, -3.31f)
                close()
            }
        }
        .build()
        return _favro!!
    }

private var _favro: ImageVector? = null
