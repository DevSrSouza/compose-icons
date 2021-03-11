package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Powerbi: ImageVector
    get() {
        if (_powerbi != null) {
            return _powerbi!!
        }
        _powerbi = Builder(name = "Powerbi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.064f, 12.537f)
                curveToRelative(-0.725f, 0.0f, -1.313f, 0.545f, -1.313f, 1.217f)
                verticalLineToRelative(5.353f)
                curveToRelative(0.0f, 0.672f, 0.589f, 1.217f, 1.314f, 1.217f)
                curveToRelative(0.726f, 0.0f, 1.314f, -0.545f, 1.314f, -1.218f)
                verticalLineToRelative(-5.352f)
                curveToRelative(0.0f, -0.672f, -0.589f, -1.217f, -1.315f, -1.217f)
                close()
                moveTo(18.196f, 7.649f)
                curveToRelative(-0.726f, 0.0f, -1.314f, 0.545f, -1.314f, 1.218f)
                lineTo(16.882f, 19.07f)
                curveToRelative(0.0f, 0.672f, 0.59f, 1.217f, 1.314f, 1.217f)
                curveToRelative(0.726f, 0.0f, 1.314f, -0.545f, 1.314f, -1.217f)
                lineTo(19.51f, 8.867f)
                curveToRelative(0.0f, -0.673f, -0.588f, -1.218f, -1.314f, -1.218f)
                close()
                moveTo(9.934f, 10.684f)
                curveToRelative(-0.725f, 0.0f, -1.313f, 0.545f, -1.313f, 1.218f)
                verticalLineToRelative(7.205f)
                curveToRelative(0.0f, 0.672f, 0.589f, 1.217f, 1.315f, 1.217f)
                curveToRelative(0.725f, 0.0f, 1.313f, -0.545f, 1.313f, -1.218f)
                verticalLineToRelative(-7.205f)
                curveToRelative(0.0f, -0.672f, -0.589f, -1.217f, -1.315f, -1.217f)
                close()
                moveTo(5.804f, 15.082f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-0.726f, 0.0f, -1.314f, 0.546f, -1.314f, 1.218f)
                lineToRelative(0.001f, 2.807f)
                curveToRelative(0.0f, 0.672f, 0.588f, 1.217f, 1.314f, 1.217f)
                curveToRelative(0.726f, 0.0f, 1.314f, -0.545f, 1.313f, -1.218f)
                lineTo(7.117f, 16.3f)
                curveToRelative(0.0f, -0.673f, -0.588f, -1.218f, -1.314f, -1.218f)
                close()
                moveTo(24.0f, 6.3f)
                verticalLineToRelative(9.163f)
                curveToRelative(0.0f, 1.447f, -1.27f, 2.624f, -2.831f, 2.624f)
                horizontalLineToRelative(-0.484f)
                verticalLineToRelative(-0.897f)
                horizontalLineToRelative(0.484f)
                curveToRelative(1.027f, 0.0f, 1.863f, -0.775f, 1.863f, -1.727f)
                lineTo(23.032f, 6.3f)
                curveToRelative(0.0f, -0.952f, -0.836f, -1.726f, -1.863f, -1.726f)
                lineTo(2.831f, 4.574f)
                curveTo(1.804f, 4.574f, 0.968f, 5.348f, 0.968f, 6.3f)
                verticalLineToRelative(9.163f)
                curveToRelative(0.0f, 0.952f, 0.836f, 1.727f, 1.863f, 1.727f)
                horizontalLineToRelative(0.484f)
                verticalLineToRelative(0.897f)
                lineTo(2.83f, 18.087f)
                curveTo(1.27f, 18.086f, 0.0f, 16.909f, 0.0f, 15.462f)
                lineTo(0.0f, 6.3f)
                curveToRelative(0.0f, -1.446f, 1.27f, -2.623f, 2.83f, -2.623f)
                horizontalLineToRelative(18.34f)
                curveTo(22.73f, 3.676f, 24.0f, 4.853f, 24.0f, 6.3f)
                close()
            }
        }
        .build()
        return _powerbi!!
    }

private var _powerbi: ImageVector? = null
