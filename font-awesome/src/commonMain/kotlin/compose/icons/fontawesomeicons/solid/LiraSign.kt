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
                moveTo(371.99f, 256.0f)
                horizontalLineToRelative(-48.02f)
                curveTo(317.64f, 256.0f, 312.0f, 260.91f, 312.0f, 267.25f)
                curveTo(312.0f, 368.0f, 230.18f, 416.0f, 144.0f, 416.0f)
                verticalLineTo(256.78f)
                lineToRelative(134.6f, -29.91f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 288.0f, 215.15f)
                verticalLineToRelative(-40.98f)
                curveToRelative(0.0f, -7.68f, -7.11f, -13.38f, -14.6f, -11.71f)
                lineTo(144.0f, 191.22f)
                verticalLineTo(160.78f)
                lineToRelative(134.6f, -29.91f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 288.0f, 119.15f)
                verticalLineTo(78.18f)
                curveToRelative(0.0f, -7.68f, -7.11f, -13.38f, -14.6f, -11.71f)
                lineTo(144.0f, 95.22f)
                verticalLineTo(44.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                horizontalLineTo(76.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(69.0f)
                lineTo(9.4f, 125.13f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 136.85f)
                verticalLineToRelative(40.98f)
                curveToRelative(0.0f, 7.68f, 7.11f, 13.38f, 14.6f, 11.71f)
                lineTo(64.0f, 178.56f)
                verticalLineToRelative(30.44f)
                lineTo(9.4f, 221.13f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 232.85f)
                verticalLineToRelative(40.98f)
                curveToRelative(0.0f, 7.68f, 7.11f, 13.38f, 14.6f, 11.71f)
                lineTo(64.0f, 274.56f)
                verticalLineTo(468.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(79.58f)
                curveToRelative(134.09f, 0.0f, 223.26f, -77.83f, 228.41f, -211.59f)
                curveToRelative(0.26f, -6.78f, -5.21f, -12.41f, -12.0f, -12.41f)
                close()
            }
        }
        .build()
        return _liraSign!!
    }

private var _liraSign: ImageVector? = null
