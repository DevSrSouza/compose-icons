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

public val BoldGroup.ArrowFatLineRight: ImageVector
    get() {
        if (_arrowFatLineRight != null) {
            return _arrowFatLineRight!!
        }
        _arrowFatLineRight = Builder(name = "ArrowFatLineRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.5f, 119.5f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -13.1f, -2.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 124.0f, 32.0f)
                verticalLineTo(68.0f)
                horizontalLineTo(80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.4f, 11.1f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 4.6f, 0.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.5f, -3.5f)
                lineToRelative(96.0f, -96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.5f, 119.5f)
                close()
                moveTo(148.0f, 195.0f)
                verticalLineTo(176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(92.0f)
                verticalLineTo(92.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(61.0f)
                lineToRelative(67.0f, 67.0f)
                close()
                moveTo(52.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowFatLineRight!!
    }

private var _arrowFatLineRight: ImageVector? = null
