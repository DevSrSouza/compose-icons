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

public val RoundGroup.Storm: ImageVector
    get() {
        if (_storm != null) {
            return _storm!!
        }
        _storm = Builder(name = "Storm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.93f, 8.0f)
                curveTo(16.72f, 4.18f, 11.82f, 2.87f, 8.0f, 5.07f)
                curveToRelative(-1.41f, 0.82f, -2.48f, 2.0f, -3.16f, 3.37f)
                curveToRelative(-0.1f, -1.75f, 0.1f, -3.5f, 0.59f, -5.17f)
                curveTo(5.61f, 2.63f, 5.14f, 2.0f, 4.48f, 2.0f)
                horizontalLineTo(4.47f)
                curveTo(4.04f, 2.0f, 3.64f, 2.28f, 3.52f, 2.7f)
                curveTo(2.24f, 7.01f, 2.65f, 11.81f, 5.07f, 16.0f)
                curveToRelative(1.1f, 1.91f, 2.88f, 3.19f, 4.86f, 3.72f)
                curveToRelative(1.98f, 0.53f, 4.16f, 0.31f, 6.07f, -0.79f)
                curveToRelative(1.41f, -0.82f, 2.48f, -2.0f, 3.16f, -3.37f)
                curveToRelative(0.1f, 1.75f, -0.09f, 3.5f, -0.58f, 5.18f)
                curveTo(18.4f, 21.37f, 18.87f, 22.0f, 19.53f, 22.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.44f, 0.0f, 0.83f, -0.28f, 0.95f, -0.7f)
                curveTo(21.75f, 16.99f, 21.35f, 12.19f, 18.93f, 8.0f)
                close()
                moveTo(15.0f, 17.2f)
                curveToRelative(-2.87f, 1.65f, -6.54f, 0.67f, -8.2f, -2.2f)
                curveToRelative(-0.11f, -0.2f, -0.21f, -0.4f, -0.3f, -0.6f)
                curveTo(5.3f, 11.64f, 6.33f, 8.34f, 9.0f, 6.8f)
                curveToRelative(2.86f, -1.65f, 6.54f, -0.67f, 8.2f, 2.2f)
                curveToRelative(0.11f, 0.2f, 0.21f, 0.4f, 0.3f, 0.6f)
                curveTo(18.7f, 12.36f, 17.67f, 15.66f, 15.0f, 17.2f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveTo(10.9f, 10.0f, 12.0f, 10.0f)
                moveTo(12.0f, 8.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveTo(14.21f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _storm!!
    }

private var _storm: ImageVector? = null
