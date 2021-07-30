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

public val Octicons.Plug16: ImageVector
    get() {
        if (_plug16 != null) {
            return _plug16!!
        }
        _plug16 = Builder(name = "Plug16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.276f, 3.09f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.192f, -0.09f)
                horizontalLineToRelative(0.782f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.782f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.192f, -0.09f)
                lineToRelative(-0.95f, -1.14f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.483f, -0.264f)
                lineToRelative(-3.124f, -0.39f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.219f, -0.249f)
                verticalLineTo(5.133f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.219f, -0.248f)
                lineToRelative(3.124f, -0.39f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.483f, -0.265f)
                lineToRelative(0.95f, -1.14f)
                close()
                moveTo(4.0f, 8.0f)
                verticalLineToRelative(1.867f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.533f, 1.737f)
                lineToRelative(2.83f, 0.354f)
                lineToRelative(0.761f, 0.912f)
                curveToRelative(0.332f, 0.4f, 0.825f, 0.63f, 1.344f, 0.63f)
                horizontalLineToRelative(0.782f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 13.0f, 11.75f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-0.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.75f, -1.75f)
                horizontalLineToRelative(-0.782f)
                curveToRelative(-0.519f, 0.0f, -1.012f, 0.23f, -1.344f, 0.63f)
                lineToRelative(-0.76f, 0.913f)
                lineToRelative(-2.831f, 0.353f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 4.0f, 5.133f)
                verticalLineTo(6.5f)
                horizontalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 0.0f, 9.0f)
                verticalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _plug16!!
    }

private var _plug16: ImageVector? = null
