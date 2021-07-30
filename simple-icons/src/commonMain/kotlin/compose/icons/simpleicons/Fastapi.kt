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

public val SimpleIcons.Fastapi: ImageVector
    get() {
        if (_fastapi != null) {
            return _fastapi!!
        }
        _fastapi = Builder(name = "Fastapi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.375f, 0.0f, 0.0f, 5.375f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, 5.375f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.626f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.625f, -5.373f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(11.376f, 21.62f)
                verticalLineToRelative(-7.528f)
                lineTo(7.19f, 14.092f)
                lineTo(13.203f, 2.38f)
                verticalLineToRelative(7.528f)
                horizontalLineToRelative(4.029f)
                lineTo(11.376f, 21.62f)
                close()
            }
        }
        .build()
        return _fastapi!!
    }

private var _fastapi: ImageVector? = null
