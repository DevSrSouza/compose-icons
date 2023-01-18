package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) {
            return _flowArrow!!
        }
        _flowArrow = Builder(name = "FlowArrow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.8f, 77.2f)
                lineToRelative(-40.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.6f)
                lineTo(230.3f, 76.0f)
                horizontalLineTo(176.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -52.0f, 52.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -44.0f, 44.0f)
                horizontalLineTo(75.7f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 8.0f)
                horizontalLineTo(80.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 52.0f, -52.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 44.0f, -44.0f)
                horizontalLineToRelative(54.3f)
                lineToRelative(-33.1f, 33.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 242.8f, 77.2f)
                close()
                moveTo(44.0f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 44.0f, 200.0f)
                close()
            }
        }
        .build()
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
