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

public val TablerIcons.MilitaryAward: ImageVector
    get() {
        if (_militaryAward != null) {
            return _militaryAward!!
        }
        _militaryAward = Builder(name = "MilitaryAward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 10.5f)
                lineToRelative(-1.0f, -2.5f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(2.48f, 5.788f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.84f, 1.212f)
                horizontalLineToRelative(2.18f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 10.5f)
                lineToRelative(1.0f, -2.5f)
                horizontalLineToRelative(5.5f)
                lineToRelative(-2.48f, 5.788f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.84f, 1.212f)
                horizontalLineToRelative(-2.18f)
            }
        }
        .build()
        return _militaryAward!!
    }

private var _militaryAward: ImageVector? = null
