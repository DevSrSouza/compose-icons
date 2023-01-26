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

public val RoundGroup.TrackChanges: ImageVector
    get() {
        if (_trackChanges != null) {
            return _trackChanges!!
        }
        _trackChanges = Builder(name = "TrackChanges", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.32f, 5.68f)
                curveToRelative(-0.36f, 0.36f, -0.39f, 0.92f, -0.07f, 1.32f)
                curveToRelative(1.45f, 1.82f, 2.21f, 4.31f, 1.53f, 6.92f)
                curveToRelative(-0.79f, 3.05f, -3.18f, 5.33f, -6.21f, 5.94f)
                curveTo(8.47f, 20.87f, 4.0f, 16.93f, 4.0f, 12.0f)
                curveToRelative(0.0f, -4.08f, 3.05f, -7.44f, 7.0f, -7.93f)
                verticalLineToRelative(2.02f)
                curveToRelative(-3.13f, 0.53f, -5.43f, 3.46f, -4.93f, 6.83f)
                curveToRelative(0.39f, 2.61f, 2.56f, 4.71f, 5.18f, 5.03f)
                curveTo(14.89f, 18.4f, 18.0f, 15.56f, 18.0f, 12.0f)
                curveToRelative(0.0f, -1.25f, -0.38f, -2.4f, -1.03f, -3.36f)
                curveToRelative(-0.34f, -0.5f, -1.07f, -0.53f, -1.5f, -0.11f)
                lineToRelative(-0.01f, 0.01f)
                curveToRelative(-0.34f, 0.34f, -0.37f, 0.87f, -0.11f, 1.27f)
                curveToRelative(0.6f, 0.92f, 0.84f, 2.1f, 0.49f, 3.32f)
                curveToRelative(-0.39f, 1.37f, -1.54f, 2.46f, -2.94f, 2.77f)
                curveToRelative(-2.6f, 0.57f, -4.9f, -1.39f, -4.9f, -3.9f)
                curveToRelative(0.0f, -1.86f, 1.28f, -3.41f, 3.0f, -3.86f)
                verticalLineToRelative(2.14f)
                curveToRelative(-0.6f, 0.35f, -1.0f, 0.98f, -1.0f, 1.72f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.74f, -0.4f, -1.38f, -1.0f, -1.72f)
                verticalLineTo(2.71f)
                curveToRelative(0.0f, -0.39f, -0.32f, -0.71f, -0.71f, -0.71f)
                curveToRelative(-5.36f, -0.2f, -9.98f, 4.06f, -10.27f, 9.4f)
                curveToRelative(-0.36f, 6.55f, 5.41f, 11.82f, 12.01f, 10.4f)
                curveToRelative(3.88f, -0.83f, 6.88f, -3.8f, 7.75f, -7.67f)
                curveToRelative(0.71f, -3.16f, -0.2f, -6.16f, -1.97f, -8.37f)
                curveToRelative(-0.37f, -0.47f, -1.07f, -0.5f, -1.49f, -0.08f)
                close()
            }
        }
        .build()
        return _trackChanges!!
    }

private var _trackChanges: ImageVector? = null
