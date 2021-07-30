package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Webassembly: ImageVector
    get() {
        if (_webassembly != null) {
            return _webassembly!!
        }
        _webassembly = Builder(name = "Webassembly", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.745f, 0.0f)
                curveToRelative(0.0f, 0.042f, 0.0f, 0.085f, 0.0f, 0.129f)
                curveToRelative(0.0f, 1.52f, -1.232f, 2.752f, -2.752f, 2.752f)
                curveToRelative(-1.52f, 0.0f, -2.752f, -1.232f, -2.752f, -2.752f)
                curveToRelative(0.0f, -0.045f, 0.0f, -0.087f, 0.0f, -0.129f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(14.745f)
                close()
                moveTo(11.454f, 21.431f)
                lineToRelative(-1.169f, -5.783f)
                horizontalLineToRelative(-0.02f)
                lineToRelative(-1.264f, 5.783f)
                horizontalLineTo(7.39f)
                lineToRelative(-1.824f, -8.497f)
                horizontalLineToRelative(1.59f)
                lineToRelative(1.088f, 5.783f)
                horizontalLineToRelative(0.02f)
                lineToRelative(1.311f, -5.783f)
                horizontalLineToRelative(1.487f)
                lineToRelative(1.177f, 5.854f)
                horizontalLineToRelative(0.02f)
                lineToRelative(1.242f, -5.854f)
                horizontalLineToRelative(1.561f)
                lineToRelative(-2.027f, 8.497f)
                horizontalLineTo(11.454f)
                close()
                moveTo(20.209f, 21.431f)
                lineToRelative(-0.542f, -1.891f)
                horizontalLineToRelative(-2.861f)
                lineToRelative(-0.417f, 1.891f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(2.056f, -8.497f)
                horizontalLineToRelative(2.509f)
                lineToRelative(2.5f, 8.497f)
                horizontalLineTo(20.209f)
                close()
                moveTo(17.812f, 15.028f)
                lineToRelative(-0.694f, 3.118f)
                horizontalLineToRelative(2.159f)
                lineToRelative(-0.796f, -3.118f)
                horizontalLineTo(17.812f)
                close()
            }
        }
        .build()
        return _webassembly!!
    }

private var _webassembly: ImageVector? = null
