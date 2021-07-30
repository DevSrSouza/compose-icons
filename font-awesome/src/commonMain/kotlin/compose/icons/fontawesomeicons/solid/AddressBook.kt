package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.AddressBook: ImageVector
    get() {
        if (_addressBook != null) {
            return _addressBook!!
        }
        _addressBook = Builder(name = "AddressBook", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(436.0f, 160.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-20.0f)
                lineTo(416.0f, 48.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(48.0f, 0.0f)
                curveTo(21.5f, 0.0f, 0.0f, 21.5f, 0.0f, 48.0f)
                verticalLineToRelative(416.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineToRelative(-48.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(208.0f, 128.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.7f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveToRelative(-64.0f, -28.7f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.7f, -64.0f, 64.0f, -64.0f)
                close()
                moveTo(320.0f, 364.8f)
                curveToRelative(0.0f, 10.6f, -10.0f, 19.2f, -22.4f, 19.2f)
                lineTo(118.4f, 384.0f)
                curveTo(106.0f, 384.0f, 96.0f, 375.4f, 96.0f, 364.8f)
                verticalLineToRelative(-19.2f)
                curveToRelative(0.0f, -31.8f, 30.1f, -57.6f, 67.2f, -57.6f)
                horizontalLineToRelative(5.0f)
                curveToRelative(12.3f, 5.1f, 25.7f, 8.0f, 39.8f, 8.0f)
                reflectiveCurveToRelative(27.6f, -2.9f, 39.8f, -8.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(37.1f, 0.0f, 67.2f, 25.8f, 67.2f, 57.6f)
                verticalLineToRelative(19.2f)
                close()
            }
        }
        .build()
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
