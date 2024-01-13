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

public val SolidGroup.HandHolding: ImageVector
    get() {
        if (_handHolding != null) {
            return _handHolding!!
        }
        _handHolding = Builder(name = "HandHolding", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(559.7f, 392.2f)
                curveToRelative(17.8f, -13.1f, 21.6f, -38.1f, 8.5f, -55.9f)
                reflectiveCurveToRelative(-38.1f, -21.6f, -55.9f, -8.5f)
                lineTo(392.6f, 416.0f)
                lineTo(272.0f, 416.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(288.0f, 320.0f)
                lineTo(272.0f, 320.0f)
                lineTo(193.7f, 320.0f)
                curveToRelative(-29.1f, 0.0f, -57.3f, 9.9f, -80.0f, 28.0f)
                lineTo(68.8f, 384.0f)
                lineTo(32.0f, 384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(192.0f, 512.0f)
                lineTo(352.5f, 512.0f)
                curveToRelative(29.0f, 0.0f, 57.3f, -9.3f, 80.7f, -26.5f)
                lineToRelative(126.6f, -93.3f)
                close()
                moveTo(193.6f, 383.9f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.9f, 0.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.9f, -0.2f)
                close()
            }
        }
        .build()
        return _handHolding!!
    }

private var _handHolding: ImageVector? = null
