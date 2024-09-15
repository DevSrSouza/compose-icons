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

public val SimpleIcons.Asciidoctor: ImageVector
    get() {
        if (_asciidoctor != null) {
            return _asciidoctor!!
        }
        _asciidoctor = Builder(name = "Asciidoctor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.069f, 0.0f)
                lineTo(5.932f, 0.0f)
                curveTo(2.658f, 0.0f, 0.0f, 2.658f, 0.0f, 5.932f)
                verticalLineToRelative(12.137f)
                curveTo(0.0f, 21.342f, 2.658f, 24.0f, 5.932f, 24.0f)
                horizontalLineToRelative(12.137f)
                curveTo(21.342f, 24.0f, 24.0f, 21.342f, 24.0f, 18.068f)
                lineTo(24.0f, 5.932f)
                curveTo(24.0f, 2.658f, 21.342f, 0.0f, 18.069f, 0.0f)
                close()
                moveTo(10.708f, 15.404f)
                lineTo(8.81f, 15.404f)
                curveToRelative(-0.002f, 0.004f, -0.003f, 0.009f, -0.005f, 0.014f)
                lineTo(7.199f, 19.282f)
                arcToRelative(0.506f, 0.506f, 0.0f, true, true, -0.934f, -0.388f)
                lineToRelative(1.451f, -3.49f)
                lineTo(4.868f, 15.404f)
                arcToRelative(0.506f, 0.506f, 0.0f, true, true, 0.0f, -1.011f)
                horizontalLineToRelative(5.84f)
                arcToRelative(0.506f, 0.506f, 0.0f, true, true, 0.0f, 1.011f)
                close()
                moveTo(18.627f, 19.569f)
                arcToRelative(0.506f, 0.506f, 0.0f, false, true, -0.655f, -0.289f)
                lineTo(12.621f, 6.231f)
                lineToRelative(-2.395f, 5.761f)
                horizontalLineToRelative(1.551f)
                arcToRelative(0.506f, 0.506f, 0.0f, true, true, 0.0f, 1.011f)
                lineTo(5.937f, 13.003f)
                arcToRelative(0.506f, 0.506f, 0.0f, true, true, 0.0f, -1.011f)
                horizontalLineToRelative(3.194f)
                curveToRelative(0.002f, -0.004f, 0.003f, -0.007f, 0.004f, -0.011f)
                lineToRelative(3.022f, -7.269f)
                arcToRelative(0.506f, 0.506f, 0.0f, false, true, 0.457f, -0.311f)
                arcToRelative(0.506f, 0.506f, 0.0f, false, true, 0.477f, 0.314f)
                lineTo(18.908f, 18.896f)
                arcToRelative(0.506f, 0.506f, 0.0f, false, true, -0.281f, 0.673f)
                close()
            }
        }
        .build()
        return _asciidoctor!!
    }

private var _asciidoctor: ImageVector? = null
