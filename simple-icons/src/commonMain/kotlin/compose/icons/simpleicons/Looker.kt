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

public val SimpleIcons.Looker: ImageVector
    get() {
        if (_looker != null) {
            return _looker!!
        }
        _looker = Builder(name = "Looker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.948f, 0.0f)
                curveToRelative(-1.16f, 0.002f, -2.098f, 0.944f, -2.096f, 2.104f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 0.356f, 1.166f)
                lineToRelative(0.895f, -0.896f)
                arcToRelative(0.884f, 0.884f, 0.0f, true, true, 0.565f, 0.564f)
                lineToRelative(-0.895f, 0.895f)
                curveToRelative(0.959f, 0.648f, 2.262f, 0.395f, 2.91f, -0.564f)
                curveToRelative(0.648f, -0.959f, 0.395f, -2.262f, -0.564f, -2.91f)
                arcTo(2.096f, 2.096f, 0.0f, false, false, 11.948f, 0.0f)
                close()
                moveTo(11.113f, 6.113f)
                arcToRelative(3.263f, 3.263f, 0.0f, false, false, -0.653f, -1.965f)
                lineToRelative(-1.164f, 1.162f)
                arcToRelative(1.667f, 1.667f, 0.0f, false, true, -0.318f, 2.012f)
                lineToRelative(0.632f, 1.545f)
                arcToRelative(3.282f, 3.282f, 0.0f, false, false, 1.503f, -2.754f)
                close()
                moveTo(7.863f, 7.779f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-0.922f, 0.001f, -1.67f, -0.746f, -1.671f, -1.667f)
                curveToRelative(-0.001f, -0.922f, 0.745f, -1.67f, 1.667f, -1.671f)
                arcToRelative(1.669f, 1.669f, 0.0f, false, true, 0.919f, 0.275f)
                lineToRelative(1.152f, -1.152f)
                curveToRelative(-1.407f, -1.141f, -3.472f, -0.926f, -4.614f, 0.481f)
                reflectiveCurveToRelative(-0.926f, 3.472f, 0.481f, 4.614f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, false, 2.727f, 0.665f)
                lineToRelative(-0.633f, -1.544f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(11.991f, 9.115f)
                curveToRelative(-0.728f, 0.0f, -1.452f, 0.106f, -2.15f, 0.315f)
                lineToRelative(0.922f, 2.252f)
                curveToRelative(2.687f, -0.682f, 5.418f, 0.944f, 6.1f, 3.631f)
                curveToRelative(0.682f, 2.687f, -0.944f, 5.418f, -3.631f, 6.1f)
                reflectiveCurveToRelative(-5.418f, -0.944f, -6.1f, -3.631f)
                curveToRelative(-0.568f, -2.239f, 0.465f, -4.577f, 2.504f, -5.664f)
                lineToRelative(-0.91f, -2.245f)
                curveToRelative(-3.691f, 1.808f, -5.217f, 6.266f, -3.409f, 9.957f)
                lineToRelative(0.001f, 0.001f)
                curveToRelative(1.808f, 3.691f, 6.266f, 5.217f, 9.957f, 3.409f)
                lineToRelative(0.001f, -0.001f)
                curveToRelative(3.691f, -1.807f, 5.219f, -6.265f, 3.412f, -9.956f)
                arcToRelative(7.442f, 7.442f, 0.0f, false, false, -6.687f, -4.17f)
                horizontalLineToRelative(-0.008f)
                lineToRelative(-0.001f, 0.001f)
                close()
            }
        }
        .build()
        return _looker!!
    }

private var _looker: ImageVector? = null
