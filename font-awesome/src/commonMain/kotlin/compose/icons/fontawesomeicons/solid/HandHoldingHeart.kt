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

public val SolidGroup.HandHoldingHeart: ImageVector
    get() {
        if (_handHoldingHeart != null) {
            return _handHoldingHeart!!
        }
        _handHoldingHeart = Builder(name = "HandHoldingHeart", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(163.9f, 136.9f)
                curveToRelative(-29.4f, -29.8f, -29.4f, -78.2f, 0.0f, -108.0f)
                reflectiveCurveToRelative(77.0f, -29.8f, 106.4f, 0.0f)
                lineToRelative(17.7f, 18.0f)
                lineToRelative(17.7f, -18.0f)
                curveToRelative(29.4f, -29.8f, 77.0f, -29.8f, 106.4f, 0.0f)
                reflectiveCurveToRelative(29.4f, 78.2f, 0.0f, 108.0f)
                lineTo(310.5f, 240.1f)
                curveToRelative(-6.2f, 6.3f, -14.3f, 9.4f, -22.5f, 9.4f)
                reflectiveCurveToRelative(-16.3f, -3.1f, -22.5f, -9.4f)
                lineTo(163.9f, 136.9f)
                close()
                moveTo(568.2f, 336.3f)
                curveToRelative(13.1f, 17.8f, 9.3f, 42.8f, -8.5f, 55.9f)
                lineTo(433.1f, 485.5f)
                curveToRelative(-23.4f, 17.2f, -51.6f, 26.5f, -80.7f, 26.5f)
                horizontalLineTo(192.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(68.8f)
                lineToRelative(44.9f, -36.0f)
                curveToRelative(22.7f, -18.2f, 50.9f, -28.0f, 80.0f, -28.0f)
                horizontalLineTo(272.0f)
                horizontalLineToRelative(16.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(288.0f)
                horizontalLineTo(272.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineTo(392.6f)
                lineToRelative(119.7f, -88.2f)
                curveToRelative(17.8f, -13.1f, 42.8f, -9.3f, 55.9f, 8.5f)
                close()
                moveTo(193.6f, 384.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-0.9f, 0.0f)
                curveToRelative(0.3f, 0.0f, 0.6f, 0.0f, 0.9f, 0.0f)
                close()
            }
        }
        .build()
        return _handHoldingHeart!!
    }

private var _handHoldingHeart: ImageVector? = null
