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
                lineTo(5.0f, 6.344f)
                lineTo(5.219f, 6.625f)
                lineTo(13.0f, 16.344f)
                lineTo(13.0f, 28.0f)
                lineTo(14.594f, 26.813f)
                lineTo(18.594f, 23.813f)
                lineTo(19.0f, 23.5f)
                lineTo(19.0f, 16.344f)
                lineTo(26.781f, 6.625f)
                lineTo(27.0f, 6.344f)
                lineTo(27.0f, 4.0f)
                close()
                moveTo(7.281f, 6.0f)
                lineTo(24.719f, 6.0f)
                lineTo(17.531f, 15.0f)
                lineTo(14.469f, 15.0f)
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
