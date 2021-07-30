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

public val SimpleIcons.Drooble: ImageVector
    get() {
        if (_drooble != null) {
            return _drooble!!
        }
        _drooble = Builder(name = "Drooble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.986f)
                arcToRelative(7.599f, 7.599f, 0.0f, false, false, -7.0f, -7.559f)
                verticalLineToRelative(7.574f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -10.0f, 0.0f)
                curveToRelative(0.0f, -3.604f, 3.707f, -6.022f, 7.0f, -4.583f)
                verticalLineTo(0.17f)
                curveTo(6.615f, -1.069f, 0.0f, 4.63f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.628f, 5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.372f, 12.0f, -12.0f)
                verticalLineToRelative(-0.014f)
                moveToRelative(-14.0f, 0.015f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                moveToRelative(14.0f, -0.015f)
                arcToRelative(7.599f, 7.599f, 0.0f, false, false, -7.0f, -7.559f)
                verticalLineToRelative(7.574f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -10.0f, 0.0f)
                curveToRelative(0.0f, -3.604f, 3.707f, -6.022f, 7.0f, -4.583f)
                verticalLineTo(0.17f)
                curveTo(6.615f, -1.069f, 0.0f, 4.63f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.628f, 5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.372f, 12.0f, -12.0f)
                verticalLineToRelative(-0.014f)
                moveToRelative(-14.0f, 0.015f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _drooble!!
    }

private var _drooble: ImageVector? = null
