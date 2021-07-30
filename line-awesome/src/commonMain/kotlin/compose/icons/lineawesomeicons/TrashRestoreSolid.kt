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

public val LineAwesomeIcons.TrashRestoreSolid: ImageVector
    get() {
        if (_trashRestoreSolid != null) {
            return _trashRestoreSolid!!
        }
        _trashRestoreSolid = Builder(name = "TrashRestoreSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                curveTo(13.477f, 4.0f, 12.9415f, 4.1835f, 12.5625f, 4.5625f)
                curveTo(12.1845f, 4.9405f, 12.0f, 5.477f, 12.0f, 6.0f)
                lineTo(12.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                lineTo(5.0f, 9.0f)
                lineTo(6.0938f, 9.0f)
                lineTo(8.0f, 27.0938f)
                lineTo(8.0938f, 28.0f)
                lineTo(23.9063f, 28.0f)
                lineTo(24.0f, 27.0938f)
                lineTo(25.9063f, 9.0f)
                lineTo(27.0f, 9.0f)
                lineTo(27.0f, 7.0f)
                lineTo(20.0f, 7.0f)
                lineTo(20.0f, 6.0f)
                curveTo(20.0f, 5.477f, 19.8165f, 4.9415f, 19.4375f, 4.5625f)
                curveTo(19.0595f, 4.1845f, 18.523f, 4.0f, 18.0f, 4.0f)
                lineTo(14.0f, 4.0f)
                close()
                moveTo(14.0f, 6.0f)
                lineTo(18.0f, 6.0f)
                lineTo(18.0f, 7.0f)
                lineTo(14.0f, 7.0f)
                lineTo(14.0f, 6.0f)
                close()
                moveTo(8.125f, 9.0f)
                lineTo(23.875f, 9.0f)
                lineTo(22.0938f, 26.0f)
                lineTo(9.9063f, 26.0f)
                lineTo(8.125f, 9.0f)
                close()
                moveTo(16.0f, 12.0f)
                lineTo(12.0f, 16.0f)
                lineTo(15.0f, 16.0f)
                lineTo(15.0f, 23.0f)
                lineTo(17.0f, 23.0f)
                lineTo(17.0f, 16.0f)
                lineTo(20.0f, 16.0f)
                lineTo(16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _trashRestoreSolid!!
    }

private var _trashRestoreSolid: ImageVector? = null
