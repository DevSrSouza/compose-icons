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

public val RemixIcons.CentosLine: ImageVector
    get() {
        if (_centosLine != null) {
            return _centosLine!!
        }
        _centosLine = Builder(name = "CentosLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(4.292f, 4.292f)
                lineToRelative(1.061f, -1.06f)
                lineTo(16.121f, 4.0f)
                lineTo(20.0f, 4.0f)
                verticalLineToRelative(3.879f)
                lineToRelative(-1.233f, -1.233f)
                lineToRelative(-1.06f, 1.061f)
                lineTo(22.0f, 12.0f)
                lineToRelative(-4.292f, 4.293f)
                lineToRelative(1.059f, 1.059f)
                lineTo(20.0f, 16.121f)
                lineTo(20.0f, 20.0f)
                horizontalLineToRelative(-3.88f)
                lineToRelative(1.232f, -1.233f)
                lineToRelative(-1.059f, -1.06f)
                lineTo(12.0f, 22.0f)
                lineToRelative(-4.293f, -4.293f)
                lineToRelative(-1.061f, 1.06f)
                lineTo(7.879f, 20.0f)
                lineTo(4.0f, 20.0f)
                verticalLineToRelative(-3.88f)
                lineToRelative(1.231f, 1.232f)
                lineToRelative(1.061f, -1.06f)
                lineTo(2.0f, 12.0f)
                lineToRelative(4.293f, -4.293f)
                lineToRelative(-1.062f, -1.061f)
                lineTo(4.0f, 7.879f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(3.879f)
                lineTo(6.646f, 5.23f)
                lineToRelative(1.062f, 1.062f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(12.0f, 13.413f)
                lineToRelative(-2.88f, 2.879f)
                lineToRelative(2.88f, 2.88f)
                lineToRelative(2.879f, -2.88f)
                lineTo(12.0f, 13.412f)
                close()
                moveTo(7.707f, 9.12f)
                lineTo(4.828f, 12.0f)
                lineToRelative(2.878f, 2.878f)
                lineToRelative(2.88f, -2.88f)
                lineToRelative(-2.879f, -2.877f)
                close()
                moveTo(16.292f, 9.12f)
                lineToRelative(-2.877f, 2.878f)
                lineToRelative(2.878f, 2.879f)
                lineTo(19.172f, 12.0f)
                lineToRelative(-2.88f, -2.879f)
                close()
                moveTo(12.0f, 4.828f)
                lineTo(9.122f, 7.707f)
                lineToRelative(2.879f, 2.878f)
                lineToRelative(2.877f, -2.879f)
                lineTo(12.0f, 4.828f)
                close()
            }
        }
        .build()
        return _centosLine!!
    }

private var _centosLine: ImageVector? = null
