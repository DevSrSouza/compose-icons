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

public val TablerIcons.ClubsFilled: ImageVector
    get() {
        if (_clubsFilled != null) {
            return _clubsFilled!!
        }
        _clubsFilled = Builder(name = "ClubsFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.488f, 2.797f)
                lineToRelative(-0.103f, 0.225f)
                arcToRelative(4.998f, 4.998f, 0.0f, false, false, -0.334f, 2.837f)
                lineToRelative(0.027f, 0.14f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -3.091f, 9.009f)
                lineToRelative(0.198f, 0.14f)
                arcToRelative(4.998f, 4.998f, 0.0f, false, false, 4.42f, 0.58f)
                lineToRelative(0.174f, -0.066f)
                lineToRelative(-0.773f, 3.095f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.97f, 1.243f)
                horizontalLineToRelative(6.0f)
                lineToRelative(0.113f, -0.006f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.857f, -1.237f)
                lineToRelative(-0.774f, -3.095f)
                lineToRelative(0.174f, 0.065f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 1.527f, -9.727f)
                lineToRelative(0.028f, -0.14f)
                arcToRelative(4.997f, 4.997f, 0.0f, false, false, -4.925f, -5.86f)
                close()
            }
        }
        .build()
        return _clubsFilled!!
    }

private var _clubsFilled: ImageVector? = null
