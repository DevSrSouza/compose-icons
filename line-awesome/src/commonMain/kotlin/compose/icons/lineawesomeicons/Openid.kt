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

public val LineAwesomeIcons.Openid: ImageVector
    get() {
        if (_openid != null) {
            return _openid!!
        }
        _openid = Builder(name = "Openid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                lineTo(15.0f, 5.938f)
                lineTo(15.0f, 25.625f)
                curveTo(9.855f, 24.953f, 6.938f, 22.602f, 6.938f, 19.656f)
                curveTo(6.938f, 16.895f, 9.922f, 14.555f, 14.0f, 13.813f)
                lineTo(14.0f, 11.313f)
                curveTo(7.723f, 12.109f, 3.0f, 15.543f, 3.0f, 19.656f)
                curveTo(3.0f, 23.949f, 7.52f, 27.473f, 15.0f, 28.094f)
                lineTo(19.0f, 26.219f)
                close()
                moveTo(20.0f, 11.375f)
                lineTo(20.0f, 13.906f)
                curveTo(21.313f, 14.188f, 22.504f, 14.645f, 23.5f, 15.219f)
                lineTo(21.375f, 16.406f)
                lineTo(29.0f, 18.063f)
                lineTo(28.469f, 12.438f)
                lineTo(26.438f, 13.563f)
                curveTo(24.688f, 12.5f, 22.469f, 11.742f, 20.0f, 11.375f)
                close()
            }
        }
        .build()
        return _openid!!
    }

private var _openid: ImageVector? = null
