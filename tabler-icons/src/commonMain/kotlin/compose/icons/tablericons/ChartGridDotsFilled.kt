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

public val TablerIcons.ChartGridDotsFilled: ImageVector
    get() {
        if (_chartGridDotsFilled != null) {
            return _chartGridDotsFilled!!
        }
        _chartGridDotsFilled = Builder(name = "ChartGridDotsFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(0.171f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, 1.83f, 1.83f)
                lineToRelative(0.17f, -0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-0.171f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, -1.828f, 1.829f)
                lineToRelative(-0.001f, 2.171f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.171f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, 1.83f, 1.83f)
                lineToRelative(0.17f, -0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-0.171f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, -1.828f, 1.829f)
                lineToRelative(-0.001f, 0.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-0.17f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, -1.829f, -1.83f)
                horizontalLineToRelative(-2.171f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.171f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, -1.828f, 1.829f)
                lineToRelative(-0.001f, 0.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-0.17f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, -1.829f, -1.83f)
                horizontalLineToRelative(-0.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(0.17f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, 1.83f, -1.83f)
                verticalLineToRelative(-0.34f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, -1.829f, -1.83f)
                horizontalLineToRelative(-0.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(0.17f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, 1.83f, -1.83f)
                verticalLineToRelative(-2.17f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.17f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, 1.83f, -1.83f)
                verticalLineToRelative(-0.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(-2.171f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, -1.828f, 1.829f)
                verticalLineToRelative(0.342f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, 1.828f, 1.829f)
                horizontalLineToRelative(2.171f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.17f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, 1.83f, -1.83f)
                verticalLineToRelative(-2.17f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.171f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, 1.83f, 1.83f)
                lineToRelative(2.17f, -0.001f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(15.171f, 7.0f)
                horizontalLineToRelative(-2.171f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.17f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, -1.829f, -1.83f)
                close()
            }
        }
        .build()
        return _chartGridDotsFilled!!
    }

private var _chartGridDotsFilled: ImageVector? = null
