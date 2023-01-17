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

public val TablerIcons.BrandMastodon: ImageVector
    get() {
        if (_brandMastodon != null) {
            return _brandMastodon!!
        }
        _brandMastodon = Builder(name = "BrandMastodon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.648f, 15.254f)
                curveToRelative(-1.816f, 1.763f, -6.648f, 1.626f, -6.648f, 1.626f)
                arcToRelative(18.262f, 18.262f, 0.0f, false, true, -3.288f, -0.256f)
                curveToRelative(1.127f, 1.985f, 4.12f, 2.81f, 8.982f, 2.475f)
                curveToRelative(-1.945f, 2.013f, -13.598f, 5.257f, -13.668f, -7.636f)
                lineToRelative(-0.026f, -1.154f)
                curveToRelative(0.0f, -3.036f, 0.023f, -4.115f, 1.352f, -5.633f)
                curveToRelative(1.671f, -1.91f, 6.648f, -1.666f, 6.648f, -1.666f)
                reflectiveCurveToRelative(4.977f, -0.243f, 6.648f, 1.667f)
                curveToRelative(1.329f, 1.518f, 1.352f, 2.597f, 1.352f, 5.633f)
                reflectiveCurveToRelative(-0.456f, 4.074f, -1.352f, 4.944f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 11.204f)
                verticalLineToRelative(-2.926f)
                curveToRelative(0.0f, -1.258f, -0.895f, -2.278f, -2.0f, -2.278f)
                reflectiveCurveToRelative(-2.0f, 1.02f, -2.0f, 2.278f)
                verticalLineToRelative(4.722f)
                moveToRelative(4.0f, -4.722f)
                curveToRelative(0.0f, -1.258f, 0.895f, -2.278f, 2.0f, -2.278f)
                reflectiveCurveToRelative(2.0f, 1.02f, 2.0f, 2.278f)
                verticalLineToRelative(4.722f)
            }
        }
        .build()
        return _brandMastodon!!
    }

private var _brandMastodon: ImageVector? = null
