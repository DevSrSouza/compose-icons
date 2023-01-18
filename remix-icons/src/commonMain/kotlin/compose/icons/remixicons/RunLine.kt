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

public val RemixIcons.RunLine: ImageVector
    get() {
        if (_runLine != null) {
            return _runLine!!
        }
        _runLine = Builder(name = "RunLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.83f, 8.79f)
                lineTo(8.0f, 9.456f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.05f)
                horizontalLineToRelative(0.015f)
                lineToRelative(5.268f, -1.918f)
                curveToRelative(0.244f, -0.093f, 0.51f, -0.14f, 0.782f, -0.131f)
                arcToRelative(2.616f, 2.616f, 0.0f, false, true, 2.427f, 1.82f)
                curveToRelative(0.186f, 0.583f, 0.356f, 0.977f, 0.51f, 1.182f)
                arcTo(4.992f, 4.992f, 0.0f, false, false, 19.0f, 11.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(6.986f, 6.986f, 0.0f, false, true, -5.402f, -2.547f)
                lineToRelative(-0.697f, 3.956f)
                lineTo(15.0f, 16.17f)
                verticalLineTo(23.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.898f)
                lineToRelative(-2.27f, -1.904f)
                lineToRelative(-0.727f, 4.127f)
                lineToRelative(-6.894f, -1.215f)
                lineToRelative(0.348f, -1.97f)
                lineToRelative(4.924f, 0.868f)
                lineTo(9.83f, 8.79f)
                close()
                moveTo(13.5f, 5.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _runLine!!
    }

private var _runLine: ImageVector? = null
