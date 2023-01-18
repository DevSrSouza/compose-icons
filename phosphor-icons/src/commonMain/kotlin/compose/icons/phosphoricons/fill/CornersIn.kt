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

public val FillGroup.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) {
            return _cornersIn!!
        }
        _cornersIn = Builder(name = "CornersIn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 96.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.9f, -7.4f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 8.8f, 1.7f)
                lineToRelative(48.0f, 48.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 1.7f, 8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 104.0f)
                horizontalLineTo(160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 96.0f)
                close()
                moveTo(96.0f, 152.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.4f, 4.9f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 1.7f, 8.8f)
                lineToRelative(48.0f, 48.0f)
                arcTo(8.3f, 8.3f, 0.0f, false, false, 96.0f, 216.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.1f, -0.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 208.0f)
                verticalLineTo(160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 152.0f)
                close()
                moveTo(99.1f, 40.6f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -8.8f, 1.7f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -1.7f, 8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 104.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 99.1f, 40.6f)
                close()
                moveTo(208.0f, 152.0f)
                horizontalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.9f, 7.4f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.1f, 0.6f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, -2.3f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 1.7f, -8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 152.0f)
                close()
            }
        }
        .build()
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
