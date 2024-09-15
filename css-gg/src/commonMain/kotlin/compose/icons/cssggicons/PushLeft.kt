package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.PushLeft: ImageVector
    get() {
        if (_pushLeft != null) {
            return _pushLeft!!
        }
        _pushLeft = Builder(name = "PushLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.288f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.802f)
                lineTo(11.045f, 16.243f)
                lineTo(9.631f, 17.657f)
                lineTo(3.974f, 12.0f)
                lineTo(9.631f, 6.343f)
                lineTo(11.045f, 7.757f)
                lineTo(7.802f, 11.0f)
                horizontalLineTo(22.288f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _pushLeft!!
    }

private var _pushLeft: ImageVector? = null
