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

public val TablerIcons.Mountain: ImageVector
    get() {
        if (_mountain != null) {
            return _mountain!!
        }
        _mountain = Builder(name = "Mountain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 20.0f)
                horizontalLineToRelative(18.0f)
                lineToRelative(-6.921f, -14.612f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -4.158f, 0.0f)
                lineToRelative(-6.921f, 14.612f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 11.0f)
                lineToRelative(2.0f, 2.5f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(2.0f, 3.0f)
                lineToRelative(2.5f, -2.0f)
            }
        }
        .build()
        return _mountain!!
    }

private var _mountain: ImageVector? = null
