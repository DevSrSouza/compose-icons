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

public val IonIcons.DesktopSharp: ImageVector
    get() {
        if (_desktopSharp != null) {
            return _desktopSharp!!
        }
        _desktopSharp = Builder(name = "DesktopSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 48.0f)
                horizontalLineTo(32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 64.0f)
                verticalLineTo(384.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(200.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(128.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(384.0f)
                verticalLineTo(432.0f)
                horizontalLineTo(312.0f)
                verticalLineTo(400.0f)
                horizontalLineTo(480.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 480.0f, 48.0f)
                close()
                moveTo(460.0f, 84.0f)
                verticalLineTo(300.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(84.0f)
                close()
                moveTo(240.13f, 354.08f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 13.79f, 13.79f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.13f, 354.08f)
                close()
            }
        }
        .build()
        return _desktopSharp!!
    }

private var _desktopSharp: ImageVector? = null
