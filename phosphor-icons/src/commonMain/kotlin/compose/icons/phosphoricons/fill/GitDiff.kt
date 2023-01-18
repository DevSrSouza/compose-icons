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

public val FillGroup.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) {
            return _gitDiff!!
        }
        _gitDiff = Builder(name = "GitDiff", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 188.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -44.0f, -35.1f)
                verticalLineToRelative(-33.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -11.7f, -28.3f)
                lineTo(152.0f, 67.3f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(163.3f)
                lineToRelative(24.3f, 24.3f)
                arcTo(55.5f, 55.5f, 0.0f, false, true, 204.0f, 119.9f)
                verticalLineToRelative(33.0f)
                arcTo(36.1f, 36.1f, 0.0f, false, true, 232.0f, 188.0f)
                close()
                moveTo(112.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(20.7f)
                lineTo(79.7f, 164.4f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 68.0f, 136.1f)
                verticalLineToRelative(-33.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -16.0f, 0.0f)
                verticalLineToRelative(33.0f)
                arcToRelative(55.5f, 55.5f, 0.0f, false, false, 16.4f, 39.6f)
                lineTo(92.7f, 200.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 160.0f)
                close()
            }
        }
        .build()
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
