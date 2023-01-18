package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(58.9f, 52.0f)
                lineTo(197.1f, 52.0f)
                arcTo(6.9f, 6.9f, 0.0f, false, true, 204.0f, 58.9f)
                lineTo(204.0f, 197.1f)
                arcTo(6.9f, 6.9f, 0.0f, false, true, 197.1f, 204.0f)
                lineTo(58.9f, 204.0f)
                arcTo(6.9f, 6.9f, 0.0f, false, true, 52.0f, 197.1f)
                lineTo(52.0f, 58.9f)
                arcTo(6.9f, 6.9f, 0.0f, false, true, 58.9f, 52.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.1f, 212.0f)
                horizontalLineTo(58.9f)
                arcTo(14.9f, 14.9f, 0.0f, false, true, 44.0f, 197.1f)
                verticalLineTo(58.9f)
                arcTo(14.9f, 14.9f, 0.0f, false, true, 58.9f, 44.0f)
                horizontalLineTo(197.1f)
                arcTo(14.9f, 14.9f, 0.0f, false, true, 212.0f, 58.9f)
                verticalLineTo(197.1f)
                arcTo(14.9f, 14.9f, 0.0f, false, true, 197.1f, 212.0f)
                close()
                moveTo(60.0f, 196.0f)
                horizontalLineTo(196.0f)
                verticalLineTo(60.0f)
                horizontalLineTo(60.0f)
                close()
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
