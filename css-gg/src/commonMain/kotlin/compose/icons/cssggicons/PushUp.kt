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

public val CssGgIcons.PushUp: ImageVector
    get() {
        if (_pushUp != null) {
            return _pushUp!!
        }
        _pushUp = Builder(name = "PushUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 22.288f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.802f)
                lineTo(16.243f, 11.045f)
                lineTo(17.657f, 9.631f)
                lineTo(12.0f, 3.974f)
                lineTo(6.343f, 9.631f)
                lineTo(7.757f, 11.045f)
                lineTo(11.0f, 7.802f)
                verticalLineTo(22.288f)
                close()
                moveTo(18.0f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _pushUp!!
    }

private var _pushUp: ImageVector? = null
