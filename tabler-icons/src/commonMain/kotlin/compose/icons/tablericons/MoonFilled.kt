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

public val TablerIcons.MoonFilled: ImageVector
    get() {
        if (_moonFilled != null) {
            return _moonFilled!!
        }
        _moonFilled = Builder(name = "MoonFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 1.992f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 9.236f, 13.838f)
                curveToRelative(0.341f, -0.82f, -0.476f, -1.644f, -1.298f, -1.31f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -6.864f, -10.787f)
                lineToRelative(0.077f, -0.08f)
                curveToRelative(0.551f, -0.63f, 0.113f, -1.653f, -0.758f, -1.653f)
                horizontalLineToRelative(-0.266f)
                lineToRelative(-0.068f, -0.006f)
                lineToRelative(-0.06f, -0.002f)
                close()
            }
        }
        .build()
        return _moonFilled!!
    }

private var _moonFilled: ImageVector? = null
