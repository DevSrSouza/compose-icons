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

public val SimpleIcons.Invision: ImageVector
    get() {
        if (_invision != null) {
            return _invision!!
        }
        _invision = Builder(name = "Invision", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.825f, 0.0f)
                lineTo(2.175f, 0.0f)
                curveTo(0.975f, 0.0f, 0.0f, 0.975f, 0.0f, 2.175f)
                verticalLineToRelative(19.65f)
                curveTo(0.0f, 23.025f, 0.975f, 24.0f, 2.175f, 24.0f)
                horizontalLineToRelative(19.65f)
                curveToRelative(1.2f, 0.0f, 2.175f, -0.975f, 2.175f, -2.175f)
                lineTo(24.0f, 2.175f)
                curveTo(24.0f, 0.975f, 23.025f, 0.0f, 21.825f, 0.0f)
                close()
                moveTo(8.02f, 4.667f)
                curveToRelative(0.798f, 0.0f, 1.468f, 0.63f, 1.468f, 1.44f)
                curveToRelative(0.0f, 0.82f, -0.67f, 1.444f, -1.468f, 1.444f)
                verticalLineToRelative(0.027f)
                curveToRelative(-0.803f, 0.0f, -1.454f, -0.65f, -1.454f, -1.455f)
                reflectiveCurveToRelative(0.65f, -1.455f, 1.455f, -1.455f)
                close()
                moveTo(17.836f, 18.482f)
                curveToRelative(-1.484f, 0.0f, -2.204f, -0.885f, -2.204f, -2.09f)
                curveToRelative(0.0f, -0.346f, 0.044f, -0.713f, 0.15f, -1.08f)
                lineToRelative(0.71f, -2.545f)
                curveToRelative(0.088f, -0.28f, 0.11f, -0.54f, 0.11f, -0.775f)
                curveToRelative(0.0f, -0.82f, -0.5f, -1.315f, -1.296f, -1.315f)
                curveToRelative(-1.013f, 0.0f, -1.68f, 0.727f, -2.025f, 2.13f)
                lineToRelative(-1.38f, 5.535f)
                lineTo(9.487f, 18.342f)
                lineToRelative(0.432f, -1.74f)
                curveToRelative(-0.708f, 1.166f, -1.695f, 1.885f, -2.91f, 1.885f)
                curveToRelative(-1.467f, 0.0f, -2.157f, -0.842f, -2.157f, -2.113f)
                curveToRelative(0.004f, -0.365f, 0.047f, -0.73f, 0.13f, -1.085f)
                verticalLineToRelative(0.002f)
                lineToRelative(1.1f, -4.49f)
                lineTo(4.375f, 10.801f)
                lineToRelative(0.518f, -1.905f)
                horizontalLineToRelative(4.1f)
                lineToRelative(-1.62f, 6.405f)
                curveToRelative(-0.105f, 0.41f, -0.15f, 0.75f, -0.15f, 0.986f)
                curveToRelative(0.0f, 0.41f, 0.202f, 0.53f, 0.517f, 0.604f)
                curveToRelative(0.195f, 0.04f, 1.725f, 0.012f, 2.56f, -1.84f)
                lineToRelative(1.06f, -4.25f)
                lineTo(9.637f, 10.801f)
                lineToRelative(0.52f, -1.875f)
                horizontalLineToRelative(3.72f)
                lineToRelative(-0.48f, 2.16f)
                curveToRelative(0.647f, -1.2f, 1.937f, -2.355f, 3.212f, -2.355f)
                curveToRelative(1.35f, 0.0f, 2.475f, 0.975f, 2.475f, 2.82f)
                curveToRelative(0.0f, 0.534f, -0.08f, 1.065f, -0.24f, 1.575f)
                lineToRelative(-0.69f, 2.476f)
                curveToRelative(-0.06f, 0.254f, -0.104f, 0.465f, -0.104f, 0.66f)
                curveToRelative(0.0f, 0.434f, 0.18f, 0.645f, 0.494f, 0.645f)
                reflectiveCurveToRelative(0.735f, -0.24f, 1.2f, -1.56f)
                lineToRelative(0.943f, 0.36f)
                curveToRelative(-0.555f, 1.964f, -1.576f, 2.774f, -2.85f, 2.774f)
                close()
            }
        }
        .build()
        return _invision!!
    }

private var _invision: ImageVector? = null
