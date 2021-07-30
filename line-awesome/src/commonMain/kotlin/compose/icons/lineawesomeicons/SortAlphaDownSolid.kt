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

public val LineAwesomeIcons.SortAlphaDownSolid: ImageVector
    get() {
        if (_sortAlphaDownSolid != null) {
            return _sortAlphaDownSolid!!
        }
        _sortAlphaDownSolid = Builder(name = "SortAlphaDownSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1875f, 5.0f)
                lineTo(7.9688f, 5.6563f)
                lineTo(6.0313f, 11.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 11.0625f)
                lineTo(5.0625f, 13.6563f)
                lineTo(5.0f, 13.8125f)
                lineTo(5.0f, 15.0f)
                lineTo(7.0f, 15.0f)
                lineTo(7.0f, 14.1563f)
                lineTo(7.4063f, 13.0f)
                lineTo(10.5938f, 13.0f)
                lineTo(11.0f, 14.1563f)
                lineTo(11.0f, 15.0f)
                lineTo(13.0f, 15.0f)
                lineTo(13.0f, 13.8125f)
                lineTo(12.9375f, 13.6563f)
                lineTo(12.0f, 11.0625f)
                lineTo(12.0f, 11.0f)
                lineTo(11.9688f, 11.0f)
                lineTo(10.0313f, 5.6563f)
                lineTo(9.8125f, 5.0f)
                close()
                moveTo(22.0f, 5.0f)
                lineTo(22.0f, 23.6875f)
                lineTo(19.4063f, 21.0938f)
                lineTo(18.0f, 22.5f)
                lineTo(22.2813f, 26.8125f)
                lineTo(23.0f, 27.5f)
                lineTo(23.7188f, 26.8125f)
                lineTo(28.0f, 22.5f)
                lineTo(26.5938f, 21.0938f)
                lineTo(24.0f, 23.6875f)
                lineTo(24.0f, 5.0f)
                close()
                moveTo(9.0f, 8.6563f)
                lineTo(9.8438f, 11.0f)
                lineTo(8.1563f, 11.0f)
                close()
                moveTo(5.0f, 17.0f)
                lineTo(5.0f, 19.0f)
                lineTo(10.5625f, 19.0f)
                lineTo(5.2813f, 24.2813f)
                lineTo(5.0f, 24.5938f)
                lineTo(5.0f, 27.0f)
                lineTo(13.0f, 27.0f)
                lineTo(13.0f, 25.0f)
                lineTo(7.4375f, 25.0f)
                lineTo(12.7188f, 19.7188f)
                lineTo(13.0f, 19.4063f)
                lineTo(13.0f, 17.0f)
                close()
            }
        }
        .build()
        return _sortAlphaDownSolid!!
    }

private var _sortAlphaDownSolid: ImageVector? = null
