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

public val SimpleIcons.Svg: ImageVector
    get() {
        if (_svg != null) {
            return _svg!!
        }
        _svg = Builder(name = "Svg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-1.497f, 0.0f, -2.749f, 0.965f, -3.248f, 2.17f)
                arcToRelative(3.45f, 3.45f, 0.0f, false, false, -0.238f, 1.416f)
                arcToRelative(3.459f, 3.459f, 0.0f, false, false, -1.168f, -0.834f)
                arcToRelative(3.508f, 3.508f, 0.0f, false, false, -1.463f, -0.256f)
                arcToRelative(3.513f, 3.513f, 0.0f, false, false, -2.367f, 1.02f)
                curveToRelative(-1.06f, 1.058f, -1.263f, 2.625f, -0.764f, 3.83f)
                curveToRelative(0.179f, 0.432f, 0.47f, 0.82f, 0.82f, 1.154f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, -1.402f, 0.252f)
                curveTo(0.965f, 9.251f, 0.0f, 10.502f, 0.0f, 12.0f)
                curveToRelative(0.0f, 1.497f, 0.965f, 2.749f, 2.17f, 3.248f)
                curveToRelative(0.437f, 0.181f, 0.924f, 0.25f, 1.414f, 0.236f)
                curveToRelative(-0.357f, 0.338f, -0.65f, 0.732f, -0.832f, 1.17f)
                curveToRelative(-0.499f, 1.205f, -0.295f, 2.772f, 0.764f, 3.83f)
                curveToRelative(1.058f, 1.06f, 2.625f, 1.263f, 3.83f, 0.764f)
                curveToRelative(0.437f, -0.181f, 0.83f, -0.476f, 1.168f, -0.832f)
                curveToRelative(-0.014f, 0.49f, 0.057f, 0.977f, 0.238f, 1.414f)
                curveTo(9.251f, 23.035f, 10.502f, 24.0f, 12.0f, 24.0f)
                curveToRelative(1.497f, 0.0f, 2.749f, -0.965f, 3.248f, -2.17f)
                arcToRelative(3.45f, 3.45f, 0.0f, false, false, 0.238f, -1.416f)
                curveToRelative(0.338f, 0.356f, 0.73f, 0.653f, 1.168f, 0.834f)
                curveToRelative(1.205f, 0.499f, 2.772f, 0.295f, 3.83f, -0.764f)
                curveToRelative(1.06f, -1.058f, 1.263f, -2.625f, 0.764f, -3.83f)
                arcToRelative(3.459f, 3.459f, 0.0f, false, false, -0.834f, -1.168f)
                arcToRelative(3.45f, 3.45f, 0.0f, false, false, 1.416f, -0.238f)
                curveTo(23.035f, 14.749f, 24.0f, 13.498f, 24.0f, 12.0f)
                curveToRelative(0.0f, -1.497f, -0.965f, -2.749f, -2.17f, -3.248f)
                arcToRelative(3.455f, 3.455f, 0.0f, false, false, -1.414f, -0.236f)
                curveToRelative(0.357f, -0.338f, 0.65f, -0.732f, 0.832f, -1.17f)
                curveToRelative(0.499f, -1.205f, 0.295f, -2.772f, -0.764f, -3.83f)
                arcToRelative(3.513f, 3.513f, 0.0f, false, false, -2.367f, -1.02f)
                arcToRelative(3.508f, 3.508f, 0.0f, false, false, -1.463f, 0.256f)
                curveToRelative(-0.437f, 0.181f, -0.83f, 0.475f, -1.168f, 0.832f)
                arcToRelative(3.45f, 3.45f, 0.0f, false, false, -0.238f, -1.414f)
                curveTo(14.749f, 0.965f, 13.498f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.959f, 1.613f)
                arcToRelative(1.902f, 1.902f, 0.0f, false, true, 1.387f, 3.246f)
                verticalLineToRelative(3.893f)
                lineTo(16.098f, 6.0f)
                arcTo(1.902f, 1.902f, 0.0f, true, true, 18.0f, 7.902f)
                lineToRelative(-2.752f, 2.752f)
                horizontalLineToRelative(3.893f)
                arcToRelative(1.902f, 1.902f, 0.0f, true, true, 0.0f, 2.692f)
                horizontalLineToRelative(-3.893f)
                lineTo(18.0f, 16.098f)
                arcTo(1.902f, 1.902f, 0.0f, true, true, 16.098f, 18.0f)
                lineToRelative(-2.752f, -2.752f)
                verticalLineToRelative(3.893f)
                arcToRelative(1.902f, 1.902f, 0.0f, true, true, -2.692f, 0.0f)
                verticalLineToRelative(-3.893f)
                lineTo(7.902f, 18.0f)
                arcTo(1.902f, 1.902f, 0.0f, true, true, 6.0f, 16.098f)
                lineToRelative(2.752f, -2.752f)
                lineTo(4.859f, 13.346f)
                arcToRelative(1.902f, 1.902f, 0.0f, true, true, 0.0f, -2.692f)
                horizontalLineToRelative(3.893f)
                lineTo(6.0f, 7.902f)
                arcTo(1.902f, 1.902f, 0.0f, true, true, 7.902f, 6.0f)
                lineToRelative(2.752f, 2.752f)
                lineTo(10.654f, 4.859f)
                arcToRelative(1.902f, 1.902f, 0.0f, false, true, 1.305f, -3.246f)
                close()
            }
        }
        .build()
        return _svg!!
    }

private var _svg: ImageVector? = null
