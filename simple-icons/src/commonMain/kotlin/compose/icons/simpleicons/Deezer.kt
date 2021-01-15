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

public val SimpleIcons.Deezer: ImageVector
    get() {
        if (_deezer != null) {
            return _deezer!!
        }
        _deezer = Builder(name = "Deezer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.81f, 4.16f)
                verticalLineToRelative(3.03f)
                lineTo(24.0f, 7.19f)
                lineTo(24.0f, 4.16f)
                horizontalLineToRelative(-5.19f)
                close()
                moveTo(6.27f, 8.38f)
                verticalLineToRelative(3.027f)
                horizontalLineToRelative(5.189f)
                lineTo(11.459f, 8.38f)
                horizontalLineToRelative(-5.19f)
                close()
                moveTo(18.81f, 8.38f)
                verticalLineToRelative(3.027f)
                lineTo(24.0f, 11.407f)
                lineTo(24.0f, 8.38f)
                horizontalLineToRelative(-5.19f)
                close()
                moveTo(6.27f, 12.594f)
                verticalLineToRelative(3.027f)
                horizontalLineToRelative(5.189f)
                verticalLineToRelative(-3.027f)
                horizontalLineToRelative(-5.19f)
                close()
                moveTo(12.541f, 12.594f)
                verticalLineToRelative(3.027f)
                horizontalLineToRelative(5.19f)
                verticalLineToRelative(-3.027f)
                horizontalLineToRelative(-5.19f)
                close()
                moveTo(18.811f, 12.594f)
                verticalLineToRelative(3.027f)
                lineTo(24.0f, 15.621f)
                verticalLineToRelative(-3.027f)
                horizontalLineToRelative(-5.19f)
                close()
                moveTo(0.0f, 16.81f)
                verticalLineToRelative(3.029f)
                horizontalLineToRelative(5.19f)
                verticalLineToRelative(-3.03f)
                lineTo(0.0f, 16.809f)
                close()
                moveTo(6.27f, 16.81f)
                verticalLineToRelative(3.029f)
                horizontalLineToRelative(5.189f)
                verticalLineToRelative(-3.03f)
                horizontalLineToRelative(-5.19f)
                close()
                moveTo(12.541f, 16.81f)
                verticalLineToRelative(3.029f)
                horizontalLineToRelative(5.19f)
                verticalLineToRelative(-3.03f)
                horizontalLineToRelative(-5.19f)
                close()
                moveTo(18.811f, 16.81f)
                verticalLineToRelative(3.029f)
                lineTo(24.0f, 19.839f)
                verticalLineToRelative(-3.03f)
                horizontalLineToRelative(-5.19f)
                close()
            }
        }
        .build()
        return _deezer!!
    }

private var _deezer: ImageVector? = null
