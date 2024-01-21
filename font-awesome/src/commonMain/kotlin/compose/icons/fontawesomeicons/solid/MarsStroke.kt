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

public val SolidGroup.MarsStroke: ImageVector
    get() {
        if (_marsStroke != null) {
            return _marsStroke!!
        }
        _marsStroke = Builder(name = "MarsStroke", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(376.0f, 0.0f)
                curveToRelative(-9.7f, 0.0f, -18.5f, 5.8f, -22.2f, 14.8f)
                reflectiveCurveToRelative(-1.7f, 19.3f, 5.2f, 26.2f)
                lineToRelative(33.4f, 33.4f)
                lineTo(370.3f, 96.4f)
                lineTo(345.0f, 71.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(25.4f, 25.4f)
                lineTo(307.8f, 159.0f)
                curveToRelative(-28.4f, -19.5f, -62.7f, -31.0f, -99.8f, -31.0f)
                curveToRelative(-97.2f, 0.0f, -176.0f, 78.8f, -176.0f, 176.0f)
                reflectiveCurveToRelative(78.8f, 176.0f, 176.0f, 176.0f)
                reflectiveCurveToRelative(176.0f, -78.8f, 176.0f, -176.0f)
                curveToRelative(0.0f, -37.0f, -11.4f, -71.4f, -31.0f, -99.8f)
                lineToRelative(28.6f, -28.6f)
                lineTo(407.0f, 201.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-25.4f, -25.4f)
                lineToRelative(22.1f, -22.1f)
                lineTo(471.0f, 153.0f)
                curveToRelative(6.9f, 6.9f, 17.2f, 8.9f, 26.2f, 5.2f)
                reflectiveCurveToRelative(14.8f, -12.5f, 14.8f, -22.2f)
                lineTo(512.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(376.0f, 0.0f)
                close()
                moveTo(464.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                lineToRelative(0.0f, 0.0f)
                close()
                moveTo(96.0f, 304.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, true, 224.0f, 0.0f)
                arcTo(112.0f, 112.0f, 0.0f, true, true, 96.0f, 304.0f)
                close()
            }
        }
        .build()
        return _marsStroke!!
    }

private var _marsStroke: ImageVector? = null
