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

public val RemixIcons.RemoteControlLine: ImageVector
    get() {
        if (_remoteControlLine != null) {
            return _remoteControlLine!!
        }
        _remoteControlLine = Builder(name = "RemoteControlLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                lineTo(8.0f, 14.0f)
                verticalLineToRelative(8.0f)
                lineTo(6.0f, 22.0f)
                verticalLineToRelative(-9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(12.0f, 16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.368f, 3.316f)
                lineToRelative(-1.79f, 0.895f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.157f, 0.0f)
                lineToRelative(-1.789f, -0.895f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 8.946f, 5.527f)
                lineToRelative(-1.789f, 0.895f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.157f, 4.422f)
                lineToRelative(-1.79f, -0.895f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _remoteControlLine!!
    }

private var _remoteControlLine: ImageVector? = null
