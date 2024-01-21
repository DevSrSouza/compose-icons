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

public val SimpleIcons.Nxp: ImageVector
    get() {
        if (_nxp != null) {
            return _nxp!!
        }
        _nxp = Builder(name = "Nxp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.7965f, 7.9138f)
                lineToRelative(2.5208f, 4.0862f)
                lineToRelative(-2.5208f, 4.0862f)
                lineToRelative(-4.271f, -4.9386f)
                lineToRelative(9.0E-4f, 4.938f)
                lineToRelative(-2.5214f, 6.0E-4f)
                lineTo(0.0f, 16.0792f)
                lineTo(0.0f, 7.9138f)
                horizontalLineToRelative(2.524f)
                lineToRelative(4.271f, 4.9386f)
                lineToRelative(3.0E-4f, -4.9386f)
                moveToRelative(14.8507f, 2.8948f)
                curveToRelative(0.0f, -0.5517f, -0.2734f, -0.8673f, -1.0366f, -0.8673f)
                horizontalLineToRelative(-3.1881f)
                verticalLineToRelative(2.3119f)
                horizontalLineToRelative(3.4046f)
                curveToRelative(0.5922f, 0.0f, 0.8201f, -0.5576f, 0.8201f, -1.0422f)
                verticalLineToRelative(-0.4024f)
                close()
                moveTo(21.0163f, 7.9138f)
                curveTo(23.4192f, 7.9138f, 24.0f, 9.1076f, 24.0f, 10.7071f)
                verticalLineToRelative(0.9603f)
                curveToRelative(0.0f, 1.2164f, -0.535f, 2.6132f, -2.3231f, 2.6132f)
                horizontalLineToRelative(-4.259f)
                lineToRelative(0.0012f, 1.8051f)
                horizontalLineToRelative(-0.0012f)
                lineTo(14.8974f, 12.0f)
                lineToRelative(2.5208f, -4.0862f)
                horizontalLineToRelative(3.5982f)
                moveToRelative(-6.7457f, 1.0E-4f)
                horizontalLineToRelative(-0.4614f)
                lineToRelative(-1.7018f, 2.7165f)
                lineToRelative(-1.7018f, -2.7164f)
                lineTo(7.4184f, 7.9139f)
                lineToRelative(2.5211f, 4.086f)
                lineToRelative(-2.5211f, 4.0862f)
                horizontalLineToRelative(2.9872f)
                lineToRelative(1.7018f, -2.7162f)
                lineToRelative(1.7018f, 2.7162f)
                horizontalLineToRelative(0.4664f)
                lineToRelative(2.5202f, -3.0E-4f)
                lineToRelative(-2.5205f, -4.0859f)
                lineToRelative(2.5208f, -4.086f)
                horizontalLineToRelative(-2.5255f)
                close()
            }
        }
        .build()
        return _nxp!!
    }

private var _nxp: ImageVector? = null
