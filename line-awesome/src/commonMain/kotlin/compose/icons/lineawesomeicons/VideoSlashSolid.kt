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

public val LineAwesomeIcons.VideoSlashSolid: ImageVector
    get() {
        if (_videoSlashSolid != null) {
            return _videoSlashSolid!!
        }
        _videoSlashSolid = Builder(name = "VideoSlashSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7188f, 2.2813f)
                lineTo(2.2813f, 3.7188f)
                lineTo(28.2813f, 29.7188f)
                lineTo(29.7188f, 28.2813f)
                lineTo(24.0f, 22.5625f)
                lineTo(24.0f, 20.625f)
                lineTo(30.0f, 23.625f)
                lineTo(30.0f, 8.375f)
                lineTo(24.0f, 11.375f)
                lineTo(24.0f, 8.0f)
                lineTo(9.4375f, 8.0f)
                close()
                moveTo(2.0f, 8.0f)
                lineTo(2.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                lineTo(18.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 10.0f)
                lineTo(6.0f, 10.0f)
                lineTo(4.0f, 8.0f)
                close()
                moveTo(11.4375f, 10.0f)
                lineTo(22.0f, 10.0f)
                lineTo(22.0f, 20.5625f)
                close()
                moveTo(28.0f, 11.625f)
                lineTo(28.0f, 20.375f)
                lineTo(24.0f, 18.375f)
                lineTo(24.0f, 13.625f)
                close()
            }
        }
        .build()
        return _videoSlashSolid!!
    }

private var _videoSlashSolid: ImageVector? = null
