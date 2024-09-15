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

public val LineAwesomeIcons.CropSolid: ImageVector
    get() {
        if (_cropSolid != null) {
            return _cropSolid!!
        }
        _cropSolid = Builder(name = "CropSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                lineTo(8.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                lineTo(4.0f, 10.0f)
                lineTo(8.0f, 10.0f)
                lineTo(8.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 28.0f)
                lineTo(24.0f, 28.0f)
                lineTo(24.0f, 24.0f)
                lineTo(28.0f, 24.0f)
                lineTo(28.0f, 22.0f)
                lineTo(11.438f, 22.0f)
                lineTo(22.0f, 11.438f)
                lineTo(22.0f, 21.0f)
                lineTo(24.0f, 21.0f)
                lineTo(24.0f, 9.438f)
                lineTo(27.719f, 5.719f)
                lineTo(26.281f, 4.281f)
                lineTo(22.563f, 8.0f)
                lineTo(11.0f, 8.0f)
                lineTo(11.0f, 10.0f)
                lineTo(20.563f, 10.0f)
                lineTo(10.0f, 20.563f)
                lineTo(10.0f, 4.0f)
                close()
            }
        }
        .build()
        return _cropSolid!!
    }

private var _cropSolid: ImageVector? = null
