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

public val LineAwesomeIcons.ICursorSolid: ImageVector
    get() {
        if (_iCursorSolid != null) {
            return _iCursorSolid!!
        }
        _iCursorSolid = Builder(name = "ICursorSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 5.0f)
                lineTo(10.0f, 7.0f)
                lineTo(12.0f, 7.0f)
                curveTo(13.668f, 7.0f, 15.0f, 8.332f, 15.0f, 10.0f)
                lineTo(15.0f, 14.0f)
                lineTo(12.0f, 14.0f)
                lineTo(12.0f, 16.0f)
                lineTo(15.0f, 16.0f)
                lineTo(15.0f, 22.0f)
                curveTo(15.0f, 23.668f, 13.668f, 25.0f, 12.0f, 25.0f)
                lineTo(10.0f, 25.0f)
                lineTo(10.0f, 27.0f)
                lineTo(12.0f, 27.0f)
                curveTo(13.6328f, 27.0f, 15.0859f, 26.1875f, 16.0f, 24.9688f)
                curveTo(16.9141f, 26.1875f, 18.3672f, 27.0f, 20.0f, 27.0f)
                lineTo(22.0f, 27.0f)
                lineTo(22.0f, 25.0f)
                lineTo(20.0f, 25.0f)
                curveTo(18.332f, 25.0f, 17.0f, 23.668f, 17.0f, 22.0f)
                lineTo(17.0f, 16.0f)
                lineTo(20.0f, 16.0f)
                lineTo(20.0f, 14.0f)
                lineTo(17.0f, 14.0f)
                lineTo(17.0f, 10.0f)
                curveTo(17.0f, 8.332f, 18.332f, 7.0f, 20.0f, 7.0f)
                lineTo(22.0f, 7.0f)
                lineTo(22.0f, 5.0f)
                lineTo(20.0f, 5.0f)
                curveTo(18.3672f, 5.0f, 16.9141f, 5.8125f, 16.0f, 7.0313f)
                curveTo(15.0859f, 5.8125f, 13.6328f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _iCursorSolid!!
    }

private var _iCursorSolid: ImageVector? = null
