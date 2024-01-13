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

public val SimpleIcons.Azurepipelines: ImageVector
    get() {
        if (_azurepipelines != null) {
            return _azurepipelines!!
        }
        _azurepipelines = Builder(name = "Azurepipelines", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.7997f, 22.1998f)
                horizontalLineToRelative(4.2001f)
                lineTo(5.9998f, 24.0f)
                lineTo(4.0E-4f, 24.0f)
                verticalLineToRelative(-6.0002f)
                horizontalLineToRelative(1.7993f)
                verticalLineToRelative(4.2f)
                close()
                moveTo(12.6229f, 9.8975f)
                lineToRelative(-7.6353f, 7.6353f)
                lineToRelative(1.4792f, 1.4792f)
                lineToRelative(7.6345f, -7.6362f)
                lineToRelative(-1.4784f, -1.4783f)
                close()
                moveTo(4.365f, 15.1793f)
                lineToRelative(-0.391f, -0.3908f)
                curveToRelative(-0.5042f, -0.5042f, -0.5828f, -1.3004f, -0.1869f, -1.8934f)
                lineToRelative(4.6036f, -6.8958f)
                lineTo(0.9979f, 5.9993f)
                curveToRelative(-0.5513f, 0.0014f, -0.9975f, 0.4487f, -0.9975f, 1.0f)
                verticalLineToRelative(5.5002f)
                lineToRelative(3.5021f, 3.6036f)
                lineToRelative(0.8625f, -0.9238f)
                close()
                moveTo(23.9996f, 0.9999f)
                verticalLineToRelative(8.9306f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.8893f, 1.6632f)
                lineToRelative(-12.2834f, 8.2005f)
                arcToRelative(0.9999f, 0.9999f, 0.0f, false, true, -1.2622f, -0.1246f)
                lineTo(8.04f, 18.1457f)
                curveToRelative(0.3313f, -0.3313f, 6.4656f, -6.4672f, 6.7684f, -6.7698f)
                lineToRelative(-2.1855f, -2.1855f)
                lineTo(5.8533f, 15.96f)
                lineToRelative(-1.5258f, -1.525f)
                arcToRelative(1.0001f, 1.0001f, 0.0f, false, true, -0.1246f, -1.2623f)
                lineTo(12.4034f, 0.8893f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0666f, 0.0f)
                horizontalLineToRelative(8.9331f)
                curveToRelative(0.5522f, 0.0f, 0.9999f, 0.4477f, 0.9999f, 0.9999f)
                close()
                moveTo(20.9999f, 6.0002f)
                curveToRelative(0.0f, -1.6567f, -1.343f, -2.9997f, -2.9997f, -2.9997f)
                reflectiveCurveToRelative(-2.9997f, 1.343f, -2.9997f, 2.9997f)
                reflectiveCurveToRelative(1.343f, 2.9997f, 2.9997f, 2.9997f)
                reflectiveCurveToRelative(2.9997f, -1.343f, 2.9997f, -2.9997f)
                close()
                moveTo(10.272f, 20.4625f)
                curveToRelative(-0.4008f, 0.0f, -0.7776f, -0.156f, -1.0609f, -0.4392f)
                lineToRelative(-0.368f, -0.3679f)
                lineToRelative(-0.8435f, 0.8417f)
                lineToRelative(3.4996f, 3.4996f)
                horizontalLineToRelative(5.5003f)
                curveToRelative(0.5522f, 0.0f, 0.9999f, -0.4477f, 0.9999f, -0.9999f)
                verticalLineToRelative(-7.3899f)
                lineTo(11.1045f, 20.21f)
                arcToRelative(1.4944f, 1.4944f, 0.0f, false, true, -0.8325f, 0.2525f)
                close()
            }
        }
        .build()
        return _azurepipelines!!
    }

private var _azurepipelines: ImageVector? = null
