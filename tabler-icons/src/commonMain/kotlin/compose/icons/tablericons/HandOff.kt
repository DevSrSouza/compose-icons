package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.HandOff: ImageVector
    get() {
        if (_handOff != null) {
            return _handOff!!
        }
        _handOff = Builder(name = "HandOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 13.5f)
                verticalLineToRelative(-5.5f)
                moveToRelative(0.44f, -3.562f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.56f, 1.062f)
                verticalLineToRelative(1.5f)
                moveToRelative(0.0f, 4.008f)
                verticalLineToRelative(0.992f)
                moveToRelative(0.0f, -6.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                verticalLineToRelative(6.5f)
                moveToRelative(0.0f, -4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(6.5f)
                moveToRelative(0.0f, -4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(8.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.114f, -0.292f, -3.956f, -1.397f, -5.0f, -3.0f)
                lineToRelative(-2.7f, -5.25f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, 2.75f, -2.0f)
                lineToRelative(0.9f, 1.75f)
            }
        }
        .build()
        return _handOff!!
    }

private var _handOff: ImageVector? = null
