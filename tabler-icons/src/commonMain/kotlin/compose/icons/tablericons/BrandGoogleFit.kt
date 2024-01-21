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

public val TablerIcons.BrandGoogleFit: ImageVector
    get() {
        if (_brandGoogleFit != null) {
            return _brandGoogleFit!!
        }
        _brandGoogleFit = Builder(name = "BrandGoogleFit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.314f)
                lineToRelative(-2.343f, -2.344f)
                arcToRelative(3.314f, 3.314f, 0.0f, false, false, -4.686f, 4.686f)
                lineToRelative(2.343f, 2.344f)
                lineToRelative(4.686f, 4.686f)
                lineToRelative(7.03f, -7.03f)
                arcToRelative(3.314f, 3.314f, 0.0f, false, false, -4.687f, -4.685f)
                lineToRelative(-7.03f, 7.029f)
            }
        }
        .build()
        return _brandGoogleFit!!
    }

private var _brandGoogleFit: ImageVector? = null
