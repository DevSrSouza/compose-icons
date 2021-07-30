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

public val SolidGroup.Ad: ImageVector
    get() {
        if (_ad != null) {
            return _ad!!
        }
        _ad = Builder(name = "Ad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(157.52f, 272.0f)
                horizontalLineToRelative(36.96f)
                lineTo(176.0f, 218.78f)
                lineTo(157.52f, 272.0f)
                close()
                moveTo(352.0f, 256.0f)
                curveToRelative(-13.23f, 0.0f, -24.0f, 10.77f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.77f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.77f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.77f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(464.0f, 64.0f)
                horizontalLineTo(48.0f)
                curveTo(21.5f, 64.0f, 0.0f, 85.5f, 0.0f, 112.0f)
                verticalLineToRelative(288.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineTo(112.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(250.58f, 352.0f)
                horizontalLineToRelative(-16.94f)
                curveToRelative(-6.81f, 0.0f, -12.88f, -4.32f, -15.12f, -10.75f)
                lineTo(211.15f, 320.0f)
                horizontalLineToRelative(-70.29f)
                lineToRelative(-7.38f, 21.25f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 118.36f, 352.0f)
                horizontalLineToRelative(-16.94f)
                curveToRelative(-11.01f, 0.0f, -18.73f, -10.85f, -15.12f, -21.25f)
                lineTo(140.0f, 176.12f)
                arcTo(23.995f, 23.995f, 0.0f, false, true, 162.67f, 160.0f)
                horizontalLineToRelative(26.66f)
                arcTo(23.99f, 23.99f, 0.0f, false, true, 212.0f, 176.13f)
                lineToRelative(53.69f, 154.62f)
                curveToRelative(3.61f, 10.4f, -4.11f, 21.25f, -15.11f, 21.25f)
                close()
                moveTo(424.0f, 336.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-4.85f, 0.0f, -9.04f, -2.27f, -11.98f, -5.68f)
                curveToRelative(-8.62f, 3.66f, -18.09f, 5.68f, -28.02f, 5.68f)
                curveToRelative(-39.7f, 0.0f, -72.0f, -32.3f, -72.0f, -72.0f)
                reflectiveCurveToRelative(32.3f, -72.0f, 72.0f, -72.0f)
                curveToRelative(8.46f, 0.0f, 16.46f, 1.73f, 24.0f, 4.42f)
                verticalLineTo(176.0f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 7.16f, 16.0f, 16.0f)
                verticalLineToRelative(160.0f)
                close()
            }
        }
        .build()
        return _ad!!
    }

private var _ad: ImageVector? = null
