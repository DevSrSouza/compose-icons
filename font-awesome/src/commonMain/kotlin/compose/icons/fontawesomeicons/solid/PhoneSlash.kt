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

public val SolidGroup.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(601.2f, 5.1f)
                curveToRelative(10.4f, -8.2f, 25.5f, -6.3f, 33.7f, 4.1f)
                reflectiveCurveToRelative(6.3f, 25.5f, -4.1f, 33.7f)
                lineToRelative(-592.0f, 464.0f)
                curveToRelative(-10.4f, 8.2f, -25.5f, 6.3f, -33.7f, -4.1f)
                reflectiveCurveToRelative(-6.3f, -25.5f, 4.1f, -33.7f)
                lineToRelative(155.6f, -122.0f)
                curveTo(101.8f, 270.0f, 64.0f, 171.4f, 64.0f, 64.0f)
                curveToRelative(0.0f, -18.0f, 12.1f, -33.8f, 29.5f, -38.6f)
                lineToRelative(88.0f, -24.0f)
                curveToRelative(19.4f, -5.3f, 39.7f, 4.6f, 47.4f, 23.2f)
                lineToRelative(40.0f, 96.0f)
                curveToRelative(6.8f, 16.3f, 2.1f, 35.2f, -11.6f, 46.3f)
                lineTo(208.0f, 207.3f)
                curveToRelative(12.0f, 25.5f, 27.2f, 49.2f, 45.0f, 70.7f)
                lineTo(601.2f, 5.1f)
                close()
                moveTo(234.3f, 415.6f)
                lineToRelative(91.3f, -72.0f)
                curveToRelative(13.7f, 9.1f, 28.0f, 17.3f, 43.0f, 24.3f)
                lineTo(409.0f, 318.7f)
                curveToRelative(11.2f, -13.7f, 30.0f, -18.4f, 46.3f, -11.6f)
                lineToRelative(96.0f, 40.0f)
                curveToRelative(18.6f, 7.7f, 28.5f, 28.0f, 23.2f, 47.4f)
                lineToRelative(-24.0f, 88.0f)
                curveTo(545.8f, 499.9f, 530.0f, 512.0f, 512.0f, 512.0f)
                curveToRelative(-104.9f, 0.0f, -201.3f, -36.0f, -277.7f, -96.4f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
