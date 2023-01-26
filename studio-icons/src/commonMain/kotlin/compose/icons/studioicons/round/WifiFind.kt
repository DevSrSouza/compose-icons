package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.WifiFind: ImageVector
    get() {
        if (_wifiFind != null) {
            return _wifiFind!!
        }
        _wifiFind = Builder(name = "WifiFind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                curveToRelative(0.0f, -3.36f, 2.64f, -6.0f, 6.0f, -6.0f)
                curveToRelative(2.2f, 0.0f, 4.08f, 1.13f, 5.13f, 2.86f)
                lineToRelative(0.36f, -0.37f)
                curveToRelative(0.86f, -0.86f, 0.76f, -2.27f, -0.2f, -3.01f)
                curveTo(19.44f, 5.3f, 15.87f, 4.0f, 12.0f, 4.0f)
                curveTo(8.13f, 4.0f, 4.56f, 5.3f, 1.71f, 7.48f)
                curveToRelative(-0.96f, 0.74f, -1.06f, 2.15f, -0.2f, 3.01f)
                lineToRelative(9.08f, 9.09f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f)
                lineToRelative(0.45f, -0.45f)
                curveTo(12.14f, 18.09f, 11.0f, 16.2f, 11.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.44f, 16.03f)
                curveTo(20.79f, 15.44f, 21.0f, 14.75f, 21.0f, 14.0f)
                curveToRelative(0.0f, -2.24f, -1.76f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.76f, -4.0f, 4.0f)
                curveToRelative(0.0f, 2.24f, 1.76f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.75f, 0.0f, 1.44f, -0.21f, 2.03f, -0.56f)
                lineToRelative(1.85f, 1.85f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(20.44f, 16.03f)
                close()
                moveTo(17.0f, 16.0f)
                curveToRelative(-1.12f, 0.0f, -2.0f, -0.88f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.12f, 0.88f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.88f, 2.0f, 2.0f)
                curveTo(19.0f, 15.12f, 18.12f, 16.0f, 17.0f, 16.0f)
                close()
            }
        }
        .build()
        return _wifiFind!!
    }

private var _wifiFind: ImageVector? = null
