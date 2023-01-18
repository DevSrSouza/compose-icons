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

public val IonIcons.FlagSharp: ImageVector
    get() {
        if (_flagSharp != null) {
            return _flagSharp!!
        }
        _flagSharp = Builder(name = "FlagSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.0f, 480.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(57.37f)
                lineToRelative(4.69f, -4.68f)
                curveTo(72.14f, 49.23f, 92.78f, 32.0f, 160.0f, 32.0f)
                curveToRelative(37.21f, 0.0f, 78.83f, 14.71f, 115.55f, 27.68f)
                curveTo(305.12f, 70.13f, 333.05f, 80.0f, 352.0f, 80.0f)
                curveToRelative(42.83f, 0.0f, 72.72f, -14.25f, 73.0f, -14.4f)
                lineToRelative(23.0f, -11.14f)
                verticalLineTo(313.89f)
                lineToRelative(-8.84f, 4.42f)
                curveTo(437.71f, 319.0f, 403.19f, 336.0f, 352.0f, 336.0f)
                curveToRelative(-24.14f, 0.0f, -54.38f, -7.14f, -86.39f, -14.71f)
                curveTo(229.63f, 312.79f, 192.43f, 304.0f, 160.0f, 304.0f)
                curveToRelative(-36.87f, 0.0f, -49.74f, 5.58f, -58.0f, 9.11f)
                close()
            }
        }
        .build()
        return _flagSharp!!
    }

private var _flagSharp: ImageVector? = null
