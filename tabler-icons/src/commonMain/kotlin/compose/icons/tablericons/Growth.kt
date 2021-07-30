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

public val TablerIcons.Growth: ImageVector
    get() {
        if (_growth != null) {
            return _growth!!
        }
        _growth = Builder(name = "Growth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 15.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.5f)
                moveToRelative(4.5f, -8.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.5f)
                moveToRelative(4.5f, -8.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.5f)
                moveToRelative(-4.0f, 3.5f)
                curveToRelative(2.21f, 0.0f, 4.0f, 2.015f, 4.0f, 4.5f)
                moveToRelative(-4.0f, -8.5f)
                curveToRelative(2.21f, 0.0f, 4.0f, 2.015f, 4.0f, 4.5f)
                moveToRelative(-4.0f, -8.5f)
                curveToRelative(2.21f, 0.0f, 4.0f, 2.015f, 4.0f, 4.5f)
                moveToRelative(0.0f, -7.5f)
                verticalLineToRelative(6.0f)
            }
        }
        .build()
        return _growth!!
    }

private var _growth: ImageVector? = null
