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

public val RemixIcons.ArrowDownSLine: ImageVector
    get() {
        if (_arrowDownSLine != null) {
            return _arrowDownSLine!!
        }
        _arrowDownSLine = Builder(name = "ArrowDownSLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.172f)
                lineToRelative(4.95f, -4.95f)
                lineToRelative(1.414f, 1.414f)
                lineTo(12.0f, 16.0f)
                lineTo(5.636f, 9.636f)
                lineTo(7.05f, 8.222f)
                close()
            }
        }
        .build()
        return _arrowDownSLine!!
    }

private var _arrowDownSLine: ImageVector? = null
