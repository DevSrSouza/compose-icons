package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons
import androidx.compose.ui.graphics.StrokeCap.Companion.Square as StrokeCapSquare

public val IonIcons.AlertSharp: ImageVector
    get() {
        if (_alertSharp != null) {
            return _alertSharp!!
        }
        _alertSharp = Builder(
            name = "AlertSharp", defaultWidth = 512.0.dp, defaultHeight =
            512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 32.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(240.0f, 80.0f)
                lineToRelative(8.0f, 240.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(8.0f, -240.0f)
                lineToRelative(-32.0f, 0.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 32.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(240.0f, 400.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-32.0f)
                close()
            }
        }
            .build()
        return _alertSharp!!
    }

private var _alertSharp: ImageVector? = null
