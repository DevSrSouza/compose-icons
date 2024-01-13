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

public val Octicons.DeviceCamera16: ImageVector
    get() {
        if (_deviceCamera16 != null) {
            return _deviceCamera16!!
        }
        _deviceCamera16 = Builder(name = "DeviceCamera16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 14.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(0.0f, 4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(10.5f, 12.0f)
                curveToRelative(1.94f, 0.0f, 3.5f, -1.56f, 3.5f, -3.5f)
                reflectiveCurveTo(12.44f, 5.0f, 10.5f, 5.0f)
                reflectiveCurveTo(7.0f, 6.56f, 7.0f, 8.5f)
                reflectiveCurveTo(8.56f, 12.0f, 10.5f, 12.0f)
                close()
                moveTo(13.0f, 8.5f)
                curveToRelative(0.0f, 1.38f, -1.13f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(8.0f, 9.87f, 8.0f, 8.5f)
                reflectiveCurveTo(9.13f, 6.0f, 10.5f, 6.0f)
                reflectiveCurveTo(13.0f, 7.13f, 13.0f, 8.5f)
                close()
                moveTo(6.0f, 5.0f)
                lineTo(6.0f, 4.0f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _deviceCamera16!!
    }

private var _deviceCamera16: ImageVector? = null
