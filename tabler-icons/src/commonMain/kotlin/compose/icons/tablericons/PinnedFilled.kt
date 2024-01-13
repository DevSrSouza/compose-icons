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

public val TablerIcons.PinnedFilled: ImageVector
    get() {
        if (_pinnedFilled != null) {
            return _pinnedFilled!!
        }
        _pinnedFilled = Builder(name = "PinnedFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                verticalLineToRelative(4.764f)
                lineToRelative(1.894f, 3.789f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.1f, 0.331f)
                lineToRelative(0.006f, 0.116f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.06f, -0.34f)
                lineToRelative(0.046f, -0.107f)
                lineToRelative(1.894f, -3.791f)
                verticalLineToRelative(-4.762f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _pinnedFilled!!
    }

private var _pinnedFilled: ImageVector? = null
