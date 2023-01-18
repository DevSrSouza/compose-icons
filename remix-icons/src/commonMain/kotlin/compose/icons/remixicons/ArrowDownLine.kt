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

public val RemixIcons.ArrowDownLine: ImageVector
    get() {
        if (_arrowDownLine != null) {
            return _arrowDownLine!!
        }
        _arrowDownLine = Builder(name = "ArrowDownLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 16.172f)
                lineToRelative(5.364f, -5.364f)
                lineToRelative(1.414f, 1.414f)
                lineTo(12.0f, 20.0f)
                lineToRelative(-7.778f, -7.778f)
                lineToRelative(1.414f, -1.414f)
                lineTo(11.0f, 16.172f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.172f)
                close()
            }
        }
        .build()
        return _arrowDownLine!!
    }

private var _arrowDownLine: ImageVector? = null
