package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.PushPin: ImageVector
    get() {
        if (_pushPin != null) {
            return _pushPin!!
        }
        _pushPin = Builder(name = "PushPin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.7f, 96.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 232.0f, 84.7f)
                lineTo(171.3f, 24.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -22.6f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(90.0f, 82.7f)
                curveToRelative(-10.7f, -3.3f, -35.0f, -7.4f, -60.4f, 13.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -1.3f, 23.8f)
                lineTo(76.7f, 168.0f)
                lineTo(42.3f, 202.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineTo(88.0f, 179.3f)
                lineToRelative(48.2f, 48.2f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 11.3f, 4.7f)
                horizontalLineToRelative(1.1f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, 11.7f, -6.4f)
                curveToRelative(19.6f, -26.1f, 17.7f, -47.3f, 13.2f, -60.0f)
                lineTo(232.0f, 107.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 236.7f, 96.0f)
                close()
                moveTo(158.3f, 158.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -1.5f, 9.3f)
                curveToRelative(9.5f, 18.9f, -1.8f, 38.6f, -9.3f, 48.6f)
                lineTo(39.6f, 108.3f)
                curveTo(51.7f, 98.5f, 63.3f, 96.0f, 72.1f, 96.0f)
                reflectiveCurveTo(88.0f, 98.9f, 88.4f, 99.2f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 9.3f, -1.5f)
                lineTo(160.0f, 35.3f)
                lineTo(220.7f, 96.0f)
                close()
            }
        }
        .build()
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
