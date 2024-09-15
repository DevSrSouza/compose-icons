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

public val CssGgIcons.Unblock: ImageVector
    get() {
        if (_unblock != null) {
            return _unblock!!
        }
        _unblock = Builder(name = "Unblock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.636f, 18.364f)
                curveTo(9.151f, 21.879f, 14.849f, 21.879f, 18.364f, 18.364f)
                curveTo(21.879f, 14.849f, 21.879f, 9.151f, 18.364f, 5.636f)
                curveTo(14.849f, 2.121f, 9.151f, 2.121f, 5.636f, 5.636f)
                curveTo(2.121f, 9.151f, 2.121f, 14.849f, 5.636f, 18.364f)
                close()
                moveTo(7.807f, 17.607f)
                curveTo(10.549f, 19.662f, 14.456f, 19.443f, 16.95f, 16.95f)
                curveTo(19.443f, 14.456f, 19.662f, 10.549f, 17.607f, 7.807f)
                lineTo(14.828f, 10.586f)
                curveTo(14.438f, 10.976f, 13.805f, 10.976f, 13.414f, 10.586f)
                curveTo(13.024f, 10.195f, 13.024f, 9.562f, 13.414f, 9.172f)
                lineTo(16.192f, 6.393f)
                curveTo(13.451f, 4.338f, 9.544f, 4.557f, 7.05f, 7.05f)
                curveTo(4.557f, 9.544f, 4.338f, 13.451f, 6.393f, 16.192f)
                lineTo(9.172f, 13.414f)
                curveTo(9.562f, 13.024f, 10.195f, 13.024f, 10.586f, 13.414f)
                curveTo(10.976f, 13.805f, 10.976f, 14.438f, 10.586f, 14.828f)
                lineTo(7.807f, 17.607f)
                close()
            }
        }
        .build()
        return _unblock!!
    }

private var _unblock: ImageVector? = null
