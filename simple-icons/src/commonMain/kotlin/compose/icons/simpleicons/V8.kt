package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.V8: ImageVector
    get() {
        if (_v8 != null) {
            return _v8!!
        }
        _v8 = Builder(name = "V8", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.832f, 6.0f)
                curveToRelative(0.0f, -0.161f, 0.008f, -0.322f, 0.023f, -0.479f)
                curveToRelative(0.019f, -0.207f, 0.07f, -0.401f, 0.112f, -0.599f)
                lineToRelative(-0.694f, -1.377f)
                lineTo(0.0f, 3.545f)
                lineToRelative(2.182f, 3.818f)
                horizontalLineToRelative(1.527f)
                lineToRelative(2.097f, 3.98f)
                arcToRelative(6.534f, 6.534f, 0.0f, false, true, 1.727f, -2.745f)
                arcTo(5.123f, 5.123f, 0.0f, false, true, 6.832f, 6.0f)
                close()
                moveTo(10.365f, 19.663f)
                lineTo(12.0f, 22.637f)
                lineToRelative(1.637f, -2.975f)
                curveToRelative(-0.535f, 0.138f, -1.079f, 0.234f, -1.637f, 0.234f)
                reflectiveCurveToRelative(-1.101f, -0.096f, -1.635f, -0.233f)
                close()
                moveTo(17.728f, 3.545f)
                lineToRelative(-0.717f, 1.258f)
                curveToRelative(0.056f, 0.238f, 0.112f, 0.476f, 0.134f, 0.726f)
                arcToRelative(5.148f, 5.148f, 0.0f, false, true, -0.677f, 3.07f)
                arcToRelative(6.565f, 6.565f, 0.0f, false, true, 1.727f, 2.746f)
                lineToRelative(2.097f, -3.981f)
                horizontalLineToRelative(1.527f)
                lineTo(24.0f, 3.545f)
                horizontalLineToRelative(-6.272f)
                close()
                moveTo(17.846f, 12.007f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.073f, -3.31f)
                arcTo(4.64f, 4.64f, 0.0f, false, false, 12.0f, 1.363f)
                arcTo(4.635f, 4.635f, 0.0f, false, false, 7.363f, 6.0f)
                arcToRelative(4.62f, 4.62f, 0.0f, false, false, 0.865f, 2.697f)
                arcTo(5.988f, 5.988f, 0.0f, false, false, 6.0f, 13.363f)
                arcToRelative(6.01f, 6.01f, 0.0f, false, false, 3.814f, 5.592f)
                arcToRelative(6.02f, 6.02f, 0.0f, false, false, 4.375f, -0.003f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, 3.657f, -6.945f)
                close()
                moveTo(12.0f, 4.227f)
                curveToRelative(1.129f, 0.0f, 2.046f, 0.917f, 2.046f, 2.045f)
                arcToRelative(2.046f, 2.046f, 0.0f, false, true, -4.092f, 0.0f)
                curveToRelative(0.0f, -1.128f, 0.918f, -2.045f, 2.046f, -2.045f)
                close()
                moveTo(12.0f, 15.683f)
                arcToRelative(2.32f, 2.32f, 0.0f, false, true, 0.0f, -4.637f)
                curveToRelative(1.282f, 0.0f, 2.318f, 1.037f, 2.318f, 2.318f)
                reflectiveCurveTo(13.282f, 15.683f, 12.0f, 15.683f)
                close()
            }
        }
        .build()
        return _v8!!
    }

private var _v8: ImageVector? = null
