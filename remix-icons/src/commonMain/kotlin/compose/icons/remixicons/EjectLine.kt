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

public val RemixIcons.EjectLine: ImageVector
    get() {
        if (_ejectLine != null) {
            return _ejectLine!!
        }
        _ejectLine = Builder(name = "EjectLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.737f, 13.0f)
                horizontalLineToRelative(8.526f)
                lineTo(12.0f, 6.606f)
                lineTo(7.737f, 13.0f)
                close()
                moveTo(12.416f, 3.624f)
                lineToRelative(7.066f, 10.599f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.416f, 0.777f)
                lineTo(4.934f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.416f, -0.777f)
                lineToRelative(7.066f, -10.599f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.832f, 0.0f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(5.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _ejectLine!!
    }

private var _ejectLine: ImageVector? = null
