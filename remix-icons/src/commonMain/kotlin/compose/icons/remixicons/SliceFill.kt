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

public val RemixIcons.SliceFill: ImageVector
    get() {
        if (_sliceFill != null) {
            return _sliceFill!!
        }
        _sliceFill = Builder(name = "SliceFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.768f, 12.232f)
                lineToRelative(2.121f, 2.122f)
                curveToRelative(-4.596f, 4.596f, -10.253f, 6.01f, -13.788f, 5.303f)
                lineTo(17.657f, 4.1f)
                lineToRelative(2.121f, 2.12f)
                lineToRelative(-6.01f, 6.011f)
                close()
            }
        }
        .build()
        return _sliceFill!!
    }

private var _sliceFill: ImageVector? = null
