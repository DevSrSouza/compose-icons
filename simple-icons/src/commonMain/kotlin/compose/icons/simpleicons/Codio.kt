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

public val SimpleIcons.Codio: ImageVector
    get() {
        if (_codio != null) {
            return _codio!!
        }
        _codio = Builder(name = "Codio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.997f, 24.0f)
                lineTo(1.605f, 17.997f)
                verticalLineToRelative(-12.0f)
                lineTo(12.0f, 0.0f)
                lineToRelative(10.396f, 5.997f)
                lineTo(16.5f, 9.402f)
                lineTo(12.0f, 6.8f)
                lineTo(7.496f, 9.4f)
                verticalLineToRelative(5.2f)
                lineToRelative(4.502f, 2.6f)
                lineToRelative(4.5f, -2.6f)
                lineToRelative(5.895f, 3.397f)
                lineTo(12.003f, 24.0f)
                horizontalLineToRelative(-0.006f)
                close()
            }
        }
        .build()
        return _codio!!
    }

private var _codio: ImageVector? = null
