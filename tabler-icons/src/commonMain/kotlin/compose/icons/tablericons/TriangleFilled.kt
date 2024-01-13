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

public val TablerIcons.TriangleFilled: ImageVector
    get() {
        if (_triangleFilled != null) {
            return _triangleFilled!!
        }
        _triangleFilled = Builder(name = "TriangleFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 1.67f)
                arcToRelative(2.914f, 2.914f, 0.0f, false, false, -2.492f, 1.403f)
                lineToRelative(-8.11f, 13.537f)
                arcToRelative(2.914f, 2.914f, 0.0f, false, false, 2.484f, 4.385f)
                horizontalLineToRelative(16.225f)
                arcToRelative(2.914f, 2.914f, 0.0f, false, false, 2.503f, -4.371f)
                lineToRelative(-8.116f, -13.546f)
                arcToRelative(2.917f, 2.917f, 0.0f, false, false, -2.494f, -1.408f)
                close()
            }
        }
        .build()
        return _triangleFilled!!
    }

private var _triangleFilled: ImageVector? = null
