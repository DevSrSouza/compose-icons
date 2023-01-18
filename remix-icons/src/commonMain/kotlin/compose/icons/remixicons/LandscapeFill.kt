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

public val RemixIcons.LandscapeFill: ImageVector
    get() {
        if (_landscapeFill != null) {
            return _landscapeFill!!
        }
        _landscapeFill = Builder(name = "LandscapeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 21.0f)
                lineToRelative(-4.762f, -8.73f)
                lineTo(15.0f, 6.0f)
                lineToRelative(8.0f, 15.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(8.0f, 10.0f)
                lineToRelative(6.0f, 11.0f)
                horizontalLineTo(2.0f)
                lineToRelative(6.0f, -11.0f)
                close()
                moveTo(5.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                close()
            }
        }
        .build()
        return _landscapeFill!!
    }

private var _landscapeFill: ImageVector? = null
