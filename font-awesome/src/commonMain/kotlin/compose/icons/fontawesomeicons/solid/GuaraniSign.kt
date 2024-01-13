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

public val SolidGroup.GuaraniSign: ImageVector
    get() {
        if (_guaraniSign != null) {
            return _guaraniSign!!
        }
        _guaraniSign = Builder(name = "GuaraniSign", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineTo(66.7f)
                curveTo(69.2f, 81.9f, 0.0f, 160.9f, 0.0f, 256.0f)
                reflectiveCurveToRelative(69.2f, 174.1f, 160.0f, 189.3f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(445.3f)
                curveToRelative(90.8f, -15.2f, 160.0f, -94.2f, 160.0f, -189.3f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(224.0f)
                verticalLineTo(132.0f)
                curveToRelative(22.1f, 5.7f, 41.8f, 17.1f, 57.6f, 32.6f)
                curveToRelative(12.6f, 12.4f, 32.9f, 12.2f, 45.3f, -0.4f)
                reflectiveCurveToRelative(12.2f, -32.9f, -0.5f, -45.3f)
                curveTo(299.0f, 92.0f, 263.5f, 73.3f, 224.0f, 66.7f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(160.0f, 132.0f)
                verticalLineTo(380.0f)
                curveToRelative(-55.2f, -14.2f, -96.0f, -64.3f, -96.0f, -124.0f)
                reflectiveCurveToRelative(40.8f, -109.8f, 96.0f, -124.0f)
                close()
                moveTo(224.0f, 380.0f)
                verticalLineTo(288.0f)
                horizontalLineToRelative(92.0f)
                curveToRelative(-11.6f, 45.0f, -47.0f, 80.4f, -92.0f, 92.0f)
                close()
            }
        }
        .build()
        return _guaraniSign!!
    }

private var _guaraniSign: ImageVector? = null
