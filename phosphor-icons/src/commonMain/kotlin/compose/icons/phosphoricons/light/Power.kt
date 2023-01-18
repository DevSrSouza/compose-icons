package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.0f, 124.0f)
                lineTo(122.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(179.3f, 49.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 171.0f, 51.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 1.7f, 8.3f)
                arcToRelative(82.0f, 82.0f, 0.0f, true, true, -89.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.6f, -10.1f)
                arcToRelative(94.0f, 94.0f, 0.0f, true, false, 102.6f, 0.0f)
                close()
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
