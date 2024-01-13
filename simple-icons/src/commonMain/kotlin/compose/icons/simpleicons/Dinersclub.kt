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

public val SimpleIcons.Dinersclub: ImageVector
    get() {
        if (_dinersclub != null) {
            return _dinersclub!!
        }
        _dinersclub = Builder(name = "Dinersclub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.506f, 11.982f)
                arcToRelative(6.026f, 6.026f, 0.0f, false, false, -3.866f, -5.618f)
                lineTo(12.64f, 17.6f)
                arcToRelative(6.025f, 6.025f, 0.0f, false, false, 3.866f, -5.618f)
                close()
                moveTo(8.33f, 17.598f)
                lineTo(8.33f, 6.365f)
                arcToRelative(6.03f, 6.03f, 0.0f, false, false, -3.863f, 5.617f)
                arcToRelative(6.028f, 6.028f, 0.0f, false, false, 3.863f, 5.616f)
                close()
                moveTo(10.486f, 2.485f)
                arcTo(9.497f, 9.497f, 0.0f, false, false, 0.99f, 11.982f)
                arcToRelative(9.495f, 9.495f, 0.0f, false, false, 9.495f, 9.494f)
                curveToRelative(5.245f, 0.0f, 9.495f, -4.25f, 9.496f, -9.494f)
                arcToRelative(9.499f, 9.499f, 0.0f, false, false, -9.496f, -9.497f)
                close()
                moveTo(10.463f, 22.373f)
                curveTo(4.723f, 22.4f, 0.0f, 17.75f, 0.0f, 12.09f)
                curveTo(0.0f, 5.905f, 4.723f, 1.626f, 10.463f, 1.627f)
                horizontalLineToRelative(2.69f)
                curveTo(18.822f, 1.627f, 24.0f, 5.903f, 24.0f, 12.09f)
                curveToRelative(0.0f, 5.658f, -5.176f, 10.283f, -10.848f, 10.283f)
            }
        }
        .build()
        return _dinersclub!!
    }

private var _dinersclub: ImageVector? = null
