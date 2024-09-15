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

public val CssGgIcons.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.657f, 2.757f)
                curveTo(15.0f, 0.414f, 18.799f, 0.414f, 21.142f, 2.757f)
                curveTo(23.485f, 5.101f, 23.485f, 8.899f, 21.142f, 11.243f)
                lineTo(11.243f, 21.142f)
                curveTo(8.899f, 23.485f, 5.101f, 23.485f, 2.757f, 21.142f)
                curveTo(0.414f, 18.799f, 0.414f, 15.0f, 2.757f, 12.657f)
                lineTo(12.657f, 2.757f)
                close()
                moveTo(19.728f, 9.828f)
                lineTo(15.485f, 14.071f)
                lineTo(9.828f, 8.414f)
                lineTo(14.071f, 4.172f)
                curveTo(15.633f, 2.609f, 18.166f, 2.609f, 19.728f, 4.172f)
                curveTo(21.29f, 5.734f, 21.29f, 8.266f, 19.728f, 9.828f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
