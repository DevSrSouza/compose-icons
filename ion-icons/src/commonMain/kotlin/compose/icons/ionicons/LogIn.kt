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

public val IonIcons.LogIn: ImageVector
    get() {
        if (_logIn != null) {
            return _logIn!!
        }
        _logIn = Builder(name = "LogIn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(392.0f, 80.0f)
                horizontalLineTo(232.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, 56.0f)
                verticalLineTo(240.0f)
                horizontalLineTo(329.37f)
                lineToRelative(-52.68f, -52.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.62f, -22.62f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 22.62f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, -22.62f)
                lineTo(329.37f, 272.0f)
                horizontalLineTo(176.0f)
                verticalLineTo(376.0f)
                curveToRelative(0.0f, 32.05f, 33.79f, 56.0f, 64.0f, 56.0f)
                horizontalLineTo(392.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, 56.0f, -56.0f)
                verticalLineTo(136.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 392.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                verticalLineTo(240.0f)
                close()
            }
        }
        .build()
        return _logIn!!
    }

private var _logIn: ImageVector? = null
