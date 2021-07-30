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

public val LineAwesomeIcons.TrashRestoreAltSolid: ImageVector
    get() {
        if (_trashRestoreAltSolid != null) {
            return _trashRestoreAltSolid!!
        }
        _trashRestoreAltSolid = Builder(name = "TrashRestoreAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                curveTo(14.478f, 4.0f, 13.9405f, 4.1845f, 13.5625f, 4.5625f)
                curveTo(13.1855f, 4.9395f, 13.0f, 5.478f, 13.0f, 6.0f)
                lineTo(13.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                lineTo(7.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                lineTo(8.0f, 25.0f)
                curveTo(8.0f, 26.645f, 9.355f, 28.0f, 11.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                curveTo(24.645f, 28.0f, 26.0f, 26.645f, 26.0f, 25.0f)
                lineTo(26.0f, 9.0f)
                lineTo(27.0f, 9.0f)
                lineTo(27.0f, 7.0f)
                lineTo(21.0f, 7.0f)
                lineTo(21.0f, 6.0f)
                curveTo(21.0f, 5.478f, 20.8155f, 4.9405f, 20.4375f, 4.5625f)
                curveTo(20.0605f, 4.1855f, 19.522f, 4.0f, 19.0f, 4.0f)
                lineTo(15.0f, 4.0f)
                close()
                moveTo(15.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                lineTo(19.0f, 7.0f)
                lineTo(15.0f, 7.0f)
                lineTo(15.0f, 6.0f)
                close()
                moveTo(10.0f, 9.0f)
                lineTo(24.0f, 9.0f)
                lineTo(24.0f, 25.0f)
                curveTo(24.0f, 25.555f, 23.555f, 26.0f, 23.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                curveTo(10.445f, 26.0f, 10.0f, 25.555f, 10.0f, 25.0f)
                lineTo(10.0f, 9.0f)
                close()
                moveTo(17.0f, 12.0f)
                lineTo(13.0f, 16.0f)
                lineTo(16.0f, 16.0f)
                lineTo(16.0f, 23.0f)
                lineTo(18.0f, 23.0f)
                lineTo(18.0f, 16.0f)
                lineTo(21.0f, 16.0f)
                lineTo(17.0f, 12.0f)
                close()
            }
        }
        .build()
        return _trashRestoreAltSolid!!
    }

private var _trashRestoreAltSolid: ImageVector? = null
