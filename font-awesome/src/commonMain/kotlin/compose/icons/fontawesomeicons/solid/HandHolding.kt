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
                moveTo(565.3f, 328.1f)
                curveToRelative(-11.8f, -10.7f, -30.2f, -10.0f, -42.6f, 0.0f)
                lineTo(430.3f, 402.0f)
                curveToRelative(-11.3f, 9.1f, -25.4f, 14.0f, -40.0f, 14.0f)
                horizontalLineTo(272.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(78.3f)
                curveToRelative(15.9f, 0.0f, 30.7f, -10.9f, 33.3f, -26.6f)
                curveToRelative(3.3f, -20.0f, -12.1f, -37.4f, -31.6f, -37.4f)
                horizontalLineTo(192.0f)
                curveToRelative(-27.0f, 0.0f, -53.1f, 9.3f, -74.1f, 26.3f)
                lineTo(71.4f, 384.0f)
                horizontalLineTo(16.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(356.8f)
                curveToRelative(14.5f, 0.0f, 28.6f, -4.9f, 40.0f, -14.0f)
                lineTo(564.0f, 377.0f)
                curveToRelative(15.2f, -12.1f, 16.4f, -35.3f, 1.3f, -48.9f)
                close()
            }
        }
        .build()
        return _handHolding!!
    }

private var _handHolding: ImageVector? = null
