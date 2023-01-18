package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 352.0f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(99.78f, 32.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 56.84f, 58.53f)
                lineToRelative(-31.0f, 62.0f)
                arcTo(48.26f, 48.26f, 0.0f, false, false, 24.28f, 160.0f)
                horizontalLineToRelative(278.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.39f, -1.87f)
                lineToRelative(75.5f, -120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 378.0f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(486.17f, 120.56f)
                lineToRelative(-31.0f, -62.0f)
                arcToRelative(47.7f, 47.7f, 0.0f, false, false, -32.79f, -25.46f)
                lineTo(342.5f, 160.0f)
                horizontalLineToRelative(0.0f)
                lineTo(298.0f, 231.08f)
                arcToRelative(128.0f, 128.0f, 0.0f, false, false, -84.0f, 0.0f)
                lineToRelative(-23.32f, -37.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.39f, -1.88f)
                lineTo(51.14f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.36f, 6.16f)
                lineToRelative(82.7f, 128.73f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 251.0f, 0.0f)
                lineTo(483.62f, 168.0f)
                arcTo(48.22f, 48.22f, 0.0f, false, false, 486.17f, 120.56f)
                close()
                moveTo(260.17f, 415.87f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 59.69f, -59.69f)
                arcTo(64.08f, 64.08f, 0.0f, false, true, 260.18f, 415.87f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
