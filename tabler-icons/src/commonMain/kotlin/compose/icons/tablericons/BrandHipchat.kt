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

public val TablerIcons.BrandHipchat: ImageVector
    get() {
        if (_brandHipchat != null) {
            return _brandHipchat!!
        }
        _brandHipchat = Builder(name = "BrandHipchat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.802f, 17.292f)
                reflectiveCurveToRelative(0.077f, -0.055f, 0.2f, -0.149f)
                curveToRelative(1.843f, -1.425f, 3.0f, -3.49f, 3.0f, -5.789f)
                curveToRelative(0.0f, -4.286f, -4.03f, -7.764f, -9.0f, -7.764f)
                curveToRelative(-4.97f, 0.0f, -9.0f, 3.478f, -9.0f, 7.764f)
                curveToRelative(0.0f, 4.288f, 4.03f, 7.646f, 9.0f, 7.646f)
                curveToRelative(0.424f, 0.0f, 1.12f, -0.028f, 2.088f, -0.084f)
                curveToRelative(1.262f, 0.82f, 3.104f, 1.493f, 4.716f, 1.493f)
                curveToRelative(0.499f, 0.0f, 0.734f, -0.41f, 0.414f, -0.828f)
                curveToRelative(-0.486f, -0.596f, -1.156f, -1.551f, -1.416f, -2.29f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 13.5f)
                curveToRelative(2.5f, 2.5f, 6.5f, 2.5f, 9.0f, 0.0f)
            }
        }
        .build()
        return _brandHipchat!!
    }

private var _brandHipchat: ImageVector? = null
