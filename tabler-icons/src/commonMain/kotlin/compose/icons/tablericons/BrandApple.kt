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

public val TablerIcons.BrandApple: ImageVector
    get() {
        if (_brandApple != null) {
            return _brandApple!!
        }
        _brandApple = Builder(name = "BrandApple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.286f, 7.008f)
                curveToRelative(-3.216f, 0.0f, -4.286f, 3.23f, -4.286f, 5.92f)
                curveToRelative(0.0f, 3.229f, 2.143f, 8.072f, 4.286f, 8.072f)
                curveToRelative(1.165f, -0.05f, 1.799f, -0.538f, 3.214f, -0.538f)
                curveToRelative(1.406f, 0.0f, 1.607f, 0.538f, 3.214f, 0.538f)
                reflectiveCurveToRelative(4.286f, -3.229f, 4.286f, -5.381f)
                curveToRelative(-0.03f, -0.011f, -2.649f, -0.434f, -2.679f, -3.23f)
                curveToRelative(-0.02f, -2.335f, 2.589f, -3.179f, 2.679f, -3.228f)
                curveToRelative(-1.096f, -1.606f, -3.162f, -2.113f, -3.75f, -2.153f)
                curveToRelative(-1.535f, -0.12f, -3.032f, 1.077f, -3.75f, 1.077f)
                curveToRelative(-0.729f, 0.0f, -2.036f, -1.077f, -3.214f, -1.077f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
            }
        }
        .build()
        return _brandApple!!
    }

private var _brandApple: ImageVector? = null
