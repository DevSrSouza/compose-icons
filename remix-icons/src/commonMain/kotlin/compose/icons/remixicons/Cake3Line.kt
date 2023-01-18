package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Cake3Line: ImageVector
    get() {
        if (_cake3Line != null) {
            return _cake3Line!!
        }
        _cake3Line = Builder(name = "Cake3Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.437f, 4.163f)
                lineToRelative(-0.015f, 0.066f)
                arcToRelative(4.502f, 4.502f, 0.0f, false, true, 0.303f, 8.428f)
                lineToRelative(-1.086f, 6.507f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.986f, 0.836f)
                lineTo(6.847f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.986f, -0.836f)
                lineToRelative(-1.029f, -6.17f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.829f, -5.824f)
                lineTo(4.0f, 9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.574f, -5.421f)
                arcTo(3.496f, 3.496f, 0.0f, false, true, 15.5f, 2.0f)
                close()
                moveTo(9.0f, 15.0f)
                lineTo(6.86f, 15.0f)
                lineToRelative(0.834f, 5.0f)
                lineTo(9.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(13.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(17.139f, 15.0f)
                lineTo(15.0f, 15.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.305f)
                lineToRelative(0.834f, -5.0f)
                close()
                moveTo(10.0f, 5.0f)
                curveTo(7.858f, 5.0f, 6.109f, 6.684f, 6.005f, 8.767f)
                lineTo(6.0f, 8.964f)
                lineToRelative(0.003f, 0.17f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.186f, 1.863f)
                lineToRelative(-0.15f, 0.059f)
                arcTo(1.001f, 1.001f, 0.0f, false, false, 5.0f, 13.0f)
                horizontalLineToRelative(12.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -0.956f, -4.81f)
                lineToRelative(-0.175f, 0.081f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.663f, -0.804f)
                lineToRelative(-0.07f, -0.137f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 5.0f)
                close()
                moveTo(15.5f, 4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.287f, 0.729f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, 1.24f, 1.764f)
                curveToRelative(0.444f, -0.228f, 0.93f, -0.384f, 1.446f, -0.453f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 4.0f)
                close()
            }
        }
        .build()
        return _cake3Line!!
    }

private var _cake3Line: ImageVector? = null
