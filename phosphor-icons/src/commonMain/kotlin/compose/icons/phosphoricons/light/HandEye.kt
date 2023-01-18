package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.HandEye: ImageVector
    get() {
        if (_handEye != null) {
            return _handEye!!
        }
        _handEye = Builder(name = "HandEye", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 130.0f)
                curveToRelative(-27.7f, 0.0f, -44.5f, 21.2f, -50.4f, 30.3f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 0.0f, 15.4f)
                curveToRelative(5.9f, 9.1f, 22.7f, 30.3f, 50.4f, 30.3f)
                reflectiveCurveToRelative(44.5f, -21.2f, 50.4f, -30.3f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 0.0f, -15.4f)
                curveTo(172.5f, 151.2f, 155.7f, 130.0f, 128.0f, 130.0f)
                close()
                moveTo(168.4f, 169.1f)
                curveToRelative(-4.9f, 7.5f, -18.6f, 24.9f, -40.4f, 24.9f)
                reflectiveCurveToRelative(-35.5f, -17.4f, -40.4f, -24.9f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 0.0f, -2.2f)
                horizontalLineToRelative(0.0f)
                curveToRelative(4.9f, -7.5f, 18.6f, -24.9f, 40.4f, -24.9f)
                reflectiveCurveToRelative(35.5f, 17.4f, 40.4f, 24.9f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 168.4f, 169.1f)
                close()
                moveTo(188.0f, 86.0f)
                arcToRelative(25.6f, 25.6f, 0.0f, false, false, -14.0f, 4.1f)
                lineTo(174.0f, 52.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -40.6f, -21.5f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 82.0f, 36.0f)
                lineTo(82.0f, 46.1f)
                arcTo(25.6f, 25.6f, 0.0f, false, false, 68.0f, 42.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, false, 42.0f, 68.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                lineTo(214.0f, 112.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, false, 188.0f, 86.0f)
                close()
                moveTo(202.0f, 152.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, -148.0f, 0.0f)
                lineTo(54.0f, 68.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(94.0f, 36.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 52.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                close()
                moveTo(138.0f, 168.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 168.0f)
                close()
            }
        }
        .build()
        return _handEye!!
    }

private var _handEye: ImageVector? = null
