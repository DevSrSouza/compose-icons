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

public val LineAwesomeIcons.FaxSolid: ImageVector
    get() {
        if (_faxSolid != null) {
            return _faxSolid!!
        }
        _faxSolid = Builder(name = "FaxSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                lineTo(12.0f, 10.0f)
                lineTo(10.0f, 10.0f)
                lineTo(10.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                lineTo(4.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 27.0f)
                curveTo(6.0f, 28.6445f, 7.3555f, 30.0f, 9.0f, 30.0f)
                curveTo(10.6445f, 30.0f, 12.0f, 28.6445f, 12.0f, 27.0f)
                lineTo(12.0f, 26.0f)
                lineTo(28.0f, 26.0f)
                lineTo(28.0f, 10.0f)
                lineTo(24.0f, 10.0f)
                lineTo(24.0f, 5.0f)
                close()
                moveTo(14.0f, 7.0f)
                lineTo(22.0f, 7.0f)
                lineTo(22.0f, 12.0f)
                lineTo(14.0f, 12.0f)
                close()
                moveTo(6.0f, 10.0f)
                lineTo(8.0f, 10.0f)
                lineTo(8.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                close()
                moveTo(10.0f, 12.0f)
                lineTo(12.0f, 12.0f)
                lineTo(12.0f, 14.0f)
                lineTo(24.0f, 14.0f)
                lineTo(24.0f, 12.0f)
                lineTo(26.0f, 12.0f)
                lineTo(26.0f, 24.0f)
                lineTo(10.0f, 24.0f)
                close()
                moveTo(13.0f, 16.0f)
                lineTo(13.0f, 18.0f)
                lineTo(15.0f, 18.0f)
                lineTo(15.0f, 16.0f)
                close()
                moveTo(17.0f, 16.0f)
                lineTo(17.0f, 18.0f)
                lineTo(19.0f, 18.0f)
                lineTo(19.0f, 16.0f)
                close()
                moveTo(21.0f, 16.0f)
                lineTo(21.0f, 18.0f)
                lineTo(23.0f, 18.0f)
                lineTo(23.0f, 16.0f)
                close()
                moveTo(13.0f, 20.0f)
                lineTo(13.0f, 22.0f)
                lineTo(15.0f, 22.0f)
                lineTo(15.0f, 20.0f)
                close()
                moveTo(17.0f, 20.0f)
                lineTo(17.0f, 22.0f)
                lineTo(19.0f, 22.0f)
                lineTo(19.0f, 20.0f)
                close()
                moveTo(21.0f, 20.0f)
                lineTo(21.0f, 22.0f)
                lineTo(23.0f, 22.0f)
                lineTo(23.0f, 20.0f)
                close()
                moveTo(8.0f, 26.0f)
                lineTo(10.0f, 26.0f)
                lineTo(10.0f, 27.0f)
                curveTo(10.0f, 27.5547f, 9.5547f, 28.0f, 9.0f, 28.0f)
                curveTo(8.4453f, 28.0f, 8.0f, 27.5547f, 8.0f, 27.0f)
                close()
            }
        }
        .build()
        return _faxSolid!!
    }

private var _faxSolid: ImageVector? = null
