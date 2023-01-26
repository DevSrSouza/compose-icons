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

public val RoundGroup.Draw: ImageVector
    get() {
        if (_draw != null) {
            return _draw!!
        }
        _draw = Builder(name = "Draw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.85f, 10.39f)
                lineToRelative(1.06f, -1.06f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineTo(18.5f, 5.09f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f)
                lineToRelative(-1.06f, 1.06f)
                lineTo(18.85f, 10.39f)
                close()
                moveTo(13.19f, 7.56f)
                lineToRelative(-9.05f, 9.05f)
                curveTo(4.05f, 16.7f, 4.0f, 16.83f, 4.0f, 16.96f)
                verticalLineToRelative(3.54f)
                curveTo(4.0f, 20.78f, 4.22f, 21.0f, 4.5f, 21.0f)
                horizontalLineToRelative(3.54f)
                curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(9.05f, -9.05f)
                lineTo(13.19f, 7.56f)
                close()
                moveTo(19.0f, 17.5f)
                curveToRelative(0.0f, 2.19f, -2.54f, 3.5f, -5.0f, 3.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                curveToRelative(1.54f, 0.0f, 3.0f, -0.73f, 3.0f, -1.5f)
                curveToRelative(0.0f, -0.47f, -0.48f, -0.87f, -1.23f, -1.2f)
                lineToRelative(1.48f, -1.48f)
                curveTo(18.32f, 15.45f, 19.0f, 16.29f, 19.0f, 17.5f)
                close()
                moveTo(4.58f, 13.35f)
                curveTo(3.61f, 12.79f, 3.0f, 12.06f, 3.0f, 11.0f)
                curveToRelative(0.0f, -1.8f, 1.89f, -2.63f, 3.56f, -3.36f)
                curveTo(7.59f, 7.18f, 9.0f, 6.56f, 9.0f, 6.0f)
                curveToRelative(0.0f, -0.41f, -0.78f, -1.0f, -2.0f, -1.0f)
                curveTo(5.74f, 5.0f, 5.2f, 5.61f, 5.17f, 5.64f)
                curveTo(4.82f, 6.05f, 4.19f, 6.1f, 3.77f, 5.76f)
                curveTo(3.36f, 5.42f, 3.28f, 4.81f, 3.62f, 4.38f)
                curveTo(3.73f, 4.24f, 4.76f, 3.0f, 7.0f, 3.0f)
                curveToRelative(2.24f, 0.0f, 4.0f, 1.32f, 4.0f, 3.0f)
                curveToRelative(0.0f, 1.87f, -1.93f, 2.72f, -3.64f, 3.47f)
                curveTo(6.42f, 9.88f, 5.0f, 10.5f, 5.0f, 11.0f)
                curveToRelative(0.0f, 0.31f, 0.43f, 0.6f, 1.07f, 0.86f)
                lineTo(4.58f, 13.35f)
                close()
            }
        }
        .build()
        return _draw!!
    }

private var _draw: ImageVector? = null
