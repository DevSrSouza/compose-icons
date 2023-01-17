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

public val SimpleIcons.Aqua: ImageVector
    get() {
        if (_aqua != null) {
            return _aqua!!
        }
        _aqua = Builder(name = "Aqua", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7875f, 18.6811f)
                curveToRelative(0.7687f, 0.0f, 0.7695f, 0.7105f, 0.7695f, 0.7517f)
                curveToRelative(3.0E-4f, 0.2888f, -0.1047f, 0.4303f, -0.2229f, 0.5535f)
                lineToRelative(-3.6066f, 3.6127f)
                curveToRelative(-0.2547f, 0.2557f, -0.5963f, 0.4006f, -0.9567f, 0.401f)
                horizontalLineTo(0.879f)
                curveToRelative(-0.1444f, 2.0E-4f, -0.2889f, -0.0409f, -0.4238f, -0.1226f)
                curveToRelative(-0.2628f, -0.1525f, -0.46f, -0.4826f, -0.4551f, -0.8042f)
                verticalLineToRelative(-4.3921f)
                horizontalLineToRelative(17.7874f)
                close()
                moveTo(23.0632f, 1.0E-4f)
                curveToRelative(0.3202f, -0.0053f, 0.6491f, 0.1893f, 0.8014f, 0.4518f)
                curveToRelative(0.0814f, 0.1348f, 0.1354f, 0.279f, 0.1354f, 0.4234f)
                verticalLineTo(13.757f)
                curveToRelative(0.0f, 0.3601f, -0.1402f, 0.7054f, -0.3946f, 0.9602f)
                lineToRelative(-3.5466f, 3.5524f)
                curveToRelative(-0.137f, 0.1371f, -0.274f, 0.2744f, -0.6027f, 0.2744f)
                curveToRelative(-0.0411f, 0.0f, -0.8225f, 0.0f, -0.8225f, -0.7681f)
                verticalLineTo(1.0E-4f)
                horizontalLineToRelative(4.4296f)
                close()
                moveTo(4.5539f, 5.482f)
                reflectiveCurveToRelative(0.824f, 0.0f, 0.824f, 0.7699f)
                verticalLineToRelative(12.0934f)
                horizontalLineTo(1.0E-4f)
                verticalLineToRelative(-8.0648f)
                curveToRelative(0.0f, -0.361f, 0.1397f, -0.7072f, 0.3945f, -0.9625f)
                lineTo(3.95f, 5.757f)
                curveToRelative(0.1372f, -0.1376f, 0.2744f, -0.275f, 0.6039f, -0.275f)
                close()
                moveTo(18.2983f, 2.0E-4f)
                verticalLineToRelative(5.377f)
                horizontalLineTo(6.255f)
                curveToRelative(-0.7669f, 0.0f, -0.7669f, -0.8233f, -0.7669f, -0.8233f)
                curveToRelative(0.0f, -0.3292f, 0.137f, -0.4663f, 0.2739f, -0.6035f)
                lineTo(9.3087f, 0.398f)
                arcToRelative(1.3545f, 1.3545f, 0.0f, false, true, 0.9585f, -0.3977f)
                horizontalLineToRelative(8.0311f)
                close()
            }
        }
        .build()
        return _aqua!!
    }

private var _aqua: ImageVector? = null
