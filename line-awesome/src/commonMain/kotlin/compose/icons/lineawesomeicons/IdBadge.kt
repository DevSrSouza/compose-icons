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

public val LineAwesomeIcons.IdBadge: ImageVector
    get() {
        if (_idBadge != null) {
            return _idBadge!!
        }
        _idBadge = Builder(name = "IdBadge", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                curveTo(13.906f, 3.0f, 13.0f, 3.906f, 13.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                lineTo(7.0f, 28.0f)
                lineTo(25.0f, 28.0f)
                lineTo(25.0f, 5.0f)
                lineTo(19.0f, 5.0f)
                curveTo(19.0f, 3.906f, 18.094f, 3.0f, 17.0f, 3.0f)
                close()
                moveTo(15.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                lineTo(17.0f, 7.0f)
                lineTo(15.0f, 7.0f)
                close()
                moveTo(9.0f, 7.0f)
                lineTo(13.0f, 7.0f)
                lineTo(13.0f, 9.0f)
                lineTo(19.0f, 9.0f)
                lineTo(19.0f, 7.0f)
                lineTo(23.0f, 7.0f)
                lineTo(23.0f, 26.0f)
                lineTo(9.0f, 26.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(13.801f, 11.0f, 12.0f, 12.801f, 12.0f, 15.0f)
                curveTo(12.0f, 16.113f, 12.477f, 17.117f, 13.219f, 17.844f)
                curveTo(11.887f, 18.746f, 11.0f, 20.281f, 11.0f, 22.0f)
                lineTo(13.0f, 22.0f)
                curveTo(13.0f, 20.332f, 14.332f, 19.0f, 16.0f, 19.0f)
                curveTo(17.668f, 19.0f, 19.0f, 20.332f, 19.0f, 22.0f)
                lineTo(21.0f, 22.0f)
                curveTo(21.0f, 20.281f, 20.113f, 18.746f, 18.781f, 17.844f)
                curveTo(19.523f, 17.117f, 20.0f, 16.113f, 20.0f, 15.0f)
                curveTo(20.0f, 12.801f, 18.199f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(17.117f, 13.0f, 18.0f, 13.883f, 18.0f, 15.0f)
                curveTo(18.0f, 16.117f, 17.117f, 17.0f, 16.0f, 17.0f)
                curveTo(14.883f, 17.0f, 14.0f, 16.117f, 14.0f, 15.0f)
                curveTo(14.0f, 13.883f, 14.883f, 13.0f, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _idBadge!!
    }

private var _idBadge: ImageVector? = null
