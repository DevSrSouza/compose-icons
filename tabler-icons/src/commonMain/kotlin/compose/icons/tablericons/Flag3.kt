package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Flag3: ImageVector
    get() {
        if (_flag3 != null) {
            return _flag3!!
        }
        _flag3 = Builder(name = "Flag3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(4.5f, -4.5f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(16.0f)
            }
        }
        .build()
        return _flag3!!
    }

private var _flag3: ImageVector? = null
