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

public val SolidGroup.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(497.941f, 273.941f)
                curveToRelative(18.745f, -18.745f, 18.745f, -49.137f, 0.0f, -67.882f)
                lineToRelative(-160.0f, -160.0f)
                curveToRelative(-18.745f, -18.745f, -49.136f, -18.746f, -67.883f, 0.0f)
                lineToRelative(-256.0f, 256.0f)
                curveToRelative(-18.745f, 18.745f, -18.745f, 49.137f, 0.0f, 67.882f)
                lineToRelative(96.0f, 96.0f)
                arcTo(48.004f, 48.004f, 0.0f, false, false, 144.0f, 480.0f)
                horizontalLineToRelative(356.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                lineTo(355.883f, 416.0f)
                lineToRelative(142.058f, -142.059f)
                close()
                moveTo(195.314f, 211.314f)
                lineToRelative(137.373f, 137.373f)
                lineTo(265.373f, 416.0f)
                lineTo(150.628f, 416.0f)
                lineToRelative(-80.0f, -80.0f)
                lineToRelative(124.686f, -124.686f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
