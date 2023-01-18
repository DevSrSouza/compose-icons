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

public val RemixIcons.WifiOffFill: ImageVector
    get() {
        if (_wifiOffFill != null) {
            return _wifiOffFill!!
        }
        _wifiOffFill = Builder(name = "WifiOffFill", defaultWidth = 24.0.dp, defaultHeight =
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
                lineToRelative(-3.682f, -3.68f)
                lineToRelative(-0.247f, 0.306f)
                arcTo(4.98f, 4.98f, 0.0f, false, false, 12.0f, 16.0f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, false, -3.141f, 1.11f)
                lineToRelative(-1.885f, -2.334f)
                arcToRelative(7.963f, 7.963f, 0.0f, false, true, 4.622f, -1.766f)
                lineToRelative(-1.773f, -1.772f)
                arcToRelative(9.963f, 9.963f, 0.0f, false, false, -4.106f, 1.982f)
                lineTo(3.83f, 10.887f)
                arcTo(12.984f, 12.984f, 0.0f, false, true, 7.416f, 8.83f)
                lineTo(5.885f, 7.3f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, -3.31f, 2.031f)
                lineTo(0.689f, 6.997f)
                curveToRelative(0.915f, -0.74f, 1.903f, -1.391f, 2.952f, -1.942f)
                lineTo(1.393f, 2.808f)
                lineToRelative(1.415f, -1.415f)
                close()
                moveTo(16.084f, 11.87f)
                lineToRelative(-3.868f, -3.867f)
                lineTo(12.0f, 8.0f)
                curveToRelative(3.095f, 0.0f, 5.937f, 1.081f, 8.17f, 2.887f)
                lineToRelative(-1.886f, 2.334f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -2.2f, -1.352f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(4.285f, 0.0f, 8.22f, 1.497f, 11.31f, 3.997f)
                lineTo(21.426f, 9.33f)
                arcTo(14.937f, 14.937f, 0.0f, false, false, 12.0f, 6.0f)
                curveToRelative(-0.572f, 0.0f, -1.136f, 0.032f, -1.69f, 0.094f)
                lineTo(7.723f, 3.511f)
                curveTo(9.094f, 3.177f, 10.527f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _wifiOffFill!!
    }

private var _wifiOffFill: ImageVector? = null
