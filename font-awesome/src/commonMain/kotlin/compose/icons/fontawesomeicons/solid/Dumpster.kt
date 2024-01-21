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

public val SolidGroup.Dumpster: ImageVector
    get() {
        if (_dumpster != null) {
            return _dumpster!!
        }
        _dumpster = Builder(name = "Dumpster", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(49.7f, 32.0f)
                curveToRelative(-10.5f, 0.0f, -19.8f, 6.9f, -22.9f, 16.9f)
                lineTo(0.9f, 133.0f)
                curveToRelative(-0.6f, 2.0f, -0.9f, 4.1f, -0.9f, 6.1f)
                curveTo(0.0f, 150.7f, 9.3f, 160.0f, 20.9f, 160.0f)
                horizontalLineToRelative(94.0f)
                lineTo(140.5f, 32.0f)
                lineTo(49.7f, 32.0f)
                close()
                moveTo(272.0f, 160.0f)
                lineTo(272.0f, 32.0f)
                lineTo(173.1f, 32.0f)
                lineTo(147.5f, 160.0f)
                lineTo(272.0f, 160.0f)
                close()
                moveTo(304.0f, 160.0f)
                lineTo(428.5f, 160.0f)
                lineTo(402.9f, 32.0f)
                lineTo(304.0f, 32.0f)
                lineTo(304.0f, 160.0f)
                close()
                moveTo(461.1f, 160.0f)
                horizontalLineToRelative(94.0f)
                curveToRelative(11.5f, 0.0f, 20.9f, -9.3f, 20.9f, -20.9f)
                curveToRelative(0.0f, -2.1f, -0.3f, -4.1f, -0.9f, -6.1f)
                lineTo(549.2f, 48.9f)
                curveTo(546.1f, 38.9f, 536.8f, 32.0f, 526.3f, 32.0f)
                lineTo(435.5f, 32.0f)
                lineToRelative(25.6f, 128.0f)
                close()
                moveTo(32.0f, 192.0f)
                lineToRelative(4.0f, 32.0f)
                lineTo(32.0f, 224.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(44.0f, 288.0f)
                lineTo(64.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(448.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(20.0f, -160.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(4.0f, -32.0f)
                lineTo(32.0f, 192.0f)
                close()
            }
        }
        .build()
        return _dumpster!!
    }

private var _dumpster: ImageVector? = null
