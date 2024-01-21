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

public val SimpleIcons.Axios: ImageVector
    get() {
        if (_axios != null) {
            return _axios!!
        }
        _axios = Builder(name = "Axios", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0683f, 2.8997f)
                verticalLineTo(22.2973f)
                lineToRelative(-2.114f, 1.7026f)
                verticalLineTo(7.8638f)
                horizontalLineTo(4.975f)
                lineToRelative(6.0933f, -4.9641f)
                close()
                moveTo(14.9343f, 0.0f)
                verticalLineToRelative(15.7672f)
                horizontalLineTo(19.025f)
                lineToRelative(-6.2004f, 5.0887f)
                verticalLineTo(1.4689f)
                lineTo(14.9343f, 0.0f)
                close()
            }
        }
        .build()
        return _axios!!
    }

private var _axios: ImageVector? = null
