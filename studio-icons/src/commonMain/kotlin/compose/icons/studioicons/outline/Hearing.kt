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

public val OutlineGroup.Hearing: ImageVector
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
                reflectiveCurveToRelative(5.0f, 2.2f, 5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -3.93f, -3.07f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveTo(7.0f, 5.07f, 7.0f, 9.0f)
                curveToRelative(0.0f, 1.26f, 0.38f, 2.65f, 1.07f, 3.9f)
                curveToRelative(0.91f, 1.65f, 1.98f, 2.48f, 2.85f, 3.15f)
                curveToRelative(0.81f, 0.62f, 1.39f, 1.07f, 1.71f, 2.05f)
                curveToRelative(0.6f, 1.82f, 1.37f, 2.84f, 2.73f, 3.55f)
                curveToRelative(0.51f, 0.23f, 1.07f, 0.35f, 1.64f, 0.35f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(7.64f, 2.64f)
                lineTo(6.22f, 1.22f)
                curveTo(4.23f, 3.21f, 3.0f, 5.96f, 3.0f, 9.0f)
                reflectiveCurveToRelative(1.23f, 5.79f, 3.22f, 7.78f)
                lineToRelative(1.41f, -1.41f)
                curveTo(6.01f, 13.74f, 5.0f, 11.49f, 5.0f, 9.0f)
                reflectiveCurveToRelative(1.01f, -4.74f, 2.64f, -6.36f)
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
