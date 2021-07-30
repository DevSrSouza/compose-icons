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

public val LineAwesomeIcons.MonumentSolid: ImageVector
    get() {
        if (_monumentSolid != null) {
            return _monumentSolid!!
        }
        _monumentSolid = Builder(name = "MonumentSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(14.8945f, 4.0f, 14.0f, 4.8945f, 14.0f, 6.0f)
                curveTo(14.0f, 7.1055f, 14.8945f, 8.0f, 16.0f, 8.0f)
                curveTo(17.1055f, 8.0f, 18.0f, 7.1055f, 18.0f, 6.0f)
                curveTo(18.0f, 4.8945f, 17.1055f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 8.0f)
                lineTo(12.0f, 8.0f)
                lineTo(12.0f, 10.0f)
                lineTo(13.4688f, 10.0f)
                lineTo(13.0313f, 20.0f)
                lineTo(10.0f, 20.0f)
                lineTo(10.0f, 26.0f)
                lineTo(8.0f, 26.0f)
                lineTo(8.0f, 28.0f)
                lineTo(24.0f, 28.0f)
                lineTo(24.0f, 26.0f)
                lineTo(22.0f, 26.0f)
                lineTo(22.0f, 20.0f)
                lineTo(18.9688f, 20.0f)
                lineTo(18.5313f, 10.0f)
                lineTo(20.0f, 10.0f)
                lineTo(20.0f, 8.0f)
                close()
                moveTo(15.4688f, 10.0f)
                lineTo(16.5313f, 10.0f)
                lineTo(16.9688f, 20.0f)
                lineTo(15.0313f, 20.0f)
                close()
                moveTo(12.0f, 22.0f)
                lineTo(20.0f, 22.0f)
                lineTo(20.0f, 26.0f)
                lineTo(12.0f, 26.0f)
                close()
            }
        }
        .build()
        return _monumentSolid!!
    }

private var _monumentSolid: ImageVector? = null
