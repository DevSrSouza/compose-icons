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

public val SimpleIcons.Marko: ImageVector
    get() {
        if (_marko != null) {
            return _marko!!
        }
        _marko = Builder(name = "Marko", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.4f, 5.46f)
                horizontalLineToRelative(-3.39f)
                lineToRelative(-2.3f, 3.77f)
                lineTo(7.4f, 5.46f)
                lineTo(4.0f, 5.46f)
                lineToRelative(-4.0f, 6.55f)
                lineToRelative(4.0f, 6.53f)
                horizontalLineToRelative(3.39f)
                lineToRelative(-4.0f, -6.54f)
                lineTo(5.7f, 8.23f)
                lineTo(8.01f, 12.0f)
                horizontalLineToRelative(3.39f)
                lineToRelative(2.31f, -3.78f)
                lineTo(16.03f, 12.0f)
                lineToRelative(-4.01f, 6.54f)
                horizontalLineToRelative(3.39f)
                lineToRelative(4.0f, -6.54f)
                close()
                moveTo(20.0f, 5.46f)
                horizontalLineToRelative(-3.39f)
                lineToRelative(4.0f, 6.54f)
                lineToRelative(-4.01f, 6.54f)
                horizontalLineToRelative(3.39f)
                lineTo(24.0f, 12.0f)
                close()
            }
        }
        .build()
        return _marko!!
    }

private var _marko: ImageVector? = null
