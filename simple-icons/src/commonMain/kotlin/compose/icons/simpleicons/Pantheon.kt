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

public val SimpleIcons.Pantheon: ImageVector
    get() {
        if (_pantheon != null) {
            return _pantheon!!
        }
        _pantheon = Builder(name = "Pantheon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.604f, 0.0f)
                lineTo(9.75f, 5.171f)
                lineTo(7.018f, 5.171f)
                lineToRelative(0.904f, 2.276f)
                horizontalLineToRelative(5.535f)
                close()
                moveTo(11.806f, 7.973f)
                lineToRelative(0.724f, 1.752f)
                horizontalLineToRelative(3.09f)
                curveToRelative(0.066f, 0.0f, 0.223f, -0.086f, 0.223f, -0.877f)
                curveToRelative(0.0f, -0.79f, -0.157f, -0.875f, -0.224f, -0.875f)
                close()
                moveTo(7.439f, 7.973f)
                curveToRelative(-0.306f, 0.0f, -0.474f, 0.0f, -0.612f, 0.456f)
                curveToRelative(-0.166f, 0.544f, -0.185f, 1.571f, -0.185f, 3.57f)
                curveToRelative(0.0f, 2.0f, 0.02f, 3.028f, 0.185f, 3.572f)
                curveToRelative(0.138f, 0.456f, 0.306f, 0.456f, 0.612f, 0.456f)
                horizontalLineToRelative(3.486f)
                lineToRelative(-1.727f, -4.202f)
                verticalLineToRelative(0.014f)
                lineToRelative(-0.816f, -2.116f)
                horizontalLineToRelative(1.912f)
                lineToRelative(0.884f, 2.119f)
                lineToRelative(1.826f, -0.016f)
                lineToRelative(-1.591f, -3.853f)
                close()
                moveTo(12.674f, 10.073f)
                lineToRelative(0.724f, 1.753f)
                horizontalLineToRelative(2.562f)
                curveToRelative(0.068f, 0.0f, 0.223f, -0.086f, 0.223f, -0.876f)
                reflectiveCurveToRelative(-0.156f, -0.876f, -0.223f, -0.876f)
                close()
                moveTo(8.932f, 10.149f)
                lineToRelative(2.633f, 6.403f)
                lineTo(8.346f, 16.552f)
                lineTo(14.297f, 24.0f)
                lineToRelative(-2.146f, -5.172f)
                horizontalLineToRelative(2.731f)
                lineToRelative(-0.913f, -2.276f)
                lineTo(12.7f, 16.552f)
                lineToRelative(-2.634f, -6.403f)
                close()
                moveTo(11.306f, 12.175f)
                lineToRelative(0.724f, 1.752f)
                horizontalLineToRelative(3.93f)
                curveToRelative(0.067f, 0.0f, 0.223f, -0.086f, 0.223f, -0.876f)
                reflectiveCurveToRelative(-0.155f, -0.876f, -0.223f, -0.876f)
                close()
                moveTo(12.174f, 14.275f)
                lineToRelative(0.723f, 1.752f)
                horizontalLineToRelative(2.722f)
                curveToRelative(0.067f, 0.0f, 0.223f, -0.085f, 0.223f, -0.875f)
                reflectiveCurveToRelative(-0.156f, -0.876f, -0.223f, -0.876f)
                close()
                moveTo(16.798f, 15.475f)
                verticalLineToRelative(0.511f)
                horizontalLineToRelative(0.103f)
                verticalLineToRelative(-0.391f)
                lineToRelative(0.129f, 0.391f)
                horizontalLineToRelative(0.096f)
                lineToRelative(0.125f, -0.391f)
                verticalLineToRelative(0.391f)
                horizontalLineToRelative(0.107f)
                verticalLineToRelative(-0.511f)
                horizontalLineToRelative(-0.15f)
                lineToRelative(-0.127f, 0.394f)
                lineToRelative(-0.127f, -0.394f)
                close()
                moveTo(16.332f, 15.475f)
                verticalLineToRelative(0.092f)
                horizontalLineToRelative(0.144f)
                verticalLineToRelative(0.42f)
                horizontalLineToRelative(0.117f)
                verticalLineToRelative(-0.42f)
                horizontalLineToRelative(0.144f)
                verticalLineToRelative(-0.092f)
                close()
            }
        }
        .build()
        return _pantheon!!
    }

private var _pantheon: ImageVector? = null
