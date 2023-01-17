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

public val SimpleIcons.Hibob: ImageVector
    get() {
        if (_hibob != null) {
            return _hibob!!
        }
        _hibob = Builder(name = "Hibob", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.527f, 17.538f)
                curveToRelative(-2.077f, 0.0f, -3.767f, -1.705f, -3.767f, -3.8f)
                curveToRelative(0.0f, -2.096f, 1.69f, -3.8f, 3.767f, -3.8f)
                reflectiveCurveToRelative(3.767f, 1.704f, 3.767f, 3.8f)
                curveToRelative(0.0f, 2.095f, -1.69f, 3.8f, -3.766f, 3.8f)
                moveToRelative(0.0f, -6.408f)
                curveToRelative(-1.426f, 0.0f, -2.586f, 1.17f, -2.586f, 2.607f)
                curveToRelative(0.0f, 1.439f, 1.159f, 2.609f, 2.585f, 2.609f)
                reflectiveCurveToRelative(2.585f, -1.17f, 2.585f, -2.609f)
                curveToRelative(0.0f, -1.437f, -1.16f, -2.606f, -2.585f, -2.606f)
                moveTo(1.707f, 10.4f)
                lineTo(1.707f, 7.082f)
                arcToRelative(0.858f, 0.858f, 0.0f, false, false, -0.853f, -0.86f)
                arcToRelative(0.856f, 0.856f, 0.0f, false, false, -0.854f, 0.86f)
                verticalLineToRelative(6.632f)
                curveToRelative(0.002f, 2.244f, 1.81f, 4.065f, 4.03f, 4.065f)
                curveToRelative(2.221f, 0.0f, 4.029f, -1.823f, 4.029f, -4.065f)
                curveToRelative(0.0f, -2.24f, -1.808f, -4.063f, -4.029f, -4.063f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, -2.323f, 0.748f)
                close()
                moveTo(4.03f, 16.058f)
                arcToRelative(2.335f, 2.335f, 0.0f, false, true, -2.323f, -2.343f)
                arcToRelative(2.335f, 2.335f, 0.0f, false, true, 2.323f, -2.342f)
                arcToRelative(2.335f, 2.335f, 0.0f, false, true, 2.323f, 2.342f)
                arcToRelative(2.335f, 2.335f, 0.0f, false, true, -2.323f, 2.343f)
                moveToRelative(16.465f, -5.854f)
                arcToRelative(3.49f, 3.491f, 0.0f, false, false, -2.848f, 1.484f)
                lineTo(17.647f, 6.704f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, false, -0.327f, -0.331f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, false, -0.328f, 0.331f)
                verticalLineToRelative(7.036f)
                curveToRelative(0.002f, 1.949f, 1.572f, 3.533f, 3.504f, 3.533f)
                curveToRelative(1.931f, 0.0f, 3.504f, -1.586f, 3.504f, -3.536f)
                curveToRelative(0.0f, -1.949f, -1.573f, -3.534f, -3.505f, -3.534f)
                moveToRelative(0.0f, 6.408f)
                curveToRelative(-1.57f, 0.0f, -2.847f, -1.289f, -2.847f, -2.873f)
                reflectiveCurveToRelative(1.278f, -2.872f, 2.847f, -2.872f)
                curveToRelative(1.57f, 0.0f, 2.848f, 1.288f, 2.848f, 2.872f)
                curveToRelative(0.0f, 1.585f, -1.277f, 2.873f, -2.848f, 2.873f)
            }
        }
        .build()
        return _hibob!!
    }

private var _hibob: ImageVector? = null
