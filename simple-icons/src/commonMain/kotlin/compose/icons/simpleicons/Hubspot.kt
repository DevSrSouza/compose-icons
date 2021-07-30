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

public val SimpleIcons.Hubspot: ImageVector
    get() {
        if (_hubspot != null) {
            return _hubspot!!
        }
        _hubspot = Builder(name = "Hubspot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.164f, 7.93f)
                lineTo(18.164f, 5.084f)
                arcToRelative(2.198f, 2.198f, 0.0f, false, false, 1.267f, -1.978f)
                verticalLineToRelative(-0.067f)
                arcTo(2.2f, 2.2f, 0.0f, false, false, 17.238f, 0.845f)
                horizontalLineToRelative(-0.067f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -2.193f, 2.193f)
                verticalLineToRelative(0.067f)
                arcToRelative(2.196f, 2.196f, 0.0f, false, false, 1.252f, 1.973f)
                lineToRelative(0.013f, 0.006f)
                verticalLineToRelative(2.852f)
                arcToRelative(6.22f, 6.22f, 0.0f, false, false, -2.969f, 1.31f)
                lineToRelative(0.012f, -0.01f)
                lineToRelative(-7.828f, -6.095f)
                arcTo(2.497f, 2.497f, 0.0f, true, false, 4.3f, 4.656f)
                lineToRelative(-0.012f, 0.006f)
                lineToRelative(7.697f, 5.991f)
                arcToRelative(6.176f, 6.176f, 0.0f, false, false, -1.038f, 3.446f)
                curveToRelative(0.0f, 1.343f, 0.425f, 2.588f, 1.147f, 3.607f)
                lineToRelative(-0.013f, -0.02f)
                lineToRelative(-2.342f, 2.343f)
                arcToRelative(1.968f, 1.968f, 0.0f, false, false, -0.58f, -0.095f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(2.033f, 2.033f, 0.0f, true, false, 2.033f, 2.033f)
                arcToRelative(1.978f, 1.978f, 0.0f, false, false, -0.1f, -0.595f)
                lineToRelative(0.005f, 0.014f)
                lineToRelative(2.317f, -2.317f)
                arcToRelative(6.247f, 6.247f, 0.0f, true, false, 4.782f, -11.134f)
                lineToRelative(-0.036f, -0.005f)
                close()
                moveTo(17.2f, 17.308f)
                arcToRelative(3.206f, 3.206f, 0.0f, true, true, 3.215f, -3.207f)
                verticalLineToRelative(0.002f)
                arcToRelative(3.206f, 3.206f, 0.0f, false, true, -3.207f, 3.207f)
                close()
            }
        }
        .build()
        return _hubspot!!
    }

private var _hubspot: ImageVector? = null
