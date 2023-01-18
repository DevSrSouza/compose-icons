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

public val RemixIcons.TravestiFill: ImageVector
    get() {
        if (_travestiFill != null) {
            return _travestiFill!!
        }
        _travestiFill = Builder(name = "TravestiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.537f, 9.95f)
                lineTo(4.66f, 7.076f)
                lineTo(2.186f, 9.55f)
                lineTo(0.772f, 8.136f)
                lineToRelative(6.364f, -6.364f)
                lineTo(8.55f, 3.186f)
                lineTo(6.075f, 5.661f)
                lineToRelative(2.876f, 2.876f)
                arcTo(7.5f, 7.5f, 0.0f, true, true, 7.537f, 9.95f)
                close()
            }
        }
        .build()
        return _travestiFill!!
    }

private var _travestiFill: ImageVector? = null
