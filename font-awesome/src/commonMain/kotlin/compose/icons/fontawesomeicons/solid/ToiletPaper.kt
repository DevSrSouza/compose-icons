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

public val SolidGroup.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) {
            return _toiletPaper!!
        }
        _toiletPaper = Builder(name = "ToiletPaper", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 0.0f)
                curveTo(74.98f, 0.0f, 32.0f, 85.96f, 32.0f, 192.0f)
                verticalLineToRelative(172.07f)
                curveToRelative(0.0f, 41.12f, -9.8f, 62.77f, -31.17f, 126.87f)
                curveTo(-2.62f, 501.3f, 5.09f, 512.0f, 16.01f, 512.0f)
                horizontalLineToRelative(280.92f)
                curveToRelative(13.77f, 0.0f, 26.0f, -8.81f, 30.36f, -21.88f)
                curveToRelative(12.83f, -38.48f, 24.71f, -72.4f, 24.71f, -126.05f)
                lineTo(352.0f, 192.0f)
                curveToRelative(0.0f, -83.6f, 23.67f, -153.52f, 60.44f, -192.0f)
                lineTo(128.0f, 0.0f)
                close()
                moveTo(96.0f, 224.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.16f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.16f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.16f, 16.0f, -16.0f, 16.0f)
                close()
                moveTo(160.0f, 224.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.16f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.16f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.16f, 16.0f, -16.0f, 16.0f)
                close()
                moveTo(224.0f, 224.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.16f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.16f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.16f, 16.0f, -16.0f, 16.0f)
                close()
                moveTo(288.0f, 224.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.16f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.16f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.16f, 16.0f, -16.0f, 16.0f)
                close()
                moveTo(480.0f, 0.0f)
                curveToRelative(-53.02f, 0.0f, -96.0f, 85.96f, -96.0f, 192.0f)
                reflectiveCurveToRelative(42.98f, 192.0f, 96.0f, 192.0f)
                reflectiveCurveToRelative(96.0f, -85.96f, 96.0f, -192.0f)
                reflectiveCurveTo(533.02f, 0.0f, 480.0f, 0.0f)
                close()
                moveTo(480.0f, 256.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, -28.65f, -32.0f, -64.0f)
                reflectiveCurveToRelative(14.33f, -64.0f, 32.0f, -64.0f)
                reflectiveCurveToRelative(32.0f, 28.65f, 32.0f, 64.0f)
                reflectiveCurveToRelative(-14.33f, 64.0f, -32.0f, 64.0f)
                close()
            }
        }
        .build()
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
