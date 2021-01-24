package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.TruckLoading: ImageVector
    get() {
        if (_truckLoading != null) {
            return _truckLoading!!
        }
        _truckLoading = Builder(name = "TruckLoading", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.2f, 375.6f)
                curveToRelative(2.3f, 8.5f, 11.1f, 13.6f, 19.6f, 11.3f)
                lineToRelative(216.4f, -58.0f)
                curveToRelative(8.5f, -2.3f, 13.6f, -11.1f, 11.3f, -19.6f)
                lineToRelative(-49.7f, -185.5f)
                curveToRelative(-2.3f, -8.5f, -11.1f, -13.6f, -19.6f, -11.3f)
                lineTo(151.0f, 133.3f)
                lineToRelative(24.8f, 92.7f)
                lineToRelative(-61.8f, 16.5f)
                lineToRelative(-24.8f, -92.7f)
                lineToRelative(-77.3f, 20.7f)
                curveTo(3.4f, 172.8f, -1.7f, 181.6f, 0.6f, 190.1f)
                lineToRelative(49.6f, 185.5f)
                close()
                moveTo(384.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(323.6f)
                lineTo(5.9f, 450.0f)
                curveToRelative(-4.3f, 1.2f, -6.8f, 5.6f, -5.6f, 9.8f)
                lineToRelative(12.6f, 46.3f)
                curveToRelative(1.2f, 4.3f, 5.6f, 6.8f, 9.8f, 5.6f)
                lineToRelative(393.7f, -107.4f)
                curveTo(418.8f, 464.1f, 467.6f, 512.0f, 528.0f, 512.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                lineTo(640.0f, 0.0f)
                lineTo(384.0f, 0.0f)
                close()
                moveTo(528.0f, 448.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _truckLoading!!
    }

private var _truckLoading: ImageVector? = null
