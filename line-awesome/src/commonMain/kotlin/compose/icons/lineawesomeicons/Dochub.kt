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

public val LineAwesomeIcons.Dochub: ImageVector
    get() {
        if (_dochub != null) {
            return _dochub!!
        }
        _dochub = Builder(name = "Dochub", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.5859f)
                lineTo(19.0f, 12.0f)
                lineTo(27.4141f, 12.0f)
                lineTo(19.0f, 3.5859f)
                close()
                moveTo(7.0f, 4.0f)
                lineTo(7.0f, 28.0f)
                lineTo(18.0f, 28.0f)
                curveTo(22.411f, 28.0f, 26.0f, 24.411f, 26.0f, 20.0f)
                lineTo(26.0f, 14.0f)
                lineTo(20.0f, 14.0f)
                lineTo(20.0f, 18.9375f)
                curveTo(20.0f, 20.6265f, 18.6265f, 22.0f, 16.9375f, 22.0f)
                lineTo(13.0f, 22.0f)
                lineTo(13.0f, 10.0f)
                lineTo(17.0f, 10.0f)
                lineTo(17.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                close()
                moveTo(9.0f, 6.0f)
                lineTo(15.0f, 6.0f)
                lineTo(15.0f, 8.0f)
                lineTo(11.0f, 8.0f)
                lineTo(11.0f, 24.0f)
                lineTo(16.9375f, 24.0f)
                curveTo(19.7295f, 24.0f, 22.0f, 21.7295f, 22.0f, 18.9375f)
                lineTo(22.0f, 16.0f)
                lineTo(24.0f, 16.0f)
                lineTo(24.0f, 20.0f)
                curveTo(24.0f, 23.309f, 21.309f, 26.0f, 18.0f, 26.0f)
                lineTo(9.0f, 26.0f)
                lineTo(9.0f, 6.0f)
                close()
                moveTo(21.0f, 8.4141f)
                lineTo(22.5859f, 10.0f)
                lineTo(21.0f, 10.0f)
                lineTo(21.0f, 8.4141f)
                close()
            }
        }
        .build()
        return _dochub!!
    }

private var _dochub: ImageVector? = null
