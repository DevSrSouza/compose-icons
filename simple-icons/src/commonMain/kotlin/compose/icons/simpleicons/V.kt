package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.V: ImageVector
    get() {
        if (_v != null) {
            return _v!!
        }
        _v = Builder(name = "V", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.474f, 0.159f)
                lineTo(17.08f, 0.775f)
                curveToRelative(-0.406f, 0.039f, -0.844f, 0.383f, -0.978f, 0.768f)
                lineToRelative(-4.092f, 11.749f)
                lineTo(7.898f, 1.542f)
                curveTo(7.764f, 1.158f, 7.325f, 0.814f, 6.92f, 0.775f)
                lineTo(0.526f, 0.159f)
                curveTo(0.121f, 0.12f, -0.096f, 0.399f, 0.041f, 0.783f)
                lineTo(8.085f, 23.15f)
                curveToRelative(0.138f, 0.383f, 0.581f, 0.695f, 0.988f, 0.695f)
                horizontalLineToRelative(6.223f)
                horizontalLineToRelative(0.039f)
                curveToRelative(0.073f, 0.0f, 0.134f, -0.02f, 0.179f, -0.055f)
                curveToRelative(0.124f, -0.062f, 0.231f, -0.169f, 0.275f, -0.292f)
                lineToRelative(0.039f, -0.108f)
                lineToRelative(8.13f, -22.607f)
                curveTo(24.096f, 0.399f, 23.879f, 0.12f, 23.474f, 0.159f)
                close()
            }
        }
        .build()
        return _v!!
    }

private var _v: ImageVector? = null
