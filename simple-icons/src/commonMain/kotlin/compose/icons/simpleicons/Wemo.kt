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

public val SimpleIcons.Wemo: ImageVector
    get() {
        if (_wemo != null) {
            return _wemo!!
        }
        _wemo = Builder(name = "Wemo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.301f, 0.0f)
                curveTo(1.925f, 0.0f, 0.0f, 1.925f, 0.0f, 4.302f)
                verticalLineToRelative(15.396f)
                curveTo(0.0f, 22.073f, 1.925f, 24.0f, 4.301f, 24.0f)
                lineTo(19.697f, 24.0f)
                curveToRelative(2.376f, 0.0f, 4.303f, -1.927f, 4.303f, -4.301f)
                lineTo(24.0f, 19.698f)
                lineTo(24.0f, 4.302f)
                curveTo(24.0f, 1.926f, 22.073f, 0.0f, 19.697f, 0.0f)
                close()
                moveTo(17.213f, 4.167f)
                curveToRelative(2.088f, 0.0f, 3.789f, 1.621f, 3.789f, 3.613f)
                curveToRelative(0.0f, 0.095f, -0.004f, 0.188f, -0.011f, 0.28f)
                lineToRelative(-0.016f, 0.176f)
                lineTo(14.651f, 8.235f)
                lineToRelative(0.114f, 0.324f)
                curveToRelative(0.354f, 0.994f, 1.337f, 1.663f, 2.448f, 1.663f)
                curveToRelative(0.829f, 0.0f, 1.614f, -0.383f, 2.099f, -1.024f)
                lineToRelative(0.109f, -0.146f)
                lineToRelative(0.99f, 0.674f)
                lineToRelative(-0.12f, 0.16f)
                curveToRelative(-0.711f, 0.943f, -1.862f, 1.505f, -3.078f, 1.505f)
                curveToRelative(-2.091f, 0.0f, -3.791f, -1.621f, -3.791f, -3.613f)
                curveToRelative(0.0f, -1.992f, 1.701f, -3.613f, 3.791f, -3.613f)
                close()
                moveTo(3.276f, 4.299f)
                horizontalLineToRelative(1.209f)
                lineTo(4.485f, 8.729f)
                curveToRelative(0.0f, 0.73f, 0.593f, 1.324f, 1.324f, 1.324f)
                curveToRelative(0.73f, 0.0f, 1.324f, -0.593f, 1.324f, -1.324f)
                lineTo(7.134f, 4.299f)
                horizontalLineToRelative(1.207f)
                verticalLineToRelative(4.43f)
                curveToRelative(0.0f, 0.73f, 0.594f, 1.324f, 1.325f, 1.324f)
                curveToRelative(0.73f, 0.0f, 1.324f, -0.593f, 1.324f, -1.324f)
                lineTo(10.989f, 4.299f)
                horizontalLineToRelative(1.209f)
                verticalLineToRelative(4.43f)
                curveToRelative(0.0f, 1.396f, -1.136f, 2.532f, -2.533f, 2.532f)
                curveToRelative(-0.648f, 0.0f, -1.289f, -0.26f, -1.76f, -0.714f)
                lineToRelative(-0.168f, -0.162f)
                lineToRelative(-0.168f, 0.162f)
                curveToRelative(-0.471f, 0.454f, -1.112f, 0.714f, -1.759f, 0.714f)
                curveToRelative(-1.397f, 0.0f, -2.533f, -1.135f, -2.533f, -2.532f)
                close()
                moveTo(17.213f, 5.323f)
                curveToRelative(-0.987f, 0.0f, -1.882f, 0.517f, -2.336f, 1.348f)
                lineToRelative(-0.195f, 0.359f)
                horizontalLineToRelative(5.059f)
                lineToRelative(-0.195f, -0.359f)
                curveToRelative(-0.454f, -0.831f, -1.348f, -1.348f, -2.333f, -1.348f)
                close()
                moveTo(17.212f, 12.556f)
                curveToRelative(2.089f, 0.0f, 3.789f, 1.622f, 3.789f, 3.614f)
                curveToRelative(0.0f, 1.993f, -1.7f, 3.614f, -3.789f, 3.614f)
                curveToRelative(-2.09f, 0.0f, -3.789f, -1.621f, -3.789f, -3.614f)
                curveToRelative(0.0f, -1.992f, 1.699f, -3.614f, 3.789f, -3.614f)
                close()
                moveTo(5.809f, 12.689f)
                curveToRelative(0.648f, 0.0f, 1.291f, 0.26f, 1.762f, 0.713f)
                lineToRelative(0.167f, 0.162f)
                lineToRelative(0.169f, -0.162f)
                curveToRelative(0.472f, -0.454f, 1.112f, -0.713f, 1.759f, -0.713f)
                curveToRelative(1.396f, 0.0f, 2.532f, 1.136f, 2.532f, 2.532f)
                verticalLineToRelative(4.43f)
                horizontalLineToRelative(-1.208f)
                verticalLineToRelative(-4.43f)
                curveToRelative(0.0f, -0.73f, -0.595f, -1.325f, -1.324f, -1.325f)
                curveToRelative(-0.731f, 0.0f, -1.324f, 0.595f, -1.324f, 1.325f)
                verticalLineToRelative(4.43f)
                lineTo(7.134f, 19.651f)
                verticalLineToRelative(-4.43f)
                curveToRelative(0.0f, -0.73f, -0.593f, -1.325f, -1.325f, -1.325f)
                curveToRelative(-0.729f, 0.0f, -1.323f, 0.595f, -1.323f, 1.325f)
                verticalLineToRelative(4.43f)
                horizontalLineToRelative(-1.209f)
                verticalLineToRelative(-4.43f)
                curveToRelative(0.0f, -1.395f, 1.137f, -2.532f, 2.532f, -2.532f)
                close()
                moveTo(17.212f, 13.727f)
                curveToRelative(-1.422f, 0.0f, -2.579f, 1.096f, -2.579f, 2.443f)
                curveToRelative(0.0f, 1.347f, 1.157f, 2.442f, 2.579f, 2.442f)
                curveToRelative(1.422f, 0.0f, 2.578f, -1.096f, 2.578f, -2.442f)
                curveToRelative(0.0f, -1.347f, -1.156f, -2.443f, -2.578f, -2.443f)
                close()
            }
        }
        .build()
        return _wemo!!
    }

private var _wemo: ImageVector? = null
