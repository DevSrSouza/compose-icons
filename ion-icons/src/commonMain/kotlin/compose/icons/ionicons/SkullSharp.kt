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

public val IonIcons.SkullSharp: ImageVector
    get() {
        if (_skullSharp != null) {
            return _skullSharp!!
        }
        _skullSharp = Builder(name = "SkullSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 16.0f)
                curveTo(141.31f, 16.0f, 48.0f, 109.31f, 48.0f, 224.0f)
                lineTo(48.0f, 378.83f)
                lineToRelative(82.0f, 32.81f)
                lineTo(146.88f, 496.0f)
                lineTo(192.0f, 496.0f)
                lineTo(192.0f, 432.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(16.0f)
                lineTo(240.0f, 432.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(16.0f)
                lineTo(288.0f, 432.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(45.12f)
                lineTo(382.0f, 411.64f)
                lineToRelative(82.0f, -32.81f)
                lineTo(464.0f, 224.0f)
                curveTo(464.0f, 109.31f, 370.69f, 16.0f, 256.0f, 16.0f)
                close()
                moveTo(168.0f, 336.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, -56.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 168.0f, 336.0f)
                close()
                moveTo(219.51f, 400.0f)
                lineTo(244.0f, 320.0f)
                horizontalLineToRelative(24.0f)
                lineToRelative(24.49f, 80.0f)
                close()
                moveTo(344.0f, 336.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, -56.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 344.0f, 336.0f)
                close()
                moveTo(448.0f, 368.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _skullSharp!!
    }

private var _skullSharp: ImageVector? = null
