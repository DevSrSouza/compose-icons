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

public val LineAwesomeIcons.ScrollSolid: ImageVector
    get() {
        if (_scrollSolid != null) {
            return _scrollSolid!!
        }
        _scrollSolid = Builder(name = "ScrollSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                curveTo(8.355f, 4.0f, 7.0f, 5.355f, 7.0f, 7.0f)
                lineTo(7.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                lineTo(4.0f, 25.0f)
                curveTo(4.0f, 26.645f, 5.355f, 28.0f, 7.0f, 28.0f)
                lineTo(21.0f, 28.0f)
                lineTo(21.0313f, 28.0f)
                curveTo(22.6602f, 27.984f, 24.0f, 26.633f, 24.0f, 25.0f)
                lineTo(24.0f, 11.0f)
                lineTo(28.0f, 11.0f)
                lineTo(28.0f, 7.0f)
                curveTo(28.0f, 5.355f, 26.645f, 4.0f, 25.0f, 4.0f)
                lineTo(10.0f, 4.0f)
                close()
                moveTo(10.0f, 6.0f)
                lineTo(22.1875f, 6.0f)
                curveTo(22.0745f, 6.316f, 22.0f, 6.648f, 22.0f, 7.0f)
                lineTo(22.0f, 25.0f)
                curveTo(22.0f, 25.566f, 21.566f, 26.0f, 21.0f, 26.0f)
                curveTo(20.437f, 26.008f, 20.008f, 25.562f, 20.0f, 25.0f)
                lineTo(19.9688f, 21.0f)
                lineTo(9.0f, 21.0f)
                lineTo(9.0f, 7.0f)
                curveTo(9.0f, 6.434f, 9.434f, 6.0f, 10.0f, 6.0f)
                close()
                moveTo(25.0f, 6.0f)
                curveTo(25.566f, 6.0f, 26.0f, 6.434f, 26.0f, 7.0f)
                lineTo(26.0f, 9.0f)
                lineTo(24.0f, 9.0f)
                lineTo(24.0f, 7.0f)
                curveTo(24.0f, 6.434f, 24.434f, 6.0f, 25.0f, 6.0f)
                close()
                moveTo(6.0f, 23.0f)
                lineTo(14.0f, 23.0f)
                lineTo(17.9688f, 23.0f)
                lineTo(18.0f, 23.0f)
                lineTo(18.0f, 25.0f)
                lineTo(18.0f, 25.0313f)
                curveTo(18.004f, 25.3752f, 18.0745f, 25.691f, 18.1875f, 26.0f)
                lineTo(7.0f, 26.0f)
                curveTo(6.434f, 26.0f, 6.0f, 25.566f, 6.0f, 25.0f)
                lineTo(6.0f, 23.0f)
                close()
            }
        }
        .build()
        return _scrollSolid!!
    }

private var _scrollSolid: ImageVector? = null
