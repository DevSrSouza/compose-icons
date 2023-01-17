package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.DeviceDesktop24: ImageVector
    get() {
        if (_deviceDesktop24 != null) {
            return _deviceDesktop24!!
        }
        _deviceDesktop24 = Builder(name = "DeviceDesktop24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.954f, 17.0f)
                horizontalLineTo(2.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 15.25f)
                verticalLineTo(3.75f)
                curveTo(1.0f, 2.784f, 1.784f, 2.0f, 2.75f, 2.0f)
                horizontalLineToRelative(18.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 21.25f, 17.0f)
                horizontalLineToRelative(-6.204f)
                curveToRelative(0.171f, 1.375f, 0.805f, 2.652f, 1.769f, 3.757f)
                arcTo(0.752f, 0.752f, 0.0f, false, true, 16.25f, 22.0f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.565f, -1.243f)
                curveToRelative(0.964f, -1.105f, 1.598f, -2.382f, 1.769f, -3.757f)
                close()
                moveTo(21.5f, 3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineTo(2.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                close()
                moveTo(13.537f, 17.0f)
                horizontalLineToRelative(-3.074f)
                curveToRelative(-0.126f, 1.266f, -0.564f, 2.445f, -1.223f, 3.5f)
                horizontalLineToRelative(5.52f)
                curveToRelative(-0.659f, -1.055f, -1.098f, -2.234f, -1.223f, -3.5f)
                close()
            }
        }
        .build()
        return _deviceDesktop24!!
    }

private var _deviceDesktop24: ImageVector? = null
