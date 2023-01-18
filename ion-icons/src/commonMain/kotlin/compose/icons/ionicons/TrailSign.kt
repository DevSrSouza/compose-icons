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

public val IonIcons.TrailSign: ImageVector
    get() {
        if (_trailSign != null) {
            return _trailSign!!
        }
        _trailSign = Builder(name = "TrailSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(491.31f, 324.69f)
                lineTo(432.0f, 265.37f)
                arcTo(31.8f, 31.8f, 0.0f, false, false, 409.37f, 256.0f)
                horizontalLineTo(272.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(416.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineTo(96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                horizontalLineTo(272.0f)
                verticalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(102.63f)
                arcTo(31.8f, 31.8f, 0.0f, false, false, 80.0f, 73.37f)
                lineTo(20.69f, 132.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.62f)
                lineTo(80.0f, 214.63f)
                arcTo(31.8f, 31.8f, 0.0f, false, false, 102.63f, 224.0f)
                horizontalLineTo(240.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineTo(240.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 32.0f, 0.0f)
                verticalLineTo(416.0f)
                horizontalLineTo(409.37f)
                arcTo(31.8f, 31.8f, 0.0f, false, false, 432.0f, 406.63f)
                lineToRelative(59.31f, -59.32f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 491.31f, 324.69f)
                close()
            }
        }
        .build()
        return _trailSign!!
    }

private var _trailSign: ImageVector? = null
