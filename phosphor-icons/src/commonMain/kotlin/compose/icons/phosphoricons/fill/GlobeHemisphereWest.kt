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

public val FillGroup.GlobeHemisphereWest: ImageVector
    get() {
        if (_globeHemisphereWest != null) {
            return _globeHemisphereWest!!
        }
        _globeHemisphereWest = Builder(name = "GlobeHemisphereWest", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.6f, 173.3f)
                arcTo(102.9f, 102.9f, 0.0f, false, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 154.8f, 27.5f)
                horizontalLineToRelative(-0.5f)
                arcTo(103.8f, 103.8f, 0.0f, false, false, 60.4f, 49.0f)
                lineToRelative(-1.3f, 1.2f)
                arcTo(103.9f, 103.9f, 0.0f, false, false, 128.0f, 232.0f)
                horizontalLineToRelative(2.4f)
                arcTo(104.3f, 104.3f, 0.0f, false, false, 221.0f, 174.6f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(89.3f, 89.3f, 0.0f, false, true, -5.5f, 30.7f)
                lineToRelative(-46.4f, -28.5f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, -6.3f, -2.3f)
                lineToRelative(-22.8f, -3.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -15.3f, 6.8f)
                horizontalLineToRelative(-8.6f)
                lineToRelative(-3.8f, -7.9f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -11.0f, -8.7f)
                lineToRelative(-6.6f, -1.4f)
                lineToRelative(2.6f, -5.9f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 7.3f, -4.9f)
                horizontalLineToRelative(16.1f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 7.7f, -2.0f)
                lineToRelative(12.2f, -6.8f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 3.0f, -2.1f)
                lineToRelative(26.9f, -24.4f)
                arcTo(15.7f, 15.7f, 0.0f, false, false, 170.0f, 50.7f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 216.0f, 128.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcToRelative(87.1f, 87.1f, 0.0f, false, true, 9.5f, -39.7f)
                lineToRelative(10.4f, 27.9f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 11.6f, 10.0f)
                lineToRelative(5.5f, 1.2f)
                horizontalLineToRelative(0.1f)
                lineToRelative(12.0f, 2.6f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 5.5f, 4.3f)
                lineToRelative(2.1f, 4.4f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 14.4f, 9.0f)
                horizontalLineToRelative(1.2f)
                lineToRelative(-7.7f, 17.2f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 2.8f, 17.4f)
                lineToRelative(16.1f, 17.4f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 2.0f, 6.9f)
                lineToRelative(-1.8f, 9.3f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 40.0f, 128.0f)
                close()
            }
        }
        .build()
        return _globeHemisphereWest!!
    }

private var _globeHemisphereWest: ImageVector? = null
