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

public val IonIcons.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 416.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(292.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 252.0f)
                lineTo(240.0f, 144.0f)
                horizontalLineToRelative(32.0f)
                lineTo(272.0f, 252.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(416.0f, 256.0f)
                arcToRelative(47.93f, 47.93f, 0.0f, false, false, 16.0f, -2.75f)
                horizontalLineToRelative(0.0f)
                arcTo(48.09f, 48.09f, 0.0f, false, false, 464.0f, 208.0f)
                lineTo(464.0f, 192.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, -48.0f)
                lineTo(375.46f, 144.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.7f, -3.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 256.0f, 58.82f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 138.24f, 141.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.7f, 3.0f)
                lineTo(96.0f, 144.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, 48.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(48.09f, 48.09f, 0.0f, false, false, 32.0f, 45.25f)
                horizontalLineToRelative(0.0f)
                arcTo(47.93f, 47.93f, 0.0f, false, false, 96.0f, 256.0f)
                lineTo(236.0f, 256.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 240.0f, 252.0f)
                close()
                moveTo(272.0f, 104.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, 40.0f)
                lineTo(272.0f, 144.0f)
                close()
                moveTo(197.14f, 64.1f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 240.0f, 104.0f)
                verticalLineToRelative(40.0f)
                lineTo(200.0f, 144.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -2.86f, -79.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(276.0f, 480.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                verticalLineTo(296.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(276.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(476.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 276.0f, 480.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
