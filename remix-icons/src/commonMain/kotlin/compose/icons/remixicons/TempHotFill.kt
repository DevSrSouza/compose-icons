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

public val RemixIcons.TempHotFill: ImageVector
    get() {
        if (_tempHotFill != null) {
            return _tempHotFill!!
        }
        _tempHotFill = Builder(name = "TempHotFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 10.255f)
                lineTo(8.0f, 5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                verticalLineToRelative(5.255f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, -8.0f, 0.0f)
                close()
                moveTo(11.0f, 12.126f)
                arcTo(4.002f, 4.002f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, -7.874f)
                lineTo(13.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.126f)
                close()
            }
        }
        .build()
        return _tempHotFill!!
    }

private var _tempHotFill: ImageVector? = null
