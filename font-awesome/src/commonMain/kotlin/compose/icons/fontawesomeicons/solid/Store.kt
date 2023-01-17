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

public val SolidGroup.Store: ImageVector
    get() {
        if (_store != null) {
            return _store!!
        }
        _store = Builder(name = "Store", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(547.6f, 103.8f)
                lineTo(490.3f, 13.1f)
                curveTo(485.2f, 5.0f, 476.1f, 0.0f, 466.4f, 0.0f)
                horizontalLineTo(109.6f)
                curveTo(99.9f, 0.0f, 90.8f, 5.0f, 85.7f, 13.1f)
                lineTo(28.3f, 103.8f)
                curveToRelative(-29.6f, 46.8f, -3.4f, 111.9f, 51.9f, 119.4f)
                curveToRelative(4.0f, 0.5f, 8.1f, 0.8f, 12.1f, 0.8f)
                curveToRelative(26.1f, 0.0f, 49.3f, -11.4f, 65.2f, -29.0f)
                curveToRelative(15.9f, 17.6f, 39.1f, 29.0f, 65.2f, 29.0f)
                curveToRelative(26.1f, 0.0f, 49.3f, -11.4f, 65.2f, -29.0f)
                curveToRelative(15.9f, 17.6f, 39.1f, 29.0f, 65.2f, 29.0f)
                curveToRelative(26.2f, 0.0f, 49.3f, -11.4f, 65.2f, -29.0f)
                curveToRelative(16.0f, 17.6f, 39.1f, 29.0f, 65.2f, 29.0f)
                curveToRelative(4.1f, 0.0f, 8.1f, -0.3f, 12.1f, -0.8f)
                curveToRelative(55.5f, -7.4f, 81.8f, -72.5f, 52.1f, -119.4f)
                close()
                moveTo(499.7f, 254.9f)
                lineToRelative(-0.1f, 0.0f)
                curveToRelative(-5.3f, 0.7f, -10.7f, 1.1f, -16.2f, 1.1f)
                curveToRelative(-12.4f, 0.0f, -24.3f, -1.9f, -35.4f, -5.3f)
                verticalLineTo(384.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(250.6f)
                curveToRelative(-11.2f, 3.5f, -23.2f, 5.4f, -35.6f, 5.4f)
                curveToRelative(-5.5f, 0.0f, -11.0f, -0.4f, -16.3f, -1.1f)
                lineToRelative(-0.1f, 0.0f)
                curveToRelative(-4.1f, -0.6f, -8.1f, -1.3f, -12.0f, -2.3f)
                verticalLineTo(384.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(448.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(384.0f)
                verticalLineTo(252.6f)
                curveToRelative(-4.0f, 1.0f, -8.0f, 1.8f, -12.3f, 2.3f)
                close()
            }
        }
        .build()
        return _store!!
    }

private var _store: ImageVector? = null
