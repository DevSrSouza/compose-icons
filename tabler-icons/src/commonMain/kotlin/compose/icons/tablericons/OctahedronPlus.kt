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

public val TablerIcons.OctahedronPlus: ImageVector
    get() {
        if (_octahedronPlus != null) {
            return _octahedronPlus!!
        }
        _octahedronPlus = Builder(name = "OctahedronPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.498f, 12.911f)
                lineToRelative(0.206f, -0.208f)
                arcToRelative(0.984f, 0.984f, 0.0f, false, false, 0.0f, -1.407f)
                lineToRelative(-8.845f, -8.948f)
                arcToRelative(1.233f, 1.233f, 0.0f, false, false, -1.718f, 0.0f)
                lineToRelative(-8.845f, 8.949f)
                arcToRelative(0.984f, 0.984f, 0.0f, false, false, 0.0f, 1.407f)
                lineToRelative(8.845f, 8.949f)
                arcToRelative(1.234f, 1.234f, 0.0f, false, false, 1.718f, -0.001f)
                lineToRelative(0.08f, -0.081f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveToRelative(0.004f, 0.086f, 0.103f, 0.178f, 0.296f, 0.246f)
                lineToRelative(8.845f, 2.632f)
                curveToRelative(0.459f, 0.163f, 1.259f, 0.163f, 1.718f, 0.0f)
                lineToRelative(2.634f, -0.784f)
                moveToRelative(5.41f, -1.61f)
                lineToRelative(0.801f, -0.238f)
                curveToRelative(0.195f, -0.07f, 0.294f, -0.156f, 0.296f, -0.243f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.12f)
                verticalLineToRelative(19.76f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                verticalLineToRelative(6.0f)
            }
        }
        .build()
        return _octahedronPlus!!
    }

private var _octahedronPlus: ImageVector? = null
