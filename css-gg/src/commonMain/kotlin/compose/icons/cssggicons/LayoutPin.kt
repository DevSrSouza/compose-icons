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

public val CssGgIcons.LayoutPin: ImageVector
    get() {
        if (_layoutPin != null) {
            return _layoutPin!!
        }
        _layoutPin = Builder(name = "LayoutPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.931f, 4.016f)
                horizontalLineTo(14.766f)
                curveTo(14.358f, 2.842f, 13.243f, 2.0f, 11.931f, 2.0f)
                curveTo(10.618f, 2.0f, 9.503f, 2.842f, 9.096f, 4.016f)
                horizontalLineTo(6.931f)
                curveTo(5.274f, 4.016f, 3.931f, 5.359f, 3.931f, 7.016f)
                verticalLineTo(9.212f)
                curveTo(2.802f, 9.643f, 2.0f, 10.736f, 2.0f, 12.016f)
                curveTo(2.0f, 13.296f, 2.802f, 14.389f, 3.931f, 14.82f)
                verticalLineTo(17.016f)
                curveTo(3.931f, 18.673f, 5.274f, 20.016f, 6.931f, 20.016f)
                horizontalLineTo(9.085f)
                curveTo(9.482f, 21.206f, 10.606f, 22.065f, 11.931f, 22.065f)
                curveTo(13.255f, 22.065f, 14.379f, 21.206f, 14.777f, 20.016f)
                horizontalLineTo(16.931f)
                curveTo(18.587f, 20.016f, 19.931f, 18.673f, 19.931f, 17.016f)
                verticalLineTo(14.845f)
                curveTo(21.095f, 14.432f, 21.929f, 13.321f, 21.929f, 12.016f)
                curveTo(21.929f, 10.71f, 21.095f, 9.599f, 19.931f, 9.187f)
                verticalLineTo(7.016f)
                curveTo(19.931f, 5.359f, 18.587f, 4.016f, 16.931f, 4.016f)
                close()
                moveTo(5.931f, 14.869f)
                verticalLineTo(17.016f)
                curveTo(5.931f, 17.568f, 6.378f, 18.016f, 6.931f, 18.016f)
                horizontalLineTo(9.119f)
                curveTo(9.544f, 16.876f, 10.643f, 16.065f, 11.931f, 16.065f)
                curveTo(13.219f, 16.065f, 14.317f, 16.876f, 14.742f, 18.016f)
                horizontalLineTo(16.931f)
                curveTo(17.483f, 18.016f, 17.931f, 17.568f, 17.931f, 17.016f)
                verticalLineTo(14.846f)
                curveTo(16.765f, 14.434f, 15.929f, 13.323f, 15.929f, 12.016f)
                curveTo(15.929f, 10.709f, 16.765f, 9.597f, 17.931f, 9.186f)
                verticalLineTo(7.016f)
                curveTo(17.931f, 6.464f, 17.483f, 6.016f, 16.931f, 6.016f)
                horizontalLineTo(14.754f)
                curveTo(14.338f, 7.173f, 13.231f, 8.0f, 11.931f, 8.0f)
                curveTo(10.63f, 8.0f, 9.523f, 7.173f, 9.107f, 6.016f)
                horizontalLineTo(6.931f)
                curveTo(6.378f, 6.016f, 5.931f, 6.464f, 5.931f, 7.016f)
                verticalLineTo(9.163f)
                curveTo(7.132f, 9.555f, 8.0f, 10.684f, 8.0f, 12.016f)
                curveTo(8.0f, 13.348f, 7.132f, 14.477f, 5.931f, 14.869f)
                close()
            }
        }
        .build()
        return _layoutPin!!
    }

private var _layoutPin: ImageVector? = null
