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

public val RoundGroup.DeviceUnknown: ImageVector
    get() {
        if (_deviceUnknown != null) {
            return _deviceUnknown!!
        }
        _deviceUnknown = Builder(name = "DeviceUnknown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 1.0f)
                lineTo(7.0f, 1.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(19.0f, 3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(17.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(9.52f, 10.19f)
                horizontalLineToRelative(0.13f)
                curveToRelative(0.33f, 0.0f, 0.59f, -0.23f, 0.7f, -0.54f)
                curveToRelative(0.24f, -0.69f, 0.91f, -1.21f, 1.66f, -1.21f)
                curveToRelative(0.93f, 0.0f, 1.75f, 0.82f, 1.75f, 1.75f)
                curveToRelative(0.0f, 1.32f, -1.49f, 1.55f, -2.23f, 2.82f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.08f, 0.14f, -0.14f, 0.29f, -0.2f, 0.45f)
                curveToRelative(-0.01f, 0.02f, -0.02f, 0.03f, -0.02f, 0.05f)
                curveToRelative(-0.01f, 0.02f, -0.01f, 0.04f, -0.01f, 0.05f)
                curveToRelative(-0.1f, 0.31f, -0.16f, 0.66f, -0.16f, 1.08f)
                horizontalLineToRelative(1.76f)
                curveToRelative(0.0f, -0.25f, 0.04f, -0.47f, 0.12f, -0.67f)
                curveToRelative(0.54f, -1.47f, 2.77f, -1.86f, 2.48f, -4.18f)
                curveToRelative(-0.19f, -1.55f, -1.43f, -2.84f, -2.98f, -3.04f)
                curveToRelative(-1.77f, -0.23f, -3.29f, 0.78f, -3.81f, 2.3f)
                curveToRelative(-0.2f, 0.56f, 0.23f, 1.14f, 0.82f, 1.14f)
                close()
            }
        }
        .build()
        return _deviceUnknown!!
    }

private var _deviceUnknown: ImageVector? = null
