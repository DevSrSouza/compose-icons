package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandWindows: ImageVector
    get() {
        if (_brandWindows != null) {
            return _brandWindows!!
        }
        _brandWindows = Builder(name = "BrandWindows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.8f, 20.0f)
                lineToRelative(-12.0f, -1.5f)
                curveToRelative(-1.0f, -0.1f, -1.8f, -0.9f, -1.8f, -1.9f)
                verticalLineToRelative(-9.2f)
                curveToRelative(0.0f, -1.0f, 0.8f, -1.8f, 1.8f, -1.9f)
                lineToRelative(12.0f, -1.5f)
                curveToRelative(1.2f, -0.1f, 2.2f, 0.8f, 2.2f, 1.9f)
                verticalLineToRelative(12.1f)
                curveToRelative(0.0f, 1.2f, -1.1f, 2.1f, -2.2f, 1.9f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                lineTo(12.0f, 19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                lineTo(20.0f, 12.0f)
            }
        }
        .build()
        return _brandWindows!!
    }

private var _brandWindows: ImageVector? = null
