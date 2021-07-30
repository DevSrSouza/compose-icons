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
                moveTo(18.0685f, 0.0f)
                lineTo(5.9318f, 0.0f)
                curveTo(2.6579f, 0.0f, 0.0f, 2.6578f, 0.0f, 5.9316f)
                verticalLineToRelative(12.1367f)
                curveTo(0.0f, 21.3421f, 2.658f, 24.0f, 5.9318f, 24.0f)
                horizontalLineToRelative(12.1367f)
                curveTo(21.3423f, 24.0f, 24.0f, 21.3421f, 24.0f, 18.0683f)
                lineTo(24.0f, 5.9316f)
                curveTo(24.0f, 2.6578f, 21.3423f, 0.0f, 18.0685f, 0.0f)
                close()
                moveTo(10.708f, 15.4038f)
                lineTo(8.8102f, 15.4038f)
                curveToRelative(-0.0018f, 0.0045f, -0.0031f, 0.009f, -0.005f, 0.0135f)
                lineTo(7.1986f, 19.282f)
                arcToRelative(0.5058f, 0.5058f, 0.0f, true, true, -0.934f, -0.3883f)
                lineToRelative(1.4507f, -3.49f)
                lineTo(4.8677f, 15.4037f)
                arcToRelative(0.5058f, 0.5058f, 0.0f, true, true, 0.0f, -1.0113f)
                horizontalLineToRelative(5.8403f)
                arcToRelative(0.5058f, 0.5058f, 0.0f, true, true, 0.0f, 1.0113f)
                close()
                moveTo(18.6269f, 19.5685f)
                arcToRelative(0.5058f, 0.5058f, 0.0f, false, true, -0.6545f, -0.2886f)
                lineTo(12.6206f, 6.2306f)
                lineToRelative(-2.395f, 5.761f)
                horizontalLineToRelative(1.551f)
                arcToRelative(0.5058f, 0.5058f, 0.0f, true, true, 0.0f, 1.0113f)
                lineTo(5.9369f, 13.0029f)
                arcToRelative(0.5058f, 0.5058f, 0.0f, true, true, 0.0f, -1.0113f)
                horizontalLineToRelative(3.194f)
                curveToRelative(0.0015f, -0.0038f, 0.0026f, -0.0075f, 0.0042f, -0.0112f)
                lineToRelative(3.0223f, -7.2693f)
                arcToRelative(0.5058f, 0.5058f, 0.0f, false, true, 0.457f, -0.3112f)
                arcToRelative(0.5058f, 0.5058f, 0.0f, false, true, 0.4774f, 0.3137f)
                lineTo(18.908f, 18.896f)
                arcToRelative(0.5058f, 0.5058f, 0.0f, false, true, -0.2812f, 0.6725f)
                close()
            }
        }
        .build()
        return _asciidoctor!!
    }

private var _asciidoctor: ImageVector? = null
