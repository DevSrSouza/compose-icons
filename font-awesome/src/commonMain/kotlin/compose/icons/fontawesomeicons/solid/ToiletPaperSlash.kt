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

public val SolidGroup.ToiletPaperSlash: ImageVector
    get() {
        if (_toiletPaperSlash != null) {
            return _toiletPaperSlash!!
        }
        _toiletPaperSlash = Builder(name = "ToiletPaperSlash", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineToRelative(-109.7f, -86.0f)
                curveTo(569.9f, 374.0f, 608.0f, 291.9f, 608.0f, 192.0f)
                curveTo(608.0f, 86.0f, 565.0f, 0.0f, 512.0f, 0.0f)
                reflectiveCurveToRelative(-96.0f, 86.0f, -96.0f, 192.0f)
                curveToRelative(0.0f, 49.1f, 9.2f, 93.9f, 24.4f, 127.9f)
                lineToRelative(-59.0f, -46.2f)
                curveToRelative(1.6f, -24.8f, 2.6f, -52.0f, 2.6f, -81.6f)
                curveToRelative(0.0f, -65.5f, 13.2f, -142.4f, 60.2f, -192.0f)
                horizontalLineTo(160.0f)
                curveToRelative(-24.8f, 0.0f, -47.4f, 18.8f, -64.4f, 49.6f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(367.3f, 385.4f)
                lineTo(66.5f, 148.4f)
                curveTo(64.9f, 162.4f, 64.0f, 177.0f, 64.0f, 192.0f)
                curveToRelative(0.0f, 101.5f, -11.7f, 170.8f, -23.0f, 213.9f)
                curveToRelative(-5.1f, 19.4f, -10.7f, 39.9f, -20.5f, 57.7f)
                curveToRelative(-5.9f, 9.9f, -6.1f, 22.1f, -0.4f, 32.2f)
                reflectiveCurveTo(36.5f, 512.0f, 48.0f, 512.0f)
                horizontalLineTo(285.9f)
                curveToRelative(22.3f, 0.0f, 45.4f, -12.1f, 55.4f, -36.1f)
                curveToRelative(7.4f, -17.7f, 17.5f, -47.2f, 26.0f, -90.6f)
                close()
                moveTo(544.0f, 192.0f)
                curveToRelative(0.0f, 35.3f, -14.3f, 64.0f, -32.0f, 64.0f)
                reflectiveCurveToRelative(-32.0f, -28.7f, -32.0f, -64.0f)
                reflectiveCurveToRelative(14.3f, -64.0f, 32.0f, -64.0f)
                reflectiveCurveToRelative(32.0f, 28.7f, 32.0f, 64.0f)
                close()
            }
        }
        .build()
        return _toiletPaperSlash!!
    }

private var _toiletPaperSlash: ImageVector? = null
