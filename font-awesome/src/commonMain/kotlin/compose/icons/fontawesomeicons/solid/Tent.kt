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

public val SolidGroup.Tent: ImageVector
    get() {
        if (_tent != null) {
            return _tent!!
        }
        _tent = Builder(name = "Tent", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(269.4f, 6.0f)
                curveTo(280.5f, -2.0f, 295.5f, -2.0f, 306.6f, 6.0f)
                lineToRelative(224.0f, 160.0f)
                curveToRelative(7.4f, 5.3f, 12.2f, 13.5f, 13.2f, 22.5f)
                lineToRelative(32.0f, 288.0f)
                curveToRelative(1.0f, 9.0f, -1.9f, 18.1f, -8.0f, 24.9f)
                reflectiveCurveToRelative(-14.7f, 10.7f, -23.8f, 10.7f)
                horizontalLineTo(464.0f)
                horizontalLineTo(435.8f)
                curveToRelative(-12.1f, 0.0f, -23.2f, -6.8f, -28.6f, -17.7f)
                lineTo(306.7f, 293.5f)
                curveToRelative(-1.7f, -3.4f, -5.1f, -5.5f, -8.8f, -5.5f)
                curveToRelative(-5.5f, 0.0f, -9.9f, 4.4f, -9.9f, 9.9f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(240.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-9.1f, 0.0f, -17.8f, -3.9f, -23.8f, -10.7f)
                reflectiveCurveToRelative(-9.0f, -15.8f, -8.0f, -24.9f)
                lineToRelative(32.0f, -288.0f)
                curveToRelative(1.0f, -9.0f, 5.8f, -17.2f, 13.2f, -22.5f)
                lineTo(269.4f, 6.0f)
                close()
            }
        }
        .build()
        return _tent!!
    }

private var _tent: ImageVector? = null
