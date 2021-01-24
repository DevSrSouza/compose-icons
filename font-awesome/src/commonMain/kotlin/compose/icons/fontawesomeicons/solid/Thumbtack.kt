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

public val SolidGroup.Thumbtack: ImageVector
    get() {
        if (_thumbtack != null) {
            return _thumbtack!!
        }
        _thumbtack = Builder(name = "Thumbtack", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(298.028f, 214.267f)
                lineTo(285.793f, 96.0f)
                horizontalLineTo(328.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineTo(24.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(56.0f)
                curveTo(42.745f, 0.0f, 32.0f, 10.745f, 32.0f, 24.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(42.207f)
                lineTo(85.972f, 214.267f)
                curveTo(37.465f, 236.82f, 0.0f, 277.261f, 0.0f, 328.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(136.0f)
                verticalLineToRelative(104.007f)
                curveToRelative(0.0f, 1.242f, 0.289f, 2.467f, 0.845f, 3.578f)
                lineToRelative(24.0f, 48.0f)
                curveToRelative(2.941f, 5.882f, 11.364f, 5.893f, 14.311f, 0.0f)
                lineToRelative(24.0f, -48.0f)
                arcToRelative(8.008f, 8.008f, 0.0f, false, false, 0.845f, -3.578f)
                verticalLineTo(352.0f)
                horizontalLineToRelative(136.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                curveToRelative(-0.001f, -51.183f, -37.983f, -91.42f, -85.973f, -113.733f)
                close()
            }
        }
        .build()
        return _thumbtack!!
    }

private var _thumbtack: ImageVector? = null
