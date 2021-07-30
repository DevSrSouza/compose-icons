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

public val LineAwesomeIcons.DiceSolid: ImageVector
    get() {
        if (_diceSolid != null) {
            return _diceSolid!!
        }
        _diceSolid = Builder(name = "DiceSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(0.0f, 13.0f)
                lineTo(12.0f, 25.0f)
                lineTo(24.0f, 13.0f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(12.0f, 3.8008f)
                lineTo(21.1992f, 13.0f)
                lineTo(12.0f, 22.1992f)
                lineTo(2.8008f, 13.0f)
                lineTo(12.0f, 3.8008f)
                close()
                moveTo(12.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 8.0f)
                close()
                moveTo(8.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 12.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 12.0f)
                close()
                moveTo(16.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 12.0f)
                close()
                moveTo(26.8008f, 13.0f)
                lineTo(24.8008f, 15.0f)
                lineTo(30.0f, 15.0f)
                lineTo(30.0f, 27.0f)
                lineTo(18.0f, 27.0f)
                lineTo(18.0f, 21.8008f)
                lineTo(16.0f, 23.8008f)
                lineTo(16.0f, 29.0f)
                lineTo(32.0f, 29.0f)
                lineTo(32.0f, 13.0f)
                lineTo(26.8008f, 13.0f)
                close()
                moveTo(12.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 16.0f)
                close()
                moveTo(24.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 24.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 24.0f, 20.0f)
                close()
            }
        }
        .build()
        return _diceSolid!!
    }

private var _diceSolid: ImageVector? = null
