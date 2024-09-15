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

public val CssGgIcons.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.012f, 5.572f)
                lineTo(10.925f, 4.485f)
                curveTo(8.777f, 2.337f, 5.295f, 2.337f, 3.147f, 4.485f)
                curveTo(0.999f, 6.633f, 0.999f, 10.115f, 3.147f, 12.263f)
                lineTo(11.986f, 21.102f)
                lineTo(11.988f, 21.1f)
                lineTo(12.014f, 21.126f)
                lineTo(20.853f, 12.287f)
                curveTo(23.001f, 10.139f, 23.001f, 6.657f, 20.853f, 4.509f)
                curveTo(18.705f, 2.361f, 15.223f, 2.361f, 13.075f, 4.509f)
                lineTo(12.012f, 5.572f)
                close()
                moveTo(11.988f, 18.271f)
                lineTo(16.924f, 13.335f)
                lineTo(18.375f, 11.934f)
                lineTo(18.376f, 11.936f)
                lineTo(19.439f, 10.873f)
                curveTo(20.806f, 9.506f, 20.806f, 7.29f, 19.439f, 5.923f)
                curveTo(18.072f, 4.557f, 15.856f, 4.557f, 14.489f, 5.923f)
                lineTo(12.013f, 8.399f)
                lineTo(12.006f, 8.392f)
                lineTo(12.005f, 8.393f)
                lineTo(9.511f, 5.899f)
                curveTo(8.144f, 4.532f, 5.928f, 4.532f, 4.561f, 5.899f)
                curveTo(3.194f, 7.266f, 3.194f, 9.482f, 4.561f, 10.849f)
                lineTo(7.101f, 13.388f)
                lineTo(7.102f, 13.386f)
                lineTo(11.988f, 18.271f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
