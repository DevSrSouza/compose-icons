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

public val SimpleIcons.Natsdotio: ImageVector
    get() {
        if (_natsdotio != null) {
            return _natsdotio!!
        }
        _natsdotio = Builder(name = "Natsdotio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.004f, 0.0f)
                lineTo(0.404f, 0.0f)
                verticalLineToRelative(18.807f)
                horizontalLineToRelative(9.938f)
                lineToRelative(1.714f, 1.602f)
                verticalLineToRelative(-0.026f)
                lineTo(15.966f, 24.0f)
                verticalLineToRelative(-5.193f)
                horizontalLineToRelative(7.63f)
                lineTo(23.596f, 0.0f)
                lineTo(12.003f, 0.0f)
                close()
                moveTo(19.582f, 14.45f)
                lineTo(15.38f, 14.45f)
                lineTo(6.898f, 6.519f)
                verticalLineToRelative(7.93f)
                lineTo(4.116f, 14.449f)
                lineTo(4.116f, 4.376f)
                horizontalLineToRelative(4.349f)
                lineToRelative(8.344f, 7.784f)
                lineTo(16.809f, 4.375f)
                horizontalLineToRelative(2.773f)
                lineTo(19.582f, 14.45f)
                close()
            }
        }
        .build()
        return _natsdotio!!
    }

private var _natsdotio: ImageVector? = null
