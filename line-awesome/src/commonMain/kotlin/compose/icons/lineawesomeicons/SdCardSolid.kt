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

public val LineAwesomeIcons.SdCardSolid: ImageVector
    get() {
        if (_sdCardSolid != null) {
            return _sdCardSolid!!
        }
        _sdCardSolid = Builder(name = "SdCardSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 5.0f)
                lineTo(9.1875f, 5.4063f)
                lineTo(6.0f, 9.6563f)
                lineTo(6.0f, 27.0f)
                lineTo(25.0f, 27.0f)
                lineTo(25.0f, 5.0f)
                close()
                moveTo(10.5f, 7.0f)
                lineTo(23.0f, 7.0f)
                lineTo(23.0f, 25.0f)
                lineTo(8.0f, 25.0f)
                lineTo(8.0f, 10.3438f)
                close()
                moveTo(13.0f, 9.0f)
                lineTo(13.0f, 13.0f)
                lineTo(15.0f, 13.0f)
                lineTo(15.0f, 9.0f)
                close()
                moveTo(16.0f, 9.0f)
                lineTo(16.0f, 13.0f)
                lineTo(18.0f, 13.0f)
                lineTo(18.0f, 9.0f)
                close()
                moveTo(19.0f, 9.0f)
                lineTo(19.0f, 13.0f)
                lineTo(21.0f, 13.0f)
                lineTo(21.0f, 9.0f)
                close()
                moveTo(10.0f, 10.0f)
                lineTo(10.0f, 14.0f)
                lineTo(12.0f, 14.0f)
                lineTo(12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _sdCardSolid!!
    }

private var _sdCardSolid: ImageVector? = null
