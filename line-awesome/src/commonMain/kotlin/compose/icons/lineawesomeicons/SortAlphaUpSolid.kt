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

public val LineAwesomeIcons.SortAlphaUpSolid: ImageVector
    get() {
        if (_sortAlphaUpSolid != null) {
            return _sortAlphaUpSolid!!
        }
        _sortAlphaUpSolid = Builder(name = "SortAlphaUpSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.189f, 5.0f)
                lineTo(7.971f, 5.66f)
                lineTo(6.029f, 11.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 11.061f)
                lineTo(5.061f, 13.66f)
                lineTo(5.0f, 13.811f)
                lineTo(5.0f, 15.0f)
                lineTo(7.0f, 15.0f)
                lineTo(7.0f, 14.16f)
                lineTo(7.41f, 13.0f)
                lineTo(10.59f, 13.0f)
                lineTo(11.0f, 14.16f)
                lineTo(11.0f, 15.0f)
                lineTo(13.0f, 15.0f)
                lineTo(13.0f, 13.811f)
                lineTo(12.939f, 13.66f)
                lineTo(12.0f, 11.061f)
                lineTo(12.0f, 11.0f)
                lineTo(11.971f, 11.0f)
                lineTo(10.029f, 5.66f)
                lineTo(9.811f, 5.0f)
                lineTo(8.189f, 5.0f)
                close()
                moveTo(23.0f, 5.5f)
                lineTo(22.279f, 6.189f)
                lineTo(18.0f, 10.5f)
                lineTo(19.41f, 11.91f)
                lineTo(22.0f, 9.311f)
                lineTo(22.0f, 28.0f)
                lineTo(24.0f, 28.0f)
                lineTo(24.0f, 9.311f)
                lineTo(26.59f, 11.91f)
                lineTo(28.0f, 10.5f)
                lineTo(23.721f, 6.189f)
                lineTo(23.0f, 5.5f)
                close()
                moveTo(9.0f, 8.66f)
                lineTo(9.84f, 11.0f)
                lineTo(8.16f, 11.0f)
                lineTo(9.0f, 8.66f)
                close()
                moveTo(5.0f, 17.0f)
                lineTo(5.0f, 19.0f)
                lineTo(10.561f, 19.0f)
                lineTo(5.279f, 24.279f)
                lineTo(5.0f, 24.59f)
                lineTo(5.0f, 27.0f)
                lineTo(13.0f, 27.0f)
                lineTo(13.0f, 25.0f)
                lineTo(7.439f, 25.0f)
                lineTo(12.721f, 19.721f)
                lineTo(13.0f, 19.41f)
                lineTo(13.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                close()
            }
        }
        .build()
        return _sortAlphaUpSolid!!
    }

private var _sortAlphaUpSolid: ImageVector? = null
