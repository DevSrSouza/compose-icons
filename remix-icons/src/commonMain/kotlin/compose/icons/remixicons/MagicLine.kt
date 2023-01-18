package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MagicLine: ImageVector
    get() {
        if (_magicLine != null) {
            return _magicLine!!
        }
        _magicLine = Builder(name = "MagicLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.199f, 9.945f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, -0.79f, -1.551f)
                lineToRelative(-0.403f, -3.083f)
                lineToRelative(-2.73f, 1.486f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, -1.72f, 0.273f)
                lineTo(6.5f, 6.5f)
                lineToRelative(0.57f, 3.056f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, -0.273f, 1.72f)
                lineToRelative(-1.486f, 2.73f)
                lineToRelative(3.083f, 0.403f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 1.55f, 0.79f)
                lineToRelative(2.138f, 2.257f)
                lineToRelative(1.336f, -2.807f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 1.23f, -1.231f)
                lineToRelative(2.808f, -1.336f)
                lineToRelative(-2.257f, -2.137f)
                close()
                moveTo(15.224f, 15.508f)
                lineToRelative(-2.213f, 4.65f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.977f, 0.155f)
                lineToRelative(-3.542f, -3.739f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.357f, -0.182f)
                lineToRelative(-5.107f, -0.668f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.449f, -0.881f)
                lineToRelative(2.462f, -4.524f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.062f, -0.396f)
                lineTo(4.16f, 4.86f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.7f, -0.7f)
                lineToRelative(5.063f, 0.943f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.396f, -0.062f)
                lineToRelative(4.524f, -2.462f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.881f, 0.45f)
                lineToRelative(0.668f, 5.106f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.182f, 0.357f)
                lineToRelative(3.739f, 3.542f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.155f, 0.977f)
                lineToRelative(-4.65f, 2.213f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.284f, 0.284f)
                close()
                moveTo(16.021f, 17.435f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(4.243f, 4.242f)
                lineToRelative(-1.415f, 1.415f)
                lineToRelative(-4.242f, -4.243f)
                close()
            }
        }
        .build()
        return _magicLine!!
    }

private var _magicLine: ImageVector? = null
