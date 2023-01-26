package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.WbAuto: ImageVector
    get() {
        if (_wbAuto != null) {
            return _wbAuto!!
        }
        _wbAuto = Builder(name = "WbAuto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.85f, 12.65f)
                horizontalLineToRelative(2.3f)
                lineTo(8.0f, 9.0f)
                close()
                moveTo(22.72f, 7.0f)
                curveToRelative(-0.42f, 0.0f, -0.77f, 0.3f, -0.85f, 0.7f)
                lineToRelative(-1.07f, 5.59f)
                lineToRelative(-1.31f, -5.51f)
                curveToRelative(-0.11f, -0.46f, -0.52f, -0.78f, -0.99f, -0.78f)
                reflectiveCurveToRelative(-0.88f, 0.32f, -0.98f, 0.78f)
                lineToRelative(-1.31f, 5.51f)
                lineToRelative(-1.07f, -5.59f)
                curveToRelative(-0.08f, -0.4f, -0.44f, -0.7f, -0.85f, -0.7f)
                curveToRelative(-0.01f, 0.0f, -0.03f, 0.01f, -0.04f, 0.01f)
                curveTo(12.78f, 5.18f, 10.53f, 4.0f, 8.0f, 4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f)
                curveToRelative(3.17f, 0.0f, 5.9f, -1.85f, 7.2f, -4.52f)
                curveToRelative(0.2f, 0.32f, 0.55f, 0.52f, 0.94f, 0.52f)
                curveToRelative(0.51f, 0.0f, 0.95f, -0.35f, 1.07f, -0.84f)
                lineTo(18.5f, 9.9f)
                lineToRelative(1.29f, 5.26f)
                curveToRelative(0.12f, 0.49f, 0.57f, 0.84f, 1.07f, 0.84f)
                curveToRelative(0.52f, 0.0f, 0.96f, -0.36f, 1.08f, -0.86f)
                lineToRelative(1.61f, -7.08f)
                curveToRelative(0.13f, -0.54f, -0.28f, -1.06f, -0.83f, -1.06f)
                close()
                moveTo(10.93f, 16.0f)
                curveToRelative(-0.38f, 0.0f, -0.72f, -0.24f, -0.84f, -0.6f)
                lineTo(9.6f, 14.0f)
                lineTo(6.4f, 14.0f)
                lineToRelative(-0.49f, 1.4f)
                curveToRelative(-0.13f, 0.36f, -0.46f, 0.6f, -0.84f, 0.6f)
                curveToRelative(-0.62f, 0.0f, -1.05f, -0.61f, -0.84f, -1.19f)
                lineToRelative(2.44f, -6.86f)
                curveTo(6.87f, 7.38f, 7.4f, 7.0f, 8.0f, 7.0f)
                reflectiveCurveToRelative(1.13f, 0.38f, 1.34f, 0.94f)
                lineToRelative(2.44f, 6.86f)
                curveToRelative(0.2f, 0.59f, -0.23f, 1.2f, -0.85f, 1.2f)
                close()
            }
        }
        .build()
        return _wbAuto!!
    }

private var _wbAuto: ImageVector? = null
