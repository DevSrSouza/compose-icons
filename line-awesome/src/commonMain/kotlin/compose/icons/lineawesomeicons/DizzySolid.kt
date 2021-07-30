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

public val LineAwesomeIcons.DizzySolid: ImageVector
    get() {
        if (_dizzySolid != null) {
            return _dizzySolid!!
        }
        _dizzySolid = Builder(name = "DizzySolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(9.707f, 10.293f)
                lineTo(8.293f, 11.707f)
                lineTo(10.0859f, 13.5f)
                lineTo(8.293f, 15.293f)
                lineTo(9.707f, 16.707f)
                lineTo(11.5f, 14.9141f)
                lineTo(13.293f, 16.707f)
                lineTo(14.707f, 15.293f)
                lineTo(12.9141f, 13.5f)
                lineTo(14.707f, 11.707f)
                lineTo(13.293f, 10.293f)
                lineTo(11.5f, 12.0859f)
                lineTo(9.707f, 10.293f)
                close()
                moveTo(18.707f, 10.293f)
                lineTo(17.293f, 11.707f)
                lineTo(19.0859f, 13.5f)
                lineTo(17.293f, 15.293f)
                lineTo(18.707f, 16.707f)
                lineTo(20.5f, 14.9141f)
                lineTo(22.293f, 16.707f)
                lineTo(23.707f, 15.293f)
                lineTo(21.9141f, 13.5f)
                lineTo(23.707f, 11.707f)
                lineTo(22.293f, 10.293f)
                lineTo(20.5f, 12.0859f)
                lineTo(18.707f, 10.293f)
                close()
                moveTo(16.0f, 18.0f)
                curveTo(13.794f, 18.0f, 12.0f, 19.5254f, 12.0f, 21.4004f)
                curveTo(12.0f, 23.1254f, 13.346f, 24.0f, 16.0f, 24.0f)
                curveTo(18.654f, 24.0f, 20.0f, 23.1254f, 20.0f, 21.4004f)
                curveTo(20.0f, 19.5254f, 18.206f, 18.0f, 16.0f, 18.0f)
                close()
                moveTo(16.0f, 20.0f)
                curveTo(17.084f, 20.0f, 18.0f, 20.6414f, 18.0f, 21.4004f)
                curveTo(18.0f, 21.5644f, 18.0f, 22.0f, 16.0f, 22.0f)
                curveTo(14.0f, 22.0f, 14.0f, 21.5644f, 14.0f, 21.4004f)
                curveTo(14.0f, 20.6414f, 14.916f, 20.0f, 16.0f, 20.0f)
                close()
            }
        }
        .build()
        return _dizzySolid!!
    }

private var _dizzySolid: ImageVector? = null
