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

public val IonIcons.BusSharp: ImageVector
    get() {
        if (_busSharp != null) {
            return _busSharp!!
        }
        _busSharp = Builder(name = "BusSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(424.0f, 32.0f)
                lineTo(88.0f, 32.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 64.0f, 56.0f)
                lineTo(64.0f, 416.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 16.0f, 27.71f)
                lineTo(80.0f, 480.0f)
                horizontalLineToRelative(72.0f)
                lineTo(152.0f, 448.0f)
                lineTo(360.0f, 448.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(72.0f)
                lineTo(432.0f, 443.71f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 448.0f, 416.0f)
                lineTo(448.0f, 56.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 424.0f, 32.0f)
                close()
                moveTo(175.82f, 371.47f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -35.3f, -35.29f)
                arcTo(32.09f, 32.09f, 0.0f, false, true, 175.82f, 371.47f)
                close()
                moveTo(240.0f, 288.0f)
                lineTo(96.0f, 288.0f)
                lineTo(96.0f, 128.0f)
                lineTo(240.0f, 128.0f)
                close()
                moveTo(256.0f, 96.0f)
                lineTo(96.46f, 96.0f)
                lineTo(96.0f, 64.0f)
                lineTo(416.0f, 64.0f)
                lineToRelative(-0.46f, 32.0f)
                lineTo(256.0f, 96.0f)
                close()
                moveTo(272.0f, 128.0f)
                lineTo(416.0f, 128.0f)
                lineTo(416.0f, 288.0f)
                lineTo(272.0f, 288.0f)
                close()
                moveTo(336.18f, 364.53f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 35.3f, 35.29f)
                arcTo(32.09f, 32.09f, 0.0f, false, true, 336.18f, 364.53f)
                close()
            }
        }
        .build()
        return _busSharp!!
    }

private var _busSharp: ImageVector? = null
