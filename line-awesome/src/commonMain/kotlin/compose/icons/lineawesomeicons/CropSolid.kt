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
                lineTo(11.4375f, 22.0f)
                lineTo(22.0f, 11.4375f)
                lineTo(22.0f, 21.0f)
                lineTo(24.0f, 21.0f)
                lineTo(24.0f, 9.4375f)
                lineTo(27.7188f, 5.7188f)
                lineTo(26.2813f, 4.2813f)
                lineTo(22.5625f, 8.0f)
                lineTo(11.0f, 8.0f)
                lineTo(11.0f, 10.0f)
                lineTo(20.5625f, 10.0f)
                lineTo(10.0f, 20.5625f)
                lineTo(10.0f, 4.0f)
                close()
            }
        }
        .build()
        return _cropSolid!!
    }

private var _cropSolid: ImageVector? = null
