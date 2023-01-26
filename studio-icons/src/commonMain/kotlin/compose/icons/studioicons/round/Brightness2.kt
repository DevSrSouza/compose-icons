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

public val RoundGroup.Brightness2: ImageVector
    get() {
        if (_brightness2 != null) {
            return _brightness2!!
        }
        _brightness2 = Builder(name = "Brightness2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.43f, 2.3f)
                curveToRelative(-2.38f, -0.59f, -4.68f, -0.27f, -6.63f, 0.64f)
                curveToRelative(-0.35f, 0.16f, -0.41f, 0.64f, -0.1f, 0.86f)
                curveTo(8.3f, 5.6f, 10.0f, 8.6f, 10.0f, 12.0f)
                curveToRelative(0.0f, 3.4f, -1.7f, 6.4f, -4.3f, 8.2f)
                curveToRelative(-0.32f, 0.22f, -0.26f, 0.7f, 0.09f, 0.86f)
                curveToRelative(1.28f, 0.6f, 2.71f, 0.94f, 4.21f, 0.94f)
                curveToRelative(6.05f, 0.0f, 10.85f, -5.38f, 9.87f, -11.6f)
                curveToRelative(-0.61f, -3.92f, -3.59f, -7.16f, -7.44f, -8.1f)
                close()
            }
        }
        .build()
        return _brightness2!!
    }

private var _brightness2: ImageVector? = null
