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

public val TablerIcons.EarOff: ImageVector
    get() {
        if (_earOff != null) {
            return _earOff!!
        }
        _earOff = Builder(name = "EarOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                curveToRelative(0.0f, -1.146f, 0.277f, -2.245f, 0.78f, -3.219f)
                moveToRelative(1.792f, -2.208f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 10.428f, 9.027f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -0.633f, 0.762f)
                moveToRelative(-2.045f, 1.96f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.322f, 2.278f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -6.8f, 1.4f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.42f, 7.414f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 4.131f, 4.13f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _earOff!!
    }

private var _earOff: ImageVector? = null
