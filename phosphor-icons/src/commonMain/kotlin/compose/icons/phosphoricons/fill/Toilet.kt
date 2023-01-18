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

public val FillGroup.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 52.8f, 85.7f)
                lineToRelative(-3.4f, 24.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 97.2f, 240.0f)
                horizontalLineToRelative(61.6f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 15.8f, -18.3f)
                lineToRelative(-3.4f, -24.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 224.0f, 112.0f)
                close()
                moveTo(97.2f, 224.0f)
                lineToRelative(2.9f, -20.1f)
                arcToRelative(97.0f, 97.0f, 0.0f, false, false, 55.8f, 0.0f)
                lineToRelative(2.9f, 20.1f)
                close()
                moveTo(60.0f, 88.0f)
                horizontalLineTo(196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f)
                verticalLineTo(84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 60.0f, 88.0f)
                close()
                moveTo(88.0f, 48.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

private var _toilet: ImageVector? = null
