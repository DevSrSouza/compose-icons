package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Pentagram: ImageVector
    get() {
        if (_pentagram != null) {
            return _pentagram!!
        }
        _pentagram = Builder(name = "Pentagram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.636f, 5.636f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 12.728f, 12.728f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -12.728f, -12.728f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.236f, 11.0f)
                lineToRelative(5.264f, 4.0f)
                horizontalLineToRelative(-6.5f)
                lineToRelative(-2.0f, 6.0f)
                lineToRelative(-2.0f, -6.0f)
                horizontalLineToRelative(-6.5f)
                lineToRelative(5.276f, -4.0f)
                lineToRelative(-2.056f, -6.28f)
                lineToRelative(5.28f, 3.78f)
                lineToRelative(5.28f, -3.78f)
                close()
            }
        }
        .build()
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
