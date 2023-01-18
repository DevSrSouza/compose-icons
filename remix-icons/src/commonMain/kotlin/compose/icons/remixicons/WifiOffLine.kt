package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.WifiOffLine: ImageVector
    get() {
        if (_wifiOffLine != null) {
            return _wifiOffLine!!
        }
        _wifiOffLine = Builder(name = "WifiOffLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveToRelative(0.714f, 0.0f, 1.37f, 0.25f, 1.886f, 0.666f)
                lineTo(12.0f, 21.0f)
                lineToRelative(-1.886f, -2.334f)
                arcTo(2.987f, 2.987f, 0.0f, false, true, 12.0f, 18.0f)
                close()
                moveTo(2.808f, 1.393f)
                lineToRelative(17.677f, 17.678f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-5.18f, -5.18f)
                arcTo(5.994f, 5.994f, 0.0f, false, false, 12.0f, 15.0f)
                curveToRelative(-1.428f, 0.0f, -2.74f, 0.499f, -3.77f, 1.332f)
                lineToRelative(-1.256f, -1.556f)
                arcToRelative(7.963f, 7.963f, 0.0f, false, true, 4.622f, -1.766f)
                lineTo(9.0f, 10.414f)
                arcToRelative(10.969f, 10.969f, 0.0f, false, false, -3.912f, 2.029f)
                lineTo(3.83f, 10.887f)
                arcTo(12.984f, 12.984f, 0.0f, false, true, 7.416f, 8.83f)
                lineTo(5.132f, 6.545f)
                arcToRelative(16.009f, 16.009f, 0.0f, false, false, -3.185f, 2.007f)
                lineTo(0.689f, 6.997f)
                curveToRelative(0.915f, -0.74f, 1.903f, -1.391f, 2.952f, -1.942f)
                lineTo(1.393f, 2.808f)
                lineToRelative(1.415f, -1.415f)
                close()
                moveTo(14.5f, 10.285f)
                lineToRelative(-2.284f, -2.283f)
                lineTo(12.0f, 8.0f)
                curveToRelative(3.095f, 0.0f, 5.937f, 1.081f, 8.17f, 2.887f)
                lineToRelative(-1.258f, 1.556f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, false, -4.412f, -2.158f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(4.285f, 0.0f, 8.22f, 1.497f, 11.31f, 3.997f)
                lineToRelative(-1.257f, 1.555f)
                arcTo(15.933f, 15.933f, 0.0f, false, false, 12.0f, 5.0f)
                curveToRelative(-0.878f, 0.0f, -1.74f, 0.07f, -2.58f, 0.207f)
                lineTo(7.725f, 3.51f)
                curveTo(9.094f, 3.177f, 10.527f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _wifiOffLine!!
    }

private var _wifiOffLine: ImageVector? = null
