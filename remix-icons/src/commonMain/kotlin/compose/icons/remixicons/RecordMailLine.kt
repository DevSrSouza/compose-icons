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

public val RemixIcons.RecordMailLine: ImageVector
    get() {
        if (_recordMailLine != null) {
            return _recordMailLine!!
        }
        _recordMailLine = Builder(name = "RecordMailLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.257f, 15.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 4.243f, 2.0f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 4.243f, -2.0f)
                horizontalLineToRelative(4.514f)
                close()
                moveTo(5.5f, 15.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                close()
                moveTo(18.5f, 15.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                close()
            }
        }
        .build()
        return _recordMailLine!!
    }

private var _recordMailLine: ImageVector? = null
