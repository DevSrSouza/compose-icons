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

public val LineAwesomeIcons.FilePowerpoint: ImageVector
    get() {
        if (_filePowerpoint != null) {
            return _filePowerpoint!!
        }
        _filePowerpoint = Builder(name = "FilePowerpoint", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 9.5996f)
                lineTo(25.6992f, 9.3008f)
                lineTo(19.6992f, 3.3008f)
                lineTo(19.4004f, 3.0f)
                lineTo(6.0f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                lineTo(18.0f, 11.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(20.0f, 6.4004f)
                lineTo(22.5996f, 9.0f)
                lineTo(20.0f, 9.0f)
                lineTo(20.0f, 6.4004f)
                close()
                moveTo(13.0f, 13.0f)
                lineTo(13.0f, 15.0f)
                lineTo(17.0f, 15.0f)
                curveTo(18.2f, 15.0f, 19.0f, 15.8f, 19.0f, 17.0f)
                curveTo(19.0f, 18.2f, 18.2f, 19.0f, 17.0f, 19.0f)
                curveTo(15.8f, 19.0f, 15.0f, 18.2f, 15.0f, 17.0f)
                lineTo(13.0f, 17.0f)
                lineTo(13.0f, 24.0f)
                lineTo(15.0f, 24.0f)
                lineTo(15.0f, 20.4004f)
                curveTo(15.6f, 20.8004f, 16.3f, 21.0f, 17.0f, 21.0f)
                curveTo(19.2f, 21.0f, 21.0f, 19.2f, 21.0f, 17.0f)
                curveTo(21.0f, 14.8f, 19.2f, 13.0f, 17.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                close()
            }
        }
        .build()
        return _filePowerpoint!!
    }

private var _filePowerpoint: ImageVector? = null
