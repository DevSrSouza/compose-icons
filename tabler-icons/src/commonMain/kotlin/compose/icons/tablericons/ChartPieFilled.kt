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

public val TablerIcons.ChartPieFilled: ImageVector
    get() {
        if (_chartPieFilled != null) {
            return _chartPieFilled!!
        }
        _chartPieFilled = Builder(name = "ChartPieFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.883f, 2.207f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.087f, 1.522f)
                lineToRelative(0.025f, 0.167f)
                lineToRelative(0.005f, 0.104f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(6.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.026f, 0.226f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -12.27f, -11.933f)
                lineToRelative(0.27f, -0.067f)
                lineToRelative(0.11f, -0.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 3.5f)
                verticalLineToRelative(5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.943f, -1.332f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -6.11f, -6.111f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.333f, 0.943f)
                close()
            }
        }
        .build()
        return _chartPieFilled!!
    }

private var _chartPieFilled: ImageVector? = null
