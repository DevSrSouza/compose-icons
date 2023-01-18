package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Armchair: ImageVector
    get() {
        if (_armchair != null) {
            return _armchair!!
        }
        _armchair = Builder(name = "Armchair", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 78.5f)
                verticalLineTo(72.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -44.0f, -44.0f)
                horizontalLineTo(80.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 36.0f, 72.0f)
                verticalLineToRelative(6.5f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, 99.0f)
                verticalLineTo(200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(177.5f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, -99.0f)
                close()
                moveTo(80.0f, 52.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(4.6f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 152.2f, 124.0f)
                horizontalLineTo(103.8f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 60.0f, 76.6f)
                verticalLineTo(72.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 80.0f, 52.0f)
                close()
                moveTo(206.8f, 155.9f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 196.0f, 167.8f)
                verticalLineTo(196.0f)
                horizontalLineTo(60.0f)
                verticalLineTo(167.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -10.8f, -11.9f)
                arcTo(28.0f, 28.0f, 0.0f, true, true, 80.0f, 128.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(148.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 30.8f, 27.9f)
                close()
            }
        }
        .build()
        return _armchair!!
    }

private var _armchair: ImageVector? = null
