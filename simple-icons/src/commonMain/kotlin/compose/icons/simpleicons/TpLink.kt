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

public val SimpleIcons.Tplink: ImageVector
    get() {
        if (_tplink != null) {
            return _tplink!!
        }
        _tplink = Builder(name = "Tplink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.185f, 0.0f)
                curveTo(10.218f, 0.0f, 6.25f, 3.984f, 6.25f, 8.903f)
                verticalLineTo(10.8f)
                horizontalLineToRelative(4.99f)
                verticalLineTo(8.903f)
                curveToRelative(0.0f, -2.135f, 1.736f, -3.863f, 3.946f, -3.863f)
                curveToRelative(2.187f, 0.0f, 3.708f, 1.536f, 3.708f, 3.815f)
                curveToRelative(0.0f, 2.257f, -1.64f, 3.912f, -3.827f, 3.912f)
                horizontalLineToRelative(-1.878f)
                verticalLineToRelative(5.039f)
                horizontalLineToRelative(1.878f)
                curveToRelative(4.874f, 0.0f, 8.819f, -4.007f, 8.819f, -8.952f)
                curveTo(23.885f, 3.72f, 20.2f, 0.0f, 15.185f, 0.0f)
                close()
                moveTo(0.115f, 12.6f)
                verticalLineToRelative(4.103f)
                curveToRelative(0.0f, 0.624f, 0.523f, 1.248f, 1.236f, 1.248f)
                horizontalLineToRelative(4.753f)
                verticalLineToRelative(4.801f)
                curveToRelative(0.0f, 0.624f, 0.523f, 1.248f, 1.236f, 1.248f)
                horizontalLineToRelative(4.065f)
                verticalLineTo(12.6f)
                close()
            }
        }
        .build()
        return _tplink!!
    }

private var _tplink: ImageVector? = null
