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

public val TablerIcons.StarFilled: ImageVector
    get() {
        if (_starFilled != null) {
            return _starFilled!!
        }
        _starFilled = Builder(name = "StarFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.243f, 7.34f)
                lineToRelative(-6.38f, 0.925f)
                lineToRelative(-0.113f, 0.023f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.44f, 1.684f)
                lineToRelative(4.622f, 4.499f)
                lineToRelative(-1.09f, 6.355f)
                lineToRelative(-0.013f, 0.11f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.464f, 0.944f)
                lineToRelative(5.706f, -3.0f)
                lineToRelative(5.693f, 3.0f)
                lineToRelative(0.1f, 0.046f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.352f, -1.1f)
                lineToRelative(-1.091f, -6.355f)
                lineToRelative(4.624f, -4.5f)
                lineToRelative(0.078f, -0.085f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.633f, -1.62f)
                lineToRelative(-6.38f, -0.926f)
                lineToRelative(-2.852f, -5.78f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.794f, 0.0f)
                lineToRelative(-2.853f, 5.78f)
                close()
            }
        }
        .build()
        return _starFilled!!
    }

private var _starFilled: ImageVector? = null
