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

public val LineAwesomeIcons.GrinBeamSweat: ImageVector
    get() {
        if (_grinBeamSweat != null) {
            return _grinBeamSweat!!
        }
        _grinBeamSweat = Builder(name = "GrinBeamSweat", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 13.946f, 28.5082f, 12.0083f, 27.6563f, 10.2793f)
                curveTo(27.3563f, 10.9863f, 26.8649f, 11.5867f, 26.2559f, 12.0527f)
                curveTo(26.7299f, 13.2797f, 27.0f, 14.608f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                curveTo(17.351f, 5.0f, 18.6409f, 5.2561f, 19.8379f, 5.7031f)
                curveTo(20.0979f, 5.1111f, 20.3978f, 4.5024f, 20.7148f, 3.8984f)
                curveTo(19.2508f, 3.3264f, 17.664f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(23.5f, 3.0f)
                curveTo(23.5f, 3.0f, 21.0f, 7.2746f, 21.0f, 8.5996f)
                curveTo(21.0f, 9.9246f, 22.12f, 11.0f, 23.5f, 11.0f)
                curveTo(24.88f, 11.0f, 26.0f, 9.9246f, 26.0f, 8.5996f)
                curveTo(26.0f, 7.2746f, 23.5f, 3.0f, 23.5f, 3.0f)
                close()
                moveTo(9.0f, 14.0f)
                lineTo(9.0f, 16.0f)
                lineTo(14.0f, 16.0f)
                lineTo(14.0f, 14.0f)
                lineTo(9.0f, 14.0f)
                close()
                moveTo(18.0f, 14.0f)
                lineTo(18.0f, 16.0f)
                lineTo(23.0f, 16.0f)
                lineTo(23.0f, 14.0f)
                lineTo(18.0f, 14.0f)
                close()
            }
        }
        .build()
        return _grinBeamSweat!!
    }

private var _grinBeamSweat: ImageVector? = null
