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

public val Octicons.Plug16: ImageVector
    get() {
        if (_plug16 != null) {
            return _plug16!!
        }
        _plug16 = Builder(name = "Plug16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                lineTo(2.5f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(0.0f, 9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                lineTo(4.0f, 6.5f)
                lineTo(4.0f, 5.133f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.533f, -1.737f)
                lineToRelative(2.831f, -0.353f)
                lineToRelative(0.76f, -0.913f)
                curveToRelative(0.332f, -0.4f, 0.825f, -0.63f, 1.344f, -0.63f)
                horizontalLineToRelative(0.782f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(13.0f, 5.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(13.0f, 11.0f)
                verticalLineToRelative(0.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, 1.75f)
                horizontalLineToRelative(-0.782f)
                curveToRelative(-0.519f, 0.0f, -1.012f, -0.23f, -1.344f, -0.63f)
                lineToRelative(-0.761f, -0.912f)
                lineToRelative(-2.83f, -0.354f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 4.0f, 9.867f)
                close()
                moveTo(10.276f, 3.09f)
                lineTo(9.326f, 4.23f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, -0.483f, 0.265f)
                lineToRelative(-3.124f, 0.39f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.219f, 0.248f)
                verticalLineToRelative(4.734f)
                curveToRelative(0.0f, 0.126f, 0.094f, 0.233f, 0.219f, 0.249f)
                lineToRelative(3.124f, 0.39f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, 0.483f, 0.264f)
                lineToRelative(0.95f, 1.14f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.192f, 0.09f)
                horizontalLineToRelative(0.782f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-0.782f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.192f, 0.09f)
                close()
            }
        }
        .build()
        return _plug16!!
    }

private var _plug16: ImageVector? = null
