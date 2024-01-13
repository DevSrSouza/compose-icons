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

public val SolidGroup.OilWell: ImageVector
    get() {
        if (_oilWell != null) {
            return _oilWell!!
        }
        _oilWell = Builder(name = "OilWell", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(528.3f, 61.3f)
                curveToRelative(-11.4f, -42.7f, -55.3f, -68.0f, -98.0f, -56.6f)
                lineTo(414.9f, 8.8f)
                curveTo(397.8f, 13.4f, 387.7f, 31.0f, 392.3f, 48.0f)
                lineToRelative(24.5f, 91.4f)
                lineTo(308.5f, 167.5f)
                lineToRelative(-6.3f, -18.1f)
                curveTo(297.7f, 136.6f, 285.6f, 128.0f, 272.0f, 128.0f)
                reflectiveCurveToRelative(-25.7f, 8.6f, -30.2f, 21.4f)
                lineToRelative(-13.6f, 39.0f)
                lineTo(96.0f, 222.6f)
                verticalLineTo(184.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineTo(448.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(544.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(406.7f)
                lineTo(340.0f, 257.5f)
                lineToRelative(-62.2f, 16.1f)
                lineTo(305.3f, 352.0f)
                horizontalLineTo(238.7f)
                lineTo(265.0f, 277.0f)
                lineToRelative(-74.6f, 19.3f)
                lineTo(137.3f, 448.0f)
                horizontalLineTo(96.0f)
                verticalLineTo(288.8f)
                lineToRelative(337.4f, -87.5f)
                lineToRelative(25.2f, 94.0f)
                curveToRelative(4.6f, 17.1f, 22.1f, 27.2f, 39.2f, 22.6f)
                lineToRelative(15.5f, -4.1f)
                curveToRelative(42.7f, -11.4f, 68.0f, -55.3f, 56.6f, -98.0f)
                lineTo(528.3f, 61.3f)
                close()
                moveTo(205.1f, 448.0f)
                lineToRelative(11.2f, -32.0f)
                horizontalLineTo(327.7f)
                lineToRelative(11.2f, 32.0f)
                horizontalLineTo(205.1f)
                close()
            }
        }
        .build()
        return _oilWell!!
    }

private var _oilWell: ImageVector? = null
