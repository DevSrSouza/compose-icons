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

public val TablerIcons.FilterFilled: ImageVector
    get() {
        if (_filterFilled != null) {
            return _filterFilled!!
        }
        _filterFilled = Builder(name = "FilterFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.227f)
                lineToRelative(0.008f, 0.223f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.772f, 1.795f)
                lineToRelative(4.22f, 4.641f)
                verticalLineToRelative(8.114f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.316f, 0.949f)
                lineToRelative(6.0f, -2.0f)
                lineToRelative(0.108f, -0.043f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.576f, -0.906f)
                verticalLineToRelative(-6.586f)
                lineToRelative(4.121f, -4.12f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.879f, -2.123f)
                verticalLineToRelative(-2.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _filterFilled!!
    }

private var _filterFilled: ImageVector? = null
