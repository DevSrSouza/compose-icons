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

public val SimpleIcons.Carthrottle: ImageVector
    get() {
        if (_carthrottle != null) {
            return _carthrottle!!
        }
        _carthrottle = Builder(name = "Carthrottle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 19.99f)
                horizontalLineToRelative(5.31f)
                lineToRelative(1.0f, -5.76f)
                horizontalLineToRelative(2.673f)
                lineTo(7.97f, 19.99f)
                horizontalLineToRelative(5.272f)
                lineToRelative(1.037f, -5.76f)
                horizontalLineToRelative(2.824f)
                lineToRelative(-1.0f, 5.76f)
                horizontalLineToRelative(7.584f)
                lineTo(21.9f, 17.029f)
                lineTo(24.0f, 4.01f)
                horizontalLineToRelative(-5.16f)
                lineToRelative(-0.987f, 5.647f)
                horizontalLineToRelative(-2.86f)
                lineToRelative(0.936f, -5.647f)
                horizontalLineTo(8.483f)
                lineToRelative(1.724f, 2.749f)
                lineToRelative(-0.487f, 2.898f)
                horizontalLineTo(6.996f)
                lineToRelative(0.9f, -5.647f)
                horizontalLineTo(0.35f)
                lineToRelative(1.76f, 2.774f)
                close()
            }
        }
        .build()
        return _carthrottle!!
    }

private var _carthrottle: ImageVector? = null
