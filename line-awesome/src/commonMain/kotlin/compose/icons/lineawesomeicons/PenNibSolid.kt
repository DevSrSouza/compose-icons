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

public val LineAwesomeIcons.PenNibSolid: ImageVector
    get() {
        if (_penNibSolid != null) {
            return _penNibSolid!!
        }
        _penNibSolid = Builder(name = "PenNibSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.5859f)
                lineTo(17.4785f, 8.1074f)
                lineTo(10.7383f, 10.0352f)
                curveTo(9.4173f, 10.3922f, 8.3715f, 11.3805f, 7.9375f, 12.6855f)
                lineTo(3.8594f, 25.2734f)
                lineTo(5.293f, 26.707f)
                lineTo(6.7266f, 28.1406f)
                lineTo(19.3203f, 24.0605f)
                curveTo(20.6183f, 23.6285f, 21.6069f, 22.5814f, 21.9609f, 21.2734f)
                lineTo(23.8887f, 14.5254f)
                lineTo(28.4141f, 10.0f)
                lineTo(22.0f, 3.5859f)
                close()
                moveTo(22.0f, 6.4141f)
                lineTo(25.5859f, 10.0f)
                lineTo(23.0f, 12.5859f)
                lineTo(19.4141f, 9.0f)
                lineTo(22.0f, 6.4141f)
                close()
                moveTo(17.7109f, 10.125f)
                lineTo(21.875f, 14.2891f)
                lineTo(20.0332f, 20.7383f)
                curveTo(19.8512f, 21.4103f, 19.3493f, 21.9422f, 18.6973f, 22.1602f)
                lineTo(7.6895f, 25.7246f)
                lineTo(13.4844f, 19.9297f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0703f, 18.5156f)
                lineTo(6.2754f, 24.3105f)
                lineTo(9.8379f, 13.3105f)
                curveTo(10.0579f, 12.6495f, 10.5904f, 12.1489f, 11.2754f, 11.9629f)
                lineTo(17.7109f, 10.125f)
                close()
            }
        }
        .build()
        return _penNibSolid!!
    }

private var _penNibSolid: ImageVector? = null
