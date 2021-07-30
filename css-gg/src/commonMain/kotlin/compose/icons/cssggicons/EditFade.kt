package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.EditFade: ImageVector
    get() {
        if (_editFade != null) {
            return _editFade!!
        }
        _editFade = Builder(name = "EditFade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeAlpha = 0.3f, strokeLineWidth = 4.0f, strokeLineCap = Butt, strokeLineJoin
                    = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                curveTo(8.0f, 10.5194f, 8.8044f, 9.2268f, 10.0f, 8.5351f)
                verticalLineTo(15.4649f)
                curveTo(8.8044f, 14.7733f, 8.0f, 13.4806f, 8.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeAlpha = 0.6f, strokeLineWidth = 4.0f, strokeLineCap = Butt, strokeLineJoin
                    = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 15.4649f)
                verticalLineTo(8.5351f)
                curveTo(15.1956f, 9.2268f, 16.0f, 10.5194f, 16.0f, 12.0f)
                curveTo(16.0f, 13.4806f, 15.1956f, 14.7733f, 14.0f, 15.4649f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                curveTo(21.0f, 16.9706f, 16.9706f, 21.0f, 12.0f, 21.0f)
                curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _editFade!!
    }

private var _editFade: ImageVector? = null
