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

public val IonIcons.LogInSharp: ImageVector
    get() {
        if (_logInSharp != null) {
            return _logInSharp!!
        }
        _logInSharp = Builder(name = "LogInSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 80.0f)
                horizontalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineTo(240.0f)
                horizontalLineTo(329.37f)
                lineToRelative(-64.0f, -64.0f)
                lineTo(288.0f, 153.37f)
                lineToRelative(91.31f, 91.32f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 22.62f)
                lineTo(288.0f, 358.63f)
                lineTo(265.37f, 336.0f)
                lineToRelative(64.0f, -64.0f)
                horizontalLineTo(176.0f)
                verticalLineTo(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(432.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 432.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 240.0f)
                horizontalLineToRelative(112.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-112.0f)
                close()
            }
        }
        .build()
        return _logInSharp!!
    }

private var _logInSharp: ImageVector? = null
