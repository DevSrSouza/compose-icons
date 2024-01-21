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

public val TablerIcons.BasketFilled: ImageVector
    get() {
        if (_basketFilled != null) {
            return _basketFilled!!
        }
        _basketFilled = Builder(name = "BasketFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.684f, 3.27f)
                lineToRelative(0.084f, 0.09f)
                lineToRelative(4.7f, 5.64f)
                horizontalLineToRelative(3.532f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.991f, 1.131f)
                lineToRelative(-0.02f, 0.112f)
                lineToRelative(-1.984f, 7.918f)
                curveToRelative(-0.258f, 1.578f, -1.41f, 2.781f, -2.817f, 2.838f)
                lineToRelative(-0.17f, 0.001f)
                lineToRelative(-10.148f, -0.002f)
                curveToRelative(-1.37f, -0.053f, -2.484f, -1.157f, -2.787f, -2.57f)
                lineToRelative(-0.035f, -0.185f)
                lineToRelative(-2.0f, -8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.857f, -1.237f)
                lineToRelative(0.113f, -0.006f)
                horizontalLineToRelative(3.53f)
                lineToRelative(4.702f, -5.64f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.452f, -0.09f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.98f, 2.65f)
                lineToRelative(-0.015f, 0.174f)
                lineToRelative(-0.005f, 0.176f)
                lineToRelative(0.005f, 0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 2.995f, -3.176f)
                close()
                moveTo(12.0f, 5.562f)
                lineToRelative(-2.865f, 3.438f)
                horizontalLineToRelative(5.73f)
                lineToRelative(-2.865f, -3.438f)
                close()
            }
        }
        .build()
        return _basketFilled!!
    }

private var _basketFilled: ImageVector? = null
