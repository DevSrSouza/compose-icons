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

public val CssGgIcons.ArrowLongLeftR: ImageVector
    get() {
        if (_arrowLongLeftR != null) {
            return _arrowLongLeftR!!
        }
        _arrowLongLeftR = Builder(name = "ArrowLongLeftR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.6487f, 7.7253f)
                lineTo(0.3989f, 11.9608f)
                lineTo(4.6344f, 16.2105f)
                lineTo(6.051f, 14.7987f)
                lineTo(4.2367f, 12.9783f)
                lineTo(16.1027f, 13.019f)
                lineTo(19.3585f, 16.2747f)
                lineTo(23.6011f, 12.0321f)
                lineTo(19.3585f, 7.7895f)
                lineTo(16.1289f, 11.019f)
                lineTo(4.218f, 10.9782f)
                lineTo(6.0606f, 9.1419f)
                lineTo(4.6487f, 7.7253f)
                close()
                moveTo(17.9443f, 12.0321f)
                lineTo(19.3585f, 10.6179f)
                lineTo(20.7727f, 12.0321f)
                lineTo(19.3585f, 13.4463f)
                lineTo(17.9443f, 12.0321f)
                close()
            }
        }
        .build()
        return _arrowLongLeftR!!
    }

private var _arrowLongLeftR: ImageVector? = null
