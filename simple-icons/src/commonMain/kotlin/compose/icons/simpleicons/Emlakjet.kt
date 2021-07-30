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

public val SimpleIcons.Emlakjet: ImageVector
    get() {
        if (_emlakjet != null) {
            return _emlakjet!!
        }
        _emlakjet = Builder(name = "Emlakjet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.65f, 16.105f)
                verticalLineToRelative(-0.24f)
                arcToRelative(3.543f, 3.543f, 0.0f, false, false, -1.267f, -2.471f)
                curveToRelative(-0.724f, -0.663f, -1.69f, -0.965f, -2.655f, -0.904f)
                curveToRelative(-1.87f, 0.12f, -3.378f, 1.747f, -3.378f, 3.615f)
                curveToRelative(0.0f, 0.784f, 0.12f, 1.567f, 0.422f, 2.471f)
                horizontalLineTo(4.55f)
                verticalLineTo(6.946f)
                lineToRelative(7.42f, -5.123f)
                lineToRelative(7.482f, 5.122f)
                verticalLineToRelative(11.692f)
                horizontalLineToRelative(-4.223f)
                curveToRelative(0.18f, -0.663f, 0.422f, -1.688f, 0.422f, -2.532f)
                moveToRelative(5.068f, -10.244f)
                lineTo(12.452f, 0.136f)
                curveToRelative(-0.301f, -0.181f, -0.663f, -0.181f, -0.905f, 0.0f)
                lineTo(3.222f, 5.86f)
                curveToRelative(-0.242f, 0.12f, -0.362f, 0.361f, -0.362f, 0.663f)
                verticalLineTo(19.48f)
                curveToRelative(0.0f, 0.482f, 0.362f, 0.844f, 0.844f, 0.844f)
                horizontalLineTo(9.92f)
                arcToRelative(0.824f, 0.824f, 0.0f, false, false, 0.844f, -0.844f)
                curveToRelative(0.0f, -0.06f, 0.0f, -0.18f, -0.06f, -0.24f)
                lineToRelative(-0.06f, -0.182f)
                curveToRelative(-0.302f, -0.723f, -0.664f, -1.627f, -0.664f, -2.53f)
                verticalLineToRelative(-0.182f)
                curveToRelative(-0.06f, -0.542f, 0.12f, -1.084f, 0.482f, -1.446f)
                arcToRelative(2.095f, 2.095f, 0.0f, false, true, 1.388f, -0.723f)
                curveToRelative(0.543f, -0.06f, 1.026f, 0.12f, 1.448f, 0.482f)
                curveToRelative(0.422f, 0.362f, 0.664f, 0.844f, 0.724f, 1.386f)
                verticalLineToRelative(0.18f)
                curveToRelative(0.06f, 1.206f, -0.724f, 2.954f, -0.845f, 3.135f)
                lineToRelative(-1.146f, 2.17f)
                lineToRelative(-0.18f, -0.362f)
                curveToRelative(-0.122f, -0.181f, -0.302f, -0.362f, -0.483f, -0.422f)
                curveToRelative(-0.182f, -0.06f, -0.423f, -0.06f, -0.604f, 0.06f)
                curveToRelative(-0.18f, 0.12f, -0.362f, 0.301f, -0.422f, 0.482f)
                reflectiveCurveToRelative(-0.06f, 0.422f, 0.06f, 0.603f)
                lineToRelative(0.905f, 1.687f)
                curveToRelative(0.121f, 0.241f, 0.423f, 0.422f, 0.724f, 0.422f)
                curveToRelative(0.302f, 0.0f, 0.604f, -0.18f, 0.724f, -0.422f)
                lineToRelative(1.81f, -3.375f)
                horizontalLineToRelative(5.732f)
                arcToRelative(0.824f, 0.824f, 0.0f, false, false, 0.844f, -0.843f)
                verticalLineTo(6.524f)
                curveToRelative(-0.06f, -0.302f, -0.18f, -0.543f, -0.422f, -0.663f)
            }
        }
        .build()
        return _emlakjet!!
    }

private var _emlakjet: ImageVector? = null
