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

public val SimpleIcons.Nbc: ImageVector
    get() {
        if (_nbc != null) {
            return _nbc!!
        }
        _nbc = Builder(name = "Nbc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8281f, 4.6055f)
                curveToRelative(-1.4058f, 0.0067f, -2.5666f, 1.2083f, -2.416f, 2.7851f)
                horizontalLineToRelative(1.08f)
                reflectiveCurveToRelative(0.5026f, -0.0062f, 0.6485f, 0.338f)
                curveToRelative(0.0f, 0.0f, -1.594f, 0.6128f, -1.4668f, 1.6093f)
                lineToRelative(0.9922f, 7.3281f)
                lineToRelative(3.4727f, -8.4316f)
                curveToRelative(0.5296f, -1.279f, -0.0616f, -3.1668f, -1.6973f, -3.5567f)
                arcToRelative(2.5497f, 2.5497f, 0.0f, false, false, -0.6133f, -0.0722f)
                close()
                moveTo(9.1855f, 4.6075f)
                arcToRelative(2.5551f, 2.5551f, 0.0f, false, false, -0.627f, 0.0722f)
                curveToRelative(-1.6356f, 0.3878f, -2.2268f, 2.2757f, -1.6972f, 3.5566f)
                lineToRelative(3.4727f, 8.4317f)
                lineToRelative(1.2422f, -9.1582f)
                curveToRelative(0.2194f, -1.629f, -0.9564f, -2.8876f, -2.3907f, -2.9024f)
                close()
                moveTo(4.293f, 8.3104f)
                curveToRelative(-0.5719f, 0.0213f, -1.1298f, 0.2465f, -1.5586f, 0.6583f)
                curveToRelative(-0.803f, 0.7737f, -1.4275f, 2.8792f, 0.371f, 4.1562f)
                lineToRelative(6.9532f, 4.9258f)
                lineToRelative(-3.334f, -8.0762f)
                curveToRelative(-0.4878f, -1.1698f, -1.4785f, -1.6994f, -2.4316f, -1.664f)
                close()
                moveTo(19.5645f, 8.3104f)
                curveToRelative(-0.9075f, 0.0203f, -1.8246f, 0.5528f, -2.2891f, 1.6641f)
                lineToRelative(-3.332f, 8.0762f)
                lineToRelative(6.953f, -4.9258f)
                curveToRelative(1.7987f, -1.275f, 1.172f, -3.3825f, 0.3692f, -4.1563f)
                curveToRelative(-0.4638f, -0.446f, -1.0802f, -0.672f, -1.7011f, -0.6582f)
                close()
                moveTo(21.5039f, 14.0976f)
                curveToRelative(-0.4523f, 0.0075f, -0.9351f, 0.1573f, -1.42f, 0.502f)
                lineToRelative(-6.7694f, 4.7948f)
                horizontalLineToRelative(8.0253f)
                curveToRelative(1.8734f, 0.0f, 3.0648f, -1.5828f, 2.5332f, -3.4843f)
                curveToRelative(-0.2595f, -0.9264f, -1.2131f, -1.8318f, -2.369f, -1.8125f)
                close()
                moveTo(2.4961f, 14.0996f)
                curveTo(1.3405f, 14.081f, 0.3879f, 14.9851f, 0.127f, 15.9101f)
                curveToRelative(-0.5316f, 1.9015f, 0.6597f, 3.4843f, 2.5332f, 3.4843f)
                horizontalLineToRelative(8.0253f)
                lineTo(3.916f, 14.5996f)
                curveToRelative(-0.4848f, -0.344f, -0.9677f, -0.4927f, -1.42f, -0.5f)
                close()
            }
        }
        .build()
        return _nbc!!
    }

private var _nbc: ImageVector? = null
