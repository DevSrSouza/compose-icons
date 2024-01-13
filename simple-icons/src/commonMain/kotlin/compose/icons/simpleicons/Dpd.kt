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

public val SimpleIcons.Dpd: ImageVector
    get() {
        if (_dpd != null) {
            return _dpd!!
        }
        _dpd = Builder(name = "Dpd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.01f, 10.71f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, true, -0.343f, -0.006f)
                lineToRelative(-0.558f, -0.331f)
                arcToRelative(0.43f, 0.43f, 0.0f, false, true, -0.182f, -0.312f)
                lineToRelative(-0.014f, -0.65f)
                arcToRelative(0.363f, 0.363f, 0.0f, false, true, 0.165f, -0.3f)
                lineToRelative(6.7f, -3.902f)
                lineTo(12.377f, 0.085f)
                arcTo(0.799f, 0.799f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(0.798f, 0.798f, 0.0f, false, false, -0.377f, 0.085f)
                lineToRelative(-9.4f, 5.124f)
                lineToRelative(10.53f, 6.13f)
                curveToRelative(0.098f, 0.054f, 0.172f, 0.181f, 0.172f, 0.295f)
                verticalLineToRelative(8.944f)
                curveToRelative(0.0f, 0.112f, -0.08f, 0.241f, -0.178f, 0.294f)
                lineToRelative(-0.567f, 0.315f)
                curveToRelative(-0.171f, 0.062f, -0.256f, 0.043f, -0.361f, 0.0f)
                lineToRelative(-0.569f, -0.315f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, true, -0.175f, -0.294f)
                verticalLineToRelative(-7.973f)
                arcToRelative(0.223f, 0.223f, 0.0f, false, false, -0.095f, -0.156f)
                lineTo(1.702f, 7.048f)
                verticalLineToRelative(10.579f)
                curveToRelative(0.0f, 0.236f, 0.167f, 0.528f, 0.371f, 0.648f)
                lineToRelative(9.556f, 5.636f)
                curveToRelative(0.102f, 0.06f, 0.237f, 0.09f, 0.371f, 0.089f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, false, 0.371f, -0.09f)
                lineToRelative(9.557f, -5.635f)
                arcToRelative(0.835f, 0.835f, 0.0f, false, false, 0.37f, -0.648f)
                verticalLineTo(7.047f)
                close()
            }
        }
        .build()
        return _dpd!!
    }

private var _dpd: ImageVector? = null
