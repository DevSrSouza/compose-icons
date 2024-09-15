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

public val LineAwesomeIcons.MediumM: ImageVector
    get() {
        if (_mediumM != null) {
            return _mediumM!!
        }
        _mediumM = Builder(name = "MediumM", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.0f, 10.359f)
                lineTo(25.211f, 10.359f)
                curveTo(24.914f, 10.359f, 24.5f, 10.785f, 24.5f, 11.059f)
                lineTo(24.5f, 20.992f)
                curveTo(24.5f, 21.27f, 24.914f, 21.641f, 25.211f, 21.641f)
                lineTo(26.0f, 21.641f)
                lineTo(26.0f, 24.0f)
                lineTo(18.832f, 24.0f)
                lineTo(18.832f, 21.641f)
                lineTo(20.332f, 21.641f)
                lineTo(20.332f, 11.199f)
                lineTo(20.262f, 11.199f)
                lineTo(16.758f, 24.0f)
                lineTo(14.047f, 24.0f)
                lineTo(10.586f, 11.199f)
                lineTo(10.5f, 11.199f)
                lineTo(10.5f, 21.641f)
                lineTo(12.0f, 21.641f)
                lineTo(12.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                lineTo(6.0f, 21.641f)
                lineTo(6.77f, 21.641f)
                curveTo(7.086f, 21.641f, 7.5f, 21.27f, 7.5f, 20.992f)
                lineTo(7.5f, 11.059f)
                curveTo(7.5f, 10.785f, 7.086f, 10.359f, 6.77f, 10.359f)
                lineTo(6.0f, 10.359f)
                lineTo(6.0f, 8.0f)
                lineTo(13.504f, 8.0f)
                lineTo(15.965f, 17.262f)
                lineTo(16.035f, 17.262f)
                lineTo(18.52f, 8.0f)
                lineTo(26.0f, 8.0f)
                close()
            }
        }
        .build()
        return _mediumM!!
    }

private var _mediumM: ImageVector? = null
