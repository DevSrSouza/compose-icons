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

public val LineAwesomeIcons.InfoSolid: ImageVector
    get() {
        if (_infoSolid != null) {
            return _infoSolid!!
        }
        _infoSolid = Builder(name = "InfoSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(13.8008f, 4.0f, 12.0f, 5.8008f, 12.0f, 8.0f)
                curveTo(12.0f, 10.1992f, 13.8008f, 12.0f, 16.0f, 12.0f)
                curveTo(18.1992f, 12.0f, 20.0f, 10.1992f, 20.0f, 8.0f)
                curveTo(20.0f, 5.8008f, 18.1992f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(17.1172f, 6.0f, 18.0f, 6.8828f, 18.0f, 8.0f)
                curveTo(18.0f, 9.1172f, 17.1172f, 10.0f, 16.0f, 10.0f)
                curveTo(14.8828f, 10.0f, 14.0f, 9.1172f, 14.0f, 8.0f)
                curveTo(14.0f, 6.8828f, 14.8828f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(11.0f, 13.0f)
                lineTo(11.0f, 18.0f)
                lineTo(13.0f, 18.0f)
                lineTo(13.0f, 23.0f)
                lineTo(11.0f, 23.0f)
                lineTo(11.0f, 28.0f)
                lineTo(21.0f, 28.0f)
                lineTo(21.0f, 23.0f)
                lineTo(19.0f, 23.0f)
                lineTo(19.0f, 13.0f)
                close()
                moveTo(13.0f, 15.0f)
                lineTo(17.0f, 15.0f)
                lineTo(17.0f, 25.0f)
                lineTo(19.0f, 25.0f)
                lineTo(19.0f, 26.0f)
                lineTo(13.0f, 26.0f)
                lineTo(13.0f, 25.0f)
                lineTo(15.0f, 25.0f)
                lineTo(15.0f, 16.0f)
                lineTo(13.0f, 16.0f)
                close()
            }
        }
        .build()
        return _infoSolid!!
    }

private var _infoSolid: ImageVector? = null
