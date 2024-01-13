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

public val SolidGroup.Dolly: ImageVector
    get() {
        if (_dolly != null) {
            return _dolly!!
        }
        _dolly = Builder(name = "Dolly", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                curveTo(0.0f, 14.3f, 14.3f, 0.0f, 32.0f, 0.0f)
                horizontalLineToRelative(72.9f)
                curveToRelative(27.5f, 0.0f, 52.0f, 17.6f, 60.7f, 43.8f)
                lineTo(257.7f, 320.0f)
                curveToRelative(30.1f, 0.5f, 56.8f, 14.9f, 74.0f, 37.0f)
                lineToRelative(202.1f, -67.4f)
                curveToRelative(16.8f, -5.6f, 34.9f, 3.5f, 40.5f, 20.2f)
                reflectiveCurveToRelative(-3.5f, 34.9f, -20.2f, 40.5f)
                lineTo(352.0f, 417.7f)
                curveToRelative(-0.9f, 52.2f, -43.5f, 94.3f, -96.0f, 94.3f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                curveToRelative(0.0f, -30.8f, 14.5f, -58.2f, 37.0f, -75.8f)
                lineTo(104.9f, 64.0f)
                horizontalLineTo(32.0f)
                curveTo(14.3f, 64.0f, 0.0f, 49.7f, 0.0f, 32.0f)
                close()
                moveTo(244.8f, 134.5f)
                curveToRelative(-5.5f, -16.8f, 3.7f, -34.9f, 20.5f, -40.3f)
                lineTo(311.0f, 79.4f)
                lineToRelative(19.8f, 60.9f)
                lineToRelative(60.9f, -19.8f)
                lineTo(371.8f, 59.6f)
                lineToRelative(45.7f, -14.8f)
                curveToRelative(16.8f, -5.5f, 34.9f, 3.7f, 40.3f, 20.5f)
                lineToRelative(49.4f, 152.2f)
                curveToRelative(5.5f, 16.8f, -3.7f, 34.9f, -20.5f, 40.3f)
                lineTo(334.5f, 307.2f)
                curveToRelative(-16.8f, 5.5f, -34.9f, -3.7f, -40.3f, -20.5f)
                lineTo(244.8f, 134.5f)
                close()
            }
        }
        .build()
        return _dolly!!
    }

private var _dolly: ImageVector? = null
