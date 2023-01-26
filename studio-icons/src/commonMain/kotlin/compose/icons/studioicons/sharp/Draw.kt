package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Draw: ImageVector
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
                lineToRelative(2.48f, -2.48f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(-2.48f, 2.48f)
                lineTo(18.85f, 10.39f)
                close()
                moveTo(13.19f, 7.56f)
                lineTo(4.0f, 16.76f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(4.24f)
                lineToRelative(9.19f, -9.19f)
                lineTo(13.19f, 7.56f)
                close()
                moveTo(19.0f, 17.5f)
                curveToRelative(0.0f, 2.19f, -2.54f, 3.5f, -5.0f, 3.5f)
                curveToRelative(-0.48f, 0.0f, -1.0f, -0.07f, -1.0f, -0.07f)
                curveToRelative(0.0f, -0.34f, 0.0f, -2.03f, 0.0f, -2.03f)
                reflectiveCurveTo(13.46f, 19.0f, 14.0f, 19.0f)
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
                curveTo(5.76f, 5.0f, 5.0f, 5.61f, 5.0f, 6.0f)
                horizontalLineTo(3.0f)
                curveToRelative(0.0f, -1.65f, 1.7f, -3.0f, 4.0f, -3.0f)
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
