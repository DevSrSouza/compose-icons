package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.6f, 53.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.4f, -8.6f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 98.5f, 40.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 19.7f, -3.8f, 38.0f, -11.2f, 54.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -6.0f, 4.6f)
                horizontalLineToRelative(-1.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.9f, -2.6f)
                close()
                moveTo(228.4f, 226.6f)
                lineToRelative(-34.9f, -38.4f)
                horizontalLineToRelative(0.0f)
                lineTo(61.2f, 42.6f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-21.8f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, -0.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -0.5f, 11.3f)
                lineTo(39.5f, 42.5f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 89.4f, 75.8f, 119.1f, 91.0f, 124.1f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 10.0f, 0.0f)
                arcToRelative(146.4f, 146.4f, 0.0f, false, false, 54.4f, -33.5f)
                lineToRelative(29.2f, 32.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.9f, 2.6f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 228.4f, 226.6f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
