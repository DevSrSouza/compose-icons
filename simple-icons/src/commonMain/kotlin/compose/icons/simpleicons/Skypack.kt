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

public val SimpleIcons.Skypack: ImageVector
    get() {
        if (_skypack != null) {
            return _skypack!!
        }
        _skypack = Builder(name = "Skypack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.82f, 11.27f)
                lineToRelative(-5.997f, -2.994f)
                lineToRelative(5.999f, -2.993f)
                curveToRelative(0.28f, -0.14f, 0.453f, -0.42f, 0.453f, -0.734f)
                arcToRelative(0.815f, 0.815f, 0.0f, false, false, -0.454f, -0.735f)
                lineTo(12.366f, 0.087f)
                arcToRelative(0.814f, 0.814f, 0.0f, false, false, -0.733f, 0.0f)
                lineTo(4.178f, 3.814f)
                arcToRelative(0.815f, 0.815f, 0.0f, false, false, -0.453f, 0.735f)
                verticalLineToRelative(7.454f)
                curveToRelative(0.0f, 0.28f, 0.15f, 0.548f, 0.384f, 0.699f)
                lineToRelative(0.07f, 0.034f)
                lineToRelative(5.998f, 2.994f)
                lineToRelative(-5.999f, 2.993f)
                arcToRelative(0.815f, 0.815f, 0.0f, false, false, -0.453f, 0.734f)
                curveToRelative(0.0f, 0.314f, 0.174f, 0.594f, 0.453f, 0.735f)
                lineToRelative(7.455f, 3.727f)
                arcToRelative(0.814f, 0.814f, 0.0f, false, false, 0.361f, 0.081f)
                arcToRelative(0.814f, 0.814f, 0.0f, false, false, 0.361f, -0.081f)
                lineToRelative(7.454f, -3.727f)
                curveToRelative(0.28f, -0.14f, 0.455f, -0.42f, 0.455f, -0.735f)
                verticalLineToRelative(-7.454f)
                arcToRelative(0.785f, 0.785f, 0.0f, false, false, -0.443f, -0.733f)
                close()
                moveTo(12.006f, 1.73f)
                lineTo(17.631f, 4.549f)
                lineTo(12.006f, 7.367f)
                lineTo(6.38f, 4.55f)
                close()
                moveTo(5.366f, 5.865f)
                lineTo(10.177f, 8.275f)
                lineTo(5.367f, 10.687f)
                close()
                moveTo(6.38f, 12.003f)
                lineTo(12.006f, 9.184f)
                lineTo(17.631f, 12.004f)
                lineTo(12.006f, 14.822f)
                close()
                moveTo(11.19f, 17.047f)
                verticalLineToRelative(4.81f)
                lineToRelative(-4.81f, -2.41f)
                close()
                moveTo(18.645f, 18.957f)
                lineTo(12.821f, 21.868f)
                verticalLineToRelative(-5.625f)
                lineToRelative(5.824f, -2.912f)
                verticalLineToRelative(5.625f)
                close()
            }
        }
        .build()
        return _skypack!!
    }

private var _skypack: ImageVector? = null
