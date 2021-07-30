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

public val SimpleIcons.Triller: ImageVector
    get() {
        if (_triller != null) {
            return _triller!!
        }
        _triller = Builder(name = "Triller", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.548f, 5.216f)
                lineTo(7.005f, 20.012f)
                lineToRelative(-0.29f, -0.167f)
                lineToRelative(8.54f, -14.788f)
                arcToRelative(9.365f, 9.365f, 0.0f, false, false, -6.07f, -0.906f)
                lineTo(2.73f, 15.333f)
                lineToRelative(-0.609f, 1.055f)
                arcToRelative(9.34f, 9.34f, 0.0f, false, false, 3.818f, 4.806f)
                lineToRelative(-1.522f, 2.64f)
                lineToRelative(0.289f, 0.166f)
                lineToRelative(2.303f, -3.987f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(9.367f, 9.367f, 0.0f, false, false, 6.068f, 0.905f)
                lineToRelative(6.321f, -10.945f)
                lineToRelative(0.287f, 0.167f)
                lineToRelative(-6.168f, 10.683f)
                lineToRelative(-0.964f, 1.67f)
                arcToRelative(9.322f, 9.322f, 0.0f, false, false, 7.55f, -7.555f)
                arcToRelative(9.267f, 9.267f, 0.0f, false, false, -0.413f, -4.802f)
                lineToRelative(2.299f, -3.982f)
                lineToRelative(-0.29f, -0.167f)
                lineTo(20.14f, 8.68f)
                arcToRelative(9.343f, 9.343f, 0.0f, false, false, -3.816f, -4.806f)
                close()
                moveTo(9.706f, 2.576f)
                arcToRelative(9.324f, 9.324f, 0.0f, false, false, -7.132f, 12.359f)
                lineTo(8.893f, 3.989f)
                lineToRelative(0.292f, 0.162f)
                lineTo(11.483f, 0.167f)
                lineTo(11.193f, 0.0f)
                close()
            }
        }
        .build()
        return _triller!!
    }

private var _triller: ImageVector? = null
