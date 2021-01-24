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

public val SolidGroup.LiraSign: ImageVector
    get() {
        if (_liraSign != null) {
            return _liraSign!!
        }
        _liraSign = Builder(name = "LiraSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(371.994f, 256.0f)
                horizontalLineToRelative(-48.019f)
                curveTo(317.64f, 256.0f, 312.0f, 260.912f, 312.0f, 267.246f)
                curveTo(312.0f, 368.0f, 230.179f, 416.0f, 144.0f, 416.0f)
                verticalLineTo(256.781f)
                lineToRelative(134.603f, -29.912f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 288.0f, 215.155f)
                verticalLineToRelative(-40.976f)
                curveToRelative(0.0f, -7.677f, -7.109f, -13.38f, -14.603f, -11.714f)
                lineTo(144.0f, 191.219f)
                verticalLineTo(160.78f)
                lineToRelative(134.603f, -29.912f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 288.0f, 119.154f)
                verticalLineTo(78.179f)
                curveToRelative(0.0f, -7.677f, -7.109f, -13.38f, -14.603f, -11.714f)
                lineTo(144.0f, 95.219f)
                verticalLineTo(44.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                horizontalLineTo(76.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(68.997f)
                lineTo(9.397f, 125.131f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 136.845f)
                verticalLineToRelative(40.976f)
                curveToRelative(0.0f, 7.677f, 7.109f, 13.38f, 14.603f, 11.714f)
                lineTo(64.0f, 178.558f)
                verticalLineToRelative(30.439f)
                lineTo(9.397f, 221.131f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 232.845f)
                verticalLineToRelative(40.976f)
                curveToRelative(0.0f, 7.677f, 7.109f, 13.38f, 14.603f, 11.714f)
                lineTo(64.0f, 274.558f)
                verticalLineTo(468.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(79.583f)
                curveToRelative(134.091f, 0.0f, 223.255f, -77.834f, 228.408f, -211.592f)
                curveToRelative(0.261f, -6.782f, -5.211f, -12.408f, -11.997f, -12.408f)
                close()
            }
        }
        .build()
        return _liraSign!!
    }

private var _liraSign: ImageVector? = null
