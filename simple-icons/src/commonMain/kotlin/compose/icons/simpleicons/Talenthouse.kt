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

public val SimpleIcons.Talenthouse: ImageVector
    get() {
        if (_talenthouse != null) {
            return _talenthouse!!
        }
        _talenthouse = Builder(name = "Talenthouse", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.373f, 7.42f)
                lineTo(22.373f, 0.0f)
                lineTo(1.627f, 0.0f)
                verticalLineToRelative(7.42f)
                horizontalLineToRelative(6.66f)
                lineTo(8.287f, 24.0f)
                horizontalLineToRelative(7.428f)
                lineTo(15.715f, 7.42f)
                horizontalLineToRelative(6.66f)
                close()
                moveTo(12.31f, 0.0f)
                horizontalLineToRelative(-0.623f)
                close()
                moveTo(12.306f, 3.41f)
                lineTo(12.306f, 0.618f)
                horizontalLineToRelative(8.865f)
                lineTo(17.652f, 3.41f)
                close()
                moveTo(6.358f, 3.41f)
                lineTo(2.83f, 0.618f)
                horizontalLineToRelative(8.857f)
                lineTo(11.687f, 3.41f)
                lineTo(6.358f, 3.41f)
                close()
                moveTo(5.75f, 3.718f)
                lineTo(2.247f, 6.478f)
                lineTo(2.247f, 0.949f)
                close()
                moveTo(2.837f, 6.802f)
                lineToRelative(3.52f, -2.781f)
                horizontalLineToRelative(4.894f)
                lineTo(8.46f, 6.8f)
                lineTo(2.837f, 6.8f)
                close()
                moveTo(8.905f, 7.24f)
                lineTo(11.685f, 4.458f)
                verticalLineToRelative(14.781f)
                lineToRelative(-1.602f, 2.046f)
                lineToRelative(-1.183f, 1.51f)
                close()
                moveTo(9.231f, 23.382f)
                lineTo(9.786f, 22.676f)
                lineTo(12.002f, 19.851f)
                lineTo(14.772f, 23.386f)
                close()
                moveTo(12.309f, 4.458f)
                lineTo(15.095f, 7.24f)
                verticalLineToRelative(15.556f)
                lineToRelative(-2.786f, -3.556f)
                close()
                moveTo(15.55f, 6.8f)
                lineToRelative(-2.8f, -2.78f)
                horizontalLineToRelative(4.904f)
                lineToRelative(3.519f, 2.78f)
                horizontalLineToRelative(-5.623f)
                close()
                moveTo(21.756f, 6.478f)
                lineTo(18.25f, 3.71f)
                lineTo(21.744f, 0.963f)
                lineToRelative(0.02f, -0.015f)
                close()
            }
        }
        .build()
        return _talenthouse!!
    }

private var _talenthouse: ImageVector? = null
