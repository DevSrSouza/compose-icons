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

public val SimpleIcons.Xdotorg: ImageVector
    get() {
        if (_xdotorg != null) {
            return _xdotorg!!
        }
        _xdotorg = Builder(name = "Xdotorg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.94f, 1.9f)
                lineToRelative(-9.092f, 11.874f)
                lineToRelative(4.598f, 6.392f)
                arcToRelative(14.29f, 14.29f, 0.0f, false, true, -2.56f, 0.228f)
                curveToRelative(-2.387f, 0.0f, -4.582f, -0.577f, -6.316f, -1.542f)
                lineToRelative(6.556f, -8.627f)
                lineToRelative(-6.031f, -8.311f)
                lineTo(2.23f, 1.91f)
                lineTo(9.8f, 12.48f)
                lineToRelative(-4.332f, 5.66f)
                curveToRelative(-1.692f, -1.266f, -2.729f, -2.965f, -2.729f, -4.832f)
                curveToRelative(0.0f, -2.13f, 1.348f, -4.042f, 3.48f, -5.342f)
                lineToRelative(-0.655f, -0.999f)
                curveTo(2.22f, 8.386f, 0.0f, 10.876f, 0.0f, 13.71f)
                curveToRelative(0.0f, 2.432f, 1.635f, 4.61f, 4.212f, 6.075f)
                lineToRelative(-1.765f, 2.307f)
                horizontalLineToRelative(1.661f)
                lineToRelative(1.299f, -1.709f)
                curveToRelative(1.892f, 0.83f, 4.158f, 1.314f, 6.592f, 1.314f)
                arcToRelative(17.43f, 17.43f, 0.0f, false, false, 4.188f, -0.501f)
                lineToRelative(0.65f, 0.903f)
                horizontalLineToRelative(4.865f)
                lineToRelative(-1.729f, -2.422f)
                curveTo(22.443f, 18.214f, 24.0f, 16.082f, 24.0f, 13.71f)
                curveToRelative(0.0f, -2.94f, -2.39f, -5.512f, -5.948f, -6.9f)
                lineToRelative(-0.217f, 0.311f)
                curveToRelative(3.099f, 1.214f, 5.195f, 3.531f, 5.195f, 6.188f)
                curveToRelative(0.0f, 2.202f, -1.44f, 4.17f, -3.698f, 5.47f)
                lineToRelative(-5.153f, -7.22f)
                lineToRelative(7.382f, -9.658f)
                close()
                moveTo(12.0f, 5.755f)
                curveToRelative(-0.586f, 0.0f, -1.212f, 0.046f, -1.775f, 0.1f)
                curveToRelative(1.004f, 1.309f, 1.836f, 2.417f, 2.795f, 3.676f)
                curveToRelative(-0.538f, -1.157f, -1.644f, -2.268f, -1.261f, -2.839f)
                curveToRelative(0.378f, -0.565f, 1.075f, -0.47f, 1.128f, -0.47f)
                curveToRelative(1.118f, 0.0f, 2.194f, 0.127f, 3.2f, 0.36f)
                lineToRelative(0.235f, -0.324f)
                curveTo(14.98f, 5.91f, 13.523f, 5.754f, 12.0f, 5.754f)
                close()
            }
        }
        .build()
        return _xdotorg!!
    }

private var _xdotorg: ImageVector? = null
