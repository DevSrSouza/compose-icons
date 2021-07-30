package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Vial: ImageVector
    get() {
        if (_vial != null) {
            return _vial!!
        }
        _vial = Builder(name = "Vial", defaultWidth = 480.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 480.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(477.7f, 186.1f)
                lineTo(309.5f, 18.3f)
                curveToRelative(-3.1f, -3.1f, -8.2f, -3.1f, -11.3f, 0.0f)
                lineToRelative(-34.0f, 33.9f)
                curveToRelative(-3.1f, 3.1f, -3.1f, 8.2f, 0.0f, 11.3f)
                lineToRelative(11.2f, 11.1f)
                lineTo(33.0f, 316.5f)
                curveToRelative(-38.8f, 38.7f, -45.1f, 102.0f, -9.4f, 143.5f)
                curveToRelative(20.6f, 24.0f, 49.5f, 36.0f, 78.4f, 35.9f)
                curveToRelative(26.4f, 0.0f, 52.8f, -10.0f, 72.9f, -30.1f)
                lineToRelative(246.3f, -245.7f)
                lineToRelative(11.2f, 11.1f)
                curveToRelative(3.1f, 3.1f, 8.2f, 3.1f, 11.3f, 0.0f)
                lineToRelative(34.0f, -33.9f)
                curveToRelative(3.1f, -3.0f, 3.1f, -8.1f, 0.0f, -11.2f)
                close()
                moveTo(318.0f, 256.0f)
                horizontalLineTo(161.0f)
                lineToRelative(148.0f, -147.7f)
                lineToRelative(78.5f, 78.3f)
                lineTo(318.0f, 256.0f)
                close()
            }
        }
        .build()
        return _vial!!
    }

private var _vial: ImageVector? = null
