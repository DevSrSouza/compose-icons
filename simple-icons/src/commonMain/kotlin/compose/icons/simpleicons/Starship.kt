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

public val SimpleIcons.Starship: ImageVector
    get() {
        if (_starship != null) {
            return _starship!!
        }
        _starship = Builder(name = "Starship", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.521f, 9.62f)
                arcToRelative(1.057f, 1.057f, 0.0f, true, true, -2.115f, 0.0f)
                arcToRelative(1.057f, 1.057f, 0.0f, false, true, 2.115f, 0.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-0.35f, 0.0f, -0.697f, -0.015f, -1.04f, -0.044f)
                curveToRelative(2.019f, -1.89f, 2.548f, -5.061f, 2.548f, -5.061f)
                lineToRelative(-3.226f, -1.053f)
                reflectiveCurveToRelative(-1.499f, 3.23f, -5.599f, 3.67f)
                arcTo(11.98f, 11.98f, 0.0f, false, true, 0.0f, 12.0f)
                curveTo(0.0f, 5.373f, 5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                close()
                moveTo(8.628f, 6.606f)
                curveToRelative(-1.23f, -0.13f, -1.885f, -0.83f, -2.03f, -2.031f)
                curveToRelative(-0.142f, 1.159f, -0.77f, 1.88f, -2.032f, 2.031f)
                curveToRelative(1.168f, 0.227f, 1.83f, 0.918f, 2.031f, 2.032f)
                curveToRelative(-0.02f, -1.154f, 0.666f, -1.825f, 2.031f, -2.032f)
                close()
                moveTo(16.414f, 11.813f)
                curveToRelative(1.11f, -2.483f, 0.392f, -4.252f, -1.233f, -6.246f)
                curveToRelative(-2.043f, 1.5f, -3.759f, 3.023f, -3.636f, 5.149f)
                curveToRelative(-1.375f, 0.675f, -2.261f, 1.206f, -3.147f, 2.289f)
                lineToRelative(2.779f, 1.103f)
                lineToRelative(-0.368f, 1.267f)
                lineToRelative(3.637f, 1.062f)
                lineToRelative(0.443f, -1.181f)
                lineToRelative(2.825f, 0.651f)
                curveToRelative(0.014f, -1.496f, -0.38f, -3.097f, -1.3f, -4.094f)
                close()
            }
        }
        .build()
        return _starship!!
    }

private var _starship: ImageVector? = null
