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

public val SharpGroup.PhotoCameraFront: ImageVector
    get() {
        if (_photoCameraFront != null) {
            return _photoCameraFront!!
        }
        _photoCameraFront = Builder(name = "PhotoCameraFront", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.83f, 5.0f)
                lineTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
                lineTo(7.17f, 5.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.83f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                curveTo(10.0f, 9.9f, 10.9f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(16.0f, 17.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-0.57f)
                curveToRelative(0.0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f)
                curveTo(10.07f, 14.21f, 11.01f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveToRelative(1.93f, 0.21f, 2.78f, 0.58f)
                curveTo(15.52f, 14.9f, 16.0f, 15.62f, 16.0f, 16.43f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _photoCameraFront!!
    }

private var _photoCameraFront: ImageVector? = null
