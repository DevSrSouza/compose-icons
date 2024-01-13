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

public val SimpleIcons.Yoast: ImageVector
    get() {
        if (_yoast != null) {
            return _yoast!!
        }
        _yoast = Builder(name = "Yoast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.61f, 0.0f)
                lineTo(11.4f, 14.477f)
                lineTo(8.806f, 6.36f)
                lineTo(5.941f, 6.36f)
                lineToRelative(3.804f, 9.77f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, true, 0.0f, 2.925f)
                curveToRelative(-0.387f, 0.993f, -1.073f, 2.158f, -2.96f, 2.505f)
                lineTo(6.785f, 24.0f)
                curveToRelative(1.512f, -0.06f, 2.692f, -0.562f, 3.694f, -1.57f)
                curveToRelative(1.032f, -1.036f, 1.919f, -2.655f, 2.79f, -5.091f)
                lineTo(19.739f, 0.0f)
                close()
                moveTo(5.357f, 3.274f)
                arcToRelative(3.706f, 3.706f, 0.0f, false, false, -3.695f, 3.695f)
                verticalLineToRelative(10.358f)
                arcToRelative(3.706f, 3.706f, 0.0f, false, false, 3.695f, 3.694f)
                horizontalLineToRelative(0.817f)
                lineToRelative(0.26f, -0.034f)
                curveToRelative(1.76f, -0.237f, 2.37f, -1.224f, 2.733f, -2.158f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 0.0f, -2.475f)
                lineTo(5.035f, 5.738f)
                lineTo(9.26f, 5.738f)
                lineToRelative(2.174f, 6.81f)
                lineToRelative(3.339f, -9.274f)
                close()
                moveTo(19.149f, 3.354f)
                lineTo(13.853f, 17.55f)
                curveToRelative(-0.502f, 1.403f, -1.015f, 2.54f, -1.559f, 3.47f)
                horizontalLineToRelative(10.044f)
                lineTo(22.338f, 6.97f)
                arcToRelative(3.706f, 3.706f, 0.0f, false, false, -3.19f, -3.616f)
                close()
            }
        }
        .build()
        return _yoast!!
    }

private var _yoast: ImageVector? = null
