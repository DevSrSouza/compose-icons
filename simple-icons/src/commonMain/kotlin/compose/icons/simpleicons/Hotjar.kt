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

public val SimpleIcons.Hotjar: ImageVector
    get() {
        if (_hotjar != null) {
            return _hotjar!!
        }
        _hotjar = Builder(name = "Hotjar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.119f, 9.814f)
                curveTo(12.899f, 8.27f, 16.704f, 6.155f, 16.704f, 0.0f)
                horizontalLineToRelative(-4.609f)
                curveToRelative(0.0f, 3.444f, -1.676f, 4.375f, -4.214f, 5.786f)
                curveTo(5.1f, 7.33f, 1.295f, 9.444f, 1.295f, 15.6f)
                horizontalLineToRelative(4.61f)
                curveToRelative(0.0f, -3.444f, 1.676f, -4.376f, 4.214f, -5.786f)
                close()
                moveTo(18.096f, 8.4f)
                curveToRelative(0.0f, 3.444f, -1.677f, 4.376f, -4.215f, 5.785f)
                curveToRelative(-2.778f, 1.544f, -6.585f, 3.66f, -6.585f, 9.815f)
                horizontalLineToRelative(4.609f)
                curveToRelative(0.0f, -3.444f, 1.676f, -4.376f, 4.214f, -5.786f)
                curveToRelative(2.78f, -1.544f, 6.586f, -3.658f, 6.586f, -9.814f)
                horizontalLineToRelative(-4.609f)
                close()
            }
        }
        .build()
        return _hotjar!!
    }

private var _hotjar: ImageVector? = null
