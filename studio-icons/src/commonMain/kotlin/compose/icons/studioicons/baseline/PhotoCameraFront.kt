package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.PhotoCameraFront: ImageVector
    get() {
        if (_photoCameraFront != null) {
            return _photoCameraFront!!
        }
        _photoCameraFront = Builder(name = "PhotoCameraFront", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.48f)
                lineToRelative(4.0f, -3.98f)
                verticalLineToRelative(11.0f)
                lineToRelative(-4.0f, -3.98f)
                lineTo(18.0f, 18.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                lineTo(4.0f, 20.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                lineTo(2.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(4.48f)
                close()
                moveTo(16.0f, 9.69f)
                lineTo(16.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(12.0f)
                lineTo(16.0f, 9.69f)
                close()
                moveTo(10.0f, 12.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveToRelative(1.34f, 0.0f, 4.0f, 0.67f, 4.0f, 2.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.33f, 2.66f, -2.0f, 4.0f, -2.0f)
                close()
            }
        }
        .build()
        return _photoCameraFront!!
    }

private var _photoCameraFront: ImageVector? = null
