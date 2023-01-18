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

public val IonIcons.BulbSharp: ImageVector
    get() {
        if (_bulbSharp != null) {
            return _bulbSharp!!
        }
        _bulbSharp = Builder(name = "BulbSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 464.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-96.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 416.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(369.42f, 62.69f)
                curveTo(339.35f, 32.58f, 299.07f, 16.0f, 256.0f, 16.0f)
                arcTo(159.62f, 159.62f, 0.0f, false, false, 96.0f, 176.0f)
                curveToRelative(0.0f, 46.62f, 17.87f, 90.23f, 49.0f, 119.64f)
                lineToRelative(4.36f, 4.09f)
                curveTo(167.37f, 316.57f, 192.0f, 339.64f, 192.0f, 360.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(269.11f)
                lineTo(195.72f, 244.0f)
                lineTo(214.0f, 217.72f)
                lineTo(256.0f, 240.0f)
                lineToRelative(41.29f, -22.39f)
                lineToRelative(19.1f, 25.68f)
                lineToRelative(-44.39f, 26.0f)
                verticalLineTo(400.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(360.0f)
                curveToRelative(0.0f, -19.88f, 24.36f, -42.93f, 42.15f, -59.77f)
                lineToRelative(4.91f, -4.66f)
                curveTo(399.08f, 265.0f, 416.0f, 223.61f, 416.0f, 176.0f)
                arcTo(159.16f, 159.16f, 0.0f, false, false, 369.42f, 62.69f)
                close()
            }
        }
        .build()
        return _bulbSharp!!
    }

private var _bulbSharp: ImageVector? = null
