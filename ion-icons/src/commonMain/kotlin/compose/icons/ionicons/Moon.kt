package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(264.0f, 480.0f)
                arcTo(232.0f, 232.0f, 0.0f, false, true, 32.0f, 248.0f)
                curveTo(32.0f, 154.0f, 86.0f, 69.72f, 169.61f, 33.33f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.06f, 21.06f)
                curveTo(181.07f, 76.43f, 176.0f, 104.66f, 176.0f, 136.0f)
                curveToRelative(0.0f, 110.28f, 89.72f, 200.0f, 200.0f, 200.0f)
                curveToRelative(31.34f, 0.0f, 59.57f, -5.07f, 81.61f, -14.67f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.06f, 21.06f)
                curveTo(442.28f, 426.0f, 358.0f, 480.0f, 264.0f, 480.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
