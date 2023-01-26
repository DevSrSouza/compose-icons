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

public val RoundGroup.Snowshoeing: ImageVector
    get() {
        if (_snowshoeing != null) {
            return _snowshoeing!!
        }
        _snowshoeing = Builder(name = "Snowshoeing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 3.5f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(12.5f, 4.6f, 12.5f, 3.5f)
                close()
                moveTo(20.0f, 11.91f)
                curveToRelative(0.0f, -0.49f, -0.36f, -0.9f, -0.84f, -0.98f)
                curveToRelative(-1.53f, -0.25f, -2.79f, -1.16f, -3.47f, -2.35f)
                lineToRelative(-1.0f, -1.58f)
                curveToRelative(-0.4f, -0.6f, -1.0f, -1.0f, -1.7f, -1.0f)
                curveToRelative(-0.68f, 0.0f, -1.28f, 0.28f, -4.77f, 1.76f)
                curveTo(7.49f, 8.07f, 7.0f, 8.8f, 7.0f, 9.6f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(9.58f)
                lineToRelative(1.79f, -0.7f)
                lineTo(9.2f, 17.0f)
                lineToRelative(-2.88f, 2.03f)
                lineToRelative(-1.14f, -1.47f)
                lineTo(4.0f, 18.5f)
                lineToRelative(2.38f, 3.04f)
                curveToRelative(0.51f, 0.65f, 1.16f, 1.15f, 1.88f, 1.41f)
                curveToRelative(0.28f, 0.1f, 0.53f, 0.04f, 0.72f, -0.11f)
                curveToRelative(0.3f, -0.23f, 0.42f, -0.7f, 0.12f, -1.07f)
                curveToRelative(-0.08f, -0.1f, -0.2f, -0.17f, -0.31f, -0.22f)
                curveToRelative(-0.43f, -0.18f, -0.82f, -0.45f, -1.14f, -0.83f)
                lineToRelative(-0.08f, -0.1f)
                lineToRelative(2.85f, -2.01f)
                curveToRelative(0.38f, -0.27f, 0.65f, -0.66f, 0.77f, -1.1f)
                lineToRelative(0.7f, -2.53f)
                lineToRelative(2.11f, 2.0f)
                verticalLineToRelative(4.52f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(23.0f)
                horizontalLineToRelative(3.87f)
                curveToRelative(0.82f, 0.0f, 1.61f, -0.21f, 2.26f, -0.61f)
                curveToRelative(0.26f, -0.16f, 0.37f, -0.39f, 0.37f, -0.64f)
                curveToRelative(0.0f, -0.38f, -0.3f, -0.75f, -0.77f, -0.75f)
                curveToRelative(-0.13f, 0.0f, -0.26f, 0.04f, -0.37f, 0.1f)
                curveToRelative(-0.4f, 0.23f, -0.87f, 0.37f, -1.36f, 0.4f)
                lineToRelative(0.0f, -5.16f)
                curveToRelative(0.0f, -0.55f, -0.23f, -1.07f, -0.62f, -1.45f)
                lineToRelative(-1.49f, -1.41f)
                lineToRelative(0.6f, -3.0f)
                curveToRelative(1.07f, 1.24f, 2.63f, 2.15f, 4.37f, 2.43f)
                curveTo(19.46f, 13.01f, 20.0f, 12.52f, 20.0f, 11.91f)
                close()
            }
        }
        .build()
        return _snowshoeing!!
    }

private var _snowshoeing: ImageVector? = null
