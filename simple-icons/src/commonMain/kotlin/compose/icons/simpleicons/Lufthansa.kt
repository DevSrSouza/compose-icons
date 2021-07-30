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

public val SimpleIcons.Lufthansa: ImageVector
    get() {
        if (_lufthansa != null) {
            return _lufthansa!!
        }
        _lufthansa = Builder(name = "Lufthansa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, -6.648f, -5.352f, -12.0f, -12.0f, -12.0f)
                curveTo(5.376f, 0.0f, 0.0f, 5.352f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.624f, 5.376f, 12.0f, 12.0f, 12.0f)
                curveTo(18.648f, 24.0f, 24.0f, 18.624f, 24.0f, 12.0f)
                close()
                moveTo(23.136f, 12.0f)
                curveToRelative(0.0f, 6.12f, -4.992f, 11.136f, -11.136f, 11.136f)
                curveTo(5.88f, 23.136f, 0.864f, 18.121f, 0.864f, 12.0f)
                curveTo(0.864f, 5.856f, 5.88f, 0.864f, 12.0f, 0.864f)
                curveTo(18.144f, 0.864f, 23.136f, 5.856f, 23.136f, 12.0f)
                close()
                moveTo(16.248f, 11.28f)
                curveToRelative(-0.264f, 0.0f, -0.6f, 0.0f, -1.032f, 0.024f)
                lineToRelative(0.312f, -0.528f)
                horizontalLineToRelative(0.504f)
                curveToRelative(1.8f, 0.0f, 3.144f, 0.096f, 4.368f, 0.312f)
                lineToRelative(0.552f, -0.528f)
                curveToRelative(-1.368f, -0.24f, -3.024f, -0.384f, -4.704f, -0.384f)
                horizontalLineTo(15.84f)
                lineToRelative(0.264f, -0.504f)
                horizontalLineToRelative(0.456f)
                curveToRelative(1.752f, 0.0f, 3.336f, 0.144f, 4.872f, 0.432f)
                lineToRelative(0.576f, -0.552f)
                curveToRelative(-1.728f, -0.336f, -3.576f, -0.503f, -5.568f, -0.503f)
                curveToRelative(-0.849f, 0.003f, -1.698f, 0.043f, -2.544f, 0.12f)
                curveToRelative(-0.96f, 2.063f, -2.496f, 3.264f, -4.224f, 3.24f)
                curveTo(9.0f, 12.384f, 8.159f, 12.097f, 7.08f, 11.52f)
                lineToRelative(-1.008f, -0.576f)
                lineToRelative(0.312f, -0.288f)
                lineToRelative(2.328f, 1.008f)
                lineToRelative(0.504f, -0.384f)
                lineTo(4.512f, 9.144f)
                lineToRelative(-0.72f, 0.552f)
                lineTo(2.112f, 9.0f)
                lineToRelative(0.024f, 0.696f)
                curveToRelative(2.256f, 1.032f, 3.192f, 1.608f, 5.568f, 3.312f)
                curveToRelative(3.096f, 2.208f, 5.856f, 3.408f, 9.696f, 4.176f)
                lineToRelative(1.008f, -0.96f)
                horizontalLineToRelative(-0.24f)
                curveToRelative(-2.544f, 0.0f, -4.824f, -0.84f, -6.144f, -2.256f)
                curveToRelative(1.104f, -0.672f, 2.471f, -0.983f, 4.368f, -0.983f)
                curveToRelative(0.504f, 0.0f, 1.224f, 0.047f, 1.896f, 0.119f)
                lineToRelative(0.576f, -0.552f)
                curveToRelative(-0.9f, -0.11f, -1.805f, -0.166f, -2.712f, -0.168f)
                curveToRelative(-0.609f, -0.001f, -1.217f, 0.023f, -1.824f, 0.072f)
                lineToRelative(0.432f, -0.528f)
                curveToRelative(0.511f, -0.03f, 1.024f, -0.046f, 1.536f, -0.048f)
                curveToRelative(1.272f, 0.0f, 2.112f, 0.048f, 3.072f, 0.192f)
                lineToRelative(0.552f, -0.528f)
                curveTo(18.912f, 11.377f, 17.52f, 11.28f, 16.248f, 11.28f)
                close()
            }
        }
        .build()
        return _lufthansa!!
    }

private var _lufthansa: ImageVector? = null
