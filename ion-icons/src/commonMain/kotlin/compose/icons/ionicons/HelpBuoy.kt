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

public val IonIcons.HelpBuoy: ImageVector
    get() {
        if (_helpBuoy != null) {
            return _helpBuoy!!
        }
        _helpBuoy = Builder(name = "HelpBuoy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(414.39f, 97.61f)
                arcTo(224.0f, 224.0f, 0.0f, true, false, 97.61f, 414.39f)
                arcTo(224.0f, 224.0f, 0.0f, true, false, 414.39f, 97.61f)
                close()
                moveTo(192.13f, 260.18f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 59.69f, 59.69f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 192.13f, 260.18f)
                close()
                moveTo(432.13f, 193.54f)
                lineTo(335.76f, 199.38f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, -3.44f, -1.59f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, -18.07f, -18.07f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, -1.59f, -3.44f)
                lineToRelative(5.84f, -96.37f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.42f, -3.51f)
                arcTo(193.0f, 193.0f, 0.0f, false, true, 435.6f, 188.12f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 432.09f, 193.54f)
                close()
                moveTo(193.54f, 79.91f)
                lineToRelative(5.84f, 96.37f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, -1.59f, 3.44f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, -18.07f, 18.07f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, -3.44f, 1.59f)
                lineToRelative(-96.37f, -5.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.51f, -5.42f)
                arcTo(193.0f, 193.0f, 0.0f, false, true, 188.12f, 76.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 193.54f, 79.91f)
                close()
                moveTo(79.91f, 318.46f)
                lineToRelative(96.37f, -5.84f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, 3.44f, 1.59f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 18.07f, 18.07f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, 1.59f, 3.44f)
                lineToRelative(-5.84f, 96.37f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.42f, 3.51f)
                arcTo(193.0f, 193.0f, 0.0f, false, true, 76.4f, 323.88f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 79.91f, 318.46f)
                close()
                moveTo(318.46f, 432.09f)
                lineToRelative(-5.84f, -96.37f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, 1.59f, -3.44f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 18.07f, -18.07f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, 3.44f, -1.59f)
                lineToRelative(96.37f, 5.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.51f, 5.42f)
                arcTo(193.0f, 193.0f, 0.0f, false, true, 323.88f, 435.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 318.46f, 432.09f)
                close()
            }
        }
        .build()
        return _helpBuoy!!
    }

private var _helpBuoy: ImageVector? = null
