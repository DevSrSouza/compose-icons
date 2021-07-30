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

public val TablerIcons.ChartBar: ImageVector
    get() {
        if (_chartBar != null) {
            return _chartBar!!
        }
        _chartBar = Builder(name = "ChartBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                lineTo(8.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 13.0f)
                lineTo(9.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 19.0f)
                lineTo(3.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                lineTo(14.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 9.0f)
                lineTo(15.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 20.0f)
                lineTo(10.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 19.0f)
                lineTo(9.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                lineTo(20.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 5.0f)
                lineTo(21.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 20.0f)
                lineTo(16.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 19.0f)
                lineTo(15.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                lineTo(18.0f, 20.0f)
            }
        }
        .build()
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
