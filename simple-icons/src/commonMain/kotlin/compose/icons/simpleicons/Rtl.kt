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

public val SimpleIcons.Rtl: ImageVector
    get() {
        if (_rtl != null) {
            return _rtl!!
        }
        _rtl = Builder(name = "Rtl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 9.953f)
                horizontalLineToRelative(7.812f)
                verticalLineToRelative(4.094f)
                lineTo(0.0f, 14.047f)
                close()
                moveTo(4.58f, 13.337f)
                horizontalLineToRelative(2.071f)
                lineToRelative(-1.308f, -0.932f)
                lineToRelative(0.059f, -0.006f)
                arcToRelative(0.784f, 0.784f, 0.0f, false, false, 0.569f, -0.235f)
                arcToRelative(0.874f, 0.874f, 0.0f, false, false, 0.252f, -0.604f)
                curveToRelative(0.0f, -0.164f, -0.03f, -0.299f, -0.082f, -0.416f)
                arcToRelative(0.847f, 0.847f, 0.0f, false, false, -0.211f, -0.282f)
                arcToRelative(0.805f, 0.805f, 0.0f, false, false, -0.294f, -0.164f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, -0.328f, -0.053f)
                lineTo(1.185f, 10.645f)
                lineToRelative(-0.006f, 2.68f)
                horizontalLineToRelative(1.976f)
                verticalLineToRelative(-0.88f)
                horizontalLineToRelative(0.405f)
                close()
                moveTo(4.059f, 11.273f)
                curveToRelative(0.088f, 0.0f, 0.158f, 0.03f, 0.21f, 0.094f)
                arcToRelative(0.339f, 0.339f, 0.0f, false, true, 0.077f, 0.199f)
                arcToRelative(0.288f, 0.288f, 0.0f, false, true, -0.076f, 0.205f)
                arcToRelative(0.283f, 0.283f, 0.0f, false, true, -0.188f, 0.1f)
                horizontalLineToRelative(-0.927f)
                verticalLineToRelative(-0.598f)
                close()
                moveTo(8.094f, 9.953f)
                horizontalLineToRelative(7.812f)
                verticalLineToRelative(4.094f)
                lineTo(8.094f, 14.047f)
                close()
                moveTo(14.469f, 11.29f)
                verticalLineToRelative(-0.633f)
                lineTo(9.39f, 10.657f)
                verticalLineToRelative(0.633f)
                horizontalLineToRelative(1.496f)
                verticalLineToRelative(2.047f)
                horizontalLineToRelative(2.111f)
                lineTo(12.997f, 11.29f)
                close()
                moveTo(16.188f, 9.953f)
                lineTo(24.0f, 9.953f)
                verticalLineToRelative(4.094f)
                horizontalLineToRelative(-7.812f)
                close()
                moveTo(22.61f, 13.337f)
                verticalLineToRelative(-0.616f)
                horizontalLineToRelative(-2.903f)
                verticalLineToRelative(-2.064f)
                horizontalLineToRelative(-2.258f)
                verticalLineToRelative(2.68f)
                close()
            }
        }
        .build()
        return _rtl!!
    }

private var _rtl: ImageVector? = null
