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

public val RemixIcons.GlobalFill: ImageVector
    get() {
        if (_globalFill != null) {
            return _globalFill!!
        }
        _globalFill = Builder(name = "GlobalFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.05f, 13.0f)
                horizontalLineToRelative(5.477f)
                arcToRelative(17.9f, 17.9f, 0.0f, false, false, 2.925f, 8.88f)
                arcTo(10.005f, 10.005f, 0.0f, false, true, 2.05f, 13.0f)
                close()
                moveTo(2.05f, 11.0f)
                arcToRelative(10.005f, 10.005f, 0.0f, false, true, 8.402f, -8.88f)
                arcTo(17.9f, 17.9f, 0.0f, false, false, 7.527f, 11.0f)
                lineTo(2.05f, 11.0f)
                close()
                moveTo(21.95f, 11.0f)
                horizontalLineToRelative(-5.477f)
                arcToRelative(17.9f, 17.9f, 0.0f, false, false, -2.925f, -8.88f)
                arcTo(10.005f, 10.005f, 0.0f, false, true, 21.95f, 11.0f)
                close()
                moveTo(21.95f, 13.0f)
                arcToRelative(10.005f, 10.005f, 0.0f, false, true, -8.402f, 8.88f)
                arcTo(17.9f, 17.9f, 0.0f, false, false, 16.473f, 13.0f)
                horizontalLineToRelative(5.478f)
                close()
                moveTo(9.53f, 13.0f)
                horizontalLineToRelative(4.94f)
                arcTo(15.908f, 15.908f, 0.0f, false, true, 12.0f, 20.592f)
                arcTo(15.908f, 15.908f, 0.0f, false, true, 9.53f, 13.0f)
                close()
                moveTo(9.53f, 11.0f)
                arcTo(15.908f, 15.908f, 0.0f, false, true, 12.0f, 3.408f)
                arcTo(15.908f, 15.908f, 0.0f, false, true, 14.47f, 11.0f)
                lineTo(9.53f, 11.0f)
                close()
            }
        }
        .build()
        return _globalFill!!
    }

private var _globalFill: ImageVector? = null
