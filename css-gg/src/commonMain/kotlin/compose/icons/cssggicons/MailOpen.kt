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

public val CssGgIcons.MailOpen: ImageVector
    get() {
        if (_mailOpen != null) {
            return _mailOpen!!
        }
        _mailOpen = Builder(name = "MailOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.05f, 10.015f)
                curveTo(2.792f, 9.307f, 2.947f, 8.482f, 3.515f, 7.914f)
                lineTo(9.879f, 1.55f)
                curveTo(11.05f, 0.379f, 12.95f, 0.379f, 14.121f, 1.55f)
                lineTo(20.485f, 7.914f)
                curveTo(21.053f, 8.482f, 21.208f, 9.307f, 20.95f, 10.015f)
                curveTo(20.982f, 10.114f, 21.0f, 10.219f, 21.0f, 10.328f)
                verticalLineTo(21.329f)
                curveTo(21.0f, 22.433f, 20.104f, 23.329f, 19.0f, 23.329f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 23.329f, 3.0f, 22.433f, 3.0f, 21.329f)
                verticalLineTo(10.328f)
                curveTo(3.0f, 10.219f, 3.018f, 10.114f, 3.05f, 10.015f)
                close()
                moveTo(4.929f, 9.328f)
                lineTo(11.293f, 2.965f)
                curveTo(11.683f, 2.574f, 12.317f, 2.574f, 12.707f, 2.965f)
                lineTo(19.071f, 9.328f)
                horizontalLineTo(19.041f)
                verticalLineTo(9.359f)
                lineTo(12.707f, 15.692f)
                curveTo(12.317f, 16.083f, 11.683f, 16.083f, 11.293f, 15.692f)
                lineTo(4.929f, 9.328f)
                close()
                moveTo(19.0f, 12.228f)
                lineTo(14.121f, 17.107f)
                curveTo(12.95f, 18.278f, 11.05f, 18.278f, 9.879f, 17.107f)
                lineTo(5.0f, 12.228f)
                lineTo(5.0f, 21.329f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.228f)
                close()
            }
        }
        .build()
        return _mailOpen!!
    }

private var _mailOpen: ImageVector? = null
