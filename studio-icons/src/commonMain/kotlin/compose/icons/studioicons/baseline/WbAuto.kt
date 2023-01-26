package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.WbAuto: ImageVector
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
                lineToRelative(-1.15f, 3.65f)
                close()
                moveTo(22.0f, 7.0f)
                lineToRelative(-1.2f, 6.29f)
                lineTo(19.3f, 7.0f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(-1.49f, 6.29f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(-0.76f)
                curveTo(12.77f, 5.17f, 10.53f, 4.0f, 8.0f, 4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f)
                curveToRelative(3.13f, 0.0f, 5.84f, -1.81f, 7.15f, -4.43f)
                lineToRelative(0.1f, 0.43f)
                lineTo(17.0f, 16.0f)
                lineToRelative(1.5f, -6.1f)
                lineTo(20.0f, 16.0f)
                horizontalLineToRelative(1.75f)
                lineToRelative(2.05f, -9.0f)
                lineTo(22.0f, 7.0f)
                close()
                moveTo(10.3f, 16.0f)
                lineToRelative(-0.7f, -2.0f)
                lineTo(6.4f, 14.0f)
                lineToRelative(-0.7f, 2.0f)
                lineTo(3.8f, 16.0f)
                lineTo(7.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(3.2f, 9.0f)
                horizontalLineToRelative(-1.9f)
                close()
            }
        }
        .build()
        return _wbAuto!!
    }

private var _wbAuto: ImageVector? = null
