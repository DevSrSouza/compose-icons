package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 96.0f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 76.0f, 161.9f)
                lineTo(76.0f, 240.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.9f, 3.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.9f, 0.2f)
                lineTo(128.0f, 220.5f)
                lineToRelative(46.2f, 23.1f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 180.0f, 240.0f)
                lineTo(180.0f, 161.9f)
                arcTo(83.8f, 83.8f, 0.0f, false, false, 212.0f, 96.0f)
                close()
                moveTo(172.0f, 233.5f)
                lineToRelative(-42.2f, -21.1f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.6f, 0.0f)
                lineTo(84.0f, 233.5f)
                verticalLineToRelative(-66.0f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, false, 88.0f, 0.0f)
                close()
                moveTo(128.0f, 172.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 76.0f, -76.0f)
                arcTo(76.1f, 76.1f, 0.0f, false, true, 128.0f, 172.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 52.0f, 52.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 128.0f, 44.0f)
                close()
                moveTo(128.0f, 140.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, -44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 128.0f, 140.0f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
