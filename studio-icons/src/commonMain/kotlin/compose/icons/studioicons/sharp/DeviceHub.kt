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

public val SharpGroup.DeviceHub: ImageVector
    get() {
        if (_deviceHub != null) {
            return _deviceHub!!
        }
        _deviceHub = Builder(name = "DeviceHub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 16.0f)
                lineToRelative(-4.0f, -4.0f)
                verticalLineTo(8.82f)
                curveTo(14.16f, 8.4f, 15.0f, 7.3f, 15.0f, 6.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(9.0f, 4.34f, 9.0f, 6.0f)
                curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f)
                verticalLineTo(12.0f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.05f)
                lineToRelative(4.0f, -4.2f)
                lineToRelative(4.0f, 4.2f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _deviceHub!!
    }

private var _deviceHub: ImageVector? = null
