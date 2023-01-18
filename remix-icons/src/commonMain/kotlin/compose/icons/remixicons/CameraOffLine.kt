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

public val RemixIcons.CameraOffLine: ImageVector
    get() {
        if (_cameraOffLine != null) {
            return _cameraOffLine!!
        }
        _cameraOffLine = Builder(name = "CameraOffLine", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(5.586f, 7.0f)
                lineTo(4.0f, 7.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(13.586f)
                lineToRelative(-2.18f, -2.18f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 7.68f, 9.094f)
                lineTo(5.586f, 7.0f)
                close()
                moveTo(9.11f, 10.525f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.865f, 4.865f)
                lineTo(9.11f, 10.525f)
                close()
                moveTo(22.0f, 17.785f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(20.0f, 7.0f)
                horizontalLineToRelative(-3.828f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(9.828f, 5.0f)
                lineToRelative(-0.307f, 0.307f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(9.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(11.786f)
                close()
                moveTo(11.263f, 7.05f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 6.188f, 6.188f)
                lineToRelative(-2.338f, -2.338f)
                arcToRelative(3.515f, 3.515f, 0.0f, false, false, -1.512f, -1.512f)
                lineToRelative(-2.338f, -2.338f)
                close()
            }
        }
        .build()
        return _cameraOffLine!!
    }

private var _cameraOffLine: ImageVector? = null
