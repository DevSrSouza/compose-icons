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

public val CssGgIcons.ArrowLongLeftE: ImageVector
    get() {
        if (_arrowLongLeftE != null) {
            return _arrowLongLeftE!!
        }
        _arrowLongLeftE = Builder(name = "ArrowLongLeftE", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.263f, 7.757f)
                lineTo(1.013f, 11.993f)
                lineTo(5.249f, 16.243f)
                lineTo(6.666f, 14.831f)
                lineTo(4.851f, 13.01f)
                lineTo(16.969f, 13.052f)
                lineTo(16.96f, 15.051f)
                lineTo(22.959f, 15.078f)
                lineTo(22.986f, 9.078f)
                lineTo(16.986f, 9.051f)
                lineTo(16.978f, 11.052f)
                lineTo(4.833f, 11.01f)
                lineTo(6.675f, 9.174f)
                lineTo(5.263f, 7.757f)
                close()
                moveTo(20.978f, 11.069f)
                lineTo(20.969f, 13.069f)
                lineTo(18.969f, 13.06f)
                lineTo(18.978f, 11.06f)
                lineTo(20.978f, 11.069f)
                close()
            }
        }
        .build()
        return _arrowLongLeftE!!
    }

private var _arrowLongLeftE: ImageVector? = null
