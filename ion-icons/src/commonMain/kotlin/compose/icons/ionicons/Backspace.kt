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

public val IonIcons.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(name = "Backspace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(403.13f, 96.0f)
                horizontalLineTo(156.87f)
                arcToRelative(44.9f, 44.9f, 0.0f, false, false, -33.68f, 15.27f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, false, -1.91f, 2.7f)
                lineTo(32.0f, 247.75f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 16.5f)
                lineToRelative(89.15f, 133.57f)
                arcToRelative(16.24f, 16.24f, 0.0f, false, false, 2.0f, 2.88f)
                arcToRelative(44.89f, 44.89f, 0.0f, false, false, 33.7f, 15.3f)
                horizontalLineTo(403.13f)
                arcTo(44.92f, 44.92f, 0.0f, false, false, 448.0f, 371.13f)
                verticalLineTo(140.87f)
                arcTo(44.92f, 44.92f, 0.0f, false, false, 403.13f, 96.0f)
                close()
                moveTo(348.0f, 311.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -22.63f, 22.62f)
                lineTo(271.67f, 280.0f)
                lineTo(218.0f, 333.65f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 195.35f, 311.0f)
                lineTo(249.0f, 257.33f)
                lineToRelative(-53.69f, -53.69f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 218.0f, 181.0f)
                lineToRelative(53.69f, 53.7f)
                lineTo(325.36f, 181.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 348.0f, 203.64f)
                lineToRelative(-53.7f, 53.69f)
                close()
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
