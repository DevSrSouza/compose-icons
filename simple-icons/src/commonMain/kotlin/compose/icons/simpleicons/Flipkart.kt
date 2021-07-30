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

public val SimpleIcons.Flipkart: ImageVector
    get() {
        if (_flipkart != null) {
            return _flipkart!!
        }
        _flipkart = Builder(name = "Flipkart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.833f, 1.333f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, false, -0.333f, 0.061f)
                lineTo(3.5f, 1.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.667f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(0.333f)
                lineTo(3.833f, 1.333f)
                close()
                moveTo(21.167f, 3.667f)
                lineTo(2.833f, 3.667f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                lineTo(1.833f, 23.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(7.3f)
                lineToRelative(1.098f, -5.645f)
                horizontalLineToRelative(-2.24f)
                curveToRelative(-0.051f, 0.0f, -5.158f, -0.241f, -5.158f, -0.241f)
                lineToRelative(4.639f, -0.327f)
                lineToRelative(-0.078f, -0.366f)
                lineToRelative(-1.978f, -0.285f)
                lineToRelative(1.882f, -0.158f)
                lineToRelative(-0.124f, -0.449f)
                lineToRelative(-3.075f, -0.467f)
                reflectiveCurveToRelative(3.341f, -0.373f, 3.392f, -0.373f)
                horizontalLineToRelative(3.232f)
                lineToRelative(0.247f, -1.331f)
                curveToRelative(0.289f, -1.616f, 0.945f, -2.807f, 1.973f, -3.693f)
                curveToRelative(1.033f, -0.892f, 2.344f, -1.332f, 3.937f, -1.332f)
                curveToRelative(0.643f, 0.0f, 1.053f, 0.151f, 1.231f, 0.463f)
                curveToRelative(0.118f, 0.186f, 0.201f, 0.516f, 0.279f, 0.859f)
                curveToRelative(0.074f, 0.352f, 0.14f, 0.671f, 0.095f, 0.903f)
                curveToRelative(-0.057f, 0.345f, -0.461f, 0.465f, -1.197f, 0.465f)
                horizontalLineToRelative(-0.253f)
                curveToRelative(-1.327f, 0.0f, -2.134f, 0.763f, -2.405f, 2.31f)
                lineToRelative(-0.243f, 1.355f)
                horizontalLineToRelative(1.54f)
                curveToRelative(0.574f, 0.0f, 0.781f, 0.402f, 0.622f, 1.306f)
                curveToRelative(-0.17f, 0.941f, -0.539f, 1.36f, -1.111f, 1.36f)
                lineTo(14.9f, 18.354f)
                lineTo(13.804f, 24.0f)
                horizontalLineToRelative(7.362f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                lineTo(22.166f, 4.667f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.999f, -1.0f)
                close()
                moveTo(20.5f, 2.333f)
                arcTo(0.334f, 0.334f, 0.0f, false, false, 20.167f, 2.0f)
                lineTo(3.833f, 2.0f)
                arcToRelative(0.334f, 0.334f, 0.0f, false, false, -0.333f, 0.333f)
                lineTo(3.5f, 3.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-0.667f)
                close()
            }
        }
        .build()
        return _flipkart!!
    }

private var _flipkart: ImageVector? = null
