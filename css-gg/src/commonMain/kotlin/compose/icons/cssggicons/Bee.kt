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

public val CssGgIcons.Bee: ImageVector
    get() {
        if (_bee != null) {
            return _bee!!
        }
        _bee = Builder(name = "Bee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.9513f, 15.571f)
                curveTo(17.7695f, 17.2187f, 16.9205f, 18.6654f, 15.6805f, 19.635f)
                curveTo(15.332f, 20.4692f, 14.7092f, 21.1601f, 13.9247f, 21.5951f)
                curveTo(13.7025f, 22.4574f, 12.9196f, 23.0944f, 11.9879f, 23.0944f)
                curveTo(11.0562f, 23.0944f, 10.2733f, 22.4574f, 10.0511f, 21.5951f)
                curveTo(9.2667f, 21.1602f, 8.6439f, 20.4693f, 8.2955f, 19.6353f)
                curveTo(7.0595f, 18.6691f, 6.212f, 17.229f, 6.0262f, 15.5883f)
                curveTo(4.9353f, 16.4161f, 3.3795f, 16.4118f, 2.2862f, 15.4944f)
                curveTo(1.017f, 14.4294f, 0.8514f, 12.5371f, 1.9164f, 11.2679f)
                lineTo(6.0097f, 6.3898f)
                curveTo(6.2712f, 3.3175f, 8.8478f, 0.9056f, 11.9878f, 0.9056f)
                curveTo(15.1166f, 0.9056f, 17.6861f, 3.3005f, 17.9631f, 6.3571f)
                lineTo(22.0837f, 11.2679f)
                curveTo(23.1487f, 12.5371f, 22.9831f, 14.4294f, 21.7139f, 15.4944f)
                curveTo(20.613f, 16.4182f, 19.0433f, 16.4161f, 17.9513f, 15.571f)
                close()
                moveTo(15.6254f, 12.9056f)
                lineTo(13.9472f, 10.9056f)
                horizontalLineTo(10.0529f)
                lineTo(8.3747f, 12.9056f)
                horizontalLineTo(15.6254f)
                close()
                moveTo(17.9878f, 12.6095f)
                lineTo(19.0195f, 13.839f)
                curveTo(19.3745f, 14.2621f, 20.0053f, 14.3173f, 20.4283f, 13.9623f)
                curveTo(20.8514f, 13.6073f, 20.9066f, 12.9765f, 20.5516f, 12.5535f)
                lineTo(17.9878f, 9.498f)
                verticalLineTo(12.6095f)
                close()
                moveTo(15.9878f, 8.9056f)
                verticalLineTo(6.9056f)
                curveTo(15.9878f, 4.6964f, 14.1969f, 2.9056f, 11.9878f, 2.9056f)
                curveTo(9.7787f, 2.9056f, 7.9878f, 4.6964f, 7.9878f, 6.9056f)
                verticalLineTo(8.9056f)
                horizontalLineTo(15.9878f)
                close()
                moveTo(4.9806f, 13.839f)
                lineTo(5.9878f, 12.6387f)
                verticalLineTo(9.5273f)
                lineTo(3.4485f, 12.5535f)
                curveTo(3.0935f, 12.9765f, 3.1487f, 13.6073f, 3.5718f, 13.9623f)
                curveTo(3.9948f, 14.3173f, 4.6256f, 14.2621f, 4.9806f, 13.839f)
                close()
                moveTo(11.9878f, 18.9056f)
                curveTo(9.7787f, 18.9056f, 7.9878f, 17.1147f, 7.9878f, 14.9056f)
                horizontalLineTo(15.9878f)
                curveTo(15.9878f, 17.1147f, 14.1969f, 18.9056f, 11.9878f, 18.9056f)
                close()
            }
        }
        .build()
        return _bee!!
    }

private var _bee: ImageVector? = null
