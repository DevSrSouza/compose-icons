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

public val SimpleIcons.Informatica: ImageVector
    get() {
        if (_informatica != null) {
            return _informatica!!
        }
        _informatica = Builder(name = "Informatica", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineToRelative(3.547f, 10.788f)
                lineToRelative(-4.5f, -1.255f)
                lineToRelative(-0.25f, 4.43f)
                lineToRelative(7.121f, 4.035f)
                lineTo(17.918f, 18.0f)
                horizontalLineToRelative(0.001f)
                lineToRelative(5.919f, -6.0f)
                close()
                moveTo(11.36f, 0.65f)
                lineTo(0.162f, 12.0f)
                lineToRelative(6.32f, 6.407f)
                lineTo(12.0f, 24.0f)
                lineToRelative(5.184f, -5.255f)
                lineToRelative(-9.736f, -3.856f)
                close()
            }
        }
        .build()
        return _informatica!!
    }

private var _informatica: ImageVector? = null
