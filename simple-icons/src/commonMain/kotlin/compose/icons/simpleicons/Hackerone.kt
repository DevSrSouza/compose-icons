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

public val SimpleIcons.Hackerone: ImageVector
    get() {
        if (_hackerone != null) {
            return _hackerone!!
        }
        _hackerone = Builder(name = "Hackerone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.207f, 0.0f)
                curveToRelative(-0.484f, 0.0f, -0.877f, 0.102f, -1.182f, 0.3f)
                curveToRelative(-0.304f, 0.2f, -0.459f, 0.463f, -0.459f, 0.78f)
                verticalLineToRelative(21.809f)
                curveToRelative(0.0f, 0.277f, 0.158f, 0.528f, 0.475f, 0.761f)
                curveToRelative(0.315f, 0.234f, 0.703f, 0.35f, 1.166f, 0.35f)
                curveToRelative(0.443f, 0.0f, 0.831f, -0.117f, 1.168f, -0.35f)
                curveToRelative(0.335f, -0.231f, 0.506f, -0.484f, 0.506f, -0.761f)
                lineTo(8.881f, 1.082f)
                curveToRelative(0.0f, -0.319f, -0.162f, -0.577f, -0.489f, -0.781f)
                curveTo(8.064f, 0.102f, 7.67f, 0.0f, 7.207f, 0.0f)
                close()
                moveTo(16.73f, 8.662f)
                curveToRelative(-0.484f, 0.0f, -0.872f, 0.098f, -1.168f, 0.301f)
                lineToRelative(-4.439f, 2.782f)
                curveToRelative(-0.199f, 0.186f, -0.284f, 0.469f, -0.247f, 0.855f)
                curveToRelative(0.034f, 0.383f, 0.211f, 0.747f, 0.524f, 1.091f)
                curveToRelative(0.315f, 0.346f, 0.666f, 0.563f, 1.068f, 0.655f)
                curveToRelative(0.396f, 0.09f, 0.697f, 0.041f, 0.896f, -0.143f)
                lineToRelative(1.755f, -1.095f)
                verticalLineToRelative(9.782f)
                curveToRelative(0.0f, 0.277f, 0.152f, 0.528f, 0.461f, 0.761f)
                curveToRelative(0.301f, 0.234f, 0.687f, 0.35f, 1.15f, 0.35f)
                curveToRelative(0.463f, 0.0f, 0.863f, -0.117f, 1.198f, -0.35f)
                curveToRelative(0.337f, -0.233f, 0.506f, -0.484f, 0.506f, -0.761f)
                lineTo(18.434f, 9.738f)
                curveToRelative(0.0f, -0.319f, -0.165f, -0.577f, -0.49f, -0.775f)
                curveToRelative(-0.325f, -0.203f, -0.729f, -0.301f, -1.214f, -0.301f)
                close()
            }
        }
        .build()
        return _hackerone!!
    }

private var _hackerone: ImageVector? = null
