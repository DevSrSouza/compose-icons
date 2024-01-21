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

public val TablerIcons.BrandPrisma: ImageVector
    get() {
        if (_brandPrisma != null) {
            return _brandPrisma!!
        }
        _brandPrisma = Builder(name = "BrandPrisma", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.186f, 16.202f)
                lineToRelative(3.615f, 5.313f)
                curveToRelative(0.265f, 0.39f, 0.754f, 0.57f, 1.215f, 0.447f)
                lineToRelative(10.166f, -2.718f)
                arcToRelative(1.086f, 1.086f, 0.0f, false, false, 0.713f, -1.511f)
                lineToRelative(-7.505f, -15.483f)
                arcToRelative(0.448f, 0.448f, 0.0f, false, false, -0.787f, -0.033f)
                lineToRelative(-7.453f, 12.838f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, false, 0.037f, 1.147f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 22.0f)
                lineToRelative(3.5f, -20.0f)
            }
        }
        .build()
        return _brandPrisma!!
    }

private var _brandPrisma: ImageVector? = null
