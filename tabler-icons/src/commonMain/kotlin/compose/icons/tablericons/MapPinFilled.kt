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

public val TablerIcons.MapPinFilled: ImageVector
    get() {
        if (_mapPinFilled != null) {
            return _mapPinFilled!!
        }
        _mapPinFilled = Builder(name = "MapPinFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.364f, 4.636f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.203f, 12.519f)
                lineToRelative(-0.203f, 0.21f)
                lineToRelative(-4.243f, 4.242f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -4.097f, 0.135f)
                lineToRelative(-0.144f, -0.135f)
                lineToRelative(-4.244f, -4.243f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 12.728f, -12.728f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
            }
        }
        .build()
        return _mapPinFilled!!
    }

private var _mapPinFilled: ImageVector? = null
