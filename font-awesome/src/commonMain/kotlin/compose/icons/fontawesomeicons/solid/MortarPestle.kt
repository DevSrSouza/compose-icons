package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.MortarPestle: ImageVector
    get() {
        if (_mortarPestle != null) {
            return _mortarPestle!!
        }
        _mortarPestle = Builder(name = "MortarPestle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(501.54f, 60.91f)
                curveToRelative(17.22f, -17.22f, 12.51f, -46.25f, -9.27f, -57.14f)
                arcToRelative(35.7f, 35.7f, 0.0f, false, false, -37.37f, 3.37f)
                lineTo(251.09f, 160.0f)
                horizontalLineToRelative(151.37f)
                lineToRelative(99.08f, -99.09f)
                close()
                moveTo(496.0f, 192.0f)
                horizontalLineTo(16.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.0f, 80.98f, 50.2f, 150.11f, 121.13f, 178.32f)
                curveToRelative(-12.76f, 16.87f, -21.72f, 36.8f, -24.95f, 58.69f)
                curveToRelative(-1.46f, 9.92f, 6.04f, 18.98f, 16.07f, 18.98f)
                horizontalLineToRelative(223.5f)
                curveToRelative(10.03f, 0.0f, 17.53f, -9.06f, 16.07f, -18.98f)
                curveToRelative(-3.22f, -21.89f, -12.18f, -41.82f, -24.95f, -58.69f)
                curveTo(429.8f, 406.11f, 480.0f, 336.98f, 480.0f, 256.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _mortarPestle!!
    }

private var _mortarPestle: ImageVector? = null
