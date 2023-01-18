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

public val RemixIcons.ShipLine: ImageVector
    get() {
        if (_shipLine != null) {
            return _shipLine!!
        }
        _shipLine = Builder(name = "ShipLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.4f)
                lineTo(4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                lineTo(10.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(6.4f)
                lineToRelative(1.086f, 0.326f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.682f, 1.2f)
                lineToRelative(-1.516f, 6.068f)
                arcToRelative(4.992f, 4.992f, 0.0f, false, true, -1.902f, -0.272f)
                lineToRelative(1.25f, -5.352f)
                lineTo(12.0f, 10.0f)
                lineToRelative(-7.6f, 2.37f)
                lineToRelative(1.25f, 5.351f)
                arcToRelative(4.992f, 4.992f, 0.0f, false, true, -1.902f, 0.273f)
                lineToRelative(-1.516f, -6.068f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.682f, -1.2f)
                lineTo(4.0f, 10.4f)
                close()
                moveTo(6.0f, 9.8f)
                lineTo(12.0f, 8.0f)
                lineToRelative(6.0f, 1.8f)
                lineTo(18.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                verticalLineToRelative(4.8f)
                close()
                moveTo(4.0f, 20.0f)
                arcToRelative(5.978f, 5.978f, 0.0f, false, false, 4.0f, -1.528f)
                arcTo(5.978f, 5.978f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(5.978f, 5.978f, 0.0f, false, false, 4.0f, -1.528f)
                arcTo(5.978f, 5.978f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(7.963f, 7.963f, 0.0f, false, true, -4.0f, -1.07f)
                arcTo(7.963f, 7.963f, 0.0f, false, true, 12.0f, 22.0f)
                arcToRelative(7.963f, 7.963f, 0.0f, false, true, -4.0f, -1.07f)
                arcTo(7.963f, 7.963f, 0.0f, false, true, 4.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _shipLine!!
    }

private var _shipLine: ImageVector? = null
