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

public val TablerIcons.Octahedron: ImageVector
    get() {
        if (_octahedron != null) {
            return _octahedron!!
        }
        _octahedron = Builder(name = "Octahedron", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.859f, 21.652f)
                lineToRelative(8.845f, -8.949f)
                arcToRelative(0.984f, 0.984f, 0.0f, false, false, 0.0f, -1.407f)
                lineToRelative(-8.845f, -8.948f)
                arcToRelative(1.233f, 1.233f, 0.0f, false, false, -1.718f, 0.0f)
                lineToRelative(-8.845f, 8.949f)
                arcToRelative(0.984f, 0.984f, 0.0f, false, false, 0.0f, 1.407f)
                lineToRelative(8.845f, 8.949f)
                arcToRelative(1.234f, 1.234f, 0.0f, false, false, 1.718f, -0.001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveToRelative(0.004f, 0.086f, 0.103f, 0.178f, 0.296f, 0.246f)
                lineToRelative(8.845f, 2.632f)
                curveToRelative(0.459f, 0.163f, 1.259f, 0.163f, 1.718f, 0.0f)
                lineToRelative(8.845f, -2.632f)
                curveToRelative(0.195f, -0.07f, 0.294f, -0.156f, 0.296f, -0.243f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.12f)
                verticalLineToRelative(19.76f)
            }
        }
        .build()
        return _octahedron!!
    }

private var _octahedron: ImageVector? = null
