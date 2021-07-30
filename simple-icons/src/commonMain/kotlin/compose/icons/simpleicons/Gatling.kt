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

public val SimpleIcons.Gatling: ImageVector
    get() {
        if (_gatling != null) {
            return _gatling!!
        }
        _gatling = Builder(name = "Gatling", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1361f, 17.306f)
                curveToRelative(0.6633f, -0.393f, 1.2406f, -0.9211f, 1.6827f, -1.5598f)
                horizontalLineToRelative(0.7738f)
                arcToRelative(0.7129f, 0.7129f, 0.0f, false, false, 0.7124f, -0.7124f)
                arcToRelative(0.7129f, 0.7129f, 0.0f, false, false, -0.7124f, -0.7124f)
                horizontalLineToRelative(-0.0614f)
                curveToRelative(0.1474f, -0.4545f, 0.2457f, -0.9212f, 0.2702f, -1.4125f)
                horizontalLineToRelative(0.7615f)
                arcToRelative(0.7129f, 0.7129f, 0.0f, false, false, 0.7124f, -0.7124f)
                arcToRelative(0.7129f, 0.7129f, 0.0f, false, false, -0.7124f, -0.7124f)
                horizontalLineToRelative(-0.786f)
                curveToRelative(-0.0492f, -0.4913f, -0.172f, -0.9703f, -0.344f, -1.4125f)
                horizontalLineToRelative(0.1474f)
                arcToRelative(0.7129f, 0.7129f, 0.0f, false, false, 0.7124f, -0.7123f)
                arcToRelative(0.7129f, 0.7129f, 0.0f, false, false, -0.7124f, -0.7124f)
                horizontalLineToRelative(-0.958f)
                curveToRelative(-0.9826f, -1.2283f, -2.5302f, -2.0512f, -4.262f, -2.0512f)
                horizontalLineToRelative(-1.216f)
                curveToRelative(-0.7615f, 0.0f, -1.4984f, 0.1597f, -2.1617f, 0.4545f)
                horizontalLineTo(14.26f)
                curveToRelative(2.9478f, 0.0f, 5.3674f, 2.4196f, 5.3674f, 5.3674f)
                curveToRelative(0.0f, 2.7267f, -2.0511f, 4.9867f, -4.6919f, 5.3306f)
                curveToRelative(-0.1597f, 0.0123f, -0.3193f, 0.0246f, -0.4913f, 0.0246f)
                horizontalLineTo(8.9171f)
                arcToRelative(6.5941f, 6.5941f, 0.0f, false, false, 2.2477f, -2.0266f)
                curveToRelative(0.0368f, 0.0122f, 0.086f, 0.0122f, 0.1228f, 0.0122f)
                horizontalLineToRelative(4.8148f)
                arcToRelative(0.7129f, 0.7129f, 0.0f, false, false, 0.7123f, -0.7123f)
                arcToRelative(0.7129f, 0.7129f, 0.0f, false, false, -0.7123f, -0.7124f)
                horizontalLineTo(11.914f)
                arcToRelative(6.8244f, 6.8244f, 0.0f, false, false, 0.3685f, -1.4125f)
                horizontalLineToRelative(5.5148f)
                arcToRelative(0.7129f, 0.7129f, 0.0f, false, false, 0.7124f, -0.7124f)
                arcToRelative(0.7129f, 0.7129f, 0.0f, false, false, -0.7124f, -0.7124f)
                horizontalLineTo(12.344f)
                curveToRelative(-0.0368f, -0.4913f, -0.1351f, -0.958f, -0.2702f, -1.4125f)
                horizontalLineToRelative(4.0532f)
                arcToRelative(0.7129f, 0.7129f, 0.0f, false, false, 0.7124f, -0.7124f)
                arcToRelative(0.7129f, 0.7129f, 0.0f, false, false, -0.7124f, -0.7123f)
                horizontalLineToRelative(-4.6796f)
                curveToRelative(-1.1423f, -1.9284f, -3.2549f, -3.2303f, -5.65f, -3.2303f)
                horizontalLineToRelative(-0.4667f)
                curveTo(3.1443f, 5.4289f, 1.1914f, 6.522f, 0.0f, 8.18f)
                arcToRelative(5.8463f, 5.8463f, 0.0f, false, true, 4.434f, -2.0266f)
                curveToRelative(2.5302f, 0.0f, 4.6919f, 1.609f, 5.5025f, 3.8567f)
                horizontalLineTo(6.9642f)
                curveTo(6.3746f, 9.261f, 5.4534f, 8.782f, 4.434f, 8.782f)
                curveToRelative(-1.781f, 0.0246f, -3.218f, 1.4616f, -3.218f, 3.2426f)
                reflectiveCurveToRelative(1.4493f, 3.2303f, 3.2303f, 3.2303f)
                curveToRelative(1.0563f, 0.0f, 1.9897f, -0.5036f, 2.5793f, -1.2897f)
                horizontalLineTo(3.955f)
                curveToRelative(0.0f, -1.4248f, 1.1545f, -2.567f, 2.567f, -2.567f)
                horizontalLineToRelative(3.7462f)
                curveToRelative(0.0245f, 0.2088f, 0.0368f, 0.4176f, 0.0368f, 0.6264f)
                curveToRelative(0.0f, 3.2303f, -2.6284f, 5.8587f, -5.8587f, 5.8587f)
                curveToRelative(-1.7073f, 0.0f, -3.2426f, -0.737f, -4.3235f, -1.9038f)
                curveToRelative(1.2037f, 1.5722f, 3.0952f, 2.5916f, 5.22f, 2.5916f)
                horizontalLineToRelative(9.6296f)
                curveToRelative(4.9867f, 0.0f, 9.0276f, -0.2947f, 9.0276f, -0.6755f)
                curveToRelative(0.0f, -0.2457f, -1.9775f, -0.479f, -4.8639f, -0.5896f)
                close()
            }
        }
        .build()
        return _gatling!!
    }

private var _gatling: ImageVector? = null
