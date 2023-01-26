package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Brightness3: ImageVector
    get() {
        if (_brightness3 != null) {
            return _brightness3!!
        }
        _brightness3 = Builder(name = "Brightness3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.93f, 2.0f)
                curveTo(8.88f, 2.0f, 8.84f, 2.0f, 8.79f, 2.0f)
                curveTo(7.96f, 2.02f, 7.7f, 3.12f, 8.4f, 3.56f)
                curveToRelative(2.78f, 1.77f, 4.63f, 4.89f, 4.63f, 8.44f)
                curveToRelative(0.0f, 3.55f, -1.84f, 6.66f, -4.62f, 8.43f)
                curveTo(7.7f, 20.89f, 7.98f, 21.98f, 8.82f, 22.0f)
                curveToRelative(0.07f, 0.0f, 0.14f, 0.0f, 0.21f, 0.0f)
                curveToRelative(6.05f, 0.0f, 10.86f, -5.39f, 9.87f, -11.63f)
                curveTo(18.14f, 5.53f, 13.83f, 1.95f, 8.93f, 2.0f)
                close()
            }
        }
        .build()
        return _brightness3!!
    }

private var _brightness3: ImageVector? = null
