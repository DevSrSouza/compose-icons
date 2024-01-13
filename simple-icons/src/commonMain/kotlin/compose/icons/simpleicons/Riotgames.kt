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

public val SimpleIcons.Riotgames: ImageVector
    get() {
        if (_riotgames != null) {
            return _riotgames!!
        }
        _riotgames = Builder(name = "Riotgames", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.458f, 0.86f)
                lineTo(0.0f, 7.093f)
                lineToRelative(3.353f, 12.761f)
                lineToRelative(2.552f, -0.313f)
                lineToRelative(-0.701f, -8.024f)
                lineToRelative(0.838f, -0.373f)
                lineToRelative(1.447f, 8.202f)
                lineToRelative(4.361f, -0.535f)
                lineToRelative(-0.775f, -8.857f)
                lineToRelative(0.83f, -0.37f)
                lineToRelative(1.591f, 9.025f)
                lineToRelative(4.412f, -0.542f)
                lineToRelative(-0.849f, -9.708f)
                lineToRelative(0.84f, -0.374f)
                lineToRelative(1.74f, 9.87f)
                lineTo(24.0f, 17.318f)
                lineTo(24.0f, 3.5f)
                close()
                moveTo(13.774f, 20.216f)
                lineTo(13.996f, 21.472f)
                lineTo(24.0f, 23.14f)
                verticalLineToRelative(-4.18f)
                lineToRelative(-10.22f, 1.256f)
                close()
            }
        }
        .build()
        return _riotgames!!
    }

private var _riotgames: ImageVector? = null
