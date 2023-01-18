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

public val RemixIcons.ArrowDropRightLine: ImageVector
    get() {
        if (_arrowDropRightLine != null) {
            return _arrowDropRightLine!!
        }
        _arrowDropRightLine = Builder(name = "ArrowDropRightLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.172f, 12.0f)
                lineTo(9.343f, 9.172f)
                lineToRelative(1.414f, -1.415f)
                lineTo(15.0f, 12.0f)
                lineToRelative(-4.243f, 4.243f)
                lineToRelative(-1.414f, -1.415f)
                close()
            }
        }
        .build()
        return _arrowDropRightLine!!
    }

private var _arrowDropRightLine: ImageVector? = null
