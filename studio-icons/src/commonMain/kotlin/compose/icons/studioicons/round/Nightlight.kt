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

public val RoundGroup.Nightlight: ImageVector
    get() {
        if (_nightlight != null) {
            return _nightlight!!
        }
        _nightlight = Builder(name = "Nightlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 22.0f)
                curveToRelative(0.07f, 0.0f, 0.14f, 0.0f, 0.21f, 0.0f)
                curveToRelative(0.84f, -0.02f, 1.12f, -1.11f, 0.41f, -1.56f)
                curveToRelative(-2.78f, -1.77f, -4.63f, -4.89f, -4.63f, -8.43f)
                curveToRelative(0.0f, -3.55f, 1.85f, -6.66f, 4.63f, -8.44f)
                curveToRelative(0.7f, -0.45f, 0.44f, -1.54f, -0.39f, -1.56f)
                curveToRelative(-0.04f, 0.0f, -0.09f, 0.0f, -0.13f, 0.0f)
                curveToRelative(-4.9f, -0.05f, -9.21f, 3.53f, -9.98f, 8.37f)
                curveTo(4.64f, 16.61f, 9.45f, 22.0f, 15.5f, 22.0f)
                lineTo(15.5f, 22.0f)
                close()
            }
        }
        .build()
        return _nightlight!!
    }

private var _nightlight: ImageVector? = null
