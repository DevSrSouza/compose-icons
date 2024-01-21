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

public val TablerIcons.TriangleInvertedFilled: ImageVector
    get() {
        if (_triangleInvertedFilled != null) {
            return _triangleInvertedFilled!!
        }
        _triangleInvertedFilled = Builder(name = "TriangleInvertedFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.118f, 3.0f)
                horizontalLineToRelative(-16.225f)
                arcToRelative(2.914f, 2.914f, 0.0f, false, false, -2.503f, 4.371f)
                lineToRelative(8.116f, 13.549f)
                arcToRelative(2.917f, 2.917f, 0.0f, false, false, 4.987f, 0.005f)
                lineToRelative(8.11f, -13.539f)
                arcToRelative(2.914f, 2.914f, 0.0f, false, false, -2.486f, -4.386f)
                close()
            }
        }
        .build()
        return _triangleInvertedFilled!!
    }

private var _triangleInvertedFilled: ImageVector? = null
