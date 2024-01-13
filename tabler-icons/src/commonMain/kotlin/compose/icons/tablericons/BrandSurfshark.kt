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

public val TablerIcons.BrandSurfshark: ImageVector
    get() {
        if (_brandSurfshark != null) {
            return _brandSurfshark!!
        }
        _brandSurfshark = Builder(name = "BrandSurfshark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.954f, 9.447f)
                curveToRelative(-0.237f, -6.217f, 0.0f, -6.217f, -6.0f, -6.425f)
                curveToRelative(-5.774f, -0.208f, -6.824f, 1.0f, -7.91f, 5.382f)
                curveToRelative(-2.884f, 11.816f, -3.845f, 14.716f, 4.792f, 11.198f)
                curveToRelative(9.392f, -3.831f, 9.297f, -5.382f, 9.114f, -10.155f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(0.452f)
                curveToRelative(1.943f, 0.007f, 3.526f, -1.461f, 3.543f, -3.286f)
                verticalLineToRelative(-2.428f)
                curveToRelative(0.018f, -1.828f, 1.607f, -3.298f, 3.553f, -3.286f)
                horizontalLineToRelative(0.452f)
            }
        }
        .build()
        return _brandSurfshark!!
    }

private var _brandSurfshark: ImageVector? = null
