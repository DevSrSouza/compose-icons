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

public val SimpleIcons.Lidl: ImageVector
    get() {
        if (_lidl != null) {
            return _lidl!!
        }
        _lidl = Builder(name = "Lidl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(0.209f, 0.209f)
                horizontalLineToRelative(23.582f)
                verticalLineToRelative(23.582f)
                lineTo(0.209f, 23.791f)
                close()
                moveTo(11.998f, 0.834f)
                curveTo(5.83f, 0.834f, 0.83f, 5.834f, 0.83f, 12.002f)
                curveToRelative(0.0f, 6.168f, 5.0f, 11.168f, 11.168f, 11.168f)
                curveToRelative(6.167f, 0.0f, 11.167f, -5.0f, 11.168f, -11.166f)
                curveTo(23.165f, 5.837f, 18.166f, 0.837f, 12.0f, 0.834f)
                close()
                moveTo(12.0f, 1.543f)
                curveToRelative(5.777f, 0.0f, 10.46f, 4.682f, 10.46f, 10.459f)
                verticalLineToRelative(0.004f)
                curveToRelative(-0.004f, 5.773f, -4.686f, 10.452f, -10.46f, 10.453f)
                curveToRelative(-5.777f, 0.0f, -10.46f, -4.68f, -10.46f, -10.457f)
                curveTo(1.54f, 6.225f, 6.222f, 1.543f, 12.0f, 1.543f)
                close()
                moveTo(9.229f, 7.85f)
                curveToRelative(-0.645f, 0.0f, -1.166f, 0.521f, -1.166f, 1.166f)
                verticalLineToRelative(0.004f)
                curveToRelative(0.0f, 1.044f, 1.261f, 1.567f, 1.999f, 0.829f)
                curveToRelative(0.738f, -0.738f, 0.215f, -2.0f, -0.829f, -1.999f)
                close()
                moveTo(2.73f, 10.059f)
                verticalLineToRelative(0.71f)
                horizontalLineToRelative(0.551f)
                verticalLineToRelative(2.465f)
                horizontalLineToRelative(-0.55f)
                verticalLineToRelative(0.713f)
                horizontalLineToRelative(4.644f)
                verticalLineToRelative(-0.65f)
                lineToRelative(0.537f, -0.54f)
                lineToRelative(1.486f, 1.491f)
                lineToRelative(-0.55f, 0.547f)
                lineToRelative(0.357f, 0.36f)
                lineToRelative(2.973f, -2.977f)
                verticalLineToRelative(-0.713f)
                lineToRelative(-0.826f, 0.83f)
                lineToRelative(-1.848f, -1.848f)
                lineToRelative(-2.129f, 2.133f)
                verticalLineToRelative(-0.576f)
                lineToRelative(-1.904f, 1.06f)
                lineTo(5.471f, 10.77f)
                horizontalLineToRelative(0.549f)
                verticalLineToRelative(-0.711f)
                close()
                moveTo(11.635f, 10.059f)
                verticalLineToRelative(0.71f)
                horizontalLineToRelative(0.549f)
                verticalLineToRelative(2.465f)
                horizontalLineToRelative(-0.555f)
                verticalLineToRelative(0.713f)
                horizontalLineToRelative(3.129f)
                curveToRelative(2.325f, 0.0f, 2.355f, -3.888f, 0.008f, -3.888f)
                close()
                moveTo(16.598f, 10.059f)
                verticalLineToRelative(0.71f)
                horizontalLineToRelative(0.55f)
                verticalLineToRelative(2.465f)
                horizontalLineToRelative(-0.55f)
                verticalLineToRelative(0.713f)
                horizontalLineToRelative(4.648f)
                verticalLineToRelative(-1.943f)
                lineToRelative(-1.906f, 1.06f)
                lineTo(19.34f, 10.77f)
                horizontalLineToRelative(0.55f)
                verticalLineToRelative(-0.711f)
                close()
                moveTo(14.168f, 11.269f)
                horizontalLineToRelative(0.133f)
                curveToRelative(0.687f, 0.0f, 0.685f, 1.461f, 0.023f, 1.461f)
                horizontalLineToRelative(-0.156f)
                verticalLineToRelative(-1.46f)
                close()
            }
        }
        .build()
        return _lidl!!
    }

private var _lidl: ImageVector? = null
