package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.FileSearch: ImageVector
    get() {
        if (_fileSearch != null) {
            return _fileSearch!!
        }
        _fileSearch = Builder(name = "FileSearch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.6f, 82.3f)
                lineToRelative(-55.9f, -56.0f)
                lineToRelative(-0.3f, -0.2f)
                lineToRelative(-0.3f, -0.3f)
                lineToRelative(-0.3f, -0.2f)
                lineToRelative(-0.3f, -0.2f)
                curveToRelative(-0.1f, -0.1f, -0.2f, -0.1f, -0.2f, -0.2f)
                lineToRelative(-0.5f, -0.3f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.5f, -0.3f)
                horizontalLineTo(155.0f)
                lineToRelative(-0.7f, -0.3f)
                horizontalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(88.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 213.6f, 82.3f)
                close()
                moveTo(165.4f, 189.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.6f, 2.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -5.7f, -2.3f)
                lineToRelative(-10.9f, -11.0f)
                arcTo(36.8f, 36.8f, 0.0f, false, true, 124.0f, 184.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcToRelative(35.8f, 35.8f, 0.0f, false, true, -5.5f, 19.2f)
                lineToRelative(10.9f, 10.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 165.4f, 189.5f)
                close()
                moveTo(152.0f, 88.0f)
                verticalLineTo(43.3f)
                lineTo(196.7f, 88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 128.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -14.1f, 5.9f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, 28.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 28.2f, 0.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, -28.2f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 124.0f, 128.0f)
                close()
            }
        }
        .build()
        return _fileSearch!!
    }

private var _fileSearch: ImageVector? = null
