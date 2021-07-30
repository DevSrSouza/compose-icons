package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.StumbleuponCircle: ImageVector
    get() {
        if (_stumbleuponCircle != null) {
            return _stumbleuponCircle!!
        }
        _stumbleuponCircle = Builder(name = "StumbleuponCircle", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3984f, 4.0f, 4.0f, 9.3984f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6016f, 9.3984f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6016f, 28.0f, 28.0f, 22.6016f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3984f, 22.6016f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(15.3984f, 11.0f, 15.0f, 11.3984f, 15.0f, 12.0f)
                lineTo(15.0f, 18.0f)
                curveTo(15.0f, 19.6992f, 13.6992f, 21.0f, 12.0f, 21.0f)
                curveTo(10.3008f, 21.0f, 9.0f, 19.6992f, 9.0f, 18.0f)
                lineTo(9.0f, 16.0f)
                lineTo(11.0f, 16.0f)
                lineTo(11.0f, 18.0f)
                curveTo(11.0f, 18.6016f, 11.3984f, 19.0f, 12.0f, 19.0f)
                curveTo(12.6016f, 19.0f, 13.0f, 18.6016f, 13.0f, 18.0f)
                lineTo(13.0f, 12.0f)
                curveTo(13.0f, 10.3008f, 14.3008f, 9.0f, 16.0f, 9.0f)
                curveTo(17.6992f, 9.0f, 19.0f, 10.3008f, 19.0f, 12.0f)
                lineTo(19.0f, 13.0f)
                curveTo(19.0f, 13.6016f, 18.6016f, 14.0f, 18.0f, 14.0f)
                curveTo(17.3984f, 14.0f, 17.0f, 13.6016f, 17.0f, 13.0f)
                lineTo(17.0f, 12.0f)
                curveTo(17.0f, 11.3984f, 16.6016f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(23.0f, 18.0f)
                curveTo(23.0f, 19.6992f, 21.6992f, 21.0f, 20.0f, 21.0f)
                curveTo(18.3008f, 21.0f, 17.0f, 19.6992f, 17.0f, 18.0f)
                lineTo(17.0f, 15.6992f)
                curveTo(17.3008f, 15.8984f, 17.6016f, 16.0f, 18.0f, 16.0f)
                curveTo(18.3984f, 16.0f, 18.6992f, 15.8984f, 19.0f, 15.6992f)
                lineTo(19.0f, 18.0f)
                curveTo(19.0f, 18.6016f, 19.3984f, 19.0f, 20.0f, 19.0f)
                curveTo(20.6016f, 19.0f, 21.0f, 18.6016f, 21.0f, 18.0f)
                lineTo(21.0f, 16.0f)
                lineTo(23.0f, 16.0f)
                close()
            }
        }
        .build()
        return _stumbleuponCircle!!
    }

private var _stumbleuponCircle: ImageVector? = null
