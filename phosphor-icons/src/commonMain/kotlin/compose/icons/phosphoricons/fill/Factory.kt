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

public val FillGroup.Factory: ImageVector
    get() {
        if (_factory != null) {
            return _factory!!
        }
        _factory = Builder(name = "Factory", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 208.0f)
                lineTo(224.0f, 208.0f)
                lineTo(224.0f, 136.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.1f, -0.4f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-15.0f, -105.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 193.1f, 16.0f)
                lineTo(174.9f, 16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.8f, 13.7f)
                lineToRelative(-11.6f, 81.0f)
                lineTo(108.8f, 81.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 88.0f)
                verticalLineToRelative(32.0f)
                lineTo(44.8f, 81.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 88.0f)
                lineTo(32.0f, 208.0f)
                lineTo(16.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(100.0f, 184.0f)
                lineTo(72.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(184.0f, 184.0f)
                lineTo(156.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(170.7f, 128.0f)
                lineTo(162.1f, 121.6f)
                lineTo(174.9f, 32.0f)
                horizontalLineToRelative(18.2f)
                lineToRelative(13.7f, 96.0f)
                close()
            }
        }
        .build()
        return _factory!!
    }

private var _factory: ImageVector? = null
