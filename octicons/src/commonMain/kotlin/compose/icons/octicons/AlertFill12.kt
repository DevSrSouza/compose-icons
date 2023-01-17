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

public val Octicons.AlertFill12: ImageVector
    get() {
        if (_alertFill12 != null) {
            return _alertFill12!!
        }
        _alertFill12 = Builder(name = "AlertFill12", defaultWidth = 12.0.dp, defaultHeight =
                12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.855f, 0.708f)
                curveToRelative(0.5f, -0.896f, 1.79f, -0.896f, 2.29f, 0.0f)
                lineToRelative(4.675f, 8.351f)
                arcToRelative(1.312f, 1.312f, 0.0f, false, true, -1.146f, 1.954f)
                lineTo(1.33f, 11.013f)
                arcTo(1.313f, 1.313f, 0.0f, false, true, 0.183f, 9.058f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(7.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(6.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _alertFill12!!
    }

private var _alertFill12: ImageVector? = null
