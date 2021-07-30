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

public val SimpleIcons.Harbor: ImageVector
    get() {
        if (_harbor != null) {
            return _harbor!!
        }
        _harbor = Builder(name = "Harbor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.591f, 0.007f)
                curveTo(4.968f, 0.233f, -0.218f, 5.785f, 0.007f, 12.409f)
                curveToRelative(0.226f, 6.624f, 5.778f, 11.81f, 12.402f, 11.584f)
                curveToRelative(6.624f, -0.232f, 11.809f, -5.786f, 11.584f, -12.411f)
                curveTo(23.762f, 4.963f, 18.211f, -0.219f, 11.591f, 0.007f)
                close()
                moveTo(12.412f, 21.909f)
                arcToRelative(9.894f, 9.894f, 0.0f, false, true, -0.845f, -0.01f)
                lineToRelative(-0.043f, -1.479f)
                lineToRelative(-4.699f, -1.824f)
                lineToRelative(-0.096f, 1.776f)
                arcToRelative(9.886f, 9.886f, 0.0f, false, true, -4.589f, -7.974f)
                curveTo(1.93f, 6.935f, 6.189f, 2.336f, 11.652f, 2.126f)
                horizontalLineToRelative(0.014f)
                arcToRelative(9.857f, 9.857f, 0.0f, false, true, 5.498f, 1.431f)
                lineToRelative(-5.17f, 5.673f)
                lineToRelative(7.52f, -3.686f)
                arcToRelative(9.906f, 9.906f, 0.0f, false, true, 1.228f, 1.79f)
                lineToRelative(-8.461f, 2.787f)
                lineToRelative(9.393f, -0.323f)
                curveToRelative(0.13f, 0.567f, 0.212f, 1.151f, 0.241f, 1.752f)
                lineToRelative(-9.314f, -0.613f)
                lineToRelative(9.086f, 3.218f)
                curveToRelative(-0.948f, 4.291f, -4.68f, 7.577f, -9.275f, 7.754f)
                close()
                moveTo(6.686f, 9.038f)
                horizontalLineToRelative(0.288f)
                verticalLineToRelative(2.539f)
                lineTo(6.74f, 11.577f)
                verticalLineToRelative(0.88f)
                horizontalLineToRelative(0.408f)
                lineToRelative(-0.067f, 1.323f)
                lineToRelative(4.197f, 1.509f)
                lineToRelative(-0.127f, -2.832f)
                horizontalLineToRelative(0.415f)
                verticalLineToRelative(-0.88f)
                horizontalLineToRelative(-0.235f)
                lineTo(11.331f, 9.038f)
                horizontalLineToRelative(0.283f)
                lineTo(9.188f, 6.217f)
                lineTo(6.686f, 9.038f)
                close()
                moveTo(10.521f, 11.577f)
                horizontalLineToRelative(-0.912f)
                lineTo(9.609f, 9.966f)
                horizontalLineToRelative(-0.912f)
                verticalLineToRelative(1.611f)
                horizontalLineToRelative(-0.912f)
                lineTo(7.785f, 9.038f)
                horizontalLineToRelative(2.736f)
                verticalLineToRelative(2.539f)
                close()
                moveTo(11.321f, 16.11f)
                lineToRelative(0.032f, 0.725f)
                lineToRelative(-4.352f, -1.563f)
                lineToRelative(0.048f, -0.816f)
                lineToRelative(4.272f, 1.654f)
                close()
                moveTo(6.974f, 15.78f)
                lineToRelative(4.411f, 1.712f)
                lineToRelative(0.032f, 0.72f)
                lineToRelative(-4.485f, -1.611f)
                lineToRelative(0.042f, -0.821f)
                close()
                moveTo(11.454f, 18.868f)
                lineToRelative(0.032f, 0.715f)
                lineToRelative(-4.624f, -1.653f)
                lineToRelative(0.048f, -0.821f)
                lineToRelative(4.544f, 1.759f)
                close()
            }
        }
        .build()
        return _harbor!!
    }

private var _harbor: ImageVector? = null
