package compose.icons.phosphoricons.bold

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
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) {
            return _globeStand!!
        }
        _globeStand = Builder(name = "GlobeStand", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 172.0f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 52.0f, 96.0f)
                arcTo(76.1f, 76.1f, 0.0f, false, false, 128.0f, 172.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcTo(52.0f, 52.0f, 0.0f, true, true, 76.0f, 96.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 128.0f, 44.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.0f, 178.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -16.9f, -17.0f)
                arcTo(91.5f, 91.5f, 0.0f, false, true, 128.0f, 188.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(91.1f, 91.1f, 0.0f, false, true, -65.0f, -27.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 63.0f, 30.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 46.0f, 14.0f)
                arcToRelative(116.1f, 116.1f, 0.0f, false, false, 0.0f, 164.0f)
                arcToRelative(114.8f, 114.8f, 0.0f, false, false, 70.0f, 33.4f)
                verticalLineTo(224.0f)
                horizontalLineTo(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(211.4f)
                arcTo(114.6f, 114.6f, 0.0f, false, false, 210.0f, 178.0f)
                close()
            }
        }
        .build()
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
