package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Wifi1Bar: ImageVector
    get() {
        if (_wifi1Bar != null) {
            return _wifi1Bar!!
        }
        _wifi1Bar = Builder(name = "Wifi1Bar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.53f, 17.46f)
                lineTo(12.0f, 21.0f)
                lineToRelative(-3.53f, -3.54f)
                curveTo(9.37f, 16.56f, 10.62f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveTo(14.63f, 16.56f, 15.53f, 17.46f)
                close()
            }
        }
        .build()
        return _wifi1Bar!!
    }

private var _wifi1Bar: ImageVector? = null
