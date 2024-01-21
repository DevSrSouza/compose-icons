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

public val SimpleIcons.Hotelsdotcom: ImageVector
    get() {
        if (_hotelsdotcom != null) {
            return _hotelsdotcom!!
        }
        _hotelsdotcom = Builder(name = "Hotelsdotcom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.064f, 0.0f)
                lineTo(4.936f, 0.0f)
                arcToRelative(4.937f, 4.937f, 0.0f, false, false, -4.93f, 4.93f)
                lineTo(0.006f, 19.06f)
                arcTo(4.94f, 4.94f, 0.0f, false, false, 4.935f, 24.0f)
                horizontalLineToRelative(14.128f)
                arcToRelative(4.926f, 4.926f, 0.0f, false, false, 4.93f, -4.941f)
                lineTo(23.993f, 4.93f)
                arcTo(4.93f, 4.93f, 0.0f, false, false, 19.065f, 0.0f)
                close()
                moveTo(8.55f, 10.63f)
                verticalLineToRelative(2.329f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.337f, 0.337f)
                lineTo(5.884f, 13.296f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.337f, -0.337f)
                lineTo(5.547f, 10.63f)
                curveToRelative(0.0f, -0.2f, 0.137f, -0.337f, 0.337f, -0.337f)
                horizontalLineToRelative(2.34f)
                curveToRelative(0.2f, 0.0f, 0.336f, 0.137f, 0.336f, 0.337f)
                horizontalLineToRelative(-0.01f)
                close()
                moveTo(13.712f, 18.121f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.337f, 0.337f)
                horizontalLineToRelative(-2.328f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.337f, -0.337f)
                verticalLineToRelative(-2.328f)
                curveToRelative(0.0f, -0.2f, 0.136f, -0.337f, 0.337f, -0.337f)
                horizontalLineToRelative(2.328f)
                curveToRelative(0.19f, 0.0f, 0.337f, 0.136f, 0.337f, 0.337f)
                verticalLineToRelative(2.328f)
                close()
                moveTo(13.712f, 12.959f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.337f, 0.337f)
                horizontalLineToRelative(-2.328f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.337f, -0.337f)
                lineTo(10.71f, 10.63f)
                curveToRelative(0.0f, -0.2f, 0.136f, -0.337f, 0.337f, -0.337f)
                horizontalLineToRelative(2.328f)
                curveToRelative(0.2f, 0.0f, 0.337f, 0.137f, 0.337f, 0.337f)
                verticalLineToRelative(2.329f)
                close()
                moveTo(19.686f, 17.331f)
                arcToRelative(0.654f, 0.654f, 0.0f, false, true, -0.22f, 0.516f)
                lineToRelative(-2.308f, 2.297f)
                curveToRelative(-0.18f, 0.168f, -0.432f, 0.052f, -0.432f, -0.2f)
                lineTo(16.726f, 7.28f)
                lineTo(4.062f, 7.28f)
                curveToRelative(-0.253f, 0.0f, -0.369f, -0.264f, -0.2f, -0.432f)
                lineTo(6.169f, 4.55f)
                curveToRelative(0.137f, -0.147f, 0.274f, -0.232f, 0.506f, -0.232f)
                horizontalLineToRelative(11.473f)
                curveToRelative(0.854f, 0.0f, 1.538f, 0.685f, 1.538f, 1.539f)
                lineTo(19.686f, 17.33f)
                close()
            }
        }
        .build()
        return _hotelsdotcom!!
    }

private var _hotelsdotcom: ImageVector? = null
