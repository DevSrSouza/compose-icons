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

public val TablerIcons.PlanetOff: ImageVector
    get() {
        if (_planetOff != null) {
            return _planetOff!!
        }
        _planetOff = Builder(name = "PlanetOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.816f, 13.58f)
                curveToRelative(1.956f, 1.825f, 3.157f, 3.449f, 3.184f, 4.445f)
                moveToRelative(-3.428f, 0.593f)
                curveToRelative(-2.098f, -0.634f, -4.944f, -2.03f, -7.919f, -3.976f)
                curveToRelative(-5.47f, -3.579f, -9.304f, -7.664f, -8.56f, -9.123f)
                curveToRelative(0.32f, -0.628f, 1.591f, -0.6f, 3.294f, -0.113f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.042f, 7.059f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 9.908f, 9.89f)
                moveToRelative(1.581f, -2.425f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -9.057f, -9.054f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _planetOff!!
    }

private var _planetOff: ImageVector? = null
