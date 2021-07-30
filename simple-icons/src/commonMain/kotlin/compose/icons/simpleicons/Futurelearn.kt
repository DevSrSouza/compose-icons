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

public val SimpleIcons.Futurelearn: ImageVector
    get() {
        if (_futurelearn != null) {
            return _futurelearn!!
        }
        _futurelearn = Builder(name = "Futurelearn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.081f, 0.61f)
                verticalLineToRelative(7.566f)
                horizontalLineToRelative(-7.223f)
                verticalLineToRelative(6.661f)
                horizontalLineTo(7.566f)
                verticalLineToRelative(6.634f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(1.92f)
                horizontalLineToRelative(9.471f)
                verticalLineToRelative(-6.649f)
                horizontalLineToRelative(7.306f)
                verticalLineToRelative(-6.66f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.61f)
                close()
            }
        }
        .build()
        return _futurelearn!!
    }

private var _futurelearn: ImageVector? = null
