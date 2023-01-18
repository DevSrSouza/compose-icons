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

public val IonIcons.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) {
            return _gitMerge!!
        }
        _gitMerge = Builder(name = "GitMerge", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(385.0f, 224.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -55.33f, 31.89f)
                curveToRelative(-42.23f, -1.21f, -85.19f, -12.72f, -116.21f, -31.33f)
                curveToRelative(-32.2f, -19.32f, -49.71f, -44.0f, -52.15f, -73.35f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -64.31f, 0.18f)
                lineTo(97.0f, 360.61f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.0f, 0.0f)
                lineTo(161.0f, 266.15f)
                curveToRelative(44.76f, 34.0f, 107.28f, 52.38f, 168.56f, 53.76f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 385.0f, 224.0f)
                close()
                moveTo(129.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 97.0f, 96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 129.0f, 64.0f)
                close()
                moveTo(129.0f, 448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 129.0f, 448.0f)
                close()
                moveTo(385.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 385.0f, 320.0f)
                close()
            }
        }
        .build()
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
