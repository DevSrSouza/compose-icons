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
                moveTo(298.03f, 214.27f)
                lineTo(285.79f, 96.0f)
                horizontalLineTo(328.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                verticalLineTo(24.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(56.0f)
                curveTo(42.74f, 0.0f, 32.0f, 10.74f, 32.0f, 24.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(42.21f)
                lineTo(85.97f, 214.27f)
                curveTo(37.47f, 236.82f, 0.0f, 277.26f, 0.0f, 328.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(136.0f)
                verticalLineToRelative(104.01f)
                curveToRelative(0.0f, 1.24f, 0.29f, 2.47f, 0.85f, 3.58f)
                lineToRelative(24.0f, 48.0f)
                curveToRelative(2.94f, 5.88f, 11.36f, 5.89f, 14.31f, 0.0f)
                lineToRelative(24.0f, -48.0f)
                arcToRelative(8.01f, 8.01f, 0.0f, false, false, 0.85f, -3.58f)
                verticalLineTo(352.0f)
                horizontalLineToRelative(136.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                curveToRelative(-0.0f, -51.18f, -37.98f, -91.42f, -85.97f, -113.73f)
                close()
            }
        }
        .build()
        return _thumbtack!!
    }

private var _thumbtack: ImageVector? = null
