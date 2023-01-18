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

public val RemixIcons.RainyFill: ImageVector
    get() {
        if (_rainyFill != null) {
            return _rainyFill!!
        }
        _rainyFill = Builder(name = "RainyFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.86f, 18.0f)
                lineToRelative(-3.153f, -3.153f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(8.18f, 17.96f)
                arcTo(8.001f, 8.001f, 0.0f, true, true, 15.98f, 6.087f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 17.0f, 18.0f)
                horizontalLineToRelative(-1.139f)
                close()
                moveTo(10.232f, 18.732f)
                lineTo(12.0f, 16.964f)
                lineToRelative(1.768f, 1.768f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -3.536f, 0.0f)
                close()
            }
        }
        .build()
        return _rainyFill!!
    }

private var _rainyFill: ImageVector? = null
