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

public val SharpGroup.MotionPhotosPaused: ImageVector
    get() {
        if (_motionPhotosPaused != null) {
            return _motionPhotosPaused!!
        }
        _motionPhotosPaused = Builder(name = "MotionPhotosPaused", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f)
                curveToRelative(0.0f, -1.19f, 0.22f, -2.32f, 0.6f, -3.38f)
                lineTo(4.48f, 9.3f)
                curveTo(4.17f, 10.14f, 4.0f, 11.05f, 4.0f, 12.0f)
                curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f)
                curveToRelative(-0.95f, 0.0f, -1.85f, 0.17f, -2.69f, 0.48f)
                lineTo(8.63f, 2.59f)
                curveTo(9.69f, 2.22f, 10.82f, 2.0f, 12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                close()
                moveTo(5.5f, 4.0f)
                curveTo(4.67f, 4.0f, 4.0f, 4.67f, 4.0f, 5.5f)
                reflectiveCurveTo(4.67f, 7.0f, 5.5f, 7.0f)
                reflectiveCurveTo(7.0f, 6.33f, 7.0f, 5.5f)
                reflectiveCurveTo(6.33f, 4.0f, 5.5f, 4.0f)
                close()
                moveTo(11.0f, 16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(15.0f, 16.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _motionPhotosPaused!!
    }

private var _motionPhotosPaused: ImageVector? = null
