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

public val LineAwesomeIcons.GrinWink: ImageVector
    get() {
        if (_grinWink != null) {
            return _grinWink!!
        }
        _grinWink = Builder(name = "GrinWink", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.5352f, 6.0f, 26.0f, 10.4648f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5352f, 21.5352f, 26.0f, 16.0f, 26.0f)
                curveTo(10.4648f, 26.0f, 6.0f, 21.5352f, 6.0f, 16.0f)
                curveTo(6.0f, 10.4648f, 10.4648f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(11.5f, 12.0f)
                curveTo(10.6719f, 12.0f, 10.0f, 12.6719f, 10.0f, 13.5f)
                curveTo(10.0f, 14.3281f, 10.6719f, 15.0f, 11.5f, 15.0f)
                curveTo(12.3281f, 15.0f, 13.0f, 14.3281f, 13.0f, 13.5f)
                curveTo(13.0f, 12.6719f, 12.3281f, 12.0f, 11.5f, 12.0f)
                close()
                moveTo(18.0f, 13.0f)
                lineTo(18.0f, 15.0f)
                lineTo(23.0f, 15.0f)
                lineTo(23.0f, 13.0f)
                close()
                moveTo(20.9688f, 17.0313f)
                curveTo(20.9688f, 18.7148f, 20.293f, 19.8828f, 19.3125f, 20.7188f)
                curveTo(18.332f, 21.5547f, 17.0352f, 22.0f, 16.0f, 22.0f)
                curveTo(13.8789f, 22.0f, 12.4375f, 21.1406f, 11.3125f, 20.0313f)
                lineTo(9.9063f, 21.4688f)
                curveTo(11.3008f, 22.8398f, 13.3203f, 24.0f, 16.0f, 24.0f)
                curveTo(17.5547f, 24.0f, 19.2617f, 23.4141f, 20.625f, 22.25f)
                curveTo(21.9883f, 21.0859f, 22.9688f, 19.2891f, 22.9688f, 17.0313f)
                close()
            }
        }
        .build()
        return _grinWink!!
    }

private var _grinWink: ImageVector? = null
