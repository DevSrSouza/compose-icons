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
                moveTo(228.9f, 24.6f)
                curveToRelative(-7.7f, -18.6f, -28.0f, -28.5f, -47.4f, -23.2f)
                lineToRelative(-88.0f, 24.0f)
                curveTo(76.1f, 30.2f, 64.0f, 46.0f, 64.0f, 64.0f)
                curveToRelative(0.0f, 107.4f, 37.8f, 206.0f, 100.8f, 283.1f)
                lineTo(9.2f, 469.1f)
                curveToRelative(-10.4f, 8.2f, -12.3f, 23.3f, -4.1f, 33.7f)
                reflectiveCurveToRelative(23.3f, 12.3f, 33.7f, 4.1f)
                lineToRelative(592.0f, -464.0f)
                curveToRelative(10.4f, -8.2f, 12.3f, -23.3f, 4.1f, -33.7f)
                reflectiveCurveToRelative(-23.3f, -12.3f, -33.7f, -4.1f)
                lineTo(253.0f, 278.0f)
                curveToRelative(-17.8f, -21.5f, -32.9f, -45.2f, -45.0f, -70.7f)
                lineTo(257.3f, 167.0f)
                curveToRelative(13.7f, -11.2f, 18.4f, -30.0f, 11.6f, -46.3f)
                lineToRelative(-40.0f, -96.0f)
                close()
                moveTo(325.7f, 343.6f)
                lineToRelative(-91.3f, 72.0f)
                curveTo(310.7f, 476.0f, 407.1f, 512.0f, 512.0f, 512.0f)
                curveToRelative(18.0f, 0.0f, 33.8f, -12.1f, 38.6f, -29.5f)
                lineToRelative(24.0f, -88.0f)
                curveToRelative(5.3f, -19.4f, -4.6f, -39.7f, -23.2f, -47.4f)
                lineToRelative(-96.0f, -40.0f)
                curveToRelative(-16.3f, -6.8f, -35.2f, -2.1f, -46.3f, 11.6f)
                lineTo(368.7f, 368.0f)
                curveToRelative(-15.0f, -7.1f, -29.3f, -15.2f, -43.0f, -24.3f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
