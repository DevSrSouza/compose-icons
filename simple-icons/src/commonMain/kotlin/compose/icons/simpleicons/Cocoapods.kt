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

public val SimpleIcons.Cocoapods: ImageVector
    get() {
        if (_cocoapods != null) {
            return _cocoapods!!
        }
        _cocoapods = Builder(name = "Cocoapods", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.812f, 17.176f)
                curveToRelative(-2.968f, 0.0f, -4.956f, -2.308f, -4.956f, -5.176f)
                curveToRelative(0.0f, -2.705f, 1.776f, -5.176f, 4.91f, -5.176f)
                curveToRelative(2.407f, 0.0f, 3.856f, 1.445f, 4.207f, 3.357f)
                horizontalLineToRelative(3.95f)
                curveTo(16.479f, 6.427f, 13.51f, 3.42f, 8.718f, 3.42f)
                curveTo(3.131f, 3.42f, 0.0f, 7.523f, 0.0f, 12.0f)
                curveToRelative(0.0f, 4.57f, 3.295f, 8.58f, 8.766f, 8.58f)
                curveToRelative(4.58f, 0.0f, 7.549f, -2.822f, 8.18f, -6.272f)
                horizontalLineToRelative(-4.02f)
                curveToRelative(-0.467f, 1.609f, -1.916f, 2.868f, -4.114f, 2.868f)
                close()
                moveTo(24.0f, 12.068f)
                lineToRelative(-3.466f, 8.055f)
                lineToRelative(-2.38f, -1.022f)
                lineToRelative(2.992f, -7.055f)
                lineToRelative(-3.01f, -7.096f)
                lineToRelative(2.433f, -1.042f)
                close()
            }
        }
        .build()
        return _cocoapods!!
    }

private var _cocoapods: ImageVector? = null
