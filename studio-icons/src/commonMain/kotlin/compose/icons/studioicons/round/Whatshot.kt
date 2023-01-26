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

public val RoundGroup.Whatshot: ImageVector
    get() {
        if (_whatshot != null) {
            return _whatshot!!
        }
        _whatshot = Builder(name = "Whatshot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.09f, 4.56f)
                curveToRelative(-0.7f, -1.03f, -1.5f, -1.99f, -2.4f, -2.85f)
                curveToRelative(-0.35f, -0.34f, -0.94f, -0.02f, -0.84f, 0.46f)
                curveToRelative(0.19f, 0.94f, 0.39f, 2.18f, 0.39f, 3.29f)
                curveToRelative(0.0f, 2.06f, -1.35f, 3.73f, -3.41f, 3.73f)
                curveToRelative(-1.54f, 0.0f, -2.8f, -0.93f, -3.35f, -2.26f)
                curveToRelative(-0.1f, -0.2f, -0.14f, -0.32f, -0.2f, -0.54f)
                curveToRelative(-0.11f, -0.42f, -0.66f, -0.55f, -0.9f, -0.18f)
                curveToRelative(-0.18f, 0.27f, -0.35f, 0.54f, -0.51f, 0.83f)
                curveTo(4.68f, 9.08f, 4.0f, 11.46f, 4.0f, 14.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f)
                curveToRelative(0.0f, -3.49f, -1.08f, -6.73f, -2.91f, -9.44f)
                close()
                moveTo(11.71f, 19.0f)
                curveToRelative(-1.78f, 0.0f, -3.22f, -1.4f, -3.22f, -3.14f)
                curveToRelative(0.0f, -1.62f, 1.05f, -2.76f, 2.81f, -3.12f)
                curveToRelative(1.47f, -0.3f, 2.98f, -0.93f, 4.03f, -1.92f)
                curveToRelative(0.28f, -0.26f, 0.74f, -0.14f, 0.82f, 0.23f)
                curveToRelative(0.23f, 1.02f, 0.35f, 2.08f, 0.35f, 3.15f)
                curveToRelative(0.01f, 2.65f, -2.14f, 4.8f, -4.79f, 4.8f)
                close()
            }
        }
        .build()
        return _whatshot!!
    }

private var _whatshot: ImageVector? = null
