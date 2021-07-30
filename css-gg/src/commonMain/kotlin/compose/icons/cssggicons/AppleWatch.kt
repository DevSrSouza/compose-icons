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

public val CssGgIcons.AppleWatch: ImageVector
    get() {
        if (_appleWatch != null) {
            return _appleWatch!!
        }
        _appleWatch = Builder(name = "AppleWatch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.4975f, 5.0299f)
                curveTo(16.4973f, 5.078f, 16.4959f, 5.1258f, 16.4934f, 5.1733f)
                curveTo(17.662f, 5.5833f, 18.5f, 6.6963f, 18.5f, 8.005f)
                verticalLineTo(9.0049f)
                horizontalLineTo(19.5f)
                verticalLineTo(13.0049f)
                horizontalLineTo(18.5f)
                verticalLineTo(16.005f)
                curveTo(18.5f, 17.3129f, 17.663f, 18.4254f, 16.4953f, 18.8359f)
                curveTo(16.4984f, 18.8919f, 16.5f, 18.9482f, 16.5f, 19.005f)
                curveTo(16.5f, 20.6618f, 15.1569f, 22.005f, 13.5f, 22.005f)
                horizontalLineTo(9.5f)
                curveTo(7.8432f, 22.005f, 6.5f, 20.6618f, 6.5f, 19.005f)
                curveTo(6.5f, 18.9482f, 6.5016f, 18.8919f, 6.5047f, 18.8359f)
                curveTo(5.337f, 18.4254f, 4.5f, 17.3129f, 4.5f, 16.005f)
                verticalLineTo(8.005f)
                curveTo(4.5f, 6.6977f, 5.3362f, 5.5857f, 6.5029f, 5.1747f)
                curveTo(6.4991f, 5.1103f, 6.4973f, 5.0455f, 6.4976f, 4.9801f)
                curveTo(6.5059f, 3.3233f, 7.8557f, 1.9868f, 9.5125f, 1.9951f)
                lineTo(13.5125f, 2.015f)
                curveTo(15.1693f, 2.0232f, 16.5058f, 3.373f, 16.4975f, 5.0299f)
                close()
                moveTo(8.4976f, 5.005f)
                horizontalLineTo(14.4975f)
                curveTo(14.4922f, 4.4595f, 14.0498f, 4.0177f, 13.5025f, 4.015f)
                lineTo(9.5026f, 3.995f)
                curveTo(8.9503f, 3.9923f, 8.5003f, 4.4378f, 8.4976f, 4.9901f)
                lineTo(8.4976f, 5.005f)
                close()
                moveTo(15.7049f, 7.026f)
                lineTo(11.4846f, 7.005f)
                horizontalLineTo(7.5f)
                curveTo(6.9477f, 7.005f, 6.5f, 7.4527f, 6.5f, 8.005f)
                verticalLineTo(16.005f)
                curveTo(6.5f, 16.5568f, 6.947f, 17.0042f, 7.4986f, 17.005f)
                horizontalLineTo(15.5014f)
                curveTo(16.053f, 17.0042f, 16.5f, 16.5568f, 16.5f, 16.005f)
                verticalLineTo(8.005f)
                curveTo(16.5f, 7.5229f, 16.1589f, 7.1205f, 15.7049f, 7.026f)
                close()
                moveTo(8.5f, 19.005f)
                curveTo(8.5f, 19.5572f, 8.9477f, 20.005f, 9.5f, 20.005f)
                horizontalLineTo(13.5f)
                curveTo(14.0523f, 20.005f, 14.5f, 19.5572f, 14.5f, 19.005f)
                horizontalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _appleWatch!!
    }

private var _appleWatch: ImageVector? = null
