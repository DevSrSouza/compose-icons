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

public val RoundGroup.DownhillSkiing: ImageVector
    get() {
        if (_downhillSkiing != null) {
            return _downhillSkiing!!
        }
        _downhillSkiing = Builder(name = "DownhillSkiing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 4.5f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveTo(18.5f, 3.4f, 18.5f, 4.5f)
                close()
                moveTo(15.78f, 20.9f)
                lineToRelative(0.76f, 0.27f)
                curveToRelative(0.62f, 0.21f, 1.27f, 0.33f, 1.96f, 0.33f)
                curveToRelative(0.68f, 0.0f, 1.34f, -0.12f, 1.95f, -0.33f)
                curveToRelative(0.27f, -0.09f, 0.57f, -0.02f, 0.78f, 0.18f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, 0.4f, 0.23f, 1.06f, -0.3f, 1.24f)
                curveTo(20.17f, 22.86f, 19.35f, 23.0f, 18.5f, 23.0f)
                curveToRelative(-0.86f, 0.0f, -1.68f, -0.14f, -2.45f, -0.41f)
                lineTo(2.7f, 17.72f)
                curveToRelative(-0.39f, -0.14f, -0.59f, -0.57f, -0.45f, -0.95f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.14f, -0.39f, 0.57f, -0.6f, 0.96f, -0.45f)
                lineToRelative(6.19f, 2.25f)
                lineToRelative(1.72f, -4.44f)
                lineTo(7.55f, 10.4f)
                curveTo(6.65f, 9.46f, 6.87f, 7.93f, 8.0f, 7.28f)
                lineToRelative(3.48f, -2.01f)
                curveToRelative(1.1f, -0.64f, 2.52f, -0.1f, 2.91f, 1.11f)
                lineToRelative(0.33f, 1.08f)
                curveToRelative(0.44f, 1.42f, 1.48f, 2.57f, 2.83f, 3.14f)
                lineToRelative(0.29f, -0.89f)
                curveToRelative(0.13f, -0.39f, 0.55f, -0.61f, 0.94f, -0.48f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.4f, 0.13f, 0.61f, 0.55f, 0.48f, 0.95f)
                lineToRelative(-0.6f, 1.85f)
                curveToRelative(-0.17f, 0.52f, -0.72f, 0.82f, -1.24f, 0.65f)
                curveToRelative(-2.02f, -0.63f, -3.64f, -2.15f, -4.42f, -4.1f)
                lineToRelative(-2.53f, 1.45f)
                lineToRelative(2.23f, 2.55f)
                curveToRelative(0.49f, 0.56f, 0.63f, 1.34f, 0.36f, 2.04f)
                lineToRelative(-1.78f, 4.63f)
                lineToRelative(3.09f, 1.12f)
                lineToRelative(2.1f, -6.44f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.46f, 0.18f, 0.94f, 0.31f, 1.44f, 0.41f)
                lineTo(15.78f, 20.9f)
                close()
            }
        }
        .build()
        return _downhillSkiing!!
    }

private var _downhillSkiing: ImageVector? = null
