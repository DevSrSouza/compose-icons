package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Chalet: ImageVector
    get() {
        if (_chalet != null) {
            return _chalet!!
        }
        _chalet = Builder(name = "Chalet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.5f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(15.0f, 15.33f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-4.67f)
                lineToRelative(-1.09f, 1.09f)
                lineTo(2.5f, 15.0f)
                lineTo(10.0f, 7.5f)
                close()
                moveTo(22.0f, 6.5f)
                horizontalLineToRelative(-1.19f)
                lineToRelative(0.75f, -0.75f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(19.39f, 6.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(5.61f)
                lineToRelative(1.45f, -1.45f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(18.5f, 4.19f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.19f)
                lineToRelative(-0.75f, -0.75f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(1.45f, 1.45f)
                verticalLineTo(6.5f)
                horizontalLineToRelative(-0.89f)
                lineToRelative(-1.45f, -1.45f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(0.75f, 0.75f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.19f)
                lineToRelative(-0.75f, 0.75f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(1.45f, -1.45f)
                horizontalLineToRelative(0.89f)
                verticalLineToRelative(0.89f)
                lineToRelative(-1.45f, 1.45f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(0.75f, -0.75f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(9.81f)
                lineToRelative(0.75f, 0.75f)
                lineToRelative(0.71f, -0.71f)
                lineTo(18.5f, 8.39f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(0.89f)
                lineToRelative(1.45f, 1.45f)
                lineToRelative(0.71f, -0.71f)
                lineTo(20.81f, 7.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.5f)
                close()
            }
        }
        .build()
        return _chalet!!
    }

private var _chalet: ImageVector? = null
