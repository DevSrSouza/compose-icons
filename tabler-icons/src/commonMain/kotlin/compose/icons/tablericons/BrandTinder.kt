package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandTinder: ImageVector
    get() {
        if (_brandTinder != null) {
            return _brandTinder!!
        }
        _brandTinder = Builder(name = "BrandTinder", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.918f, 8.174f)
                curveToRelative(2.56f, 4.982f, 0.501f, 11.656f, -5.38f, 12.626f)
                curveToRelative(-7.702f, 1.687f, -12.84f, -7.716f, -7.054f, -13.229f)
                curveToRelative(0.309f, -0.305f, 1.161f, -1.095f, 1.516f, -1.349f)
                curveToRelative(0.0f, 0.528f, 0.27f, 3.475f, 1.0f, 3.167f)
                curveToRelative(3.0f, 0.0f, 4.0f, -4.222f, 3.587f, -7.389f)
                curveToRelative(2.7f, 1.411f, 4.987f, 3.376f, 6.331f, 6.174f)
                close()
            }
        }
        .build()
        return _brandTinder!!
    }

private var _brandTinder: ImageVector? = null
