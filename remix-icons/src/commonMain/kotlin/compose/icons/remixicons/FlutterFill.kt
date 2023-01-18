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

public val RemixIcons.FlutterFill: ImageVector
    get() {
        if (_flutterFill != null) {
            return _flutterFill!!
        }
        _flutterFill = Builder(name = "FlutterFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.503f, 2.001f)
                lineToRelative(-10.0f, 10.0f)
                lineToRelative(3.083f, 3.083f)
                lineToRelative(13.08f, -13.083f)
                horizontalLineToRelative(-6.163f)
                close()
                moveTo(13.497f, 11.199f)
                lineTo(8.122f, 16.62f)
                lineTo(13.494f, 22.0f)
                horizontalLineToRelative(6.189f)
                lineToRelative(-5.387f, -5.4f)
                lineToRelative(5.389f, -5.4f)
                horizontalLineToRelative(-6.188f)
                close()
            }
        }
        .build()
        return _flutterFill!!
    }

private var _flutterFill: ImageVector? = null
