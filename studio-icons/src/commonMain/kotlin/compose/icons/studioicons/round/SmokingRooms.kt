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

public val RoundGroup.SmokingRooms: ImageVector
    get() {
        if (_smokingRooms != null) {
            return _smokingRooms!!
        }
        _smokingRooms = Builder(name = "SmokingRooms", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 16.0f)
                horizontalLineToRelative(-12.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveTo(2.67f, 19.0f, 3.5f, 19.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.85f, 7.73f)
                curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f)
                curveToRelative(0.0f, -1.51f, -1.0f, -2.79f, -2.38f, -3.21f)
                curveToRelative(-0.48f, -0.14f, -0.97f, 0.22f, -0.97f, 0.72f)
                curveToRelative(0.0f, 0.33f, 0.21f, 0.62f, 0.52f, 0.71f)
                curveToRelative(0.77f, 0.23f, 1.33f, 0.94f, 1.33f, 1.78f)
                curveToRelative(0.0f, 0.82f, -0.53f, 1.51f, -1.27f, 1.76f)
                curveToRelative(-0.33f, 0.11f, -0.58f, 0.39f, -0.58f, 0.74f)
                lineTo(16.5f, 8.0f)
                curveToRelative(0.0f, 0.37f, 0.27f, 0.69f, 0.64f, 0.75f)
                curveToRelative(1.93f, 0.31f, 3.36f, 2.0f, 3.36f, 4.02f)
                verticalLineToRelative(1.48f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-1.49f)
                curveToRelative(0.0f, -2.22f, -1.28f, -4.14f, -3.15f, -5.03f)
                close()
                moveTo(16.03f, 10.2f)
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
                curveToRelative(0.0f, 0.41f, 0.33f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.33f, 0.75f, -0.75f)
                verticalLineToRelative(-0.89f)
                curveToRelative(-0.01f, -1.81f, -1.61f, -3.16f, -3.48f, -3.16f)
                close()
                moveTo(18.0f, 16.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.0f)
                lineTo(18.0f, 19.0f)
                close()
                moveTo(20.5f, 16.0f)
                lineTo(22.0f, 16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _smokingRooms!!
    }

private var _smokingRooms: ImageVector? = null
