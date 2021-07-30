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

public val SimpleIcons.Mozilla: ImageVector
    get() {
        if (_mozilla != null) {
            return _mozilla!!
        }
        _mozilla = Builder(name = "Mozilla", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(10.13f, 6.706f)
                curveToRelative(1.481f, 0.0f, 2.858f, 0.706f, 3.352f, 2.224f)
                curveToRelative(0.565f, -1.377f, 1.73f, -2.224f, 3.353f, -2.224f)
                curveToRelative(1.87f, 0.0f, 3.565f, 1.13f, 3.565f, 3.564f)
                verticalLineToRelative(4.765f)
                horizontalLineToRelative(1.412f)
                verticalLineToRelative(2.26f)
                horizontalLineToRelative(-4.341f)
                verticalLineToRelative(-5.86f)
                curveToRelative(0.0f, -1.8f, -0.6f, -2.47f, -1.765f, -2.47f)
                curveToRelative(-1.412f, 0.0f, -1.976f, 1.024f, -1.976f, 2.435f)
                lineTo(13.73f, 15.0f)
                horizontalLineToRelative(1.376f)
                verticalLineToRelative(2.259f)
                horizontalLineToRelative(-4.341f)
                verticalLineToRelative(-5.824f)
                curveToRelative(0.0f, -1.8f, -0.6f, -2.47f, -1.765f, -2.47f)
                curveToRelative(-1.412f, 0.0f, -1.976f, 1.024f, -1.976f, 2.435f)
                lineTo(7.024f, 15.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(2.259f)
                lineTo(2.647f, 17.259f)
                lineTo(2.647f, 15.0f)
                horizontalLineToRelative(1.377f)
                lineTo(4.024f, 9.176f)
                lineTo(2.647f, 9.176f)
                lineTo(2.647f, 6.918f)
                lineTo(6.99f, 6.918f)
                lineTo(6.99f, 8.47f)
                curveToRelative(0.635f, -1.095f, 1.693f, -1.765f, 3.14f, -1.765f)
                close()
            }
        }
        .build()
        return _mozilla!!
    }

private var _mozilla: ImageVector? = null
