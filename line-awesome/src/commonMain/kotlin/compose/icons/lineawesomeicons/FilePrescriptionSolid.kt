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

public val LineAwesomeIcons.FilePrescriptionSolid: ImageVector
    get() {
        if (_filePrescriptionSolid != null) {
            return _filePrescriptionSolid!!
        }
        _filePrescriptionSolid = Builder(name = "FilePrescriptionSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 9.6f)
                lineTo(25.699f, 9.301f)
                lineTo(19.699f, 3.301f)
                lineTo(19.4f, 3.0f)
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
                moveTo(20.0f, 6.4f)
                lineTo(22.6f, 9.0f)
                lineTo(20.0f, 9.0f)
                lineTo(20.0f, 6.4f)
                close()
                moveTo(11.0f, 11.0f)
                lineTo(11.0f, 20.0f)
                lineTo(13.0f, 20.0f)
                lineTo(13.0f, 17.0f)
                lineTo(13.6f, 17.0f)
                lineTo(16.1f, 21.4f)
                lineTo(14.0f, 25.0f)
                lineTo(16.0f, 25.0f)
                lineTo(17.0f, 23.199f)
                lineTo(18.0f, 25.0f)
                lineTo(20.0f, 25.0f)
                lineTo(18.0f, 21.4f)
                lineTo(20.0f, 18.0f)
                lineTo(18.0f, 18.0f)
                lineTo(17.0f, 19.699f)
                lineTo(15.301f, 16.699f)
                curveTo(16.301f, 16.199f, 16.9f, 15.2f, 16.9f, 14.0f)
                curveTo(16.9f, 12.4f, 15.5f, 11.0f, 13.9f, 11.0f)
                lineTo(11.0f, 11.0f)
                close()
                moveTo(13.0f, 13.0f)
                lineTo(14.0f, 13.0f)
                curveTo(14.6f, 13.0f, 15.0f, 13.4f, 15.0f, 14.0f)
                curveTo(15.0f, 14.6f, 14.6f, 15.0f, 14.0f, 15.0f)
                lineTo(13.0f, 15.0f)
                lineTo(13.0f, 13.0f)
                close()
            }
        }
        .build()
        return _filePrescriptionSolid!!
    }

private var _filePrescriptionSolid: ImageVector? = null
