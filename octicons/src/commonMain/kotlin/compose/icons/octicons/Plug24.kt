package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Plug24: ImageVector
    get() {
        if (_plug24 != null) {
            return _plug24!!
        }
        _plug24 = Builder(name = "Plug24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.5f)
                lineTo(2.938f, 11.5f)
                curveToRelative(-0.794f, 0.0f, -1.438f, 0.644f, -1.438f, 1.437f)
                verticalLineToRelative(8.313f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-8.312f)
                arcTo(2.939f, 2.939f, 0.0f, false, true, 2.937f, 10.0f)
                lineTo(7.0f, 10.0f)
                lineTo(7.0f, 6.151f)
                curveToRelative(0.0f, -0.897f, 0.678f, -1.648f, 1.57f, -1.74f)
                lineToRelative(6.055f, -0.626f)
                lineToRelative(1.006f, -1.174f)
                arcTo(1.752f, 1.752f, 0.0f, false, true, 16.96f, 2.0f)
                horizontalLineToRelative(1.29f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                lineTo(20.0f, 6.0f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(20.0f, 7.5f)
                lineTo(20.0f, 14.0f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(20.0f, 15.5f)
                verticalLineToRelative(2.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, 1.75f)
                horizontalLineToRelative(-1.29f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.329f, -0.611f)
                lineToRelative(-1.006f, -1.174f)
                lineToRelative(-6.055f, -0.627f)
                arcTo(1.749f, 1.749f, 0.0f, false, true, 7.0f, 15.348f)
                close()
                moveTo(16.77f, 3.587f)
                verticalLineToRelative(0.001f)
                lineToRelative(-1.201f, 1.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.492f, 0.258f)
                lineToRelative(-6.353f, 0.657f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.224f, 0.249f)
                verticalLineToRelative(9.196f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.224f, 0.249f)
                lineToRelative(6.353f, 0.657f)
                curveToRelative(0.191f, 0.02f, 0.368f, 0.112f, 0.493f, 0.258f)
                lineToRelative(1.2f, 1.401f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, false, 0.19f, 0.087f)
                horizontalLineToRelative(1.29f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-14.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-1.29f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, false, -0.19f, 0.087f)
                close()
            }
        }
        .build()
        return _plug24!!
    }

private var _plug24: ImageVector? = null
