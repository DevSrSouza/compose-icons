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

public val IonIcons.Exit: ImageVector
    get() {
        if (_exit != null) {
            return _exit!!
        }
        _exit = Builder(name = "Exit", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 376.0f)
                verticalLineTo(272.0f)
                horizontalLineTo(191.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                horizontalLineTo(336.0f)
                verticalLineTo(136.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, -56.0f)
                horizontalLineTo(88.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, 56.0f)
                verticalLineTo(376.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, 56.0f, 56.0f)
                horizontalLineTo(280.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 336.0f, 376.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(425.37f, 272.0f)
                lineToRelative(-52.68f, 52.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 22.62f)
                lineToRelative(80.0f, -80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.62f)
                lineToRelative(-80.0f, -80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 22.62f)
                lineTo(425.37f, 240.0f)
                horizontalLineTo(336.0f)
                verticalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _exit!!
    }

private var _exit: ImageVector? = null
