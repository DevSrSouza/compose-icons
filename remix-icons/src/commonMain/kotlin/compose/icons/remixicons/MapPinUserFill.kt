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

public val RemixIcons.MapPinUserFill: ImageVector
    get() {
        if (_mapPinUserFill != null) {
            return _mapPinUserFill!!
        }
        _mapPinUserFill = Builder(name = "MapPinUserFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.084f, 15.812f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -10.168f, 0.0f)
                arcTo(5.996f, 5.996f, 0.0f, false, true, 12.0f, 13.0f)
                arcToRelative(5.996f, 5.996f, 0.0f, false, true, 5.084f, 2.812f)
                close()
                moveTo(12.0f, 23.728f)
                lineToRelative(-6.364f, -6.364f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 12.728f, 0.0f)
                lineTo(12.0f, 23.728f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _mapPinUserFill!!
    }

private var _mapPinUserFill: ImageVector? = null
