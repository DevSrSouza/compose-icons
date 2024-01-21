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

public val TablerIcons.Triangles: ImageVector
    get() {
        if (_triangles != null) {
            return _triangles!!
        }
        _triangles = Builder(name = "Triangles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.974f, 21.0f)
                horizontalLineToRelative(8.052f)
                arcToRelative(0.975f, 0.975f, 0.0f, false, false, 0.81f, -1.517f)
                lineToRelative(-4.025f, -6.048f)
                arcToRelative(0.973f, 0.973f, 0.0f, false, false, -1.622f, 0.0f)
                lineToRelative(-4.025f, 6.048f)
                arcToRelative(0.977f, 0.977f, 0.0f, false, false, 0.81f, 1.517f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.98f, 16.0f)
                horizontalLineToRelative(14.04f)
                curveToRelative(0.542f, 0.0f, 0.98f, -0.443f, 0.98f, -0.989f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.156f, -0.534f)
                lineToRelative(-7.02f, -11.023f)
                arcToRelative(0.974f, 0.974f, 0.0f, false, false, -1.648f, 0.0f)
                lineToRelative(-7.02f, 11.023f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.294f, 1.366f)
                arcToRelative(0.973f, 0.973f, 0.0f, false, false, 0.53f, 0.157f)
                close()
            }
        }
        .build()
        return _triangles!!
    }

private var _triangles: ImageVector? = null
