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

public val SimpleIcons.Rescript: ImageVector
    get() {
        if (_rescript != null) {
            return _rescript!!
        }
        _rescript = Builder(name = "Rescript", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.29f, 1.8f)
                curveToRelative(-0.3f, -0.4f, -0.6f, -0.7f, -0.9f, -0.9f)
                curveToRelative(-1.3f, -0.9f, -2.899f, -0.9f, -6.098f, -0.9f)
                lineTo(7.696f, 0.0f)
                curveTo(4.498f, 0.0f, 2.9f, 0.0f, 1.8f, 0.8f)
                curveToRelative(-0.4f, 0.3f, -0.7f, 0.6f, -1.0f, 1.0f)
                curveTo(0.0f, 2.9f, 0.0f, 4.5f, 0.0f, 7.7f)
                verticalLineToRelative(8.6f)
                curveToRelative(0.0f, 3.2f, 0.0f, 4.8f, 0.8f, 5.9f)
                curveToRelative(0.3f, 0.4f, 0.6f, 0.7f, 0.9f, 0.9f)
                curveToRelative(1.199f, 0.9f, 2.798f, 0.9f, 5.996f, 0.9f)
                horizontalLineToRelative(8.596f)
                curveToRelative(3.199f, 0.0f, 4.798f, 0.0f, 5.898f, -0.8f)
                curveToRelative(0.4f, -0.3f, 0.7f, -0.6f, 0.9f, -0.9f)
                curveToRelative(0.799f, -1.1f, 0.799f, -2.7f, 0.799f, -5.9f)
                lineTo(23.889f, 7.7f)
                curveToRelative(0.2f, -3.2f, 0.2f, -4.8f, -0.6f, -5.9f)
                close()
                moveTo(11.194f, 16.5f)
                curveToRelative(0.0f, 0.2f, 0.0f, 0.5f, -0.1f, 0.8f)
                curveToRelative(0.0f, 0.2f, -0.1f, 0.3f, -0.1f, 0.5f)
                curveToRelative(-0.1f, 0.1f, -0.2f, 0.3f, -0.4f, 0.5f)
                reflectiveCurveToRelative(-0.4f, 0.3f, -0.6f, 0.4f)
                curveToRelative(-0.3f, 0.1f, -0.7f, 0.1f, -1.399f, 0.1f)
                curveToRelative(-0.8f, 0.0f, -1.1f, 0.0f, -1.4f, -0.1f)
                curveToRelative(-0.4f, -0.2f, -0.699f, -0.5f, -0.899f, -0.9f)
                curveToRelative(-0.1f, -0.3f, -0.1f, -0.7f, -0.1f, -1.4f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.9f, 0.0f, -1.4f, 0.2f, -1.7f)
                curveToRelative(0.2f, -0.3f, 0.4f, -0.5f, 0.8f, -0.7f)
                curveToRelative(0.3f, -0.2f, 0.8f, -0.2f, 1.699f, -0.2f)
                horizontalLineToRelative(2.299f)
                close()
                moveTo(16.291f, 11.6f)
                curveToRelative(-1.599f, 0.0f, -2.798f, -1.3f, -2.798f, -2.8f)
                curveToRelative(0.0f, -1.6f, 1.3f, -2.8f, 2.798f, -2.8f)
                curveToRelative(1.5f, 0.0f, 2.8f, 1.3f, 2.8f, 2.8f)
                curveToRelative(0.0f, 1.5f, -1.3f, 2.8f, -2.8f, 2.8f)
                close()
            }
        }
        .build()
        return _rescript!!
    }

private var _rescript: ImageVector? = null
