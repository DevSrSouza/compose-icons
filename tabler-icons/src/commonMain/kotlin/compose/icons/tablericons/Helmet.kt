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

public val TablerIcons.Helmet: ImageVector
    get() {
        if (_helmet != null) {
            return _helmet!!
        }
        _helmet = Builder(name = "Helmet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 5.656f, 16.0f)
                horizontalLineToRelative(-11.312f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 5.656f, -16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 9.0f)
                horizontalLineToRelative(-8.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.968f, 1.246f)
                curveToRelative(0.507f, 2.0f, 1.596f, 3.418f, 3.268f, 4.254f)
                curveToRelative(2.0f, 1.0f, 4.333f, 1.5f, 7.0f, 1.5f)
            }
        }
        .build()
        return _helmet!!
    }

private var _helmet: ImageVector? = null
