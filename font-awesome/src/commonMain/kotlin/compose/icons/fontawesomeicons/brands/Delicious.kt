package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Delicious: ImageVector
    get() {
        if (_delicious != null) {
            return _delicious!!
        }
        _delicious = Builder(name = "Delicious", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(446.5f, 68.0f)
                curveToRelative(-0.4f, -1.5f, -0.9f, -3.0f, -1.4f, -4.5f)
                curveToRelative(-0.9f, -2.5f, -2.0f, -4.8f, -3.3f, -7.1f)
                curveToRelative(-1.4f, -2.4f, -3.0f, -4.8f, -4.7f, -6.9f)
                curveToRelative(-2.1f, -2.5f, -4.4f, -4.8f, -6.9f, -6.8f)
                curveToRelative(-1.1f, -0.9f, -2.2f, -1.7f, -3.3f, -2.5f)
                curveToRelative(-1.3f, -0.9f, -2.6f, -1.7f, -4.0f, -2.4f)
                curveToRelative(-1.8f, -1.0f, -3.6f, -1.8f, -5.5f, -2.5f)
                curveToRelative(-1.7f, -0.7f, -3.5f, -1.3f, -5.4f, -1.7f)
                curveToRelative(-3.8f, -1.0f, -7.9f, -1.5f, -12.0f, -1.5f)
                horizontalLineTo(48.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 4.1f, 0.5f, 8.2f, 1.5f, 12.0f)
                curveToRelative(2.0f, 7.7f, 5.8f, 14.6f, 11.0f, 20.3f)
                curveToRelative(1.0f, 1.1f, 2.1f, 2.2f, 3.3f, 3.3f)
                curveToRelative(5.7f, 5.2f, 12.6f, 9.0f, 20.3f, 11.0f)
                curveToRelative(3.8f, 1.0f, 7.9f, 1.5f, 12.0f, 1.5f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineTo(80.0f)
                curveToRelative(-0.1f, -4.1f, -0.6f, -8.2f, -1.6f, -12.0f)
                close()
                moveTo(416.0f, 432.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(224.0f)
                verticalLineTo(256.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(176.0f)
                verticalLineToRelative(192.0f)
                horizontalLineToRelative(192.0f)
                close()
            }
        }
        .build()
        return _delicious!!
    }

private var _delicious: ImageVector? = null
