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

public val IonIcons.PlayBack: ImageVector
    get() {
        if (_playBack != null) {
            return _playBack!!
        }
        _playBack = Builder(name = "PlayBack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(30.71f, 229.47f)
                lineToRelative(188.87f, -113.0f)
                arcToRelative(30.54f, 30.54f, 0.0f, false, true, 31.09f, -0.39f)
                arcToRelative(33.74f, 33.74f, 0.0f, false, true, 16.76f, 29.47f)
                verticalLineTo(224.6f)
                lineTo(448.15f, 116.44f)
                arcToRelative(30.54f, 30.54f, 0.0f, false, true, 31.09f, -0.39f)
                arcTo(33.74f, 33.74f, 0.0f, false, true, 496.0f, 145.52f)
                verticalLineToRelative(221.0f)
                arcTo(33.73f, 33.73f, 0.0f, false, true, 479.24f, 396.0f)
                arcToRelative(30.54f, 30.54f, 0.0f, false, true, -31.09f, -0.39f)
                lineTo(267.43f, 287.4f)
                verticalLineToRelative(79.08f)
                arcTo(33.73f, 33.73f, 0.0f, false, true, 250.67f, 396.0f)
                arcToRelative(30.54f, 30.54f, 0.0f, false, true, -31.09f, -0.39f)
                lineToRelative(-188.87f, -113.0f)
                arcToRelative(31.27f, 31.27f, 0.0f, false, true, 0.0f, -53.0f)
                close()
            }
        }
        .build()
        return _playBack!!
    }

private var _playBack: ImageVector? = null
