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

public val SimpleIcons.Tidal: ImageVector
    get() {
        if (_tidal != null) {
            return _tidal!!
        }
        _tidal = Builder(name = "Tidal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.012f, 3.992f)
                lineTo(8.008f, 7.996f)
                lineTo(4.004f, 3.992f)
                lineTo(0.0f, 7.996f)
                lineTo(4.004f, 12.0f)
                lineToRelative(4.004f, -4.004f)
                lineTo(12.012f, 12.0f)
                lineToRelative(-4.004f, 4.004f)
                lineToRelative(4.004f, 4.004f)
                lineToRelative(4.004f, -4.004f)
                lineTo(12.012f, 12.0f)
                lineToRelative(4.004f, -4.004f)
                lineToRelative(-4.004f, -4.004f)
                close()
                moveTo(16.042f, 7.996f)
                lineToRelative(3.979f, -3.979f)
                lineTo(24.0f, 7.996f)
                lineToRelative(-3.979f, 3.979f)
                close()
            }
        }
        .build()
        return _tidal!!
    }

private var _tidal: ImageVector? = null
