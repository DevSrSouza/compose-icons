package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.VisibilityOff: ImageVector
    get() {
        if (_visibilityOff != null) {
            return _visibilityOff!!
        }
        _visibilityOff = Builder(name = "VisibilityOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(3.79f, 0.0f, 7.17f, 2.13f, 8.82f, 5.5f)
                curveToRelative(-0.59f, 1.22f, -1.42f, 2.27f, -2.41f, 3.12f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(1.39f, -1.23f, 2.49f, -2.77f, 3.18f, -4.53f)
                curveTo(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f)
                curveToRelative(-1.27f, 0.0f, -2.49f, 0.2f, -3.64f, 0.57f)
                lineToRelative(1.65f, 1.65f)
                curveTo(10.66f, 6.09f, 11.32f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(10.93f, 7.14f)
                lineTo(13.0f, 9.21f)
                curveToRelative(0.57f, 0.25f, 1.03f, 0.71f, 1.28f, 1.28f)
                lineToRelative(2.07f, 2.07f)
                curveToRelative(0.08f, -0.34f, 0.14f, -0.7f, 0.14f, -1.07f)
                curveTo(16.5f, 9.01f, 14.48f, 7.0f, 12.0f, 7.0f)
                curveToRelative(-0.37f, 0.0f, -0.72f, 0.05f, -1.07f, 0.14f)
                close()
                moveTo(2.01f, 3.87f)
                lineToRelative(2.68f, 2.68f)
                curveTo(3.06f, 7.83f, 1.77f, 9.53f, 1.0f, 11.5f)
                curveTo(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f)
                curveToRelative(1.52f, 0.0f, 2.98f, -0.29f, 4.32f, -0.82f)
                lineToRelative(3.42f, 3.42f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.42f, 2.45f)
                lineTo(2.01f, 3.87f)
                close()
                moveTo(9.51f, 11.37f)
                lineToRelative(2.61f, 2.61f)
                curveToRelative(-0.04f, 0.01f, -0.08f, 0.02f, -0.12f, 0.02f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.05f, 0.01f, -0.08f, 0.01f, -0.13f)
                close()
                moveTo(6.11f, 7.97f)
                lineToRelative(1.75f, 1.75f)
                curveToRelative(-0.23f, 0.55f, -0.36f, 1.15f, -0.36f, 1.78f)
                curveToRelative(0.0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                curveToRelative(0.63f, 0.0f, 1.23f, -0.13f, 1.77f, -0.36f)
                lineToRelative(0.98f, 0.98f)
                curveToRelative(-0.88f, 0.24f, -1.8f, 0.38f, -2.75f, 0.38f)
                curveToRelative(-3.79f, 0.0f, -7.17f, -2.13f, -8.82f, -5.5f)
                curveToRelative(0.7f, -1.43f, 1.72f, -2.61f, 2.93f, -3.53f)
                close()
            }
        }
        .build()
        return _visibilityOff!!
    }

private var _visibilityOff: ImageVector? = null
