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

public val RegularGroup.Detective: ImageVector
    get() {
        if (_detective != null) {
            return _detective!!
        }
        _detective = Builder(name = "Detective", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 144.0f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, -35.1f, 28.0f)
                lineTo(111.1f, 172.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 0.0f, 16.0f)
                horizontalLineToRelative(33.8f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 180.0f, 144.0f)
                close()
                moveTo(76.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 76.0f, 200.0f)
                close()
                moveTo(180.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 180.0f, 200.0f)
                close()
                moveTo(248.0f, 112.0f)
                lineTo(220.2f, 112.0f)
                lineTo(173.3f, 45.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -13.1f, -6.8f)
                lineTo(160.0f, 38.2f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.2f, 7.1f)
                lineTo(128.0f, 73.6f)
                lineTo(109.2f, 45.3f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 82.7f, 45.0f)
                lineTo(35.8f, 112.0f)
                lineTo(8.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(248.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(95.8f, 54.2f)
                lineToRelative(18.9f, 28.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 26.6f, 0.0f)
                lineToRelative(18.9f, -28.3f)
                lineTo(200.6f, 112.0f)
                lineTo(55.4f, 112.0f)
                close()
            }
        }
        .build()
        return _detective!!
    }

private var _detective: ImageVector? = null
