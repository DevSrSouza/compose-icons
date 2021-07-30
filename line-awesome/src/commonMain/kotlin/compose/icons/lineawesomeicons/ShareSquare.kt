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

public val LineAwesomeIcons.ShareSquare: ImageVector
    get() {
        if (_shareSquare != null) {
            return _shareSquare!!
        }
        _shareSquare = Builder(name = "ShareSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.4141f, 4.4375f)
                lineTo(22.0f, 5.8516f)
                lineTo(26.168f, 10.0f)
                lineTo(16.5f, 10.0f)
                curveTo(13.468f, 10.0f, 11.0f, 12.467f, 11.0f, 15.5f)
                curveTo(11.0f, 18.533f, 13.468f, 21.0f, 16.5f, 21.0f)
                lineTo(17.0f, 21.0f)
                lineTo(17.0f, 19.0f)
                lineTo(16.5f, 19.0f)
                curveTo(14.57f, 19.0f, 13.0f, 17.43f, 13.0f, 15.5f)
                curveTo(13.0f, 13.57f, 14.57f, 12.0f, 16.5f, 12.0f)
                lineTo(26.1719f, 12.0f)
                lineTo(22.0078f, 16.1641f)
                lineTo(23.4219f, 17.5781f)
                lineTo(30.0f, 11.0f)
                lineTo(23.4141f, 4.4375f)
                close()
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 17.0f)
                lineTo(25.0f, 19.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                lineTo(17.8535f, 7.0f)
                lineTo(19.8535f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _shareSquare!!
    }

private var _shareSquare: ImageVector? = null
