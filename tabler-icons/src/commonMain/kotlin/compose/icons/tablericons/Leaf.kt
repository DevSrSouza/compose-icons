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

public val TablerIcons.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                curveToRelative(0.5f, -4.5f, 2.5f, -8.0f, 7.0f, -10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 18.0f)
                curveToRelative(6.218f, 0.0f, 10.5f, -3.288f, 11.0f, -12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.014f)
                curveToRelative(-9.0f, 0.0f, -11.986f, 4.0f, -12.0f, 9.0f)
                curveToRelative(0.0f, 1.0f, 0.0f, 3.0f, 2.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
