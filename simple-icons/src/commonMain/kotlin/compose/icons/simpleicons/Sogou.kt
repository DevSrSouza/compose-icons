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

public val SimpleIcons.Sogou: ImageVector
    get() {
        if (_sogou != null) {
            return _sogou!!
        }
        _sogou = Builder(name = "Sogou", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.801f, 22.74f)
                lineTo(17.79f, 24.0f)
                curveToRelative(1.561f, -0.676f, 2.926f, -1.62f, 4.051f, -2.851f)
                lineToRelative(-0.946f, -1.318f)
                curveToRelative(-1.11f, 1.289f, -2.475f, 2.279f, -4.08f, 2.909f)
                horizontalLineToRelative(-0.014f)
                close()
                moveTo(12.0f, 22.199f)
                curveToRelative(-5.775f, 0.0f, -10.455f, -4.619f, -10.455f, -10.35f)
                curveTo(1.545f, 6.15f, 6.225f, 1.53f, 12.0f, 1.53f)
                reflectiveCurveToRelative(10.456f, 4.65f, 10.456f, 10.35f)
                curveToRelative(0.0f, 2.55f, -0.946f, 4.891f, -2.507f, 6.69f)
                lineToRelative(0.945f, 1.261f)
                curveTo(22.801f, 17.729f, 24.0f, 14.939f, 24.0f, 11.88f)
                curveTo(24.0f, 5.295f, 18.63f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.311f, 0.0f, 11.85f)
                curveToRelative(0.0f, 6.57f, 5.37f, 11.88f, 12.0f, 11.88f)
                curveToRelative(1.71f, 0.0f, 3.33f, -0.346f, 4.801f, -0.99f)
                lineToRelative(-0.961f, -1.26f)
                curveToRelative(-1.2f, 0.45f, -2.49f, 0.719f, -3.84f, 0.719f)
                close()
                moveTo(18.0f, 12.646f)
                curveToRelative(-2.25f, -1.86f, -5.34f, -2.101f, -7.801f, -3.556f)
                curveToRelative(-0.75f, -0.479f, -0.148f, -1.395f, 0.602f, -1.425f)
                curveToRelative(2.699f, -0.45f, 5.369f, 0.63f, 7.889f, 1.5f)
                lineToRelative(0.151f, -2.655f)
                curveToRelative(-3.151f, -1.14f, -6.57f, -1.875f, -9.901f, -1.35f)
                curveToRelative(-1.2f, 0.3f, -2.4f, 0.675f, -3.254f, 1.56f)
                curveToRelative(-1.171f, 1.2f, -0.961f, 3.36f, 0.389f, 4.32f)
                curveToRelative(2.236f, 1.755f, 5.176f, 2.011f, 7.621f, 3.36f)
                curveToRelative(0.96f, 0.39f, 0.555f, 1.68f, -0.391f, 1.77f)
                curveToRelative(-2.925f, 0.555f, -5.805f, -0.721f, -8.325f, -2.1f)
                curveToRelative(-0.03f, 1.02f, -0.06f, 2.01f, -0.06f, 3.0f)
                curveToRelative(3.195f, 1.409f, 6.75f, 2.069f, 10.2f, 1.529f)
                curveToRelative(1.17f, -0.225f, 2.37f, -0.6f, 3.225f, -1.454f)
                curveToRelative(1.229f, -1.2f, 1.111f, -3.511f, -0.33f, -4.5f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _sogou!!
    }

private var _sogou: ImageVector? = null
