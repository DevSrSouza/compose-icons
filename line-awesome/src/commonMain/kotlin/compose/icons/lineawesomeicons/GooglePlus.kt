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

public val LineAwesomeIcons.GooglePlus: ImageVector
    get() {
        if (_googlePlus != null) {
            return _googlePlus!!
        }
        _googlePlus = Builder(name = "GooglePlus", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.0f)
                curveTo(6.027f, 7.0f, 2.0f, 11.027f, 2.0f, 16.0f)
                curveTo(2.0f, 20.973f, 6.027f, 25.0f, 11.0f, 25.0f)
                curveTo(15.973f, 25.0f, 20.0f, 20.973f, 20.0f, 16.0f)
                curveTo(20.0f, 15.383f, 19.934f, 14.781f, 19.813f, 14.199f)
                lineTo(19.766f, 14.0f)
                lineTo(11.0f, 14.0f)
                lineTo(11.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                curveTo(16.523f, 19.836f, 13.973f, 22.0f, 11.0f, 22.0f)
                curveTo(7.688f, 22.0f, 5.0f, 19.313f, 5.0f, 16.0f)
                curveTo(5.0f, 12.688f, 7.688f, 10.0f, 11.0f, 10.0f)
                curveTo(12.5f, 10.0f, 13.867f, 10.555f, 14.922f, 11.465f)
                lineTo(17.07f, 9.359f)
                curveTo(15.469f, 7.895f, 13.34f, 7.0f, 11.0f, 7.0f)
                close()
                moveTo(25.0f, 11.0f)
                lineTo(25.0f, 14.0f)
                lineTo(22.0f, 14.0f)
                lineTo(22.0f, 16.0f)
                lineTo(25.0f, 16.0f)
                lineTo(25.0f, 19.0f)
                lineTo(27.0f, 19.0f)
                lineTo(27.0f, 16.0f)
                lineTo(30.0f, 16.0f)
                lineTo(30.0f, 14.0f)
                lineTo(27.0f, 14.0f)
                lineTo(27.0f, 11.0f)
                close()
            }
        }
        .build()
        return _googlePlus!!
    }

private var _googlePlus: ImageVector? = null
