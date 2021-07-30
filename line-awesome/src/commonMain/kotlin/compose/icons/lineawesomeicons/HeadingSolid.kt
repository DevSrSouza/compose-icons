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

public val LineAwesomeIcons.HeadingSolid: ImageVector
    get() {
        if (_headingSolid != null) {
            return _headingSolid!!
        }
        _headingSolid = Builder(name = "HeadingSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                lineTo(6.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                lineTo(7.0f, 25.0f)
                lineTo(6.0f, 25.0f)
                lineTo(6.0f, 27.0f)
                lineTo(14.0f, 27.0f)
                lineTo(14.0f, 25.0f)
                lineTo(13.0f, 25.0f)
                lineTo(13.0f, 19.0f)
                lineTo(19.0f, 19.0f)
                lineTo(19.0f, 25.0f)
                lineTo(18.0f, 25.0f)
                lineTo(18.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                lineTo(26.0f, 25.0f)
                lineTo(25.0f, 25.0f)
                lineTo(25.0f, 7.0f)
                lineTo(26.0f, 7.0f)
                lineTo(26.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                lineTo(18.0f, 7.0f)
                lineTo(19.0f, 7.0f)
                lineTo(19.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                lineTo(13.0f, 7.0f)
                lineTo(14.0f, 7.0f)
                lineTo(14.0f, 5.0f)
                close()
                moveTo(9.0f, 7.0f)
                lineTo(11.0f, 7.0f)
                lineTo(11.0f, 15.0f)
                lineTo(21.0f, 15.0f)
                lineTo(21.0f, 7.0f)
                lineTo(23.0f, 7.0f)
                lineTo(23.0f, 25.0f)
                lineTo(21.0f, 25.0f)
                lineTo(21.0f, 17.0f)
                lineTo(11.0f, 17.0f)
                lineTo(11.0f, 25.0f)
                lineTo(9.0f, 25.0f)
                close()
            }
        }
        .build()
        return _headingSolid!!
    }

private var _headingSolid: ImageVector? = null
