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

public val IonIcons.CarSharp: ImageVector
    get() {
        if (_carSharp != null) {
            return _carSharp!!
        }
        _carSharp = Builder(name = "CarSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(447.68f, 220.78f)
                arcToRelative(16.44f, 16.44f, 0.0f, false, false, -1.0f, -3.1f)
                lineToRelative(-48.0f, -112.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 384.0f, 96.0f)
                lineTo(128.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -14.71f, 9.7f)
                lineToRelative(-48.0f, 112.0f)
                arcToRelative(16.44f, 16.44f, 0.0f, false, false, -1.0f, 3.1f)
                arcTo(16.15f, 16.15f, 0.0f, false, false, 64.0f, 224.0f)
                lineTo(64.0f, 408.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(112.0f, 384.0f)
                lineTo(400.0f, 384.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(448.0f, 224.0f)
                arcTo(16.15f, 16.15f, 0.0f, false, false, 447.68f, 220.78f)
                close()
                moveTo(144.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 144.0f, 320.0f)
                close()
                moveTo(368.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 368.0f, 320.0f)
                close()
                moveTo(104.26f, 208.0f)
                lineToRelative(34.29f, -80.0f)
                horizontalLineToRelative(234.9f)
                lineToRelative(34.29f, 80.0f)
                close()
            }
        }
        .build()
        return _carSharp!!
    }

private var _carSharp: ImageVector? = null
