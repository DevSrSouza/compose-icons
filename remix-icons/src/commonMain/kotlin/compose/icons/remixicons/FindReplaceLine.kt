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

public val RemixIcons.FindReplaceLine: ImageVector
    get() {
        if (_findReplaceLine != null) {
            return _findReplaceLine!!
        }
        _findReplaceLine = Builder(name = "FindReplaceLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.033f, 16.618f)
                lineToRelative(4.28f, 4.281f)
                lineToRelative(-1.414f, 1.415f)
                lineToRelative(-4.28f, -4.281f)
                arcTo(8.963f, 8.963f, 0.0f, false, true, 11.0f, 20.0f)
                arcToRelative(8.998f, 8.998f, 0.0f, false, true, -8.065f, -5.0f)
                horizontalLineTo(9.0f)
                lineToRelative(-1.304f, 2.173f)
                arcTo(6.972f, 6.972f, 0.0f, false, false, 11.0f, 18.0f)
                arcToRelative(6.977f, 6.977f, 0.0f, false, false, 4.875f, -1.975f)
                lineToRelative(0.15f, -0.15f)
                arcTo(6.977f, 6.977f, 0.0f, false, false, 18.0f, 11.0f)
                curveToRelative(0.0f, -0.695f, -0.101f, -1.366f, -0.29f, -2.0f)
                horizontalLineToRelative(2.067f)
                curveToRelative(0.146f, 0.643f, 0.223f, 1.313f, 0.223f, 2.0f)
                arcToRelative(8.963f, 8.963f, 0.0f, false, true, -1.967f, 5.618f)
                close()
                moveTo(19.065f, 7.0f)
                horizontalLineTo(13.0f)
                lineToRelative(1.304f, -2.173f)
                arcTo(6.972f, 6.972f, 0.0f, false, false, 11.0f, 4.0f)
                curveToRelative(-3.868f, 0.0f, -7.0f, 3.132f, -7.0f, 7.0f)
                curveToRelative(0.0f, 0.695f, 0.101f, 1.366f, 0.29f, 2.0f)
                horizontalLineTo(2.223f)
                arcTo(9.038f, 9.038f, 0.0f, false, true, 2.0f, 11.0f)
                curveToRelative(0.0f, -4.973f, 4.027f, -9.0f, 9.0f, -9.0f)
                arcToRelative(8.998f, 8.998f, 0.0f, false, true, 8.065f, 5.0f)
                close()
            }
        }
        .build()
        return _findReplaceLine!!
    }

private var _findReplaceLine: ImageVector? = null
