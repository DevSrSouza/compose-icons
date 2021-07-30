package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.PentagonLeft: ImageVector
    get() {
        if (_pentagonLeft != null) {
            return _pentagonLeft!!
        }
        _pentagonLeft = Builder(name = "PentagonLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 12.0f)
                lineTo(18.0f, 7.0f)
                horizontalLineTo(8.0f)
                lineTo(6.0f, 12.0f)
                lineTo(8.0f, 17.0f)
                horizontalLineTo(18.0f)
                lineTo(16.0f, 12.0f)
                close()
                moveTo(15.0459f, 15.0f)
                lineTo(13.8459f, 12.0f)
                lineTo(15.0459f, 9.0f)
                horizontalLineTo(9.3541f)
                lineTo(8.1541f, 12.0f)
                lineTo(9.3541f, 15.0f)
                horizontalLineTo(15.0459f)
                close()
            }
        }
        .build()
        return _pentagonLeft!!
    }

private var _pentagonLeft: ImageVector? = null
