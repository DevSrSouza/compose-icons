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

public val SolidGroup.TarpDroplet: ImageVector
    get() {
        if (_tarpDroplet != null) {
            return _tarpDroplet!!
        }
        _tarpDroplet = Builder(name = "TarpDroplet", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 160.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -26.9f, -64.0f, -60.0f)
                curveToRelative(0.0f, -24.0f, 33.7f, -70.1f, 52.2f, -93.5f)
                curveToRelative(6.1f, -7.7f, 17.5f, -7.7f, 23.6f, 0.0f)
                curveTo(318.3f, 29.9f, 352.0f, 76.0f, 352.0f, 100.0f)
                curveToRelative(0.0f, 33.1f, -28.7f, 60.0f, -64.0f, 60.0f)
                close()
                moveTo(64.0f, 128.0f)
                horizontalLineTo(197.5f)
                curveToRelative(13.2f, 37.3f, 48.7f, 64.0f, 90.5f, 64.0f)
                reflectiveCurveToRelative(77.4f, -26.7f, 90.5f, -64.0f)
                horizontalLineTo(512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 128.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                close()
                moveTo(448.0f, 512.0f)
                lineToRelative(0.0f, -128.0f)
                horizontalLineTo(576.0f)
                lineTo(448.0f, 512.0f)
                close()
                moveTo(96.0f, 256.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _tarpDroplet!!
    }

private var _tarpDroplet: ImageVector? = null
