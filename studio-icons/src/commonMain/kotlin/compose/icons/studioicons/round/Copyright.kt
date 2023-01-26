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

public val RoundGroup.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = Builder(name = "Copyright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.08f, 10.86f)
                curveToRelative(0.05f, -0.33f, 0.16f, -0.62f, 0.3f, -0.87f)
                reflectiveCurveToRelative(0.34f, -0.46f, 0.59f, -0.62f)
                curveToRelative(0.24f, -0.15f, 0.54f, -0.22f, 0.91f, -0.23f)
                curveToRelative(0.23f, 0.01f, 0.44f, 0.05f, 0.63f, 0.13f)
                curveToRelative(0.2f, 0.09f, 0.38f, 0.21f, 0.52f, 0.36f)
                reflectiveCurveToRelative(0.25f, 0.33f, 0.34f, 0.53f)
                reflectiveCurveToRelative(0.13f, 0.42f, 0.14f, 0.64f)
                horizontalLineToRelative(1.79f)
                curveToRelative(-0.02f, -0.47f, -0.11f, -0.9f, -0.28f, -1.29f)
                reflectiveCurveToRelative(-0.4f, -0.73f, -0.7f, -1.01f)
                reflectiveCurveToRelative(-0.66f, -0.5f, -1.08f, -0.66f)
                reflectiveCurveToRelative(-0.88f, -0.23f, -1.39f, -0.23f)
                curveToRelative(-0.65f, 0.0f, -1.22f, 0.11f, -1.7f, 0.34f)
                reflectiveCurveToRelative(-0.88f, 0.53f, -1.2f, 0.92f)
                reflectiveCurveToRelative(-0.56f, 0.84f, -0.71f, 1.36f)
                reflectiveCurveTo(8.0f, 11.29f, 8.0f, 11.87f)
                verticalLineToRelative(0.27f)
                curveToRelative(0.0f, 0.58f, 0.08f, 1.12f, 0.23f, 1.64f)
                reflectiveCurveToRelative(0.39f, 0.97f, 0.71f, 1.35f)
                reflectiveCurveToRelative(0.72f, 0.69f, 1.2f, 0.91f)
                curveToRelative(0.48f, 0.22f, 1.05f, 0.34f, 1.7f, 0.34f)
                curveToRelative(0.47f, 0.0f, 0.91f, -0.08f, 1.32f, -0.23f)
                reflectiveCurveToRelative(0.77f, -0.36f, 1.08f, -0.63f)
                reflectiveCurveToRelative(0.56f, -0.58f, 0.74f, -0.94f)
                reflectiveCurveToRelative(0.29f, -0.74f, 0.3f, -1.15f)
                horizontalLineToRelative(-1.79f)
                curveToRelative(-0.01f, 0.21f, -0.06f, 0.4f, -0.15f, 0.58f)
                reflectiveCurveToRelative(-0.21f, 0.33f, -0.36f, 0.46f)
                reflectiveCurveToRelative(-0.32f, 0.23f, -0.52f, 0.3f)
                curveToRelative(-0.19f, 0.07f, -0.39f, 0.09f, -0.6f, 0.1f)
                curveToRelative(-0.36f, -0.01f, -0.66f, -0.08f, -0.89f, -0.23f)
                curveToRelative(-0.25f, -0.16f, -0.45f, -0.37f, -0.59f, -0.62f)
                reflectiveCurveToRelative(-0.25f, -0.55f, -0.3f, -0.88f)
                reflectiveCurveToRelative(-0.08f, -0.67f, -0.08f, -1.0f)
                verticalLineToRelative(-0.27f)
                curveToRelative(0.0f, -0.35f, 0.03f, -0.68f, 0.08f, -1.01f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
