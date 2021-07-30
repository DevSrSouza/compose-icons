package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Euro: ImageVector
    get() {
        if (_euro != null) {
            return _euro!!
        }
        _euro = Builder(name = "Euro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5535f, 15.5355f)
                curveTo(17.6487f, 16.4404f, 16.3987f, 17.0f, 15.018f, 17.0f)
                curveTo(13.1416f, 17.0f, 11.5066f, 15.9664f, 10.6513f, 14.4374f)
                horizontalLineTo(13.0323f)
                lineTo(13.7284f, 12.5625f)
                horizontalLineTo(10.0493f)
                curveTo(10.0286f, 12.3779f, 10.018f, 12.1902f, 10.018f, 12.0f)
                curveTo(10.018f, 11.8098f, 10.0286f, 11.6221f, 10.0493f, 11.4374f)
                horizontalLineTo(14.3362f)
                lineTo(15.0324f, 9.5625f)
                horizontalLineTo(10.6514f)
                curveTo(11.5066f, 8.0336f, 13.1416f, 7.0f, 15.018f, 7.0f)
                curveTo(16.3987f, 7.0f, 17.6487f, 7.5596f, 18.5535f, 8.4645f)
                lineTo(19.9677f, 7.0503f)
                curveTo(18.701f, 5.7835f, 16.951f, 5.0f, 15.018f, 5.0f)
                curveTo(12.0092f, 5.0f, 9.4438f, 6.8983f, 8.4541f, 9.5625f)
                horizontalLineTo(6.0324f)
                lineTo(5.3362f, 11.4374f)
                horizontalLineTo(8.0403f)
                curveTo(8.0255f, 11.623f, 8.018f, 11.8106f, 8.018f, 12.0f)
                curveTo(8.018f, 12.1894f, 8.0255f, 12.3769f, 8.0403f, 12.5625f)
                horizontalLineTo(4.7284f)
                lineTo(4.0323f, 14.4374f)
                horizontalLineTo(8.454f)
                curveTo(9.4438f, 17.1017f, 12.0092f, 19.0f, 15.018f, 19.0f)
                curveTo(16.951f, 19.0f, 18.701f, 18.2165f, 19.9677f, 16.9497f)
                lineTo(18.5535f, 15.5355f)
                close()
            }
        }
        .build()
        return _euro!!
    }

private var _euro: ImageVector? = null
