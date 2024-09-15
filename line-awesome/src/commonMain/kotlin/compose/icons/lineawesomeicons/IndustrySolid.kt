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

public val LineAwesomeIcons.IndustrySolid: ImageVector
    get() {
        if (_industrySolid != null) {
            return _industrySolid!!
        }
        _industrySolid = Builder(name = "IndustrySolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                lineTo(20.0f, 10.469f)
                lineTo(17.0f, 12.25f)
                lineTo(17.0f, 9.219f)
                lineTo(15.5f, 10.156f)
                lineTo(12.0f, 12.25f)
                lineTo(12.0f, 9.219f)
                lineTo(10.5f, 10.156f)
                lineTo(5.5f, 13.156f)
                lineTo(5.0f, 13.438f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(22.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 14.531f)
                lineTo(10.0f, 12.75f)
                lineTo(10.0f, 15.781f)
                lineTo(11.5f, 14.844f)
                lineTo(15.0f, 12.75f)
                lineTo(15.0f, 15.781f)
                lineTo(16.5f, 14.844f)
                lineTo(21.5f, 11.844f)
                lineTo(22.0f, 11.563f)
                close()
                moveTo(9.0f, 17.0f)
                lineTo(9.0f, 19.0f)
                lineTo(11.0f, 19.0f)
                lineTo(11.0f, 17.0f)
                close()
                moveTo(13.0f, 17.0f)
                lineTo(13.0f, 19.0f)
                lineTo(15.0f, 19.0f)
                lineTo(15.0f, 17.0f)
                close()
                moveTo(17.0f, 17.0f)
                lineTo(17.0f, 19.0f)
                lineTo(19.0f, 19.0f)
                lineTo(19.0f, 17.0f)
                close()
                moveTo(21.0f, 17.0f)
                lineTo(21.0f, 19.0f)
                lineTo(23.0f, 19.0f)
                lineTo(23.0f, 17.0f)
                close()
                moveTo(9.0f, 21.0f)
                lineTo(9.0f, 23.0f)
                lineTo(11.0f, 23.0f)
                lineTo(11.0f, 21.0f)
                close()
                moveTo(13.0f, 21.0f)
                lineTo(13.0f, 23.0f)
                lineTo(15.0f, 23.0f)
                lineTo(15.0f, 21.0f)
                close()
                moveTo(17.0f, 21.0f)
                lineTo(17.0f, 23.0f)
                lineTo(19.0f, 23.0f)
                lineTo(19.0f, 21.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(21.0f, 23.0f)
                lineTo(23.0f, 23.0f)
                lineTo(23.0f, 21.0f)
                close()
            }
        }
        .build()
        return _industrySolid!!
    }

private var _industrySolid: ImageVector? = null
