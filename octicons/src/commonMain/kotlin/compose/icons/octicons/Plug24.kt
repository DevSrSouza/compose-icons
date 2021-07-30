package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 11.5f)
                verticalLineToRelative(3.848f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.57f, 1.74f)
                lineToRelative(6.055f, 0.627f)
                lineToRelative(1.006f, 1.174f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.329f, 0.611f)
                horizontalLineToRelative(1.29f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 20.0f, 17.75f)
                lineTo(20.0f, 15.5f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(20.0f, 14.0f)
                lineTo(20.0f, 7.5f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(20.0f, 6.0f)
                lineTo(20.0f, 3.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 18.25f, 2.0f)
                horizontalLineToRelative(-1.29f)
                curveToRelative(-0.51f, 0.0f, -0.996f, 0.223f, -1.329f, 0.611f)
                lineToRelative(-1.006f, 1.174f)
                lineToRelative(-6.055f, 0.626f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 7.0f, 6.151f)
                lineTo(7.0f, 10.0f)
                lineTo(2.937f, 10.0f)
                arcTo(2.938f, 2.938f, 0.0f, false, false, 0.0f, 12.938f)
                verticalLineToRelative(8.312f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-8.313f)
                curveToRelative(0.0f, -0.793f, 0.644f, -1.437f, 1.438f, -1.437f)
                lineTo(7.0f, 11.5f)
                close()
                moveTo(16.77f, 3.587f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.19f, -0.087f)
                horizontalLineToRelative(1.29f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(14.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-1.29f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.19f, -0.087f)
                lineToRelative(-1.2f, -1.401f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.493f, -0.258f)
                lineToRelative(-6.353f, -0.657f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.224f, -0.249f)
                lineTo(8.5f, 6.152f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.224f, -0.249f)
                lineToRelative(6.353f, -0.657f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.492f, -0.258f)
                lineToRelative(1.201f, -1.4f)
                close()
            }
        }
        .build()
        return _plug24!!
    }

private var _plug24: ImageVector? = null
