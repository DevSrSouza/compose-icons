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

public val RemixIcons.KnifeFill: ImageVector
    get() {
        if (_knifeFill != null) {
            return _knifeFill!!
        }
        _knifeFill = Builder(name = "KnifeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.373f, 19.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.121f, 2.12f)
                lineToRelative(-4.596f, -4.596f)
                lineTo(12.12f, 20.5f)
                lineToRelative(-7.778f, -7.778f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.174f, -11.135f)
                lineToRelative(0.174f, -0.179f)
                lineTo(22.373f, 19.44f)
                close()
            }
        }
        .build()
        return _knifeFill!!
    }

private var _knifeFill: ImageVector? = null
