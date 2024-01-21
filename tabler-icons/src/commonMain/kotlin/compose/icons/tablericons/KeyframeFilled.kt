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

public val TablerIcons.KeyframeFilled: ImageVector
    get() {
        if (_keyframeFilled != null) {
            return _keyframeFilled!!
        }
        _keyframeFilled = Builder(name = "KeyframeFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                arcToRelative(2.599f, 2.599f, 0.0f, false, false, -2.0f, 0.957f)
                lineToRelative(-4.355f, 5.24f)
                arcToRelative(2.847f, 2.847f, 0.0f, false, false, -0.007f, 3.598f)
                lineToRelative(4.368f, 5.256f)
                curveToRelative(0.499f, 0.6f, 1.225f, 0.949f, 1.994f, 0.949f)
                arcToRelative(2.599f, 2.599f, 0.0f, false, false, 2.0f, -0.957f)
                lineToRelative(4.355f, -5.24f)
                arcToRelative(2.847f, 2.847f, 0.0f, false, false, 0.007f, -3.598f)
                lineToRelative(-4.368f, -5.256f)
                arcToRelative(2.593f, 2.593f, 0.0f, false, false, -1.994f, -0.949f)
                close()
            }
        }
        .build()
        return _keyframeFilled!!
    }

private var _keyframeFilled: ImageVector? = null
