package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PlaySkipBackSharp: ImageVector
    get() {
        if (_playSkipBackSharp != null) {
            return _playSkipBackSharp!!
        }
        _playSkipBackSharp = Builder(name = "PlaySkipBackSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(143.47f, 64.0f)
                lineToRelative(0.0f, 163.52f)
                lineToRelative(272.53f, -163.52f)
                lineToRelative(0.0f, 384.0f)
                lineToRelative(-272.53f, -163.52f)
                lineToRelative(0.0f, 163.52f)
                lineToRelative(-47.47f, 0.0f)
                lineToRelative(0.0f, -384.0f)
                lineToRelative(47.47f, 0.0f)
                close()
            }
        }
        .build()
        return _playSkipBackSharp!!
    }

private var _playSkipBackSharp: ImageVector? = null
