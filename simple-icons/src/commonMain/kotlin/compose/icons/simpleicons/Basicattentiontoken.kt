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

public val SimpleIcons.Basicattentiontoken: ImageVector
    get() {
        if (_basicattentiontoken != null) {
            return _basicattentiontoken!!
        }
        _basicattentiontoken = Builder(name = "Basicattentiontoken", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.917f, 21.886f)
                lineToRelative(0.062f, -0.124f)
                verticalLineToRelative(-0.042f)
                curveToRelative(0.0f, -0.041f, 0.021f, -0.083f, 0.021f, -0.103f)
                verticalLineToRelative(-0.042f)
                curveToRelative(0.0f, -0.041f, 0.0f, -0.103f, -0.02f, -0.145f)
                lineToRelative(-0.063f, -0.124f)
                verticalLineToRelative(-0.021f)
                lineTo(12.54f, 2.135f)
                arcTo(0.618f, 0.618f, 0.0f, false, false, 12.0f, 1.824f)
                curveToRelative(-0.228f, 0.0f, -0.415f, 0.124f, -0.539f, 0.31f)
                lineTo(0.083f, 21.265f)
                verticalLineToRelative(0.021f)
                lineToRelative(-0.062f, 0.124f)
                curveTo(0.0f, 21.451f, 0.0f, 21.513f, 0.0f, 21.554f)
                verticalLineToRelative(0.042f)
                curveToRelative(0.0f, 0.041f, 0.0f, 0.083f, 0.02f, 0.103f)
                verticalLineToRelative(0.042f)
                curveToRelative(0.021f, 0.041f, 0.021f, 0.083f, 0.063f, 0.124f)
                lineToRelative(0.02f, 0.021f)
                curveToRelative(0.021f, 0.041f, 0.042f, 0.083f, 0.084f, 0.104f)
                lineToRelative(0.062f, 0.062f)
                curveToRelative(0.02f, 0.02f, 0.041f, 0.041f, 0.062f, 0.041f)
                curveToRelative(0.02f, 0.021f, 0.062f, 0.021f, 0.083f, 0.042f)
                curveToRelative(0.02f, 0.0f, 0.041f, 0.02f, 0.062f, 0.02f)
                curveToRelative(0.062f, 0.021f, 0.104f, 0.021f, 0.166f, 0.021f)
                horizontalLineToRelative(22.736f)
                curveToRelative(0.062f, 0.0f, 0.103f, 0.0f, 0.165f, -0.02f)
                curveToRelative(0.021f, 0.0f, 0.042f, -0.021f, 0.063f, -0.021f)
                curveToRelative(0.041f, -0.021f, 0.062f, -0.021f, 0.103f, -0.042f)
                curveToRelative(0.02f, -0.02f, 0.042f, -0.02f, 0.062f, -0.041f)
                lineToRelative(0.062f, -0.062f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, false, 0.083f, -0.104f)
                horizontalLineToRelative(0.021f)
                close()
                moveTo(12.0f, 11.316f)
                lineToRelative(3.627f, 5.845f)
                lineTo(8.373f, 17.161f)
                lineTo(12.0f, 11.316f)
                close()
                moveTo(11.378f, 9.969f)
                lineTo(6.818f, 17.326f)
                lineTo(2.363f, 19.876f)
                lineTo(11.378f, 4.726f)
                verticalLineToRelative(5.243f)
                close()
                moveTo(7.42f, 18.425f)
                horizontalLineToRelative(9.14f)
                lineToRelative(4.456f, 2.55f)
                lineTo(2.964f, 20.975f)
                lineToRelative(4.456f, -2.55f)
                close()
                moveTo(17.181f, 17.326f)
                lineTo(12.621f, 9.969f)
                lineTo(12.621f, 4.725f)
                lineToRelative(9.016f, 15.15f)
                lineToRelative(-4.456f, -2.549f)
                close()
            }
        }
        .build()
        return _basicattentiontoken!!
    }

private var _basicattentiontoken: ImageVector? = null
