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

public val TablerIcons.BrandPowershell: ImageVector
    get() {
        if (_brandPowershell != null) {
            return _brandPowershell!!
        }
        _brandPowershell = Builder(name = "BrandPowershell", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.887f, 20.0f)
                horizontalLineToRelative(11.868f)
                curveToRelative(0.893f, 0.0f, 1.664f, -0.665f, 1.847f, -1.592f)
                lineToRelative(2.358f, -12.0f)
                curveToRelative(0.212f, -1.081f, -0.442f, -2.14f, -1.462f, -2.366f)
                arcToRelative(1.784f, 1.784f, 0.0f, false, false, -0.385f, -0.042f)
                horizontalLineToRelative(-11.868f)
                curveToRelative(-0.893f, 0.0f, -1.664f, 0.665f, -1.847f, 1.592f)
                lineToRelative(-2.358f, 12.0f)
                curveToRelative(-0.212f, 1.081f, 0.442f, 2.14f, 1.462f, 2.366f)
                curveToRelative(0.127f, 0.028f, 0.256f, 0.042f, 0.385f, 0.042f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 8.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-6.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                horizontalLineToRelative(3.0f)
            }
        }
        .build()
        return _brandPowershell!!
    }

private var _brandPowershell: ImageVector? = null
