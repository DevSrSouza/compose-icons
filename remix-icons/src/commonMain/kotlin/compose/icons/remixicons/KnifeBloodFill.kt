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

public val RemixIcons.KnifeBloodFill: ImageVector
    get() {
        if (_knifeBloodFill != null) {
            return _knifeBloodFill!!
        }
        _knifeBloodFill = Builder(name = "KnifeBloodFill", defaultWidth = 24.0.dp, defaultHeight =
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
                verticalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.993f, -0.117f)
                lineTo(4.0f, 15.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(7.214f)
                arcToRelative(7.976f, 7.976f, 0.0f, false, true, 2.168f, -5.627f)
                lineToRelative(0.174f, -0.179f)
                close()
            }
        }
        .build()
        return _knifeBloodFill!!
    }

private var _knifeBloodFill: ImageVector? = null
