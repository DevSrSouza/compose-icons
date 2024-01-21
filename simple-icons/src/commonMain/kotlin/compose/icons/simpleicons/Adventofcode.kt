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

public val SimpleIcons.Adventofcode: ImageVector
    get() {
        if (_adventofcode != null) {
            return _adventofcode!!
        }
        _adventofcode = Builder(name = "Adventofcode", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.05f, 13.236f)
                lineToRelative(6.498f, 9.606f)
                lineTo(18.91f, 24.0f)
                lineToRelative(-6.905f, -9.47f)
                lineTo(5.1f, 24.0f)
                lineToRelative(-1.637f, -1.158f)
                lineToRelative(6.498f, -9.606f)
                lineTo(0.553f, 9.22f)
                lineToRelative(0.615f, -1.69f)
                lineToRelative(9.596f, 3.463f)
                lineTo(11.087f, 0.0f)
                horizontalLineToRelative(1.826f)
                lineToRelative(0.323f, 10.993f)
                lineToRelative(9.596f, -3.462f)
                lineToRelative(0.615f, 1.69f)
                lineToRelative(-9.387f, 4.015f)
                close()
            }
        }
        .build()
        return _adventofcode!!
    }

private var _adventofcode: ImageVector? = null
