package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.WbAuto: ImageVector
    get() {
        if (_wbAuto != null) {
            return _wbAuto!!
        }
        _wbAuto = Builder(name = "WbAuto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                lineToRelative(-3.2f, 9.0f)
                horizontalLineToRelative(1.9f)
                lineToRelative(0.7f, -2.0f)
                horizontalLineToRelative(3.2f)
                lineToRelative(0.7f, 2.0f)
                horizontalLineToRelative(1.9f)
                lineTo(9.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(6.85f, 12.65f)
                lineTo(8.0f, 9.0f)
                lineToRelative(1.15f, 3.65f)
                horizontalLineToRelative(-2.3f)
                close()
                moveTo(22.0f, 7.0f)
                lineToRelative(-1.2f, 6.29f)
                lineTo(19.3f, 7.0f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(-1.49f, 6.29f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(-0.76f)
                lineToRelative(-0.01f, 0.01f)
                curveTo(12.76f, 5.18f, 10.53f, 4.0f, 8.0f, 4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f)
                curveToRelative(2.96f, 0.0f, 5.55f, -1.61f, 6.93f, -4.0f)
                curveToRelative(0.03f, -0.06f, 0.05f, -0.12f, 0.08f, -0.18f)
                curveToRelative(0.05f, -0.08f, 0.09f, -0.17f, 0.14f, -0.25f)
                lineToRelative(0.1f, 0.43f)
                lineTo(17.0f, 16.0f)
                lineToRelative(1.5f, -6.1f)
                lineTo(20.0f, 16.0f)
                horizontalLineToRelative(1.75f)
                lineToRelative(2.05f, -9.0f)
                lineTo(22.0f, 7.0f)
                close()
                moveTo(13.37f, 14.67f)
                curveTo(12.38f, 16.64f, 10.35f, 18.0f, 8.0f, 18.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f)
                curveToRelative(0.0f, 0.96f, -0.23f, 1.86f, -0.63f, 2.67f)
                close()
            }
        }
        .build()
        return _wbAuto!!
    }

private var _wbAuto: ImageVector? = null
