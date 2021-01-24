package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.MarsStroke: ImageVector
    get() {
        if (_marsStroke != null) {
            return _marsStroke!!
        }
        _marsStroke = Builder(name = "MarsStroke", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(372.0f, 64.0f)
                horizontalLineToRelative(-79.0f)
                curveToRelative(-10.7f, 0.0f, -16.0f, 12.9f, -8.5f, 20.5f)
                lineToRelative(16.9f, 16.9f)
                lineToRelative(-17.5f, 17.5f)
                lineToRelative(-14.1f, -14.1f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17.0f, 0.0f)
                lineTo(224.5f, 133.0f)
                curveToRelative(-4.7f, 4.7f, -4.7f, 12.3f, 0.0f, 17.0f)
                lineToRelative(14.1f, 14.1f)
                lineToRelative(-18.0f, 18.0f)
                curveToRelative(-22.2f, -14.0f, -48.5f, -22.1f, -76.7f, -22.1f)
                curveTo(64.5f, 160.0f, 0.0f, 224.5f, 0.0f, 304.0f)
                reflectiveCurveToRelative(64.5f, 144.0f, 144.0f, 144.0f)
                reflectiveCurveToRelative(144.0f, -64.5f, 144.0f, -144.0f)
                curveToRelative(0.0f, -28.2f, -8.1f, -54.5f, -22.1f, -76.7f)
                lineToRelative(18.0f, -18.0f)
                lineToRelative(14.1f, 14.1f)
                curveToRelative(4.7f, 4.7f, 12.3f, 4.7f, 17.0f, 0.0f)
                lineToRelative(28.3f, -28.3f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.3f, 0.0f, -17.0f)
                lineTo(329.2f, 164.0f)
                lineToRelative(17.5f, -17.5f)
                lineToRelative(16.9f, 16.9f)
                curveToRelative(7.6f, 7.6f, 20.5f, 2.2f, 20.5f, -8.5f)
                verticalLineTo(76.0f)
                curveToRelative(-0.1f, -6.6f, -5.5f, -12.0f, -12.1f, -12.0f)
                close()
                moveTo(144.0f, 384.0f)
                curveToRelative(-44.1f, 0.0f, -80.0f, -35.9f, -80.0f, -80.0f)
                reflectiveCurveToRelative(35.9f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.9f, 80.0f, 80.0f)
                reflectiveCurveToRelative(-35.9f, 80.0f, -80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _marsStroke!!
    }

private var _marsStroke: ImageVector? = null
