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

public val SolidGroup.ArrowUpShortWide: ImageVector
    get() {
        if (_arrowUpShortWide != null) {
            return _arrowUpShortWide!!
        }
        _arrowUpShortWide = Builder(name = "ArrowUpShortWide", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(151.6f, 42.4f)
                curveTo(145.5f, 35.8f, 137.0f, 32.0f, 128.0f, 32.0f)
                reflectiveCurveToRelative(-17.5f, 3.8f, -23.6f, 10.4f)
                lineToRelative(-88.0f, 96.0f)
                curveToRelative(-11.9f, 13.0f, -11.1f, 33.3f, 2.0f, 45.2f)
                reflectiveCurveToRelative(33.3f, 11.1f, 45.2f, -2.0f)
                lineTo(96.0f, 146.3f)
                lineTo(96.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(160.0f, 146.3f)
                lineToRelative(32.4f, 35.4f)
                curveToRelative(11.9f, 13.0f, 32.2f, 13.9f, 45.2f, 2.0f)
                reflectiveCurveToRelative(13.9f, -32.2f, 2.0f, -45.2f)
                lineToRelative(-88.0f, -96.0f)
                close()
                moveTo(320.0f, 32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(320.0f, 32.0f)
                close()
                moveTo(320.0f, 160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(320.0f, 160.0f)
                close()
                moveTo(320.0f, 288.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(480.0f, 352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(320.0f, 288.0f)
                close()
                moveTo(320.0f, 416.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(544.0f, 480.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(320.0f, 416.0f)
                close()
            }
        }
        .build()
        return _arrowUpShortWide!!
    }

private var _arrowUpShortWide: ImageVector? = null
