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

public val RemixIcons.FlutterLine: ImageVector
    get() {
        if (_flutterLine != null) {
            return _flutterLine!!
        }
        _flutterLine = Builder(name = "FlutterLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.597f, 10.684f)
                horizontalLineToRelative(2.828f)
                lineToRelative(-5.657f, 5.658f)
                lineToRelative(5.657f, 5.656f)
                horizontalLineToRelative(-2.828f)
                lineTo(8.94f, 16.34f)
                lineToRelative(5.657f, -5.657f)
                close()
                moveTo(14.403f, 2.004f)
                horizontalLineToRelative(2.829f)
                lineTo(5.918f, 13.318f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(9.9f, -9.9f)
                close()
            }
        }
        .build()
        return _flutterLine!!
    }

private var _flutterLine: ImageVector? = null
