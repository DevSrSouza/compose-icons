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

public val RoundGroup.Bedtime: ImageVector
    get() {
        if (_bedtime != null) {
            return _bedtime!!
        }
        _bedtime = Builder(name = "Bedtime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.65f, 3.46f)
                curveToRelative(0.27f, -0.71f, -0.36f, -1.45f, -1.12f, -1.34f)
                curveToRelative(-5.52f, 0.8f, -9.47f, 6.07f, -8.34f, 11.88f)
                curveToRelative(0.78f, 4.02f, 4.09f, 7.21f, 8.14f, 7.87f)
                curveToRelative(3.74f, 0.61f, 7.16f, -0.87f, 9.32f, -3.44f)
                curveToRelative(0.48f, -0.57f, 0.19f, -1.48f, -0.55f, -1.62f)
                curveTo(13.08f, 15.66f, 9.42f, 9.27f, 11.65f, 3.46f)
                close()
            }
        }
        .build()
        return _bedtime!!
    }

private var _bedtime: ImageVector? = null
