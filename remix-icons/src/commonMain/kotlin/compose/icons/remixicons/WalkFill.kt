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

public val RemixIcons.WalkFill: ImageVector
    get() {
        if (_walkFill != null) {
            return _walkFill!!
        }
        _walkFill = Builder(name = "WalkFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.617f, 8.712f)
                lineToRelative(3.205f, -2.328f)
                arcTo(1.995f, 1.995f, 0.0f, false, true, 12.065f, 6.0f)
                arcToRelative(2.616f, 2.616f, 0.0f, false, true, 2.427f, 1.82f)
                curveToRelative(0.186f, 0.583f, 0.356f, 0.977f, 0.51f, 1.182f)
                arcTo(4.992f, 4.992f, 0.0f, false, false, 19.0f, 11.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(6.986f, 6.986f, 0.0f, false, true, -5.402f, -2.547f)
                lineToRelative(-0.697f, 3.955f)
                lineToRelative(2.061f, 1.73f)
                lineToRelative(2.223f, 6.108f)
                lineToRelative(-1.88f, 0.684f)
                lineToRelative(-2.04f, -5.604f)
                lineToRelative(-3.39f, -2.845f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.713f, -1.904f)
                lineToRelative(0.509f, -2.885f)
                lineToRelative(-0.677f, 0.492f)
                lineToRelative(-2.127f, 2.928f)
                lineToRelative(-1.618f, -1.176f)
                lineTo(7.6f, 8.7f)
                lineToRelative(0.017f, 0.012f)
                close()
                moveTo(13.5f, 5.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
                moveTo(10.528f, 18.681f)
                lineToRelative(-3.214f, 3.83f)
                lineToRelative(-1.532f, -1.285f)
                lineToRelative(2.976f, -3.546f)
                lineToRelative(0.746f, -2.18f)
                lineToRelative(1.791f, 1.5f)
                lineToRelative(-0.767f, 1.681f)
                close()
            }
        }
        .build()
        return _walkFill!!
    }

private var _walkFill: ImageVector? = null
