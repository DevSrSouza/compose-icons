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

public val IonIcons.WatchSharp: ImageVector
    get() {
        if (_watchSharp != null) {
            return _watchSharp!!
        }
        _watchSharp = Builder(name = "WatchSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 136.0f)
                lineTo(368.0f, 136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 376.0f, 144.0f)
                lineTo(376.0f, 368.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 368.0f, 376.0f)
                lineTo(144.0f, 376.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 368.0f)
                lineTo(136.0f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 136.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 96.0f)
                lineTo(336.0f, 96.0f)
                lineTo(336.0f, 16.0f)
                lineTo(176.0f, 16.0f)
                lineTo(176.0f, 96.0f)
                lineTo(128.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                lineTo(96.0f, 384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(80.0f)
                lineTo(336.0f, 496.0f)
                lineTo(336.0f, 416.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(416.0f, 128.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 384.0f, 96.0f)
                close()
                moveTo(392.0f, 368.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(144.0f, 392.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(120.0f, 144.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f)
                lineTo(368.0f, 120.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _watchSharp!!
    }

private var _watchSharp: ImageVector? = null
