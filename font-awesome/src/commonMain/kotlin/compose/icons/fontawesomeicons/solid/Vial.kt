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
        _vial = Builder(name = "Vial", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(342.6f, 9.4f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(9.4f, 9.4f)
                lineTo(28.1f, 342.6f)
                curveTo(10.1f, 360.6f, 0.0f, 385.0f, 0.0f, 410.5f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(25.5f, 0.0f, 49.9f, -10.1f, 67.9f, -28.1f)
                lineTo(448.0f, 205.3f)
                lineToRelative(9.4f, 9.4f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(-32.0f, -32.0f)
                lineToRelative(-96.0f, -96.0f)
                lineToRelative(-32.0f, -32.0f)
                close()
                moveTo(205.3f, 256.0f)
                lineTo(352.0f, 109.3f)
                lineTo(402.7f, 160.0f)
                lineToRelative(-96.0f, 96.0f)
                horizontalLineTo(205.3f)
                close()
            }
        }
        .build()
        return _vial!!
    }

private var _vial: ImageVector? = null
