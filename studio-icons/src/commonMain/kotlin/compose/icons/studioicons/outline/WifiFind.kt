package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.WifiFind: ImageVector
    get() {
        if (_wifiFind != null) {
            return _wifiFind!!
        }
        _wifiFind = Builder(name = "WifiFind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(4.14f, 0.0f, 7.88f, 1.68f, 10.59f, 4.39f)
                lineTo(24.0f, 8.98f)
                curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f)
                curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f)
                lineTo(12.0f, 21.0f)
                lineToRelative(1.41f, -1.42f)
                lineTo(2.93f, 9.08f)
                curveTo(5.45f, 7.16f, 8.59f, 6.0f, 12.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 14.0f)
                curveToRelative(0.0f, -2.24f, -1.76f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.76f, -4.0f, 4.0f)
                curveToRelative(0.0f, 2.24f, 1.76f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.75f, 0.0f, 1.44f, -0.21f, 2.03f, -0.56f)
                lineTo(21.59f, 20.0f)
                lineTo(23.0f, 18.59f)
                lineToRelative(-2.56f, -2.56f)
                curveTo(20.79f, 15.44f, 21.0f, 14.75f, 21.0f, 14.0f)
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
