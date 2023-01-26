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

public val RoundGroup.MotionPhotosPaused: ImageVector
    get() {
        if (_motionPhotosPaused != null) {
            return _motionPhotosPaused!!
        }
        _motionPhotosPaused = Builder(name = "MotionPhotosPaused", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                curveToRelative(0.26f, 0.26f, 0.34f, 0.63f, 0.25f, 0.98f)
                curveToRelative(-0.35f, 1.36f, -0.36f, 2.87f, 0.1f, 4.38f)
                curveToRelative(0.88f, 2.91f, 3.44f, 5.1f, 6.44f, 5.55f)
                curveToRelative(5.52f, 0.81f, 10.19f, -4.06f, 9.03f, -9.62f)
                curveToRelative(-0.65f, -3.13f, -3.23f, -5.61f, -6.37f, -6.16f)
                curveToRelative(-1.21f, -0.21f, -2.38f, -0.15f, -3.46f, 0.13f)
                curveTo(9.64f, 4.35f, 9.26f, 4.26f, 9.01f, 4.01f)
                lineToRelative(0.0f, 0.0f)
                curveTo(8.45f, 3.45f, 8.73f, 2.52f, 9.48f, 2.32f)
                curveToRelative(1.47f, -0.38f, 3.06f, -0.44f, 4.7f, -0.09f)
                curveToRelative(3.98f, 0.86f, 7.09f, 4.18f, 7.7f, 8.2f)
                curveToRelative(1.04f, 6.81f, -4.82f, 12.58f, -11.64f, 11.42f)
                curveTo(6.23f, 21.16f, 2.98f, 17.99f, 2.2f, 14.0f)
                curveToRelative(-0.31f, -1.59f, -0.24f, -3.12f, 0.12f, -4.53f)
                curveTo(2.52f, 8.72f, 3.45f, 8.45f, 4.0f, 9.0f)
                close()
                moveTo(7.0f, 5.5f)
                curveTo(7.0f, 6.33f, 6.33f, 7.0f, 5.5f, 7.0f)
                reflectiveCurveTo(4.0f, 6.33f, 4.0f, 5.5f)
                reflectiveCurveTo(4.67f, 4.0f, 5.5f, 4.0f)
                reflectiveCurveTo(7.0f, 4.67f, 7.0f, 5.5f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f)
                reflectiveCurveTo(15.31f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(10.0f, 15.0f)
                lineTo(10.0f, 15.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveTo(11.0f, 14.55f, 10.55f, 15.0f, 10.0f, 15.0f)
                close()
                moveTo(14.0f, 15.0f)
                lineTo(14.0f, 15.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveTo(15.0f, 14.55f, 14.55f, 15.0f, 14.0f, 15.0f)
                close()
            }
        }
        .build()
        return _motionPhotosPaused!!
    }

private var _motionPhotosPaused: ImageVector? = null
