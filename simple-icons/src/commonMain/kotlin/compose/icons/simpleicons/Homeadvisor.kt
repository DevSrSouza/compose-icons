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

public val SimpleIcons.Homeadvisor: ImageVector
    get() {
        if (_homeadvisor != null) {
            return _homeadvisor!!
        }
        _homeadvisor = Builder(name = "Homeadvisor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.98f, 2.442f)
                horizontalLineTo(8.02f)
                lineTo(0.0f, 10.46f)
                horizontalLineToRelative(2.275f)
                lineToRelative(6.882f, -6.88f)
                lineToRelative(6.881f, 6.881f)
                horizontalLineTo(24.0f)
                lineToRelative(-8.02f, -8.018f)
                moveToRelative(-0.492f, 9.348f)
                lineTo(9.157f, 5.459f)
                lineTo(4.01f, 10.605f)
                verticalLineToRelative(4.987f)
                arcToRelative(1.33f, 1.33f, 0.0f, false, false, 1.329f, 1.329f)
                horizontalLineToRelative(6.077f)
                lineToRelative(4.637f, 4.637f)
                verticalLineToRelative(-4.637f)
                horizontalLineToRelative(2.598f)
                arcToRelative(1.33f, 1.33f, 0.0f, false, false, 1.33f, -1.33f)
                verticalLineTo(11.79f)
                horizontalLineToRelative(-4.494f)
                close()
            }
        }
        .build()
        return _homeadvisor!!
    }

private var _homeadvisor: ImageVector? = null
