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

public val LineAwesomeIcons.PhotoVideoSolid: ImageVector
    get() {
        if (_photoVideoSolid != null) {
            return _photoVideoSolid!!
        }
        _photoVideoSolid = Builder(name = "PhotoVideoSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                lineTo(10.0f, 9.0f)
                lineTo(12.0f, 9.0f)
                lineTo(12.0f, 4.0f)
                lineTo(14.0f, 4.0f)
                lineTo(14.0f, 5.0f)
                lineTo(16.0f, 5.0f)
                lineTo(16.0f, 4.0f)
                lineTo(25.0f, 4.0f)
                lineTo(25.0f, 5.0f)
                lineTo(27.0f, 5.0f)
                lineTo(27.0f, 4.0f)
                lineTo(29.0f, 4.0f)
                lineTo(29.0f, 16.0f)
                lineTo(27.0f, 16.0f)
                lineTo(27.0f, 15.0f)
                lineTo(25.0f, 15.0f)
                lineTo(25.0f, 18.0f)
                lineTo(31.0f, 18.0f)
                lineTo(31.0f, 2.0f)
                lineTo(10.0f, 2.0f)
                close()
                moveTo(14.0f, 7.0f)
                lineTo(14.0f, 9.0f)
                lineTo(16.0f, 9.0f)
                lineTo(16.0f, 7.0f)
                lineTo(14.0f, 7.0f)
                close()
                moveTo(25.0f, 7.0f)
                lineTo(25.0f, 9.0f)
                lineTo(27.0f, 9.0f)
                lineTo(27.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                close()
                moveTo(2.0f, 11.0f)
                lineTo(2.0f, 29.0f)
                lineTo(23.0f, 29.0f)
                lineTo(23.0f, 11.0f)
                lineTo(2.0f, 11.0f)
                close()
                moveTo(25.0f, 11.0f)
                lineTo(25.0f, 13.0f)
                lineTo(27.0f, 13.0f)
                lineTo(27.0f, 11.0f)
                lineTo(25.0f, 11.0f)
                close()
                moveTo(4.0f, 13.0f)
                lineTo(21.0f, 13.0f)
                lineTo(21.0f, 22.7813f)
                lineTo(18.4063f, 20.1875f)
                lineTo(17.6875f, 19.5f)
                lineTo(14.875f, 22.3125f)
                lineTo(10.5938f, 18.0f)
                lineTo(9.9063f, 17.2813f)
                lineTo(4.0f, 23.1875f)
                lineTo(4.0f, 13.0f)
                close()
                moveTo(15.5f, 15.0f)
                curveTo(14.671f, 15.0f, 14.0f, 15.671f, 14.0f, 16.5f)
                curveTo(14.0f, 17.329f, 14.671f, 18.0f, 15.5f, 18.0f)
                curveTo(16.329f, 18.0f, 17.0f, 17.329f, 17.0f, 16.5f)
                curveTo(17.0f, 15.671f, 16.329f, 15.0f, 15.5f, 15.0f)
                close()
                moveTo(9.9043f, 20.125f)
                lineTo(14.9043f, 25.125f)
                lineTo(15.5938f, 24.4063f)
                lineTo(17.6875f, 22.3125f)
                lineTo(21.0f, 25.625f)
                lineTo(21.0f, 27.0f)
                lineTo(4.0f, 27.0f)
                lineTo(4.0f, 26.0313f)
                lineTo(9.9043f, 20.125f)
                close()
            }
        }
        .build()
        return _photoVideoSolid!!
    }

private var _photoVideoSolid: ImageVector? = null
