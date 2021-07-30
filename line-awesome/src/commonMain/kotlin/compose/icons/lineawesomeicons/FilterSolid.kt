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

public val LineAwesomeIcons.FilterSolid: ImageVector
    get() {
        if (_filterSolid != null) {
            return _filterSolid!!
        }
        _filterSolid = Builder(name = "FilterSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                lineTo(5.0f, 6.3438f)
                lineTo(5.2188f, 6.625f)
                lineTo(13.0f, 16.3438f)
                lineTo(13.0f, 28.0f)
                lineTo(14.5938f, 26.8125f)
                lineTo(18.5938f, 23.8125f)
                lineTo(19.0f, 23.5f)
                lineTo(19.0f, 16.3438f)
                lineTo(26.7813f, 6.625f)
                lineTo(27.0f, 6.3438f)
                lineTo(27.0f, 4.0f)
                close()
                moveTo(7.2813f, 6.0f)
                lineTo(24.7188f, 6.0f)
                lineTo(17.5313f, 15.0f)
                lineTo(14.4688f, 15.0f)
                close()
                moveTo(15.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                lineTo(17.0f, 22.5f)
                lineTo(15.0f, 24.0f)
                close()
            }
        }
        .build()
        return _filterSolid!!
    }

private var _filterSolid: ImageVector? = null
