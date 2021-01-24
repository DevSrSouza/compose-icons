package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Subscript: ImageVector
    get() {
        if (_subscript != null) {
            return _subscript!!
        }
        _subscript = Builder(name = "Subscript", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 448.0f)
                horizontalLineToRelative(-16.0f)
                verticalLineTo(304.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -14.29f, 8.83f)
                lineToRelative(-16.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 400.0f, 352.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(336.0f, 64.0f)
                horizontalLineToRelative(-67.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.14f, 6.87f)
                lineToRelative(-79.9f, 115.0f)
                lineToRelative(-79.9f, -115.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 83.0f, 64.0f)
                horizontalLineTo(16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 80.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(33.48f)
                lineToRelative(77.81f, 112.0f)
                lineToRelative(-77.81f, 112.0f)
                horizontalLineTo(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(67.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.14f, -6.87f)
                lineToRelative(79.9f, -115.0f)
                lineToRelative(79.9f, 115.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 269.0f, 448.0f)
                horizontalLineToRelative(67.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-33.48f)
                lineToRelative(-77.81f, -112.0f)
                lineToRelative(77.81f, -112.0f)
                horizontalLineTo(336.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _subscript!!
    }

private var _subscript: ImageVector? = null
