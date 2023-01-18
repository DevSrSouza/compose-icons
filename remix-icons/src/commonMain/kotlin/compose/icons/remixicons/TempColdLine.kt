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

public val RemixIcons.TempColdLine: ImageVector
    get() {
        if (_tempColdLine != null) {
            return _tempColdLine!!
        }
        _tempColdLine = Builder(name = "TempColdLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                verticalLineToRelative(5.255f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, -8.0f, 0.0f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(9.144f, 11.895f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.712f, 0.0f)
                lineTo(14.0f, 11.298f)
                lineTo(14.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                verticalLineToRelative(6.298f)
                lineToRelative(-0.856f, 0.597f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _tempColdLine!!
    }

private var _tempColdLine: ImageVector? = null
