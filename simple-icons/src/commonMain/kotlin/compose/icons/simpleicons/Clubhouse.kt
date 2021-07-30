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

public val SimpleIcons.Clubhouse: ImageVector
    get() {
        if (_clubhouse != null) {
            return _clubhouse!!
        }
        _clubhouse = Builder(name = "Clubhouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.184f, 2.654f)
                lineToRelative(-10.967f, 3.5f)
                lineTo(12.217f, 2.696f)
                lineTo(0.39f, 6.47f)
                verticalLineToRelative(10.025f)
                lineToRelative(10.2f, -3.258f)
                verticalLineToRelative(3.441f)
                lineToRelative(13.41f, -4.275f)
                lineToRelative(-3.634f, -3.55f)
                close()
                moveTo(10.592f, 4.929f)
                verticalLineToRelative(6.592f)
                lineToRelative(-8.567f, 2.733f)
                lineTo(2.025f, 7.662f)
                close()
                moveTo(20.275f, 5.296f)
                lineToRelative(-1.85f, 3.9f)
                lineToRelative(2.542f, 2.467f)
                lineToRelative(-8.75f, 2.791f)
                lineTo(12.217f, 7.871f)
                close()
                moveTo(1.741f, 17.863f)
                curveToRelative(-0.958f, 0.0f, -1.741f, 0.783f, -1.741f, 1.741f)
                curveToRelative(0.0f, 0.959f, 0.783f, 1.742f, 1.741f, 1.742f)
                arcToRelative(1.74f, 1.74f, 0.0f, true, false, 0.0f, -3.483f)
                close()
            }
        }
        .build()
        return _clubhouse!!
    }

private var _clubhouse: ImageVector? = null
