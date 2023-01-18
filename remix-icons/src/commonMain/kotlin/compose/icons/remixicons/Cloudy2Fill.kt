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

public val RemixIcons.Cloudy2Fill: ImageVector
    get() {
        if (_cloudy2Fill != null) {
            return _cloudy2Fill!!
        }
        _cloudy2Fill = Builder(name = "Cloudy2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 21.0f)
                horizontalLineTo(7.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 5.008f, 9.339f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 13.984f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 17.0f, 21.0f)
                close()
            }
        }
        .build()
        return _cloudy2Fill!!
    }

private var _cloudy2Fill: ImageVector? = null
