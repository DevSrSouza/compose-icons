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

public val TablerIcons.Spiral: ImageVector
    get() {
        if (_spiral != null) {
            return _spiral!!
        }
        _spiral = Builder(name = "Spiral", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 12.057f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 0.614f, 0.743f)
                curveToRelative(1.06f, 0.713f, 2.472f, 0.112f, 3.043f, -0.919f)
                curveToRelative(0.839f, -1.513f, -0.022f, -3.368f, -1.525f, -4.08f)
                curveToRelative(-2.0f, -0.95f, -4.371f, 0.154f, -5.24f, 2.086f)
                curveToRelative(-1.095f, 2.432f, 0.29f, 5.248f, 2.71f, 6.246f)
                curveToRelative(2.931f, 1.208f, 6.283f, -0.418f, 7.438f, -3.255f)
                curveToRelative(1.36f, -3.343f, -0.557f, -7.134f, -3.896f, -8.41f)
                curveToRelative(-3.855f, -1.474f, -8.2f, 0.68f, -9.636f, 4.422f)
                curveToRelative(-1.63f, 4.253f, 0.823f, 9.024f, 5.082f, 10.576f)
                curveToRelative(4.778f, 1.74f, 10.118f, -0.941f, 11.833f, -5.59f)
                arcToRelative(9.354f, 9.354f, 0.0f, false, false, 0.577f, -2.813f)
            }
        }
        .build()
        return _spiral!!
    }

private var _spiral: ImageVector? = null
