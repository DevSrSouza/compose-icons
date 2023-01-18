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

public val RemixIcons.RhythmLine: ImageVector
    get() {
        if (_rhythmLine != null) {
            return _rhythmLine!!
        }
        _rhythmLine = Builder(name = "RhythmLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                lineTo(2.0f, 21.0f)
                lineTo(2.0f, 9.0f)
                close()
                moveTo(8.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(18.0f)
                lineTo(8.0f, 21.0f)
                lineTo(8.0f, 3.0f)
                close()
                moveTo(14.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(20.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 6.0f)
                close()
            }
        }
        .build()
        return _rhythmLine!!
    }

private var _rhythmLine: ImageVector? = null
