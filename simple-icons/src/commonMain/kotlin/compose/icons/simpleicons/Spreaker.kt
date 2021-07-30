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

public val SimpleIcons.Spreaker: ImageVector
    get() {
        if (_spreaker != null) {
            return _spreaker!!
        }
        _spreaker = Builder(name = "Spreaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.615f, 0.0f)
                lineToRelative(-5.64f, 6.54f)
                lineTo(0.529f, 4.718f)
                lineToRelative(8.68f, 7.372f)
                lineToRelative(-8.537f, 7.463f)
                lineToRelative(8.411f, -1.984f)
                lineTo(14.843f, 24.0f)
                lineToRelative(0.71f, -8.601f)
                lineToRelative(7.918f, -3.483f)
                lineToRelative(-7.963f, -3.33f)
                lineTo(14.621f, 0.0f)
                horizontalLineToRelative(-0.006f)
                close()
            }
        }
        .build()
        return _spreaker!!
    }

private var _spreaker: ImageVector? = null
