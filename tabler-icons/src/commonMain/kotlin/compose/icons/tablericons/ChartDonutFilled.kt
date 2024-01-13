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

public val TablerIcons.ChartDonutFilled: ImageVector
    get() {
        if (_chartDonutFilled != null) {
            return _chartDonutFilled!!
        }
        _chartDonutFilled = Builder(name = "ChartDonutFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.883f, 2.207f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.087f, 1.522f)
                lineToRelative(0.025f, 0.167f)
                lineToRelative(0.005f, 0.104f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.641f, 0.933f)
                lineToRelative(-0.107f, 0.035f)
                arcToRelative(3.1f, 3.1f, 0.0f, true, false, 3.73f, 3.953f)
                lineToRelative(0.05f, -0.173f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.855f, -0.742f)
                lineToRelative(0.113f, -0.006f)
                horizontalLineToRelative(3.8f)
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
                moveTo(14.775f, 2.526f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, true, 0.22f, -0.026f)
                lineToRelative(0.122f, 0.007f)
                lineToRelative(0.112f, 0.02f)
                lineToRelative(0.103f, 0.03f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 6.003f, 5.817f)
                lineToRelative(0.108f, 0.294f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.824f, 1.325f)
                lineToRelative(-0.119f, 0.007f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.76f, -0.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.89f, -0.89f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.342f, -0.636f)
                lineToRelative(-0.008f, -0.124f)
                verticalLineToRelative(-4.495f)
                lineToRelative(0.006f, -0.118f)
                curveToRelative(0.005f, -0.042f, 0.012f, -0.08f, 0.02f, -0.116f)
                lineToRelative(0.03f, -0.103f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, true, 0.168f, -0.299f)
                lineToRelative(0.071f, -0.08f)
                curveToRelative(0.03f, -0.028f, 0.058f, -0.052f, 0.087f, -0.075f)
                lineToRelative(0.09f, -0.063f)
                lineToRelative(0.088f, -0.05f)
                lineToRelative(0.103f, -0.043f)
                lineToRelative(0.112f, -0.032f)
                close()
            }
        }
        .build()
        return _chartDonutFilled!!
    }

private var _chartDonutFilled: ImageVector? = null
