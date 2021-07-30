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

public val SimpleIcons.Zdf: ImageVector
    get() {
        if (_zdf != null) {
            return _zdf!!
        }
        _zdf = Builder(name = "Zdf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.014f, 4.987f)
                arcTo(7.02f, 7.02f, 0.0f, false, false, 0.0f, 12.005f)
                arcToRelative(7.017f, 7.017f, 0.0f, false, false, 13.271f, 3.174f)
                horizontalLineToRelative(2.915f)
                curveToRelative(0.696f, 0.0f, 1.324f, -0.044f, 1.962f, -0.553f)
                curveToRelative(0.461f, -0.365f, 0.749f, -0.884f, 0.883f, -1.56f)
                verticalLineToRelative(2.103f)
                horizontalLineToRelative(1.336f)
                verticalLineToRelative(-2.473f)
                horizontalLineToRelative(3.153f)
                verticalLineToRelative(-1.1f)
                horizontalLineToRelative(-3.16f)
                lineToRelative(0.02f, -0.445f)
                curveToRelative(0.005f, -0.724f, 0.226f, -1.162f, 1.277f, -1.162f)
                lineTo(24.0f, 9.989f)
                lineTo(24.0f, 8.876f)
                horizontalLineToRelative(-2.818f)
                curveToRelative(-1.517f, 0.0f, -2.141f, 0.85f, -2.141f, 2.18f)
                verticalLineToRelative(0.129f)
                curveToRelative(-0.254f, -1.565f, -1.185f, -2.31f, -2.889f, -2.31f)
                horizontalLineToRelative(-2.855f)
                arcToRelative(7.018f, 7.018f, 0.0f, false, false, -6.283f, -3.888f)
                close()
                moveTo(8.02f, 8.876f)
                horizontalLineToRelative(3.436f)
                curveToRelative(1.742f, 0.0f, 1.992f, 1.219f, 1.992f, 1.9f)
                curveToRelative(0.0f, 0.725f, -0.298f, 1.873f, -1.992f, 1.873f)
                horizontalLineToRelative(-0.844f)
                curveToRelative(-1.056f, 0.0f, -1.281f, 0.38f, -1.281f, 1.104f)
                verticalLineToRelative(0.336f)
                horizontalLineToRelative(3.945f)
                verticalLineToRelative(1.074f)
                lineTo(7.982f, 15.163f)
                verticalLineToRelative(-1.558f)
                curveToRelative(0.0f, -1.335f, 0.625f, -2.123f, 2.137f, -2.123f)
                horizontalLineToRelative(0.873f)
                curveToRelative(0.691f, 0.0f, 1.1f, -0.14f, 1.1f, -0.725f)
                curveToRelative(0.0f, -0.605f, -0.409f, -0.772f, -1.12f, -0.772f)
                horizontalLineToRelative(-2.95f)
                verticalLineToRelative(-1.11f)
                close()
                moveTo(14.65f, 9.989f)
                horizontalLineToRelative(1.472f)
                curveToRelative(1.157f, 0.0f, 1.574f, 0.496f, 1.574f, 2.04f)
                curveToRelative(0.0f, 1.542f, -0.412f, 2.036f, -1.574f, 2.036f)
                lineTo(14.65f, 14.065f)
                close()
            }
        }
        .build()
        return _zdf!!
    }

private var _zdf: ImageVector? = null
