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

public val FillGroup.Detective: ImageVector
    get() {
        if (_detective != null) {
            return _detective!!
        }
        _detective = Builder(name = "Detective", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 180.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -71.1f, 8.0f)
                lineTo(111.1f, 188.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 0.0f, -16.0f)
                horizontalLineToRelative(33.8f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 71.1f, 8.0f)
                close()
                moveTo(248.0f, 112.0f)
                lineTo(220.2f, 112.0f)
                lineTo(173.3f, 45.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -26.5f, 0.3f)
                lineTo(128.0f, 73.6f)
                lineTo(109.2f, 45.3f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 82.7f, 45.0f)
                lineTo(35.8f, 112.0f)
                lineTo(8.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(248.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _detective!!
    }

private var _detective: ImageVector? = null
