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

public val LineAwesomeIcons.CropAltSolid: ImageVector
    get() {
        if (_cropAltSolid != null) {
            return _cropAltSolid!!
        }
        _cropAltSolid = Builder(name = "CropAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                lineTo(22.0f, 22.0f)
                lineTo(11.4375f, 22.0f)
                lineTo(10.0f, 22.0f)
                lineTo(10.0f, 20.5625f)
                lineTo(10.0f, 10.0f)
                lineTo(10.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                close()
                moveTo(12.0f, 8.0f)
                lineTo(12.0f, 10.0f)
                lineTo(22.0f, 10.0f)
                lineTo(22.0f, 20.0f)
                lineTo(24.0f, 20.0f)
                lineTo(24.0f, 8.0f)
                lineTo(12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _cropAltSolid!!
    }

private var _cropAltSolid: ImageVector? = null
