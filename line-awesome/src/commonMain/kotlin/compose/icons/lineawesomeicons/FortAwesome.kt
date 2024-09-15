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

public val LineAwesomeIcons.FortAwesome: ImageVector
    get() {
        if (_fortAwesome != null) {
            return _fortAwesome!!
        }
        _fortAwesome = Builder(name = "FortAwesome", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 4.0f)
                curveTo(15.225f, 4.0f, 15.0f, 4.225f, 15.0f, 4.5f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 11.5f)
                lineTo(15.0f, 12.0f)
                lineTo(13.0f, 12.0f)
                lineTo(13.0f, 10.0f)
                lineTo(11.0f, 10.0f)
                lineTo(11.0f, 12.0f)
                lineTo(8.994f, 12.0f)
                lineTo(8.994f, 10.0f)
                lineTo(7.0f, 10.0f)
                lineTo(7.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 17.0f)
                lineTo(3.0f, 17.0f)
                lineTo(3.0f, 27.0f)
                lineTo(13.0f, 27.0f)
                lineTo(13.0f, 24.0f)
                curveTo(13.0f, 22.343f, 14.343f, 21.0f, 16.0f, 21.0f)
                curveTo(17.657f, 21.0f, 19.0f, 22.343f, 19.0f, 24.0f)
                lineTo(19.0f, 27.0f)
                lineTo(29.0f, 27.0f)
                lineTo(29.0f, 17.0f)
                lineTo(27.0f, 17.0f)
                lineTo(27.0f, 19.0f)
                lineTo(25.0f, 19.0f)
                lineTo(25.0f, 10.0f)
                lineTo(22.994f, 10.0f)
                lineTo(22.994f, 12.0f)
                lineTo(21.0f, 12.0f)
                lineTo(21.0f, 10.0f)
                lineTo(19.0f, 10.0f)
                lineTo(19.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                lineTo(17.0f, 10.0f)
                lineTo(16.0f, 10.0f)
                lineTo(16.0f, 7.906f)
                curveTo(16.275f, 7.806f, 16.725f, 7.678f, 17.275f, 7.668f)
                curveTo(18.037f, 7.658f, 18.412f, 7.867f, 19.225f, 7.957f)
                curveTo(19.572f, 8.0f, 20.069f, 8.029f, 20.699f, 7.951f)
                curveTo(20.869f, 7.93f, 21.0f, 7.778f, 21.0f, 7.607f)
                lineTo(21.0f, 4.432f)
                curveTo(21.0f, 4.332f, 20.887f, 4.261f, 20.762f, 4.281f)
                curveTo(20.1f, 4.361f, 19.587f, 4.331f, 19.225f, 4.291f)
                curveTo(18.412f, 4.201f, 18.037f, 3.982f, 17.275f, 4.002f)
                curveTo(16.725f, 4.012f, 16.275f, 4.14f, 16.0f, 4.24f)
                lineTo(16.0f, 4.5f)
                curveTo(16.0f, 4.225f, 15.775f, 4.0f, 15.5f, 4.0f)
                close()
                moveTo(11.0f, 14.0f)
                lineTo(13.0f, 14.0f)
                lineTo(13.0f, 18.0f)
                lineTo(11.0f, 18.0f)
                lineTo(11.0f, 14.0f)
                close()
                moveTo(19.0f, 14.0f)
                lineTo(21.0f, 14.0f)
                lineTo(21.0f, 18.0f)
                lineTo(19.0f, 18.0f)
                lineTo(19.0f, 14.0f)
                close()
            }
        }
        .build()
        return _fortAwesome!!
    }

private var _fortAwesome: ImageVector? = null
