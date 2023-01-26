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

public val SharpGroup.Calculate: ImageVector
    get() {
        if (_calculate != null) {
            return _calculate!!
        }
        _calculate = Builder(name = "Calculate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(13.03f, 7.06f)
                lineTo(14.09f, 6.0f)
                lineToRelative(1.41f, 1.41f)
                lineTo(16.91f, 6.0f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.06f, 1.06f)
                lineTo(15.5f, 9.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.03f, 7.06f)
                close()
                moveTo(6.25f, 7.72f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(7.72f)
                close()
                moveTo(11.5f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(18.0f, 17.25f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(17.25f)
                close()
                moveTo(18.0f, 14.75f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(14.75f)
                close()
            }
        }
        .build()
        return _calculate!!
    }

private var _calculate: ImageVector? = null
