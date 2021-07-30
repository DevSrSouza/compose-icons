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
                moveTo(16.9307f, 4.0159f)
                horizontalLineTo(14.7655f)
                curveTo(14.3582f, 2.8424f, 13.2428f, 2.0f, 11.9307f, 2.0f)
                curveTo(10.6185f, 2.0f, 9.5031f, 2.8424f, 9.0958f, 4.0159f)
                horizontalLineTo(6.9307f)
                curveTo(5.2738f, 4.0159f, 3.9307f, 5.359f, 3.9307f, 7.0159f)
                verticalLineTo(9.2121f)
                curveTo(2.8018f, 9.6428f, 2.0f, 10.7357f, 2.0f, 12.0159f)
                curveTo(2.0f, 13.296f, 2.8018f, 14.3889f, 3.9307f, 14.8197f)
                verticalLineTo(17.0159f)
                curveTo(3.9307f, 18.6727f, 5.2738f, 20.0159f, 6.9307f, 20.0159f)
                horizontalLineTo(9.0847f)
                curveTo(9.4825f, 21.2064f, 10.6064f, 22.0645f, 11.9307f, 22.0645f)
                curveTo(13.255f, 22.0645f, 14.3789f, 21.2064f, 14.7767f, 20.0159f)
                horizontalLineTo(16.9307f)
                curveTo(18.5875f, 20.0159f, 19.9307f, 18.6727f, 19.9307f, 17.0159f)
                verticalLineTo(14.8446f)
                curveTo(21.095f, 14.4322f, 21.929f, 13.3214f, 21.929f, 12.0159f)
                curveTo(21.929f, 10.7103f, 21.095f, 9.5995f, 19.9307f, 9.1872f)
                verticalLineTo(7.0159f)
                curveTo(19.9307f, 5.359f, 18.5875f, 4.0159f, 16.9307f, 4.0159f)
                close()
                moveTo(5.9307f, 14.8687f)
                verticalLineTo(17.0159f)
                curveTo(5.9307f, 17.5682f, 6.3784f, 18.0159f, 6.9307f, 18.0159f)
                horizontalLineTo(9.119f)
                curveTo(9.5443f, 16.8761f, 10.6427f, 16.0645f, 11.9307f, 16.0645f)
                curveTo(13.2187f, 16.0645f, 14.3171f, 16.8761f, 14.7423f, 18.0159f)
                horizontalLineTo(16.9307f)
                curveTo(17.4829f, 18.0159f, 17.9307f, 17.5682f, 17.9307f, 17.0159f)
                verticalLineTo(14.8458f)
                curveTo(16.7646f, 14.4344f, 15.929f, 13.3227f, 15.929f, 12.0159f)
                curveTo(15.929f, 10.709f, 16.7646f, 9.5973f, 17.9307f, 9.186f)
                verticalLineTo(7.0159f)
                curveTo(17.9307f, 6.4636f, 17.4829f, 6.0159f, 16.9307f, 6.0159f)
                horizontalLineTo(14.7543f)
                curveTo(14.338f, 7.1728f, 13.2309f, 8.0f, 11.9307f, 8.0f)
                curveTo(10.6304f, 8.0f, 9.5233f, 7.1728f, 9.107f, 6.0159f)
                horizontalLineTo(6.9307f)
                curveTo(6.3784f, 6.0159f, 5.9307f, 6.4636f, 5.9307f, 7.0159f)
                verticalLineTo(9.163f)
                curveTo(7.1319f, 9.5547f, 8.0f, 10.6839f, 8.0f, 12.0159f)
                curveTo(8.0f, 13.3479f, 7.1319f, 14.4771f, 5.9307f, 14.8687f)
                close()
            }
        }
        .build()
        return _layoutPin!!
    }

private var _layoutPin: ImageVector? = null
