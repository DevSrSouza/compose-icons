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

public val RoundGroup.Hearing: ImageVector
    get() {
        if (_hearing != null) {
            return _hearing!!
        }
        _hearing = Builder(name = "Hearing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 20.0f)
                curveToRelative(-0.29f, 0.0f, -0.56f, -0.06f, -0.76f, -0.15f)
                curveToRelative(-0.71f, -0.37f, -1.21f, -0.88f, -1.71f, -2.38f)
                curveToRelative(-0.51f, -1.56f, -1.47f, -2.29f, -2.39f, -3.0f)
                curveToRelative(-0.79f, -0.61f, -1.61f, -1.24f, -2.32f, -2.53f)
                curveTo(9.29f, 10.98f, 9.0f, 9.93f, 9.0f, 9.0f)
                curveToRelative(0.0f, -2.8f, 2.2f, -5.0f, 5.0f, -5.0f)
                curveToRelative(2.56f, 0.0f, 4.63f, 1.85f, 4.95f, 4.31f)
                curveToRelative(0.06f, 0.4f, 0.41f, 0.69f, 0.82f, 0.69f)
                horizontalLineToRelative(0.34f)
                curveToRelative(0.5f, 0.0f, 0.89f, -0.44f, 0.83f, -0.94f)
                curveTo(20.49f, 4.59f, 17.61f, 2.0f, 14.0f, 2.0f)
                curveToRelative(-3.93f, 0.0f, -7.0f, 3.07f, -7.0f, 7.0f)
                curveToRelative(0.0f, 1.26f, 0.38f, 2.65f, 1.07f, 3.9f)
                curveToRelative(0.91f, 1.65f, 1.98f, 2.48f, 2.85f, 3.15f)
                curveToRelative(0.81f, 0.62f, 1.39f, 1.07f, 1.71f, 2.05f)
                curveToRelative(0.6f, 1.82f, 1.37f, 2.84f, 2.73f, 3.55f)
                curveToRelative(0.51f, 0.23f, 1.07f, 0.35f, 1.64f, 0.35f)
                curveToRelative(1.84f, 0.0f, 3.39f, -1.24f, 3.86f, -2.93f)
                curveToRelative(0.14f, -0.54f, -0.25f, -1.07f, -0.81f, -1.07f)
                horizontalLineToRelative(-0.35f)
                curveToRelative(-0.38f, 0.0f, -0.68f, 0.27f, -0.81f, 0.63f)
                curveToRelative(-0.26f, 0.79f, -1.01f, 1.37f, -1.89f, 1.37f)
                close()
                moveTo(6.97f, 1.97f)
                curveToRelative(-0.43f, -0.43f, -1.12f, -0.39f, -1.5f, 0.07f)
                curveTo(3.93f, 3.94f, 3.0f, 6.36f, 3.0f, 9.0f)
                reflectiveCurveToRelative(0.93f, 5.06f, 2.47f, 6.95f)
                curveToRelative(0.38f, 0.46f, 1.07f, 0.5f, 1.49f, 0.08f)
                curveToRelative(0.36f, -0.36f, 0.39f, -0.93f, 0.07f, -1.32f)
                curveTo(5.77f, 13.16f, 5.0f, 11.17f, 5.0f, 9.0f)
                reflectiveCurveToRelative(0.77f, -4.16f, 2.04f, -5.7f)
                curveToRelative(0.33f, -0.4f, 0.29f, -0.97f, -0.07f, -1.33f)
                close()
                moveTo(11.5f, 9.0f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _hearing!!
    }

private var _hearing: ImageVector? = null
