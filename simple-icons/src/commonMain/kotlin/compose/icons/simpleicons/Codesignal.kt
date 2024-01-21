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

public val SimpleIcons.Codesignal: ImageVector
    get() {
        if (_codesignal != null) {
            return _codesignal!!
        }
        _codesignal = Builder(name = "Codesignal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 1.212f)
                lineTo(13.012f, 2.787f)
                lineTo(12.0f, 5.62f)
                lineToRelative(-1.01f, -2.833f)
                lineTo(0.0f, 1.212f)
                lineTo(3.672f, 11.45f)
                lineToRelative(4.512f, 0.646f)
                lineToRelative(3.815f, 10.691f)
                lineToRelative(3.816f, -10.691f)
                lineToRelative(4.512f, -0.646f)
                close()
                moveTo(20.375f, 5.618f)
                lineTo(15.855f, 6.266f)
                lineTo(15.125f, 8.31f)
                lineTo(19.642f, 7.663f)
                lineTo(18.908f, 9.71f)
                lineTo(14.394f, 10.357f)
                lineTo(12.0f, 17.064f)
                lineToRelative(-2.393f, -6.707f)
                lineToRelative(-4.514f, -0.647f)
                lineToRelative(-0.735f, -2.047f)
                lineToRelative(4.518f, 0.647f)
                lineToRelative(-0.73f, -2.044f)
                lineToRelative(-4.52f, -0.648f)
                lineToRelative(-0.735f, -2.047f)
                lineToRelative(6.676f, 0.956f)
                lineTo(12.0f, 11.345f)
                lineToRelative(2.434f, -6.818f)
                lineToRelative(6.676f, -0.956f)
                close()
            }
        }
        .build()
        return _codesignal!!
    }

private var _codesignal: ImageVector? = null
