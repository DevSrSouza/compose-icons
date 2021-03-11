package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.SortDescending2: ImageVector
    get() {
        if (_sortDescending2 != null) {
            return _sortDescending2!!
        }
        _sortDescending2 = Builder(name = "SortDescending2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 5.0f)
                lineTo(9.5f, 5.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 5.5f)
                lineTo(10.0f, 9.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 9.5f, 10.0f)
                lineTo(5.5f, 10.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 9.5f)
                lineTo(5.0f, 5.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 14.0f)
                lineTo(9.5f, 14.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 14.5f)
                lineTo(10.0f, 18.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 9.5f, 19.0f)
                lineTo(5.5f, 19.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 18.5f)
                lineTo(5.0f, 14.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 15.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                verticalLineToRelative(-12.0f)
            }
        }
        .build()
        return _sortDescending2!!
    }

private var _sortDescending2: ImageVector? = null
