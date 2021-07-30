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

public val SimpleIcons.Apostrophe: ImageVector
    get() {
        if (_apostrophe != null) {
            return _apostrophe!!
        }
        _apostrophe = Builder(name = "Apostrophe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.674f, 0.0f)
                curveToRelative(-0.795f, 0.001f, -1.794f, 0.095f, -3.167f, 0.313f)
                lineToRelative(-4.6f, 0.729f)
                curveToRelative(-3.138f, 0.497f, -4.224f, 1.003f, -5.274f, 1.798f)
                arcToRelative(6.485f, 6.485f, 0.0f, false, false, -2.24f, 3.082f)
                curveToRelative(-0.43f, 1.245f, -0.577f, 2.434f, -0.08f, 5.571f)
                lineToRelative(0.729f, 4.6f)
                curveToRelative(0.497f, 3.138f, 1.003f, 4.22f, 1.798f, 5.273f)
                arcToRelative(6.485f, 6.485f, 0.0f, false, false, 3.082f, 2.24f)
                curveToRelative(1.245f, 0.431f, 2.434f, 0.578f, 5.571f, 0.081f)
                lineToRelative(4.6f, -0.729f)
                curveToRelative(3.138f, -0.497f, 4.22f, -1.003f, 5.273f, -1.799f)
                arcToRelative(6.477f, 6.477f, 0.0f, false, false, 2.24f, -3.081f)
                curveToRelative(0.431f, -1.245f, 0.578f, -2.434f, 0.082f, -5.571f)
                lineToRelative(-0.73f, -4.6f)
                curveToRelative(-0.497f, -3.138f, -1.003f, -4.224f, -1.799f, -5.274f)
                arcToRelative(6.477f, 6.477f, 0.0f, false, false, -3.081f, -2.24f)
                curveTo(17.378f, 0.152f, 16.695f, 0.0f, 15.674f, 0.0f)
                close()
                moveTo(10.355f, 4.566f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.003f, 0.0f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.52f, 0.444f)
                lineToRelative(0.77f, 4.865f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, -0.435f, 0.6f)
                lineToRelative(-4.859f, 0.77f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, -0.602f, -0.436f)
                lineToRelative(-0.77f, -4.866f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.435f, -0.6f)
                lineToRelative(4.86f, -0.77f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.078f, -0.007f)
                close()
                moveTo(9.92f, 5.692f)
                lineToRelative(-3.823f, 0.605f)
                lineToRelative(0.612f, 3.83f)
                lineToRelative(3.813f, -0.605f)
                close()
                moveTo(16.424f, 8.602f)
                arcToRelative(3.274f, 3.274f, 0.0f, false, true, 0.497f, 6.513f)
                arcToRelative(3.258f, 3.258f, 0.0f, false, true, -3.713f, -2.726f)
                arcToRelative(3.274f, 3.274f, 0.0f, false, true, 3.216f, -3.787f)
                close()
                moveTo(16.37f, 9.66f)
                arcToRelative(2.226f, 2.226f, 0.0f, true, false, 0.388f, 4.42f)
                arcToRelative(2.208f, 2.208f, 0.0f, false, false, 1.818f, -2.541f)
                arcToRelative(2.226f, 2.226f, 0.0f, false, false, -2.206f, -1.879f)
                close()
                moveTo(9.92f, 12.66f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.424f, 0.208f)
                lineToRelative(3.824f, 4.964f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, -0.333f, 0.839f)
                lineToRelative(-5.932f, 0.937f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, -0.576f, -0.695f)
                lineToRelative(2.108f, -5.901f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.486f, -0.352f)
                close()
                moveTo(10.1f, 14.271f)
                lineTo(8.61f, 18.438f)
                lineToRelative(4.186f, -0.664f)
                close()
            }
        }
        .build()
        return _apostrophe!!
    }

private var _apostrophe: ImageVector? = null
