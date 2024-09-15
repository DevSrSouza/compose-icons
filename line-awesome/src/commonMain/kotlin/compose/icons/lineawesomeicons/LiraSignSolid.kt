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

public val LineAwesomeIcons.LiraSignSolid: ImageVector
    get() {
        if (_liraSignSolid != null) {
            return _liraSignSolid!!
        }
        _liraSignSolid = Builder(name = "LiraSignSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                lineTo(11.0f, 9.906f)
                lineTo(8.0f, 11.0f)
                lineTo(8.0f, 13.0f)
                lineTo(11.0f, 11.906f)
                lineTo(11.0f, 13.906f)
                lineTo(8.0f, 15.0f)
                lineTo(8.0f, 17.0f)
                lineTo(11.0f, 15.906f)
                lineTo(11.0f, 28.0f)
                lineTo(12.0f, 28.0f)
                curveTo(17.762f, 28.0f, 22.828f, 24.152f, 24.344f, 18.594f)
                lineTo(24.969f, 16.25f)
                lineTo(23.031f, 15.75f)
                lineTo(22.406f, 18.063f)
                curveTo(21.219f, 22.426f, 17.43f, 25.422f, 13.0f, 25.844f)
                lineTo(13.0f, 15.188f)
                lineTo(19.0f, 13.0f)
                lineTo(19.0f, 11.0f)
                lineTo(13.0f, 13.188f)
                lineTo(13.0f, 11.188f)
                lineTo(19.0f, 9.0f)
                lineTo(19.0f, 7.0f)
                lineTo(13.0f, 9.188f)
                lineTo(13.0f, 4.0f)
                close()
            }
        }
        .build()
        return _liraSignSolid!!
    }

private var _liraSignSolid: ImageVector? = null
