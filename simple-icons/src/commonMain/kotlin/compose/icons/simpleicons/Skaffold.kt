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

public val SimpleIcons.Skaffold: ImageVector
    get() {
        if (_skaffold != null) {
            return _skaffold!!
        }
        _skaffold = Builder(name = "Skaffold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.602f, 20.097f)
                lineTo(24.0f, 20.097f)
                verticalLineToRelative(3.836f)
                lineTo(6.602f, 23.933f)
                verticalLineToRelative(-3.836f)
                close()
                moveTo(3.836f, 13.405f)
                horizontalLineToRelative(13.562f)
                verticalLineToRelative(3.837f)
                lineTo(0.0f, 17.242f)
                lineTo(0.0f, 6.714f)
                horizontalLineToRelative(3.836f)
                verticalLineToRelative(6.691f)
                close()
                moveTo(17.398f, 3.903f)
                lineTo(0.0f, 3.903f)
                lineTo(0.0f, 0.067f)
                horizontalLineToRelative(17.398f)
                verticalLineToRelative(3.836f)
                close()
                moveTo(20.164f, 10.595f)
                lineTo(6.602f, 10.595f)
                lineTo(6.602f, 6.758f)
                lineTo(24.0f, 6.758f)
                verticalLineToRelative(10.528f)
                horizontalLineToRelative(-3.836f)
                verticalLineToRelative(-6.691f)
                close()
            }
        }
        .build()
        return _skaffold!!
    }

private var _skaffold: ImageVector? = null
