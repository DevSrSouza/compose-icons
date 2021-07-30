package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Simpleicons: ImageVector
    get() {
        if (_simpleicons != null) {
            return _simpleicons!!
        }
        _simpleicons = Builder(name = "Simpleicons", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(8.688f, 0.0f, 6.0f, 2.688f, 6.0f, 6.0f)
                reflectiveCurveToRelative(2.688f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.066f, 0.0f, 2.1171f, 0.2862f, 3.0371f, 0.8262f)
                curveToRelative(2.858f, 1.678f, 3.8167f, 5.3539f, 2.1387f, 8.2129f)
                horizontalLineToRelative(1.6797f)
                arcToRelative(7.4925f, 7.4925f, 0.0f, false, false, 0.6425f, -3.0293f)
                curveToRelative(0.003f, -4.144f, -3.356f, -7.5048f, -7.498f, -7.5098f)
                curveToRelative(-2.484f, 0.0f, -4.5f, -2.016f, -4.5f, -4.5f)
                reflectiveCurveTo(9.516f, 1.5f, 12.0f, 1.5f)
                reflectiveCurveToRelative(4.5f, 2.016f, 4.5f, 4.5f)
                lineTo(18.0f, 6.0f)
                curveToRelative(0.0f, -3.312f, -2.688f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(-1.597f, 0.04f, -2.8799f, 1.3259f, -2.9219f, 2.9219f)
                curveTo(9.0351f, 7.5799f, 10.343f, 8.957f, 12.0f, 9.0f)
                curveToRelative(1.597f, -0.04f, 2.8799f, -1.3259f, 2.9219f, -2.9219f)
                curveTo(14.9649f, 4.4201f, 13.656f, 3.043f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 4.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(0.002f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.673f, -1.5f, -1.502f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(7.5f, 15.0f)
                verticalLineToRelative(1.5f)
                lineTo(9.0f, 16.5f)
                verticalLineToRelative(6.0f)
                lineTo(4.5f, 22.5f)
                lineTo(4.5f, 24.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.5f)
                lineTo(15.0f, 22.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.5f)
                lineTo(16.5f, 15.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(10.5f, 16.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(4.5f, 17.9707f)
                lineTo(4.5f, 18.0f)
                arcToRelative(7.418f, 7.418f, 0.0f, false, false, 0.6445f, 3.039f)
                horizontalLineToRelative(1.6836f)
                curveTo(6.3001f, 20.147f, 6.0f, 19.11f, 6.0f, 18.0f)
                verticalLineToRelative(-0.0293f)
                lineTo(4.5f, 17.9707f)
                close()
            }
        }
        .build()
        return _simpleicons!!
    }

private var _simpleicons: ImageVector? = null
