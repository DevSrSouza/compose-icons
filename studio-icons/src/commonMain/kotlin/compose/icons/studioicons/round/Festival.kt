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

public val RoundGroup.Festival: ImageVector
    get() {
        if (_festival != null) {
            return _festival!!
        }
        _festival = Builder(name = "Festival", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                verticalLineToRelative(-0.61f)
                curveToRelative(0.0f, -0.8f, -0.48f, -1.54f, -1.23f, -1.84f)
                curveToRelative(-3.65f, -1.48f, -6.81f, -3.93f, -8.48f, -5.37f)
                curveToRelative(-0.74f, -0.64f, -1.84f, -0.64f, -2.58f, 0.0f)
                curveTo(9.03f, 4.62f, 5.88f, 7.06f, 2.23f, 8.55f)
                curveTo(1.48f, 8.85f, 1.0f, 9.58f, 1.0f, 10.39f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, 1.49f, 0.93f, 2.75f, 2.24f, 3.26f)
                curveToRelative(-0.03f, 1.68f, -0.16f, 3.55f, -0.52f, 5.29f)
                curveTo(2.46f, 20.81f, 3.38f, 22.0f, 4.67f, 22.0f)
                horizontalLineToRelative(14.67f)
                curveToRelative(1.29f, 0.0f, 2.21f, -1.19f, 1.95f, -2.45f)
                curveToRelative(-0.36f, -1.75f, -0.5f, -3.62f, -0.52f, -5.29f)
                curveTo(22.07f, 13.75f, 23.0f, 12.49f, 23.0f, 11.0f)
                close()
                moveTo(12.0f, 4.71f)
                curveToRelative(1.33f, 1.14f, 3.49f, 2.84f, 6.11f, 4.29f)
                horizontalLineTo(5.89f)
                curveTo(8.51f, 7.55f, 10.67f, 5.85f, 12.0f, 4.71f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(13.0f, 11.83f, 13.0f, 11.0f)
                close()
                moveTo(9.5f, 12.5f)
                curveTo(8.67f, 12.5f, 8.0f, 11.83f, 8.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                curveTo(11.0f, 11.83f, 10.33f, 12.5f, 9.5f, 12.5f)
                close()
                moveTo(6.0f, 11.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(3.0f, 11.83f, 3.0f, 11.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(4.66f, 20.0f)
                curveToRelative(0.39f, -1.86f, 0.54f, -3.82f, 0.57f, -5.58f)
                curveToRelative(0.68f, -0.15f, 1.29f, -0.49f, 1.76f, -0.98f)
                curveToRelative(0.25f, 0.25f, 0.54f, 0.45f, 0.85f, 0.62f)
                curveToRelative(-0.1f, 1.87f, -0.26f, 4.0f, -0.52f, 5.93f)
                horizontalLineTo(4.66f)
                close()
                moveTo(9.35f, 20.0f)
                curveToRelative(0.24f, -1.83f, 0.39f, -3.78f, 0.48f, -5.53f)
                curveToRelative(0.84f, -0.08f, 1.61f, -0.45f, 2.17f, -1.02f)
                curveToRelative(0.56f, 0.57f, 1.32f, 0.94f, 2.17f, 1.02f)
                curveToRelative(0.1f, 1.75f, 0.24f, 3.7f, 0.48f, 5.53f)
                horizontalLineTo(9.35f)
                close()
                moveTo(16.67f, 20.0f)
                curveToRelative(-0.27f, -1.94f, -0.43f, -4.07f, -0.52f, -5.93f)
                curveToRelative(0.31f, -0.17f, 0.61f, -0.37f, 0.85f, -0.62f)
                curveToRelative(0.47f, 0.48f, 1.08f, 0.83f, 1.76f, 0.98f)
                curveToRelative(0.03f, 1.76f, 0.18f, 3.72f, 0.57f, 5.58f)
                horizontalLineTo(16.67f)
                close()
                moveTo(19.5f, 12.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveTo(21.0f, 11.83f, 20.33f, 12.5f, 19.5f, 12.5f)
                close()
            }
        }
        .build()
        return _festival!!
    }

private var _festival: ImageVector? = null
