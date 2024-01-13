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
                moveTo(32.0f, 32.0f)
                curveTo(32.0f, 14.3f, 46.3f, 0.0f, 64.0f, 0.0f)
                horizontalLineTo(320.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(290.5f)
                lineToRelative(11.4f, 148.2f)
                curveToRelative(36.7f, 19.9f, 65.7f, 53.2f, 79.5f, 94.7f)
                lineToRelative(1.0f, 3.0f)
                curveToRelative(3.3f, 9.8f, 1.6f, 20.5f, -4.4f, 28.8f)
                reflectiveCurveToRelative(-15.7f, 13.3f, -26.0f, 13.3f)
                horizontalLineTo(32.0f)
                curveToRelative(-10.3f, 0.0f, -19.9f, -4.9f, -26.0f, -13.3f)
                reflectiveCurveToRelative(-7.7f, -19.1f, -4.4f, -28.8f)
                lineToRelative(1.0f, -3.0f)
                curveToRelative(13.8f, -41.5f, 42.8f, -74.8f, 79.5f, -94.7f)
                lineTo(93.5f, 64.0f)
                horizontalLineTo(64.0f)
                curveTo(46.3f, 64.0f, 32.0f, 49.7f, 32.0f, 32.0f)
                close()
                moveTo(160.0f, 384.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(384.0f)
                close()
            }
        }
        .build()
        return _thumbtack!!
    }

private var _thumbtack: ImageVector? = null
