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

public val LineAwesomeIcons.MercurySolid: ImageVector
    get() {
        if (_mercurySolid != null) {
            return _mercurySolid!!
        }
        _mercurySolid = Builder(name = "MercurySolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                curveTo(11.0f, 3.477f, 11.66f, 4.801f, 12.688f, 5.719f)
                curveTo(9.93f, 6.984f, 8.0f, 9.777f, 8.0f, 13.0f)
                curveTo(8.0f, 17.066f, 11.066f, 20.438f, 15.0f, 20.938f)
                lineTo(15.0f, 24.0f)
                lineTo(11.0f, 24.0f)
                lineTo(11.0f, 26.0f)
                lineTo(15.0f, 26.0f)
                lineTo(15.0f, 30.0f)
                lineTo(17.0f, 30.0f)
                lineTo(17.0f, 26.0f)
                lineTo(21.0f, 26.0f)
                lineTo(21.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 20.938f)
                curveTo(20.934f, 20.438f, 24.0f, 17.066f, 24.0f, 13.0f)
                curveTo(24.0f, 9.777f, 22.07f, 6.984f, 19.313f, 5.719f)
                curveTo(20.34f, 4.801f, 21.0f, 3.477f, 21.0f, 2.0f)
                lineTo(19.0f, 2.0f)
                curveTo(19.0f, 3.668f, 17.668f, 5.0f, 16.0f, 5.0f)
                curveTo(14.332f, 5.0f, 13.0f, 3.668f, 13.0f, 2.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(19.324f, 7.0f, 22.0f, 9.676f, 22.0f, 13.0f)
                curveTo(22.0f, 16.324f, 19.324f, 19.0f, 16.0f, 19.0f)
                curveTo(12.676f, 19.0f, 10.0f, 16.324f, 10.0f, 13.0f)
                curveTo(10.0f, 9.676f, 12.676f, 7.0f, 16.0f, 7.0f)
                close()
            }
        }
        .build()
        return _mercurySolid!!
    }

private var _mercurySolid: ImageVector? = null
