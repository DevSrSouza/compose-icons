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

public val SimpleIcons.Audible: ImageVector
    get() {
        if (_audible != null) {
            return _audible!!
        }
        _audible = Builder(name = "Audible", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.008f, 17.362f)
                lineTo(24.0f, 9.885f)
                verticalLineToRelative(2.028f)
                lineToRelative(-11.992f, 7.509f)
                lineTo(0.0f, 11.912f)
                lineTo(0.0f, 9.886f)
                lineToRelative(12.008f, 7.477f)
                close()
                moveTo(12.008f, 7.984f)
                curveToRelative(-2.709f, 0.0f, -5.085f, 1.363f, -6.448f, 3.47f)
                curveToRelative(0.111f, -0.111f, 0.175f, -0.175f, 0.286f, -0.254f)
                curveToRelative(3.374f, -2.804f, 8.237f, -2.17f, 10.883f, 1.362f)
                lineToRelative(1.758f, -1.124f)
                curveToRelative(-1.394f, -2.044f, -3.786f, -3.454f, -6.48f, -3.454f)
                moveToRelative(0.0f, 3.47f)
                arcToRelative(4.392f, 4.392f, 0.0f, false, false, -3.548f, 1.821f)
                arcToRelative(3.597f, 3.597f, 0.0f, false, true, 2.139f, -0.697f)
                curveToRelative(1.299f, 0.0f, 2.455f, 0.666f, 3.232f, 1.79f)
                lineToRelative(1.679f, -1.045f)
                curveToRelative(-0.729f, -1.157f, -2.028f, -1.87f, -3.501f, -1.87f)
                moveTo(3.897f, 8.412f)
                curveToRelative(4.943f, -3.897f, 11.929f, -2.836f, 15.652f, 2.344f)
                lineToRelative(0.031f, 0.032f)
                lineToRelative(1.822f, -1.125f)
                arcToRelative(11.214f, 11.214f, 0.0f, false, false, -9.394f, -5.085f)
                curveToRelative(-3.897f, 0.0f, -7.366f, 1.996f, -9.394f, 5.085f)
                curveToRelative(0.364f, -0.412f, 0.824f, -0.903f, 1.283f, -1.251f)
            }
        }
        .build()
        return _audible!!
    }

private var _audible: ImageVector? = null
