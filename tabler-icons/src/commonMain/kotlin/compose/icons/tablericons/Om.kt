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

public val TablerIcons.Om: ImageVector
    get() {
        if (_om != null) {
            return _om!!
        }
        _om = Builder(name = "Om", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.567f, 4.0f, -3.5f)
                reflectiveCurveToRelative(-1.79f, -3.5f, -4.0f, -3.5f)
                curveToRelative(-1.594f, 0.0f, -2.97f, 0.816f, -3.613f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.423f, 14.483f)
                arcToRelative(4.944f, 4.944f, 0.0f, false, false, -0.423f, 2.017f)
                curveToRelative(0.0f, 2.485f, 1.79f, 4.5f, 4.0f, 4.5f)
                reflectiveCurveToRelative(4.0f, -2.015f, 4.0f, -4.5f)
                reflectiveCurveToRelative(-1.79f, -4.5f, -4.0f, -4.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.071f, 17.01f)
                curveToRelative(0.327f, 2.277f, 1.739f, 3.99f, 3.429f, 3.99f)
                curveToRelative(1.933f, 0.0f, 3.5f, -2.239f, 3.5f, -5.0f)
                reflectiveCurveToRelative(-1.567f, -5.0f, -3.5f, -5.0f)
                curveToRelative(-0.96f, 0.0f, -1.868f, 0.606f, -2.5f, 1.5f)
                curveToRelative(-0.717f, 1.049f, -1.76f, 1.7f, -2.936f, 1.7f)
                curveToRelative(-0.92f, 0.0f, -1.766f, -0.406f, -2.434f, -1.087f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                lineToRelative(2.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(1.667f, 3.667f, 4.667f, 5.333f, 9.0f, 5.0f)
            }
        }
        .build()
        return _om!!
    }

private var _om: ImageVector? = null
