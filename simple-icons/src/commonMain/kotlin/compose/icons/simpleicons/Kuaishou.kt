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

public val SimpleIcons.Kuaishou: ImageVector
    get() {
        if (_kuaishou != null) {
            return _kuaishou!!
        }
        _kuaishou = Builder(name = "Kuaishou", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.315f, 12.264f)
                curveToRelative(2.33f, 0.0f, 4.218f, 1.88f, 4.218f, 4.2f)
                lineTo(22.533f, 19.8f)
                curveToRelative(0.0f, 2.32f, -1.888f, 4.2f, -4.218f, 4.2f)
                horizontalLineToRelative(-6.202f)
                arcToRelative(4.218f, 4.218f, 0.0f, false, true, -4.023f, -2.938f)
                lineToRelative(-3.676f, 1.833f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, true, -2.731f, -0.903f)
                arcToRelative(2.015f, 2.015f, 0.0f, false, true, -0.216f, -0.907f)
                verticalLineToRelative(-5.94f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, true, 2.035f, -2.024f)
                arcToRelative(2.044f, 2.044f, 0.0f, false, true, 0.919f, 0.218f)
                lineToRelative(3.673f, 1.85f)
                arcToRelative(4.218f, 4.218f, 0.0f, false, true, 4.02f, -2.925f)
                close()
                moveTo(18.253f, 14.426f)
                horizontalLineToRelative(-6.078f)
                curveToRelative(-1.153f, 0.0f, -2.09f, 0.921f, -2.108f, 2.065f)
                verticalLineToRelative(3.247f)
                curveToRelative(0.0f, 1.148f, 0.925f, 2.081f, 2.073f, 2.1f)
                horizontalLineToRelative(6.113f)
                curveToRelative(1.153f, 0.0f, 2.09f, -0.922f, 2.109f, -2.065f)
                verticalLineToRelative(-3.247f)
                arcToRelative(2.104f, 2.104f, 0.0f, false, false, -2.074f, -2.1f)
                close()
                moveTo(4.18f, 15.72f)
                arcToRelative(0.554f, 0.554f, 0.0f, false, false, -0.555f, 0.542f)
                verticalLineToRelative(3.734f)
                arcToRelative(0.556f, 0.556f, 0.0f, false, false, 0.798f, 0.496f)
                lineToRelative(0.01f, -0.004f)
                lineToRelative(3.463f, -1.756f)
                lineTo(7.896f, 17.51f)
                lineToRelative(-3.467f, -1.73f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, false, -0.249f, -0.06f)
                close()
                moveTo(9.28f, 0.0f)
                arcToRelative(5.667f, 5.667f, 0.0f, false, true, 4.98f, 2.965f)
                arcToRelative(4.921f, 4.921f, 0.0f, false, true, 3.36f, -1.317f)
                curveToRelative(2.714f, 0.0f, 4.913f, 2.177f, 4.913f, 4.863f)
                curveToRelative(0.0f, 2.686f, -2.2f, 4.863f, -4.912f, 4.863f)
                arcToRelative(4.921f, 4.921f, 0.0f, false, true, -3.996f, -2.034f)
                arcToRelative(5.651f, 5.651f, 0.0f, false, true, -4.345f, 2.034f)
                curveToRelative(-3.131f, 0.0f, -5.67f, -2.546f, -5.67f, -5.687f)
                curveTo(3.61f, 2.546f, 6.149f, 0.0f, 9.28f, 0.0f)
                close()
                moveTo(17.62f, 3.926f)
                curveToRelative(-1.441f, 0.0f, -2.61f, 1.157f, -2.61f, 2.585f)
                reflectiveCurveToRelative(1.169f, 2.585f, 2.61f, 2.585f)
                curveToRelative(1.443f, 0.0f, 2.612f, -1.157f, 2.612f, -2.585f)
                reflectiveCurveToRelative(-1.169f, -2.585f, -2.611f, -2.585f)
                close()
                moveTo(9.28f, 2.287f)
                arcToRelative(3.395f, 3.395f, 0.0f, false, false, -3.39f, 3.4f)
                curveToRelative(0.0f, 1.877f, 1.518f, 3.4f, 3.39f, 3.4f)
                arcToRelative(3.395f, 3.395f, 0.0f, false, false, 3.39f, -3.4f)
                curveToRelative(0.0f, -1.878f, -1.518f, -3.4f, -3.39f, -3.4f)
                close()
            }
        }
        .build()
        return _kuaishou!!
    }

private var _kuaishou: ImageVector? = null
