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

public val RegularGroup.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = Builder(name = "Ear", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 152.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                curveToRelative(0.0f, -15.7f, 9.3f, -23.7f, 16.8f, -30.1f)
                reflectiveCurveTo(160.0f, 111.9f, 160.0f, 104.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 96.0f, 0.0f)
                curveToRelative(0.0f, 15.7f, -9.3f, 23.7f, -16.8f, 30.1f)
                reflectiveCurveTo(148.0f, 144.1f, 148.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(128.0f, 16.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, -88.0f, 88.0f)
                curveToRelative(0.0f, 33.5f, 12.5f, 45.5f, 22.5f, 55.2f)
                curveToRelative(7.8f, 7.5f, 13.5f, 13.0f, 13.5f, 28.8f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 92.1f, 33.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -1.1f, -11.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -11.2f, 1.1f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 188.0f)
                curveToRelative(0.0f, -22.6f, -9.8f, -32.0f, -18.4f, -40.4f)
                reflectiveCurveTo(56.0f, 130.7f, 56.0f, 104.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 128.0f, 16.0f)
                close()
            }
        }
        .build()
        return _ear!!
    }

private var _ear: ImageVector? = null
