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

public val RemixIcons.CameraOffFill: ImageVector
    get() {
        if (_cameraOffFill != null) {
            return _cameraOffFill!!
        }
        _cameraOffFill = Builder(name = "CameraOffFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.586f, 21.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(0.586f)
                lineTo(1.393f, 2.808f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(19.799f, 19.8f)
                lineToRelative(-1.415f, 1.414f)
                lineTo(19.586f, 21.0f)
                close()
                moveTo(7.556f, 8.97f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.475f, 8.475f)
                lineToRelative(-1.417f, -1.417f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.642f, -5.642f)
                lineTo(7.555f, 8.97f)
                close()
                moveTo(22.0f, 17.785f)
                lineToRelative(-4.045f, -4.045f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.695f, -6.695f)
                lineTo(8.106f, 3.892f)
                lineTo(9.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(11.786f)
                close()
                moveTo(13.508f, 9.293f)
                arcToRelative(4.013f, 4.013f, 0.0f, false, true, 2.198f, 2.198f)
                lineToRelative(-2.198f, -2.198f)
                close()
            }
        }
        .build()
        return _cameraOffFill!!
    }

private var _cameraOffFill: ImageVector? = null
