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

public val LineAwesomeIcons.Dev: ImageVector
    get() {
        if (_dev != null) {
            return _dev!!
        }
        _dev = Builder(name = "Dev", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                lineTo(2.0f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(4.0f, 9.0f)
                lineTo(28.0f, 9.0f)
                lineTo(28.0f, 23.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(6.0f, 11.0f)
                lineTo(6.0f, 21.0f)
                lineTo(9.0f, 21.0f)
                curveTo(10.654f, 21.0f, 12.0f, 19.654f, 12.0f, 18.0f)
                lineTo(12.0f, 14.0f)
                curveTo(12.0f, 12.346f, 10.654f, 11.0f, 9.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(14.897f, 11.0f, 14.0f, 11.897f, 14.0f, 13.0f)
                lineTo(14.0f, 19.0f)
                curveTo(14.0f, 20.103f, 14.897f, 21.0f, 16.0f, 21.0f)
                lineTo(18.0f, 21.0f)
                lineTo(18.0f, 19.0f)
                lineTo(16.0f, 19.0f)
                lineTo(16.0f, 17.0f)
                lineTo(18.0f, 17.0f)
                lineTo(18.0f, 15.0f)
                lineTo(16.0f, 15.0f)
                lineTo(16.0f, 13.0f)
                lineTo(18.0f, 13.0f)
                lineTo(18.0f, 11.0f)
                lineTo(16.0f, 11.0f)
                close()
                moveTo(19.6914f, 11.0f)
                lineTo(21.7754f, 20.0254f)
                curveTo(21.9074f, 20.5954f, 22.415f, 21.0f, 23.0f, 21.0f)
                curveTo(23.585f, 21.0f, 24.0926f, 20.5954f, 24.2246f, 20.0254f)
                lineTo(26.3086f, 11.0f)
                lineTo(24.2559f, 11.0f)
                lineTo(23.0f, 16.4395f)
                lineTo(21.7441f, 11.0f)
                lineTo(19.6914f, 11.0f)
                close()
                moveTo(8.0f, 13.0f)
                lineTo(9.0f, 13.0f)
                curveTo(9.552f, 13.0f, 10.0f, 13.448f, 10.0f, 14.0f)
                lineTo(10.0f, 18.0f)
                curveTo(10.0f, 18.552f, 9.552f, 19.0f, 9.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                lineTo(8.0f, 13.0f)
                close()
            }
        }
        .build()
        return _dev!!
    }

private var _dev: ImageVector? = null
