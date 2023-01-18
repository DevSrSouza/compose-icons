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

public val RemixIcons.ArrowRightDownLine: ImageVector
    get() {
        if (_arrowRightDownLine != null) {
            return _arrowRightDownLine!!
        }
        _arrowRightDownLine = Builder(name = "ArrowRightDownLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.59f, 16.004f)
                lineTo(5.982f, 7.397f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(8.607f, 8.606f)
                verticalLineTo(7.004f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _arrowRightDownLine!!
    }

private var _arrowRightDownLine: ImageVector? = null
