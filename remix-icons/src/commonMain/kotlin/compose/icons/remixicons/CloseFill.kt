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

public val RemixIcons.CloseFill: ImageVector
    get() {
        if (_closeFill != null) {
            return _closeFill!!
        }
        _closeFill = Builder(name = "CloseFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.586f)
                lineToRelative(4.95f, -4.95f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(4.95f, 4.95f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-4.95f, -4.95f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(4.95f, -4.95f)
                lineToRelative(-4.95f, -4.95f)
                lineTo(7.05f, 5.636f)
                close()
            }
        }
        .build()
        return _closeFill!!
    }

private var _closeFill: ImageVector? = null
