package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Clock: ImageVector
    get() {
        if (_clock != null) {
            return _clock!!
        }
        _clock = Builder(name = "Clock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.0f, 8.0f, 8.0f, 119.0f, 8.0f, 256.0f)
                reflectiveCurveTo(119.0f, 504.0f, 256.0f, 504.0f)
                reflectiveCurveTo(504.0f, 393.0f, 504.0f, 256.0f)
                reflectiveCurveTo(393.0f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(348.49f, 321.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-20.0f, 25.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.49f, 2.5f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-67.0f, -49.72f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -15.0f, -31.23f)
                lineTo(224.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(288.0f, 256.0f)
                lineToRelative(58.0f, 42.5f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 348.49f, 321.0f)
                close()
            }
        }
        .build()
        return _clock!!
    }

private var _clock: ImageVector? = null
