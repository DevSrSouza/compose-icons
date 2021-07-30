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

public val CssGgIcons.Tennis: ImageVector
    get() {
        if (_tennis != null) {
            return _tennis!!
        }
        _tennis = Builder(name = "Tennis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0711f, 19.0711f)
                curveTo(22.9763f, 15.1658f, 22.9763f, 8.8342f, 19.0711f, 4.9289f)
                curveTo(15.1658f, 1.0237f, 8.8342f, 1.0237f, 4.9289f, 4.9289f)
                curveTo(1.0237f, 8.8342f, 1.0237f, 15.1658f, 4.9289f, 19.0711f)
                curveTo(8.8342f, 22.9763f, 15.1658f, 22.9763f, 19.0711f, 19.0711f)
                close()
                moveTo(19.9426f, 11.0407f)
                curveTo(19.7364f, 9.3237f, 18.9745f, 7.6608f, 17.6569f, 6.3432f)
                curveTo(16.3343f, 5.0206f, 14.6639f, 4.2579f, 12.9402f, 4.0551f)
                lineTo(12.93f, 4.1114f)
                curveTo(12.1086f, 8.5831f, 8.583f, 12.1086f, 4.1114f, 12.93f)
                lineTo(4.0551f, 12.9402f)
                curveTo(4.2579f, 14.6639f, 5.0206f, 16.3343f, 6.3432f, 17.6569f)
                curveTo(7.6608f, 18.9745f, 9.3237f, 19.7364f, 11.0407f, 19.9426f)
                curveTo(11.0449f, 19.9191f, 11.0491f, 19.8956f, 11.0534f, 19.8721f)
                curveTo(11.8748f, 15.4004f, 15.4003f, 11.8748f, 19.872f, 11.0534f)
                curveTo(19.8955f, 11.0491f, 19.9191f, 11.0449f, 19.9426f, 11.0407f)
                close()
                moveTo(19.872f, 13.4292f)
                verticalLineTo(13.0951f)
                curveTo(16.5073f, 13.8586f, 13.8586f, 16.5073f, 13.095f, 19.8721f)
                horizontalLineTo(13.429f)
                curveTo(14.9777f, 19.5924f, 16.4598f, 18.8539f, 17.6569f, 17.6569f)
                curveTo(18.8539f, 16.4598f, 19.5923f, 14.9778f, 19.872f, 13.4292f)
                close()
                moveTo(4.1114f, 10.8884f)
                lineTo(4.1114f, 10.666f)
                curveTo(4.3777f, 9.083f, 5.1216f, 7.5647f, 6.3432f, 6.3432f)
                curveTo(7.5647f, 5.1217f, 9.0829f, 4.3777f, 10.6658f, 4.1114f)
                lineTo(10.8883f, 4.1114f)
                curveTo(10.1248f, 7.4762f, 7.4761f, 10.1249f, 4.1114f, 10.8884f)
                close()
            }
        }
        .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
