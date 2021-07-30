package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Drone: ImageVector
    get() {
        if (_drone != null) {
            return _drone!!
        }
        _drone = Builder(name = "Drone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.07f, 13.633f)
                arcToRelative(3.07f, 3.07f, 0.0f, true, true, -6.14f, 0.0f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, true, 6.14f, 0.0f)
                close()
                moveTo(12.0f, 1.856f)
                curveToRelative(5.359f, 0.042f, 11.452f, 3.82f, 12.0f, 10.94f)
                horizontalLineToRelative(-7.256f)
                reflectiveCurveTo(15.809f, 8.863f, 12.0f, 8.889f)
                reflectiveCurveToRelative(-4.744f, 3.907f, -4.744f, 3.907f)
                horizontalLineTo(0.0f)
                curveTo(0.353f, 5.802f, 6.344f, 1.812f, 12.0f, 1.856f)
                close()
                moveTo(12.05f, 22.144f)
                curveToRelative(-3.996f, 0.011f, -7.729f, -3.005f, -9.259f, -7.674f)
                horizontalLineToRelative(4.465f)
                reflectiveCurveToRelative(0.963f, 3.889f, 4.773f, 3.863f)
                reflectiveCurveToRelative(4.716f, -3.863f, 4.716f, -3.863f)
                horizontalLineToRelative(4.465f)
                curveToRelative(-0.995f, 4.94f, -5.164f, 7.664f, -9.159f, 7.674f)
                close()
            }
        }
        .build()
        return _drone!!
    }

private var _drone: ImageVector? = null
