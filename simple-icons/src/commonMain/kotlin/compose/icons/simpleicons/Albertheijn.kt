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

public val SimpleIcons.Albertheijn: ImageVector
    get() {
        if (_albertheijn != null) {
            return _albertheijn!!
        }
        _albertheijn = Builder(name = "Albertheijn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.652f, 0.0f)
                curveToRelative(-0.354f, 0.002f, -0.714f, 0.09f, -1.047f, 0.276f)
                lineTo(4.475f, 5.924f)
                curveToRelative(-0.456f, 0.26f, -0.881f, 0.716f, -1.075f, 1.362f)
                lineToRelative(-2.718f, 9.44f)
                curveToRelative(-0.326f, 1.13f, 0.311f, 2.314f, 1.423f, 2.646f)
                lineToRelative(15.968f, 4.542f)
                curveToRelative(1.111f, 0.33f, 2.277f, -0.318f, 2.603f, -1.448f)
                lineToRelative(2.641f, -9.258f)
                curveToRelative(0.172f, -0.543f, 0.076f, -1.213f, -0.192f, -1.737f)
                lineTo(17.59f, 1.162f)
                arcTo(2.19f, 2.19f, 0.0f, false, false, 15.652f, 0.0f)
                close()
                moveTo(12.97f, 6.373f)
                reflectiveCurveToRelative(-0.008f, 4.23f, 0.0f, 4.225f)
                curveToRelative(0.899f, -1.295f, 1.712f, -2.577f, 3.234f, -2.577f)
                curveToRelative(1.684f, -0.001f, 2.597f, 1.409f, 2.602f, 2.595f)
                lineToRelative(-0.007f, 7.596f)
                horizontalLineToRelative(-1.891f)
                lineToRelative(-0.009f, -7.19f)
                curveToRelative(0.0f, -0.988f, -0.793f, -0.986f, -0.804f, -0.986f)
                curveToRelative(-0.64f, 0.0f, -1.816f, 1.605f, -3.125f, 3.386f)
                verticalLineToRelative(4.793f)
                lineToRelative(-1.913f, 0.002f)
                lineToRelative(-0.002f, -2.219f)
                reflectiveCurveTo(9.79f, 18.217f, 7.897f, 18.22f)
                curveToRelative(-2.148f, 0.0f, -2.877f, -1.476f, -2.882f, -5.015f)
                curveToRelative(-0.004f, -3.37f, 0.474f, -5.175f, 2.777f, -5.177f)
                curveToRelative(1.751f, -0.001f, 3.256f, 2.55f, 3.256f, 2.55f)
                lineTo(11.048f, 8.963f)
                close()
                moveTo(7.82f, 10.031f)
                curveToRelative(-0.88f, 0.0f, -0.957f, 0.93f, -0.954f, 3.17f)
                curveToRelative(0.003f, 2.242f, 0.124f, 3.115f, 0.95f, 3.115f)
                curveToRelative(1.124f, -0.001f, 2.895f, -2.86f, 2.895f, -2.86f)
                reflectiveCurveTo(8.955f, 10.03f, 7.82f, 10.03f)
                close()
            }
        }
        .build()
        return _albertheijn!!
    }

private var _albertheijn: ImageVector? = null
