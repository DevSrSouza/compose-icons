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

public val TablerIcons.Eggs: ImageVector
    get() {
        if (_eggs != null) {
            return _eggs!!
        }
        _eggs = Builder(name = "Eggs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 22.0f)
                curveToRelative(-3.0f, 0.0f, -4.868f, -2.118f, -5.0f, -5.0f)
                curveToRelative(0.0f, -3.0f, 2.0f, -5.0f, 5.0f, -5.0f)
                curveToRelative(4.0f, 0.0f, 8.01f, 2.5f, 8.0f, 5.0f)
                curveToRelative(0.0f, 2.5f, -4.0f, 5.0f, -8.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 18.0f)
                curveToRelative(-3.03f, -0.196f, -5.0f, -2.309f, -5.0f, -5.38f)
                curveToRelative(0.0f, -4.307f, 2.75f, -8.625f, 5.5f, -8.62f)
                curveToRelative(2.614f, 0.0f, 5.248f, 3.915f, 5.5f, 8.0f)
            }
        }
        .build()
        return _eggs!!
    }

private var _eggs: ImageVector? = null
