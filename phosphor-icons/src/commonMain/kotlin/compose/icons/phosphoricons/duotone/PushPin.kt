package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.PushPin: ImageVector
    get() {
        if (_pushPin != null) {
            return _pushPin!!
        }
        _pushPin = Builder(name = "PushPin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(154.3f, 29.7f)
                lineTo(92.0f, 92.0f)
                reflectiveCurveTo(64.3f, 78.1f, 34.6f, 102.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 34.0f, 114.0f)
                lineTo(141.8f, 221.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.1f, -0.8f)
                curveToRelative(8.4f, -11.1f, 21.6f, -34.1f, 10.1f, -57.0f)
                lineToRelative(62.3f, -62.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.4f)
                lineTo(165.7f, 29.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 154.3f, 29.7f)
                close()
            }
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
