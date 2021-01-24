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

public val SolidGroup.Tram: ImageVector
    get() {
        if (_tram != null) {
            return _tram!!
        }
        _tram = Builder(name = "Tram", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveTo(305.7f, 0.0f, 288.0f, 0.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                close()
                moveTo(511.5f, 51.9f)
                curveToRelative(-2.3f, -8.6f, -11.0f, -13.6f, -19.6f, -11.3f)
                lineToRelative(-480.0f, 128.0f)
                curveToRelative(-8.5f, 2.3f, -13.6f, 11.0f, -11.3f, 19.6f)
                curveTo(2.5f, 195.3f, 8.9f, 200.0f, 16.0f, 200.0f)
                curveToRelative(1.4f, 0.0f, 2.8f, -0.2f, 4.1f, -0.5f)
                lineTo(240.0f, 140.8f)
                lineTo(240.0f, 224.0f)
                lineTo(64.0f, 224.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(224.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(480.0f, 256.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(272.0f, 224.0f)
                verticalLineToRelative(-91.7f)
                lineToRelative(228.1f, -60.8f)
                curveToRelative(8.6f, -2.3f, 13.6f, -11.1f, 11.4f, -19.6f)
                close()
                moveTo(176.0f, 384.0f)
                lineTo(80.0f, 384.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(336.0f, 288.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(-96.0f)
                verticalLineToRelative(-96.0f)
                close()
                moveTo(304.0f, 288.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(-96.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineToRelative(96.0f)
                close()
                moveTo(192.0f, 96.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _tram!!
    }

private var _tram: ImageVector? = null
