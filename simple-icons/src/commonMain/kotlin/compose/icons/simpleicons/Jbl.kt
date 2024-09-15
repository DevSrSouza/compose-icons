package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Jbl: ImageVector
    get() {
        if (_jbl != null) {
            return _jbl!!
        }
        _jbl = Builder(name = "Jbl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.265f)
                lineToRelative(2.022f, 4.589f)
                lineToRelative(2.022f, -4.589f)
                close()
                moveTo(2.022f, 12.865f)
                curveToRelative(0.698f, 0.0f, 1.266f, -0.566f, 1.266f, -1.261f)
                curveToRelative(0.0f, -0.698f, -0.567f, -1.262f, -1.266f, -1.262f)
                curveToRelative(-0.7f, 0.0f, -1.266f, 0.563f, -1.266f, 1.262f)
                curveToRelative(0.0f, 0.695f, 0.566f, 1.261f, 1.266f, 1.261f)
                close()
                moveTo(0.928f, 16.226f)
                curveToRelative(0.0f, 0.957f, 0.862f, 2.509f, 3.314f, 2.509f)
                curveToRelative(2.453f, 0.0f, 3.315f, -1.187f, 3.315f, -2.509f)
                lineTo(7.558f, 5.265f)
                lineTo(5.369f, 5.265f)
                lineToRelative(0.001f, 11.343f)
                curveToRelative(0.0f, 0.62f, -0.504f, 1.139f, -1.126f, 1.139f)
                curveToRelative(-0.623f, 0.0f, -1.128f, -0.504f, -1.128f, -1.124f)
                lineToRelative(-0.002f, -2.311f)
                lineTo(0.928f, 14.312f)
                close()
                moveTo(9.217f, 18.538f)
                lineTo(9.217f, 5.265f)
                horizontalLineToRelative(4.374f)
                curveToRelative(0.844f, 0.0f, 2.187f, 0.693f, 2.187f, 2.163f)
                verticalLineToRelative(2.261f)
                curveToRelative(0.0f, 0.661f, -0.58f, 1.833f, -1.441f, 1.833f)
                curveToRelative(0.861f, 0.0f, 1.441f, 0.742f, 1.441f, 1.304f)
                verticalLineToRelative(3.979f)
                curveToRelative(0.0f, 0.677f, -0.546f, 1.734f, -2.187f, 1.734f)
                close()
                moveTo(12.597f, 10.979f)
                curveToRelative(0.795f, 0.0f, 0.994f, -0.134f, 0.994f, -2.215f)
                curveToRelative(0.0f, -2.08f, -0.199f, -2.246f, -0.994f, -2.246f)
                horizontalLineToRelative(-1.195f)
                verticalLineToRelative(4.457f)
                close()
                moveTo(13.591f, 14.79f)
                curveToRelative(0.0f, -2.081f, 0.0f, -2.691f, -0.864f, -2.691f)
                horizontalLineToRelative(-1.326f)
                verticalLineToRelative(5.348f)
                lineToRelative(1.326f, 0.003f)
                curveToRelative(0.864f, 0.0f, 0.864f, -0.581f, 0.864f, -2.66f)
                close()
                moveTo(17.37f, 18.538f)
                lineTo(24.0f, 18.538f)
                verticalLineToRelative(-4.227f)
                horizontalLineToRelative(-2.189f)
                lineToRelative(0.002f, 2.311f)
                curveToRelative(0.0f, 0.62f, -0.505f, 1.124f, -1.127f, 1.124f)
                curveToRelative(-0.622f, 0.0f, -1.127f, -0.504f, -1.127f, -1.124f)
                lineTo(19.558f, 5.264f)
                horizontalLineToRelative(-2.188f)
                close()
            }
        }
        .build()
        return _jbl!!
    }

private var _jbl: ImageVector? = null
