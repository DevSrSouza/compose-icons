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

public val OutlineGroup.DownhillSkiing: ImageVector
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
                curveToRelative(0.84f, 0.0f, 1.65f, -0.18f, 2.38f, -0.5f)
                lineTo(22.0f, 22.13f)
                curveTo(20.95f, 22.68f, 19.76f, 23.0f, 18.5f, 23.0f)
                curveToRelative(-0.86f, 0.0f, -1.68f, -0.14f, -2.45f, -0.41f)
                lineTo(2.0f, 17.47f)
                lineToRelative(0.5f, -1.41f)
                lineToRelative(6.9f, 2.51f)
                lineToRelative(1.72f, -4.44f)
                lineTo(7.55f, 10.4f)
                curveTo(6.66f, 9.46f, 6.88f, 7.93f, 8.0f, 7.28f)
                lineToRelative(3.48f, -2.01f)
                curveToRelative(1.1f, -0.64f, 2.52f, -0.1f, 2.91f, 1.11f)
                lineToRelative(0.33f, 1.08f)
                curveToRelative(0.44f, 1.42f, 1.48f, 2.57f, 2.83f, 3.14f)
                lineTo(18.07f, 9.0f)
                lineToRelative(1.43f, 0.46f)
                lineToRelative(-1.12f, 3.45f)
                curveToRelative(-2.45f, -0.4f, -4.48f, -2.07f, -5.38f, -4.32f)
                lineToRelative(-2.53f, 1.45f)
                lineToRelative(3.03f, 3.46f)
                lineToRelative(-2.22f, 5.76f)
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
