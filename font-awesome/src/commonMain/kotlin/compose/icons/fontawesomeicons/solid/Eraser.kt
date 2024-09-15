package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                moveTo(497.94f, 273.94f)
                curveToRelative(18.75f, -18.75f, 18.75f, -49.14f, 0.0f, -67.88f)
                lineToRelative(-160.0f, -160.0f)
                curveToRelative(-18.75f, -18.75f, -49.14f, -18.75f, -67.88f, 0.0f)
                lineToRelative(-256.0f, 256.0f)
                curveToRelative(-18.75f, 18.75f, -18.75f, 49.14f, 0.0f, 67.88f)
                lineToRelative(96.0f, 96.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 144.0f, 480.0f)
                horizontalLineToRelative(356.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                lineTo(355.88f, 416.0f)
                lineToRelative(142.06f, -142.06f)
                close()
                moveTo(195.31f, 211.31f)
                lineToRelative(137.37f, 137.37f)
                lineTo(265.37f, 416.0f)
                lineTo(150.63f, 416.0f)
                lineToRelative(-80.0f, -80.0f)
                lineToRelative(124.69f, -124.69f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
