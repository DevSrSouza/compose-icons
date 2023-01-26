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

public val RoundGroup.VapingRooms: ImageVector
    get() {
        if (_vapingRooms != null) {
            return _vapingRooms!!
        }
        _vapingRooms = Builder(name = "VapingRooms", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(12.5f)
                curveTo(21.33f, 16.0f, 22.0f, 16.67f, 22.0f, 17.5f)
                close()
                moveTo(10.5f, 17.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveTo(10.78f, 17.0f, 10.5f, 17.0f)
                close()
                moveTo(18.85f, 7.73f)
                curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f)
                curveToRelative(0.0f, -1.51f, -1.0f, -2.79f, -2.38f, -3.21f)
                curveTo(16.99f, 2.0f, 16.5f, 2.36f, 16.5f, 2.86f)
                curveToRelative(0.0f, 0.33f, 0.21f, 0.62f, 0.52f, 0.71f)
                curveToRelative(0.77f, 0.23f, 1.33f, 0.94f, 1.33f, 1.78f)
                curveToRelative(0.0f, 0.82f, -0.53f, 1.51f, -1.27f, 1.76f)
                curveTo(16.75f, 7.22f, 16.5f, 7.5f, 16.5f, 7.85f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, 0.37f, 0.27f, 0.69f, 0.64f, 0.75f)
                curveToRelative(1.93f, 0.31f, 3.36f, 2.0f, 3.36f, 4.02f)
                verticalLineToRelative(1.48f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveTo(22.0f, 14.66f, 22.0f, 14.25f)
                verticalLineToRelative(-1.49f)
                curveTo(22.0f, 10.54f, 20.72f, 8.62f, 18.85f, 7.73f)
                close()
                moveTo(18.76f, 15.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.33f, 0.75f, -0.75f)
                verticalLineToRelative(-0.89f)
                curveToRelative(-0.01f, -1.81f, -1.61f, -3.16f, -3.48f, -3.16f)
                horizontalLineToRelative(-1.3f)
                curveToRelative(-1.02f, 0.0f, -1.94f, -0.73f, -2.07f, -1.75f)
                curveToRelative(-0.12f, -0.95f, 0.46f, -1.7f, 1.3f, -1.93f)
                curveToRelative(0.32f, -0.09f, 0.54f, -0.38f, 0.54f, -0.72f)
                curveToRelative(0.0f, -0.49f, -0.46f, -0.86f, -0.93f, -0.72f)
                curveToRelative(-1.42f, 0.41f, -2.45f, 1.73f, -2.42f, 3.28f)
                curveToRelative(0.03f, 1.84f, 1.62f, 3.29f, 3.46f, 3.29f)
                horizontalLineToRelative(1.42f)
                curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f)
                verticalLineToRelative(0.55f)
                curveTo(18.0f, 14.66f, 18.34f, 15.0f, 18.76f, 15.0f)
                close()
                moveTo(3.0f, 18.5f)
                curveToRelative(1.33f, 0.0f, 2.71f, 0.18f, 4.0f, 0.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-1.29f, 0.32f, -2.67f, 0.5f, -4.0f, 0.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveTo(2.45f, 18.5f, 3.0f, 18.5f)
                close()
            }
        }
        .build()
        return _vapingRooms!!
    }

private var _vapingRooms: ImageVector? = null
