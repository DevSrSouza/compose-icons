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

public val LineAwesomeIcons.GooglePlusG: ImageVector
    get() {
        if (_googlePlusG != null) {
            return _googlePlusG!!
        }
        _googlePlusG = Builder(name = "GooglePlusG", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.0f)
                curveTo(6.0273f, 7.0f, 2.0f, 11.0273f, 2.0f, 16.0f)
                curveTo(2.0f, 20.9727f, 6.0273f, 25.0f, 11.0f, 25.0f)
                curveTo(15.9727f, 25.0f, 20.0f, 20.9727f, 20.0f, 16.0f)
                curveTo(20.0f, 15.3828f, 19.9336f, 14.7813f, 19.8125f, 14.1992f)
                lineTo(19.7656f, 14.0f)
                lineTo(11.0f, 14.0f)
                lineTo(11.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                curveTo(16.5234f, 19.8359f, 13.9727f, 22.0f, 11.0f, 22.0f)
                curveTo(7.6875f, 22.0f, 5.0f, 19.3125f, 5.0f, 16.0f)
                curveTo(5.0f, 12.6875f, 7.6875f, 10.0f, 11.0f, 10.0f)
                curveTo(12.5f, 10.0f, 13.8672f, 10.5547f, 14.9219f, 11.4648f)
                lineTo(17.0703f, 9.3594f)
                curveTo(15.4688f, 7.8945f, 13.3398f, 7.0f, 11.0f, 7.0f)
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
        return _googlePlusG!!
    }

private var _googlePlusG: ImageVector? = null
