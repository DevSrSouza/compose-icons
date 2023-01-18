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

public val BoldGroup.Tabs: ImageVector
    get() {
        if (_tabs != null) {
            return _tabs!!
        }
        _tabs = Builder(name = "Tabs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.5f, 164.6f)
                horizontalLineToRelative(-0.1f)
                lineTo(233.2f, 90.3f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 214.0f, 76.0f)
                horizontalLineTo(204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(7.1f)
                lineToRelative(16.8f, 56.0f)
                horizontalLineToRelative(-31.0f)
                lineTo(177.2f, 90.3f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 158.0f, 76.0f)
                horizontalLineTo(148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(7.1f)
                lineToRelative(16.8f, 56.0f)
                horizontalLineToRelative(-31.0f)
                lineTo(121.2f, 90.3f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 102.0f, 76.0f)
                horizontalLineTo(42.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 22.8f, 90.3f)
                lineTo(0.6f, 164.4f)
                horizontalLineTo(0.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 180.0f)
                horizontalLineTo(244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.5f, -15.4f)
                close()
                moveTo(44.9f, 100.0f)
                horizontalLineTo(99.1f)
                lineToRelative(16.8f, 56.0f)
                horizontalLineTo(28.1f)
                close()
            }
        }
        .build()
        return _tabs!!
    }

private var _tabs: ImageVector? = null
