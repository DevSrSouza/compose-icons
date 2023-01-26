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

public val OutlineGroup.MotionPhotosAuto: ImageVector
    get() {
        if (_motionPhotosAuto != null) {
            return _motionPhotosAuto!!
        }
        _motionPhotosAuto = Builder(name = "MotionPhotosAuto", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.88f, 7.88f)
                lineToRelative(1.54f, 1.54f)
                curveTo(4.15f, 10.23f, 4.0f, 11.1f, 4.0f, 12.0f)
                curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f)
                curveToRelative(-0.9f, 0.0f, -1.77f, 0.15f, -2.58f, 0.42f)
                lineTo(7.89f, 2.89f)
                curveTo(9.15f, 2.32f, 10.54f, 2.0f, 12.0f, 2.0f)
                curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.48f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 10.53f, 2.32f, 9.14f, 2.88f, 7.88f)
                close()
                moveTo(7.0f, 5.5f)
                curveTo(7.0f, 6.33f, 6.33f, 7.0f, 5.5f, 7.0f)
                reflectiveCurveTo(4.0f, 6.33f, 4.0f, 5.5f)
                reflectiveCurveTo(4.67f, 4.0f, 5.5f, 4.0f)
                reflectiveCurveTo(7.0f, 4.67f, 7.0f, 5.5f)
                close()
                moveTo(12.03f, 8.99f)
                horizontalLineToRelative(-0.07f)
                lineToRelative(-1.16f, 3.31f)
                horizontalLineToRelative(2.39f)
                lineTo(12.03f, 8.99f)
                close()
                moveTo(11.29f, 7.5f)
                horizontalLineToRelative(1.43f)
                lineToRelative(3.01f, 8.0f)
                horizontalLineToRelative(-1.39f)
                lineToRelative(-0.72f, -2.04f)
                horizontalLineToRelative(-3.23f)
                lineTo(9.66f, 15.5f)
                horizontalLineTo(8.28f)
                lineTo(11.29f, 7.5f)
                close()
            }
        }
        .build()
        return _motionPhotosAuto!!
    }

private var _motionPhotosAuto: ImageVector? = null
