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

public val RoundGroup.Compost: ImageVector
    get() {
        if (_compost != null) {
            return _compost!!
        }
        _compost = Builder(name = "Compost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.73f, 21.5f)
                curveToRelative(-4.95f, -0.14f, -9.08f, -4.27f, -9.22f, -9.22f)
                curveTo(2.35f, 6.91f, 6.67f, 2.5f, 12.0f, 2.5f)
                verticalLineTo(1.21f)
                curveToRelative(0.0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f)
                lineToRelative(-2.79f, 2.79f)
                curveTo(12.54f, 7.46f, 12.0f, 7.24f, 12.0f, 6.79f)
                verticalLineTo(5.5f)
                curveToRelative(-3.58f, 0.0f, -6.5f, 2.92f, -6.5f, 6.5f)
                curveToRelative(0.0f, 2.21f, 1.11f, 4.17f, 2.81f, 5.35f)
                curveToRelative(0.51f, -0.92f, 1.63f, -1.62f, 2.98f, -1.8f)
                curveToRelative(-0.09f, -0.69f, -0.26f, -1.42f, -0.49f, -2.03f)
                curveToRelative(-0.33f, 0.28f, -0.75f, 0.46f, -1.22f, 0.48f)
                curveToRelative(-1.14f, 0.05f, -2.08f, -0.99f, -2.08f, -2.13f)
                lineToRelative(0.0f, -0.86f)
                curveToRelative(0.0f, -0.29f, -0.05f, -0.57f, -0.14f, -0.83f)
                curveTo(7.24f, 9.84f, 7.5f, 9.49f, 7.86f, 9.52f)
                curveToRelative(1.3f, 0.09f, 3.6f, 0.52f, 3.64f, 2.48f)
                curveToRelative(0.0f, 0.29f, -0.06f, 0.56f, -0.17f, 0.8f)
                curveTo(10.91f, 12.48f, 10.47f, 12.2f, 10.0f, 12.0f)
                curveToRelative(0.58f, 0.43f, 1.37f, 1.37f, 2.0f, 2.6f)
                curveToRelative(0.67f, -1.62f, 1.68f, -3.27f, 3.0f, -4.6f)
                curveToRelative(-0.76f, 0.52f, -1.47f, 1.12f, -2.13f, 1.81f)
                curveToRelative(-0.26f, -0.42f, -0.4f, -0.93f, -0.36f, -1.47f)
                curveTo(12.59f, 9.0f, 13.79f, 8.0f, 15.13f, 8.0f)
                lineTo(16.0f, 8.0f)
                curveToRelative(0.56f, 0.0f, 0.97f, -0.14f, 1.28f, -0.31f)
                curveToRelative(0.34f, -0.19f, 0.76f, 0.05f, 0.75f, 0.44f)
                curveTo(17.99f, 9.87f, 17.56f, 13.0f, 15.0f, 13.0f)
                curveToRelative(-0.49f, 0.0f, -0.94f, -0.14f, -1.32f, -0.38f)
                curveToRelative(-0.24f, 0.64f, -0.59f, 1.76f, -0.76f, 2.96f)
                curveToRelative(1.26f, 0.22f, 2.28f, 0.89f, 2.77f, 1.77f)
                curveToRelative(1.57f, -1.09f, 2.64f, -2.85f, 2.79f, -4.87f)
                curveTo(18.5f, 12.22f, 18.71f, 12.0f, 18.98f, 12.0f)
                lineToRelative(1.82f, 0.0f)
                curveToRelative(0.47f, 0.0f, 0.71f, 0.24f, 0.69f, 0.52f)
                curveTo(21.21f, 17.61f, 16.91f, 21.64f, 11.73f, 21.5f)
                close()
            }
        }
        .build()
        return _compost!!
    }

private var _compost: ImageVector? = null
