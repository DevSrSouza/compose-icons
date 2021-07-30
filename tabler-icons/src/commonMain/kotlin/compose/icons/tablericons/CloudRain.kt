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

public val TablerIcons.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 18.0f)
                arcToRelative(4.6f, 4.4f, 0.0f, false, true, 0.0f, -9.0f)
                arcToRelative(5.0f, 4.5f, 0.0f, false, true, 11.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                verticalLineToRelative(2.0f)
                moveToRelative(0.0f, 3.0f)
                verticalLineToRelative(2.0f)
                moveToRelative(4.0f, -5.0f)
                verticalLineToRelative(2.0f)
                moveToRelative(0.0f, 3.0f)
                verticalLineToRelative(2.0f)
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
