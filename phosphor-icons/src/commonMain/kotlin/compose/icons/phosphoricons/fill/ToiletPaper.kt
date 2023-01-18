package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) {
            return _toiletPaper!!
        }
        _toiletPaper = Builder(name = "ToiletPaper", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(160.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 120.0f)
                close()
                moveTo(240.0f, 120.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(112.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(96.0f, 186.3f)
                curveTo(87.4f, 200.4f, 76.2f, 208.0f, 64.0f, 208.0f)
                curveToRelative(-13.9f, 0.0f, -26.5f, -9.9f, -35.4f, -27.9f)
                curveTo(20.5f, 163.9f, 16.0f, 142.6f, 16.0f, 120.0f)
                reflectiveCurveToRelative(4.5f, -43.9f, 12.6f, -60.1f)
                curveTo(37.5f, 41.9f, 50.1f, 32.0f, 64.0f, 32.0f)
                lineTo(192.0f, 32.0f)
                curveToRelative(13.9f, 0.0f, 26.5f, 9.9f, 35.4f, 27.9f)
                curveTo(235.5f, 76.1f, 240.0f, 97.4f, 240.0f, 120.0f)
                close()
                moveTo(76.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 120.0f)
                close()
                moveTo(224.0f, 128.0f)
                lineTo(208.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(15.8f)
                curveToRelative(-2.0f, -38.1f, -17.6f, -64.0f, -31.8f, -64.0f)
                lineTo(92.1f, 48.0f)
                arcToRelative(65.0f, 65.0f, 0.0f, false, true, 7.3f, 11.9f)
                curveToRelative(7.2f, 14.2f, 11.5f, 32.5f, 12.4f, 52.1f)
                lineTo(128.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(112.0f, 128.0f)
                verticalLineToRelative(80.0f)
                lineTo(224.0f, 208.0f)
                close()
            }
        }
        .build()
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
