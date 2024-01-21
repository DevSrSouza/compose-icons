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

public val TablerIcons.BrandCohost: ImageVector
    get() {
        if (_brandCohost != null) {
            return _brandCohost!!
        }
        _brandCohost = Builder(name = "BrandCohost", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 2.0f, 0.0f, true, false, 6.0f, 0.0f)
                arcToRelative(3.0f, 2.0f, 0.0f, true, false, -6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.526f, 17.666f)
                curveToRelative(-1.133f, -0.772f, -1.897f, -1.924f, -2.291f, -3.456f)
                curveToRelative(-0.398f, -1.54f, -0.29f, -2.937f, 0.32f, -4.19f)
                curveToRelative(0.61f, -1.255f, 1.59f, -2.34f, 2.938f, -3.254f)
                curveToRelative(1.348f, -0.914f, 2.93f, -1.625f, 4.749f, -2.132f)
                curveToRelative(1.81f, -0.504f, 3.516f, -0.708f, 5.12f, -0.61f)
                curveToRelative(1.608f, 0.1f, 2.979f, 0.537f, 4.112f, 1.31f)
                reflectiveCurveToRelative(1.897f, 1.924f, 2.291f, 3.456f)
                curveToRelative(0.398f, 1.541f, 0.29f, 2.938f, -0.32f, 4.192f)
                curveToRelative(-0.61f, 1.253f, -1.59f, 2.337f, -2.938f, 3.252f)
                curveToRelative(-1.348f, 0.915f, -2.93f, 1.626f, -4.749f, 2.133f)
                curveToRelative(-1.81f, 0.503f, -3.516f, 0.707f, -5.12f, 0.61f)
                curveToRelative(-1.608f, -0.102f, -2.979f, -0.538f, -4.112f, -1.31f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 12.508f)
                curveToRelative(-0.53f, -0.316f, -1.23f, -0.508f, -2.0f, -0.508f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 0.895f, -3.0f, 2.0f)
                reflectiveCurveToRelative(1.343f, 2.0f, 3.0f, 2.0f)
                curveToRelative(0.767f, 0.0f, 1.467f, -0.192f, 2.0f, -0.508f)
            }
        }
        .build()
        return _brandCohost!!
    }

private var _brandCohost: ImageVector? = null
