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

public val SimpleIcons.Beatsbydre: ImageVector
    get() {
        if (_beatsbydre != null) {
            return _beatsbydre!!
        }
        _beatsbydre = Builder(name = "Beatsbydre", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.01f, 15.6f)
                arcTo(3.599f, 3.599f, 0.0f, true, false, 8.41f, 12.0f)
                arcToRelative(3.599f, 3.599f, 0.0f, false, false, 3.6f, 3.6f)
                close()
                moveTo(12.01f, 0.002f)
                arcToRelative(11.998f, 11.998f, 0.0f, false, false, -3.6f, 0.552f)
                verticalLineToRelative(6.647f)
                arcTo(5.999f, 5.999f, 0.0f, true, true, 6.011f, 12.0f)
                lineTo(6.011f, 1.603f)
                arcTo(11.998f, 11.998f, 0.0f, true, false, 12.01f, 0.002f)
                close()
            }
        }
        .build()
        return _beatsbydre!!
    }

private var _beatsbydre: ImageVector? = null
