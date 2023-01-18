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

public val IonIcons.Desktop: ImageVector
    get() {
        if (_desktop != null) {
            return _desktop!!
        }
        _desktop = Builder(name = "Desktop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 352.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, 48.0f)
                lineTo(197.88f, 400.0f)
                lineToRelative(-4.0f, 32.0f)
                lineTo(144.0f, 432.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                lineTo(368.0f, 464.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                lineTo(318.12f, 432.0f)
                lineToRelative(-4.0f, -32.0f)
                lineTo(448.0f, 400.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, -48.0f)
                lineTo(496.0f, 304.0f)
                lineTo(16.0f, 304.0f)
                close()
                moveTo(256.0f, 336.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 256.0f, 336.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 96.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, -48.0f, -48.0f)
                horizontalLineTo(64.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 16.0f, 96.0f)
                verticalLineTo(288.0f)
                horizontalLineTo(496.0f)
                close()
            }
        }
        .build()
        return _desktop!!
    }

private var _desktop: ImageVector? = null
