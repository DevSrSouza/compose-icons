package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.MugHotSolid: ImageVector
    get() {
        if (_mugHotSolid != null) {
            return _mugHotSolid!!
        }
        _mugHotSolid = Builder(name = "MugHotSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(12.0f, 6.0f)
                lineTo(14.0f, 6.0f)
                lineTo(14.0f, 2.0f)
                close()
                moveTo(16.0f, 3.0f)
                lineTo(16.0f, 6.0f)
                lineTo(18.0f, 6.0f)
                lineTo(18.0f, 3.0f)
                close()
                moveTo(6.0f, 7.0f)
                lineTo(6.0f, 25.0f)
                curveTo(6.0f, 26.645f, 7.355f, 28.0f, 9.0f, 28.0f)
                lineTo(21.0f, 28.0f)
                curveTo(22.645f, 28.0f, 24.0f, 26.645f, 24.0f, 25.0f)
                lineTo(24.0f, 20.0f)
                lineTo(26.0f, 20.0f)
                curveTo(27.645f, 20.0f, 29.0f, 18.645f, 29.0f, 17.0f)
                lineTo(29.0f, 14.0f)
                curveTo(29.0f, 12.355f, 27.645f, 11.0f, 26.0f, 11.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 7.0f)
                close()
                moveTo(8.0f, 9.0f)
                lineTo(22.0f, 9.0f)
                lineTo(22.0f, 25.0f)
                curveTo(22.0f, 25.555f, 21.555f, 26.0f, 21.0f, 26.0f)
                lineTo(9.0f, 26.0f)
                curveTo(8.445f, 26.0f, 8.0f, 25.555f, 8.0f, 25.0f)
                close()
                moveTo(24.0f, 13.0f)
                lineTo(26.0f, 13.0f)
                curveTo(26.555f, 13.0f, 27.0f, 13.445f, 27.0f, 14.0f)
                lineTo(27.0f, 17.0f)
                curveTo(27.0f, 17.555f, 26.555f, 18.0f, 26.0f, 18.0f)
                lineTo(24.0f, 18.0f)
                close()
            }
        }
        .build()
        return _mugHotSolid!!
    }

private var _mugHotSolid: ImageVector? = null
