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

public val RemixIcons.UbuntuLine: ImageVector
    get() {
        if (_ubuntuLine != null) {
            return _ubuntuLine!!
        }
        _ubuntuLine = Builder(name = "UbuntuLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.667f, 19.273f)
                lineToRelative(1.006f, -1.742f)
                arcToRelative(6.001f, 6.001f, 0.0f, false, false, 8.282f, -4.781f)
                horizontalLineToRelative(2.012f)
                arcTo(7.97f, 7.97f, 0.0f, false, true, 18.928f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.452f, 1.835f)
                arcToRelative(2.493f, 2.493f, 0.0f, false, false, -1.976f, 0.227f)
                arcToRelative(2.493f, 2.493f, 0.0f, false, false, -1.184f, 1.596f)
                arcToRelative(7.979f, 7.979f, 0.0f, false, true, -5.65f, -0.385f)
                close()
                moveTo(7.367f, 18.523f)
                arcToRelative(7.979f, 7.979f, 0.0f, false, true, -3.156f, -4.7f)
                curveTo(4.696f, 13.367f, 5.0f, 12.72f, 5.0f, 12.0f)
                curveToRelative(0.0f, -0.72f, -0.304f, -1.369f, -0.791f, -1.825f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 5.072f, 8.0f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, true, 2.295f, -2.524f)
                lineToRelative(1.006f, 1.742f)
                arcToRelative(6.001f, 6.001f, 0.0f, false, false, 0.0f, 9.563f)
                lineToRelative(-1.005f, 1.742f)
                close()
                moveTo(8.667f, 4.727f)
                arcToRelative(8.007f, 8.007f, 0.0f, false, true, 5.648f, -0.387f)
                curveToRelative(0.152f, 0.65f, 0.562f, 1.238f, 1.185f, 1.598f)
                curveToRelative(0.623f, 0.36f, 1.337f, 0.42f, 1.976f, 0.227f)
                arcToRelative(8.007f, 8.007f, 0.0f, false, true, 2.49f, 5.085f)
                horizontalLineToRelative(-2.013f)
                arcTo(5.99f, 5.99f, 0.0f, false, false, 15.0f, 6.804f)
                arcToRelative(5.99f, 5.99f, 0.0f, false, false, -5.327f, -0.335f)
                lineTo(8.667f, 4.727f)
                close()
                moveTo(16.0f, 5.072f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, -2.598f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 5.072f)
                close()
                moveTo(4.0f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
                moveTo(16.0f, 18.928f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, 2.598f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -2.598f)
                close()
            }
        }
        .build()
        return _ubuntuLine!!
    }

private var _ubuntuLine: ImageVector? = null
