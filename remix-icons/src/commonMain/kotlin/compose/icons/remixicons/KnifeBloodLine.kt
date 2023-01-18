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

public val RemixIcons.KnifeBloodLine: ImageVector
    get() {
        if (_knifeBloodLine != null) {
            return _knifeBloodLine!!
        }
        _knifeBloodLine = Builder(name = "KnifeBloodLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.342f, 1.408f)
                lineTo(22.373f, 19.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.121f, 2.122f)
                lineToRelative(-4.596f, -4.597f)
                lineTo(12.12f, 20.5f)
                lineTo(8.0f, 16.38f)
                lineTo(8.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.993f, -0.117f)
                lineTo(4.0f, 15.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(2.0f, 7.214f)
                arcToRelative(7.976f, 7.976f, 0.0f, false, true, 2.168f, -5.627f)
                lineToRelative(0.174f, -0.179f)
                close()
                moveTo(4.583f, 4.478f)
                lineToRelative(-0.051f, 0.11f)
                arcToRelative(5.993f, 5.993f, 0.0f, false, false, -0.522f, 2.103f)
                lineTo(4.0f, 7.0f)
                lineToRelative(-0.001f, 0.12f)
                arcToRelative(5.984f, 5.984f, 0.0f, false, false, 1.58f, 4.003f)
                lineToRelative(0.177f, 0.185f)
                lineToRelative(6.363f, 6.363f)
                lineToRelative(2.829f, -2.828f)
                lineTo(4.583f, 4.478f)
                close()
            }
        }
        .build()
        return _knifeBloodLine!!
    }

private var _knifeBloodLine: ImageVector? = null
