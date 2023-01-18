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

public val RemixIcons.Cake3Fill: ImageVector
    get() {
        if (_cake3Fill != null) {
            return _cake3Fill!!
        }
        _cake3Fill = Builder(name = "Cake3Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.575f, -5.42f)
                arcTo(3.493f, 3.493f, 0.0f, false, true, 15.5f, 2.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(15.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(17.5f, 13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -0.956f, -4.81f)
                lineToRelative(-0.175f, 0.081f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.663f, -0.804f)
                lineToRelative(-0.07f, -0.137f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 5.0f)
                curveTo(7.858f, 5.0f, 6.109f, 6.684f, 6.005f, 8.767f)
                lineTo(6.0f, 8.964f)
                lineToRelative(0.003f, 0.17f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.186f, 1.863f)
                lineToRelative(-0.15f, 0.059f)
                arcTo(1.001f, 1.001f, 0.0f, false, false, 5.0f, 13.0f)
                horizontalLineToRelative(12.5f)
                close()
            }
        }
        .build()
        return _cake3Fill!!
    }

private var _cake3Fill: ImageVector? = null
