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

public val TablerIcons.BrandCodecov: ImageVector
    get() {
        if (_brandCodecov != null) {
            return _brandCodecov!!
        }
        _brandCodecov = Builder(name = "BrandCodecov", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.695f, 12.985f)
                arcToRelative(5.972f, 5.972f, 0.0f, false, false, -3.295f, -0.985f)
                curveToRelative(-1.257f, 0.0f, -2.436f, 0.339f, -3.4f, 1.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 18.0f, 0.0f)
                curveToRelative(-0.966f, -0.664f, -2.14f, -1.0f, -3.4f, -1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.605f, 8.144f)
            }
        }
        .build()
        return _brandCodecov!!
    }

private var _brandCodecov: ImageVector? = null
