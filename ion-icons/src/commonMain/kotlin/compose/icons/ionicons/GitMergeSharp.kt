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

public val IonIcons.GitMergeSharp: ImageVector
    get() {
        if (_gitMergeSharp != null) {
            return _gitMergeSharp!!
        }
        _gitMergeSharp = Builder(name = "GitMergeSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 224.0f)
                arcToRelative(63.66f, 63.66f, 0.0f, false, false, -37.95f, 12.5f)
                lineTo(160.0f, 153.36f)
                verticalLineToRelative(-2.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -64.0f, 0.0f)
                lineTo(96.0f, 360.61f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.0f, 0.0f)
                lineTo(160.0f, 223.46f)
                lineToRelative(160.41f, 71.69f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 384.0f, 224.0f)
                close()
                moveTo(128.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 96.0f, 96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 64.0f)
                close()
                moveTo(128.0f, 448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 448.0f)
                close()
                moveTo(384.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 384.0f, 320.0f)
                close()
            }
        }
        .build()
        return _gitMergeSharp!!
    }

private var _gitMergeSharp: ImageVector? = null
