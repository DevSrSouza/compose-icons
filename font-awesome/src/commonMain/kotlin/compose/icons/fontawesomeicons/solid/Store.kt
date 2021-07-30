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
        _store = Builder(name = "Store", defaultWidth = 616.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 616.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(602.0f, 118.6f)
                lineTo(537.1f, 15.0f)
                curveTo(531.3f, 5.7f, 521.0f, 0.0f, 510.0f, 0.0f)
                horizontalLineTo(106.0f)
                curveTo(95.0f, 0.0f, 84.7f, 5.7f, 78.9f, 15.0f)
                lineTo(14.0f, 118.6f)
                curveToRelative(-33.5f, 53.5f, -3.8f, 127.9f, 58.8f, 136.4f)
                curveToRelative(4.5f, 0.6f, 9.1f, 0.9f, 13.7f, 0.9f)
                curveToRelative(29.6f, 0.0f, 55.8f, -13.0f, 73.8f, -33.1f)
                curveToRelative(18.0f, 20.1f, 44.3f, 33.1f, 73.8f, 33.1f)
                curveToRelative(29.6f, 0.0f, 55.8f, -13.0f, 73.8f, -33.1f)
                curveToRelative(18.0f, 20.1f, 44.3f, 33.1f, 73.8f, 33.1f)
                curveToRelative(29.6f, 0.0f, 55.8f, -13.0f, 73.8f, -33.1f)
                curveToRelative(18.1f, 20.1f, 44.3f, 33.1f, 73.8f, 33.1f)
                curveToRelative(4.7f, 0.0f, 9.2f, -0.3f, 13.7f, -0.9f)
                curveToRelative(62.8f, -8.4f, 92.6f, -82.8f, 59.0f, -136.4f)
                close()
                moveTo(529.5f, 288.0f)
                curveToRelative(-10.0f, 0.0f, -19.9f, -1.5f, -29.5f, -3.8f)
                verticalLineTo(384.0f)
                horizontalLineTo(116.0f)
                verticalLineToRelative(-99.8f)
                curveToRelative(-9.6f, 2.2f, -19.5f, 3.8f, -29.5f, 3.8f)
                curveToRelative(-6.0f, 0.0f, -12.1f, -0.4f, -18.0f, -1.2f)
                curveToRelative(-5.6f, -0.8f, -11.1f, -2.1f, -16.4f, -3.6f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(448.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(283.2f)
                curveToRelative(-5.4f, 1.6f, -10.8f, 2.9f, -16.4f, 3.6f)
                curveToRelative(-6.1f, 0.8f, -12.1f, 1.2f, -18.2f, 1.2f)
                close()
            }
        }
        .build()
        return _store!!
    }

private var _store: ImageVector? = null
