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

public val RemixIcons.CarWashingFill: ImageVector
    get() {
        if (_carWashingFill != null) {
            return _carWashingFill!!
        }
        _carWashingFill = Builder(name = "CarWashingFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                lineToRelative(2.417f, -4.029f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.132f, 8.0f)
                horizontalLineToRelative(11.736f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.715f, 0.971f)
                lineTo(22.0f, 13.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(4.332f, 13.0f)
                horizontalLineToRelative(15.336f)
                lineToRelative(-1.8f, -3.0f)
                lineTo(6.132f, 10.0f)
                lineToRelative(-1.8f, 3.0f)
                close()
                moveTo(6.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(17.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(5.44f, 3.44f)
                lineTo(6.5f, 2.378f)
                lineToRelative(1.06f, 1.06f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.121f, 0.0f)
                close()
                moveTo(10.94f, 3.44f)
                lineTo(12.0f, 2.378f)
                lineToRelative(1.06f, 1.06f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.121f, 0.0f)
                close()
                moveTo(16.44f, 3.44f)
                lineToRelative(1.06f, -1.061f)
                lineToRelative(1.06f, 1.06f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.121f, 0.0f)
                close()
            }
        }
        .build()
        return _carWashingFill!!
    }

private var _carWashingFill: ImageVector? = null
