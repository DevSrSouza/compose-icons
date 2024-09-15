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
                moveTo(8.188f, 5.0f)
                lineTo(7.969f, 5.656f)
                lineTo(6.031f, 11.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 11.063f)
                lineTo(5.063f, 13.656f)
                lineTo(5.0f, 13.813f)
                lineTo(5.0f, 15.0f)
                lineTo(7.0f, 15.0f)
                lineTo(7.0f, 14.156f)
                lineTo(7.406f, 13.0f)
                lineTo(10.594f, 13.0f)
                lineTo(11.0f, 14.156f)
                lineTo(11.0f, 15.0f)
                lineTo(13.0f, 15.0f)
                lineTo(13.0f, 13.813f)
                lineTo(12.938f, 13.656f)
                lineTo(12.0f, 11.063f)
                lineTo(12.0f, 11.0f)
                lineTo(11.969f, 11.0f)
                lineTo(10.031f, 5.656f)
                lineTo(9.813f, 5.0f)
                close()
                moveTo(22.0f, 5.0f)
                lineTo(22.0f, 23.688f)
                lineTo(19.406f, 21.094f)
                lineTo(18.0f, 22.5f)
                lineTo(22.281f, 26.813f)
                lineTo(23.0f, 27.5f)
                lineTo(23.719f, 26.813f)
                lineTo(28.0f, 22.5f)
                lineTo(26.594f, 21.094f)
                lineTo(24.0f, 23.688f)
                lineTo(24.0f, 5.0f)
                close()
                moveTo(9.0f, 8.656f)
                lineTo(9.844f, 11.0f)
                lineTo(8.156f, 11.0f)
                close()
                moveTo(5.0f, 17.0f)
                lineTo(5.0f, 19.0f)
                lineTo(10.563f, 19.0f)
                lineTo(5.281f, 24.281f)
                lineTo(5.0f, 24.594f)
                lineTo(5.0f, 27.0f)
                lineTo(13.0f, 27.0f)
                lineTo(13.0f, 25.0f)
                lineTo(7.438f, 25.0f)
                lineTo(12.719f, 19.719f)
                lineTo(13.0f, 19.406f)
                lineTo(13.0f, 17.0f)
                close()
            }
        }
        .build()
        return _sortAlphaDownSolid!!
    }

private var _sortAlphaDownSolid: ImageVector? = null
