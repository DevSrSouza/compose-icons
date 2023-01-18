package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.GlobeHemisphereEast: ImageVector
    get() {
        if (_globeHemisphereEast != null) {
            return _globeHemisphereEast!!
        }
        _globeHemisphereEast = Builder(name = "GlobeHemisphereEast", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.8f, 42.9f)
                lineToRelative(-1.2f, -0.7f)
                arcTo(103.0f, 103.0f, 0.0f, false, false, 128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 42.6f, 187.3f)
                verticalLineToRelative(0.2f)
                lineToRelative(0.8f, 1.1f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 147.8f, 21.9f)
                lineToRelative(1.4f, -1.1f)
                arcToRelative(105.3f, 105.3f, 0.0f, false, false, 30.8f, -40.2f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.5f, -1.2f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 187.8f, 42.9f)
                close()
                moveTo(212.8f, 151.4f)
                lineTo(196.9f, 136.8f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -16.9f, -3.0f)
                lineToRelative(-30.5f, 12.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -9.7f, 12.4f)
                lineToRelative(-2.4f, 16.2f)
                arcTo(16.2f, 16.2f, 0.0f, false, false, 149.2f, 193.0f)
                lineToRelative(21.5f, 5.6f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -113.2f, -17.0f)
                lineToRelative(3.9f, -2.4f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, 7.7f, -13.6f)
                lineToRelative(0.2f, -33.8f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 1.3f, -4.3f)
                lineToRelative(14.0f, -22.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.4f, -2.2f)
                lineToRelative(12.8f, 9.3f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, false, 11.6f, 2.9f)
                lineToRelative(31.4f, -4.3f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, 10.0f, -5.4f)
                lineTo(188.0f, 84.2f)
                arcTo(15.8f, 15.8f, 0.0f, false, false, 191.8f, 73.0f)
                lineToRelative(-0.2f, -5.8f)
                arcTo(87.7f, 87.7f, 0.0f, false, true, 216.0f, 128.0f)
                arcTo(86.4f, 86.4f, 0.0f, false, true, 212.8f, 151.4f)
                close()
            }
        }
        .build()
        return _globeHemisphereEast!!
    }

private var _globeHemisphereEast: ImageVector? = null
