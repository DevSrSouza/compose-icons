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
                moveTo(11.0001f, 22.2877f)
                horizontalLineTo(13.0001f)
                verticalLineTo(7.8024f)
                lineTo(16.2428f, 11.045f)
                lineTo(17.657f, 9.6308f)
                lineTo(12.0001f, 3.9739f)
                lineTo(6.3433f, 9.6308f)
                lineTo(7.7575f, 11.045f)
                lineTo(11.0001f, 7.8024f)
                verticalLineTo(22.2877f)
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
