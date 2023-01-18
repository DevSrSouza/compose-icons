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

public val IonIcons.WarningSharp: ImageVector
    get() {
        if (_warningSharp != null) {
            return _warningSharp!!
        }
        _warningSharp = Builder(name = "WarningSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(479.0f, 447.77f)
                lineTo(268.43f, 56.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.09f, 0.0f)
                lineTo(43.73f, 447.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.05f, 11.79f)
                lineTo(472.0f, 459.56f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 479.0f, 447.77f)
                close()
                moveTo(281.38f, 411.48f)
                horizontalLineToRelative(-40.0f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(277.38f, 347.56f)
                horizontalLineToRelative(-32.0f)
                lineToRelative(-6.0f, -160.0f)
                horizontalLineToRelative(44.0f)
                close()
            }
        }
        .build()
        return _warningSharp!!
    }

private var _warningSharp: ImageVector? = null
