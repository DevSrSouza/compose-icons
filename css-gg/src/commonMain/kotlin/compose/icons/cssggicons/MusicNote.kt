package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.MusicNote: ImageVector
    get() {
        if (_musicNote != null) {
            return _musicNote!!
        }
        _musicNote = Builder(name = "MusicNote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 8.9544f)
                lineTo(17.6352f, 7.8274f)
                curveTo(19.0102f, 7.5524f, 20.0f, 6.345f, 20.0f, 4.9427f)
                curveTo(20.0f, 3.0864f, 18.3017f, 1.6941f, 16.4813f, 2.0581f)
                lineTo(12.4117f, 2.8721f)
                curveTo(11.0094f, 3.1525f, 10.0f, 4.3838f, 10.0f, 5.8138f)
                verticalLineTo(13.8895f)
                curveTo(9.4116f, 13.5492f, 8.7286f, 13.3544f, 8.0f, 13.3544f)
                curveTo(5.7909f, 13.3544f, 4.0f, 15.1453f, 4.0f, 17.3544f)
                curveTo(4.0f, 19.5635f, 5.7909f, 21.3544f, 8.0f, 21.3544f)
                curveTo(10.2091f, 21.3544f, 12.0f, 19.5635f, 12.0f, 17.3544f)
                verticalLineTo(8.9544f)
                close()
                moveTo(16.8736f, 4.0193f)
                lineTo(12.8039f, 4.8332f)
                curveTo(12.3365f, 4.9267f, 12.0f, 5.3371f, 12.0f, 5.8138f)
                verticalLineTo(6.9148f)
                lineTo(17.2429f, 5.8662f)
                curveTo(17.6831f, 5.7782f, 18.0f, 5.3917f, 18.0f, 4.9427f)
                curveTo(18.0f, 4.3485f, 17.4563f, 3.9027f, 16.8736f, 4.0193f)
                close()
                moveTo(10.0f, 17.3544f)
                curveTo(10.0f, 16.2498f, 9.1046f, 15.3544f, 8.0f, 15.3544f)
                curveTo(6.8954f, 15.3544f, 6.0f, 16.2498f, 6.0f, 17.3544f)
                curveTo(6.0f, 18.459f, 6.8954f, 19.3544f, 8.0f, 19.3544f)
                curveTo(9.1046f, 19.3544f, 10.0f, 18.459f, 10.0f, 17.3544f)
                close()
            }
        }
        .build()
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
