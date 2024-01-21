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

public val TablerIcons.OctahedronOff: ImageVector
    get() {
        if (_octahedronOff != null) {
            return _octahedronOff!!
        }
        _octahedronOff = Builder(name = "OctahedronOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.771f, 6.77f)
                lineToRelative(-4.475f, 4.527f)
                arcToRelative(0.984f, 0.984f, 0.0f, false, false, 0.0f, 1.407f)
                lineToRelative(8.845f, 8.949f)
                arcToRelative(1.234f, 1.234f, 0.0f, false, false, 1.718f, -0.001f)
                lineToRelative(4.36f, -4.412f)
                moveToRelative(2.002f, -2.025f)
                lineToRelative(2.483f, -2.512f)
                arcToRelative(0.984f, 0.984f, 0.0f, false, false, 0.0f, -1.407f)
                lineToRelative(-8.845f, -8.948f)
                arcToRelative(1.233f, 1.233f, 0.0f, false, false, -1.718f, 0.0f)
                lineToRelative(-2.375f, 2.403f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveToRelative(0.004f, 0.086f, 0.103f, 0.178f, 0.296f, 0.246f)
                lineToRelative(8.845f, 2.632f)
                curveToRelative(0.459f, 0.163f, 1.259f, 0.163f, 1.718f, 0.0f)
                lineToRelative(1.544f, -0.46f)
                moveToRelative(3.094f, -0.92f)
                lineToRelative(4.207f, -1.252f)
                curveToRelative(0.195f, -0.07f, 0.294f, -0.156f, 0.296f, -0.243f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.12f)
                verticalLineToRelative(5.88f)
                moveToRelative(0.0f, 4.0f)
                verticalLineToRelative(9.88f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _octahedronOff!!
    }

private var _octahedronOff: ImageVector? = null
