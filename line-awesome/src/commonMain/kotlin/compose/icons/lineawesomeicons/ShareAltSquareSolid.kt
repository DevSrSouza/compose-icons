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

public val LineAwesomeIcons.ShareAltSquareSolid: ImageVector
    get() {
        if (_shareAltSquareSolid != null) {
            return _shareAltSquareSolid!!
        }
        _shareAltSquareSolid = Builder(name = "ShareAltSquareSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(20.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.008f, 12.156f)
                lineTo(13.32f, 14.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.32f, 17.5f)
                lineTo(18.008f, 19.844f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.68f, 18.5f)
                lineTo(13.992f, 16.156f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.992f, 15.844f)
                lineTo(18.68f, 13.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 10.0f)
                close()
            }
        }
        .build()
        return _shareAltSquareSolid!!
    }

private var _shareAltSquareSolid: ImageVector? = null
