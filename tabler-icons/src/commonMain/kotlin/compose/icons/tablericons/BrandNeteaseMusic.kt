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

public val TablerIcons.BrandNeteaseMusic: ImageVector
    get() {
        if (_brandNeteaseMusic != null) {
            return _brandNeteaseMusic!!
        }
        _brandNeteaseMusic = Builder(name = "BrandNeteaseMusic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveToRelative(-2.93f, 1.346f, -5.0f, 5.046f, -5.0f, 8.492f)
                curveToRelative(0.0f, 4.508f, 4.0f, 7.508f, 8.0f, 7.508f)
                reflectiveCurveToRelative(8.0f, -3.0f, 8.0f, -7.0f)
                curveToRelative(0.0f, -3.513f, -3.5f, -5.513f, -6.0f, -5.513f)
                reflectiveCurveToRelative(-5.0f, 1.513f, -5.0f, 4.513f)
                curveToRelative(0.0f, 2.0f, 1.5f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.0f, 3.0f, -3.0f)
                curveToRelative(0.0f, -3.513f, -2.0f, -4.508f, -2.0f, -6.515f)
                curveToRelative(0.0f, -3.504f, 3.5f, -2.603f, 4.0f, -1.502f)
            }
        }
        .build()
        return _brandNeteaseMusic!!
    }

private var _brandNeteaseMusic: ImageVector? = null
