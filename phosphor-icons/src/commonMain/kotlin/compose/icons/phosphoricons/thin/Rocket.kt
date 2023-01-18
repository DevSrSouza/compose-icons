package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(112.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 148.0f, 224.0f)
                close()
                moveTo(219.1f, 156.7f)
                lineTo(206.7f, 212.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.7f, 8.8f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, true, -4.0f, 0.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.5f, -2.6f)
                lineTo(158.6f, 196.0f)
                lineTo(97.4f, 196.0f)
                lineTo(68.5f, 219.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.5f, 2.6f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, true, -4.0f, -0.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.7f, -8.8f)
                lineTo(36.9f, 156.7f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, true, 2.5f, -10.3f)
                lineToRelative(30.5f, -36.5f)
                arcToRelative(117.4f, 117.4f, 0.0f, false, true, 7.9f, -35.8f)
                curveToRelative(11.8f, -30.5f, 33.8f, -50.3f, 42.7f, -57.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.0f, 0.1f)
                curveToRelative(10.9f, 8.8f, 30.9f, 28.1f, 42.2f, 57.4f)
                arcToRelative(119.0f, 119.0f, 0.0f, false, true, 7.8f, 35.0f)
                lineToRelative(31.1f, 37.3f)
                arcTo(12.4f, 12.4f, 0.0f, false, true, 219.1f, 156.7f)
                close()
                moveTo(98.3f, 188.0f)
                horizontalLineToRelative(59.4f)
                curveToRelative(50.4f, -91.6f, -8.0f, -149.5f, -27.2f, -165.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveTo(106.0f, 38.5f, 46.8f, 96.3f, 98.3f, 188.0f)
                close()
                moveTo(90.8f, 191.0f)
                curveToRelative(-13.0f, -23.5f, -20.0f, -46.4f, -21.0f, -68.5f)
                lineToRelative(-24.2f, 29.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.8f, 3.5f)
                lineToRelative(12.3f, 55.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.6f, 2.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.8f, -0.6f)
                close()
                moveTo(210.4f, 151.5f)
                lineTo(185.7f, 121.9f)
                curveToRelative(-0.8f, 22.3f, -7.7f, 45.4f, -20.6f, 69.1f)
                lineToRelative(27.4f, 21.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.8f, 0.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.6f, -2.9f)
                lineTo(211.2f, 155.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 210.4f, 151.5f)
                close()
                moveTo(128.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 104.0f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
