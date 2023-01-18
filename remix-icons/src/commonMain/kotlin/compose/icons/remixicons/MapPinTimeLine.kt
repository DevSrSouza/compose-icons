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

public val RemixIcons.MapPinTimeLine: ImageVector
    get() {
        if (_mapPinTimeLine != null) {
            return _mapPinTimeLine!!
        }
        _mapPinTimeLine = Builder(name = "MapPinTimeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.95f, 15.95f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -9.9f, 0.0f)
                lineTo(12.0f, 20.9f)
                lineToRelative(4.95f, -4.95f)
                close()
                moveTo(12.0f, 23.728f)
                lineToRelative(-6.364f, -6.364f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 12.728f, 0.0f)
                lineTo(12.0f, 23.728f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _mapPinTimeLine!!
    }

private var _mapPinTimeLine: ImageVector? = null
