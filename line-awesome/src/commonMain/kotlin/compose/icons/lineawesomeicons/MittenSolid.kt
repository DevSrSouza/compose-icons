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

public val LineAwesomeIcons.MittenSolid: ImageVector
    get() {
        if (_mittenSolid != null) {
            return _mittenSolid!!
        }
        _mittenSolid = Builder(name = "MittenSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                curveTo(14.6055f, 3.0f, 11.0f, 6.6055f, 11.0f, 11.0f)
                lineTo(11.0f, 13.625f)
                curveTo(9.2773f, 12.6172f, 7.0391f, 12.957f, 5.8125f, 14.5938f)
                curveTo(4.4922f, 16.3516f, 4.8359f, 18.8711f, 6.5938f, 20.1875f)
                lineTo(6.5938f, 20.2188f)
                lineTo(6.625f, 20.2188f)
                lineTo(12.0f, 24.1563f)
                lineTo(12.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 23.7188f)
                curveTo(26.0195f, 23.6797f, 26.0391f, 23.6445f, 26.0625f, 23.5938f)
                curveTo(26.1758f, 23.3672f, 26.2969f, 23.0469f, 26.4375f, 22.625f)
                curveTo(26.7188f, 21.7852f, 27.0f, 20.5703f, 27.0f, 19.0f)
                lineTo(27.0f, 11.0f)
                curveTo(27.0f, 6.6055f, 23.3945f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(19.0f, 5.0f)
                curveTo(22.3047f, 5.0f, 25.0f, 7.6953f, 25.0f, 11.0f)
                lineTo(25.0f, 19.0f)
                curveTo(25.0f, 20.3438f, 24.7813f, 21.3438f, 24.5625f, 22.0f)
                curveTo(24.4531f, 22.3281f, 24.3242f, 22.5664f, 24.25f, 22.7188f)
                curveTo(24.2109f, 22.793f, 24.207f, 22.8438f, 24.1875f, 22.875f)
                curveTo(24.1797f, 22.8906f, 24.1602f, 22.9023f, 24.1563f, 22.9063f)
                lineTo(24.3125f, 23.0f)
                lineTo(13.8438f, 23.0f)
                lineTo(13.5938f, 22.8125f)
                lineTo(7.8125f, 18.5938f)
                curveTo(6.918f, 17.9258f, 6.7383f, 16.7031f, 7.4063f, 15.8125f)
                curveTo(8.0781f, 14.918f, 9.2969f, 14.7383f, 10.1875f, 15.4063f)
                lineTo(10.2188f, 15.4063f)
                lineTo(11.4375f, 16.25f)
                lineTo(13.0f, 17.3438f)
                lineTo(13.0f, 11.0f)
                curveTo(13.0f, 7.6953f, 15.6953f, 5.0f, 19.0f, 5.0f)
                close()
                moveTo(14.0f, 25.0f)
                lineTo(24.0f, 25.0f)
                lineTo(24.0f, 27.0f)
                lineTo(14.0f, 27.0f)
                close()
            }
        }
        .build()
        return _mittenSolid!!
    }

private var _mittenSolid: ImageVector? = null
