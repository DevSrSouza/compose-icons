package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.AddressCard: ImageVector
    get() {
        if (_addressCard != null) {
            return _addressCard!!
        }
        _addressCard = Builder(name = "AddressCard", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(528.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(480.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(576.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(528.0f, 432.0f)
                lineTo(48.0f, 432.0f)
                lineTo(48.0f, 80.0f)
                horizontalLineToRelative(480.0f)
                verticalLineToRelative(352.0f)
                close()
                moveTo(208.0f, 256.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.7f, -64.0f, -64.0f, -64.0f)
                reflectiveCurveToRelative(-64.0f, 28.7f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.7f, 64.0f, 64.0f, 64.0f)
                close()
                moveTo(118.4f, 384.0f)
                horizontalLineToRelative(179.2f)
                curveToRelative(12.4f, 0.0f, 22.4f, -8.6f, 22.4f, -19.2f)
                verticalLineToRelative(-19.2f)
                curveToRelative(0.0f, -31.8f, -30.1f, -57.6f, -67.2f, -57.6f)
                curveToRelative(-10.8f, 0.0f, -18.7f, 8.0f, -44.8f, 8.0f)
                curveToRelative(-26.9f, 0.0f, -33.4f, -8.0f, -44.8f, -8.0f)
                curveToRelative(-37.1f, 0.0f, -67.2f, 25.8f, -67.2f, 57.6f)
                verticalLineToRelative(19.2f)
                curveToRelative(0.0f, 10.6f, 10.0f, 19.2f, 22.4f, 19.2f)
                close()
                moveTo(360.0f, 320.0f)
                horizontalLineToRelative(112.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, -3.6f, 8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                lineTo(360.0f, 288.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                close()
                moveTo(360.0f, 256.0f)
                horizontalLineToRelative(112.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, -3.6f, 8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                lineTo(360.0f, 224.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                close()
                moveTo(360.0f, 192.0f)
                horizontalLineToRelative(112.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, -3.6f, 8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                lineTo(360.0f, 160.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _addressCard!!
    }

private var _addressCard: ImageVector? = null
