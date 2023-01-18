package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.DriveFill: ImageVector
    get() {
        if (_driveFill != null) {
            return _driveFill!!
        }
        _driveFill = Builder(name = "DriveFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.94f, 4.146f)
                lineToRelative(3.482f, 6.03f)
                lineToRelative(-5.94f, 10.293f)
                lineTo(2.0f, 14.44f)
                lineTo(7.94f, 4.146f)
                close()
                moveTo(10.116f, 14.44f)
                lineTo(22.0f, 14.44f)
                lineToRelative(-3.482f, 6.029f)
                lineTo(6.635f, 20.469f)
                lineToRelative(3.481f, -6.029f)
                close()
                moveTo(14.459f, 13.44f)
                lineTo(8.518f, 3.145f)
                horizontalLineToRelative(6.964f)
                lineToRelative(5.94f, 10.295f)
                lineTo(14.46f, 13.44f)
                close()
            }
        }
        .build()
        return _driveFill!!
    }

private var _driveFill: ImageVector? = null
