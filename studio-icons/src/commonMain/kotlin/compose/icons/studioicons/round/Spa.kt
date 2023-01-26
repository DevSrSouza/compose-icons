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

public val RoundGroup.Spa: ImageVector
    get() {
        if (_spa != null) {
            return _spa!!
        }
        _spa = Builder(name = "Spa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.49f, 9.63f)
                curveToRelative(-0.16f, -2.42f, -1.03f, -4.79f, -2.64f, -6.76f)
                curveToRelative(-0.41f, -0.5f, -1.16f, -0.5f, -1.57f, 0.0f)
                curveToRelative(-1.65f, 1.98f, -2.57f, 4.35f, -2.77f, 6.76f)
                curveToRelative(1.28f, 0.68f, 2.46f, 1.56f, 3.49f, 2.63f)
                curveToRelative(1.03f, -1.06f, 2.21f, -1.94f, 3.49f, -2.63f)
                close()
                moveTo(8.99f, 12.28f)
                curveToRelative(-0.14f, -0.1f, -0.3f, -0.19f, -0.45f, -0.29f)
                curveToRelative(0.15f, 0.11f, 0.31f, 0.19f, 0.45f, 0.29f)
                close()
                moveTo(15.41f, 12.03f)
                curveToRelative(-0.13f, 0.09f, -0.27f, 0.16f, -0.4f, 0.26f)
                curveToRelative(0.13f, -0.1f, 0.27f, -0.17f, 0.4f, -0.26f)
                close()
                moveTo(12.0f, 15.45f)
                curveToRelative(-1.95f, -2.97f, -5.14f, -5.03f, -8.83f, -5.39f)
                curveToRelative(-0.64f, -0.06f, -1.17f, 0.47f, -1.11f, 1.11f)
                curveToRelative(0.45f, 4.8f, 3.65f, 8.78f, 7.98f, 10.33f)
                curveToRelative(0.63f, 0.23f, 1.29f, 0.4f, 1.97f, 0.51f)
                curveToRelative(0.68f, -0.12f, 1.33f, -0.29f, 1.97f, -0.51f)
                curveToRelative(4.33f, -1.55f, 7.53f, -5.52f, 7.98f, -10.33f)
                curveToRelative(0.06f, -0.64f, -0.48f, -1.17f, -1.11f, -1.11f)
                curveToRelative(-3.71f, 0.36f, -6.9f, 2.42f, -8.85f, 5.39f)
                close()
            }
        }
        .build()
        return _spa!!
    }

private var _spa: ImageVector? = null
